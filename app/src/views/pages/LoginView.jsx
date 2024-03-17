import { useState } from "react";
import Header from "../components/Header";

export default function LoginView({ callback }) {
    const [password, setPassword] = useState("");
    const [email, setEmail] = useState("");

    const handleInputChange = (e) => {
        const { name, value } = e.target;
        switch (name) {
            case "password":
                setPassword(() => {
                    return value;
                });
                break;
            case "email":
                setEmail(() => {
                    return value;
                });
                break;
            default:
                break;
        }
    };
    return (
        <>
            <Header />
            <div className='columns is-centered'>
                <div className='column is-6'>
                    <div className='field'>
                        <label className='label'>Email</label>
                        <div className='control'>
                            <input
                                className='input is-dark'
                                type='text'
                                placeholder='Email'
                                name='email'
                                value={email}
                                onChange={handleInputChange}
                            />
                        </div>
                    </div>

                    <div className='field'>
                        <label className='label'>Mot de passe</label>
                        <div className='control'>
                            <input
                                className='input is-dark'
                                type='password'
                                placeholder='Mot de passe'
                                name='password'
                                value={password}
                                onChange={handleInputChange}
                            />
                        </div>
                    </div>

                    <div className='field is-grouped'>
                        <div className='control'>
                            <button className='button is-link' onClick={() => callback(email, password)}>
                                Se connecter
                            </button>
                        </div>
                        <div className='control'>
                            <a className='button is-primary' href='/register'>
                                S&#39;enregistrer
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </>
    );
}
