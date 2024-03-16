import { useState } from "react";
import Header from "../components/Header";

export default function RegisterView({ callback }) {
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");
    const [email, setEmail] = useState("");

    const handleInputChange = (e) => {
        console.log("e", e);
        const { name, value } = e.target;
        switch (name) {
            case "username":
                setUsername(value);
                break;
            case "password":
                setPassword(value);
                break;
            case "email":
                setEmail(value);
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
                        <label className='label'>Nom d&#39;utilisateur</label>
                        <div className='control'>
                            <input
                                className='input is-dark'
                                type='text'
                                placeholder='Nom d&#39;utilisateur'
                                name='username'
                                value={username}
                                onChange={handleInputChange}
                            />
                        </div>
                    </div>

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
                            <button className='button is-link' onClick={() => callback(username, email, password)}>
                                S&#39;enregistrer
                            </button>
                        </div>
                        <div className='control'>
                            <a className='button is-primary' href='/login'>
                                Se connecter
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </>
    );
}
