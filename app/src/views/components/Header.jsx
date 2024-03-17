import "bulma/css/bulma.min.css";
import logo from "/assets/images/logo.svg";
import LoginChecker from "../../utils/LoginChecker";

export default function header() {
    const isLoggedIn = LoginChecker.checkLogged();

    const logout = () => {
        localStorage.removeItem("user");
        localStorage.removeItem("cart");
        window.location.reload();
    };

    return (
        <div className='column is-8 is-offset-2'>
            <nav className='navbar is-info' role='navigation' aria-label='main navigation'>
                <div className='navbar-brand'>
                    <a className='navbar-item' href='/'>
                        <figure className='image'>
                            <img src={logo} height='80' width='80' />
                        </figure>
                    </a>
                </div>

                <div id='navbarBasicExample' className='navbar-menu'>
                    <div className='navbar-start'>
                        <a className='navbar-item' href='/'>
                            Accueil
                        </a>
                        <a className='navbar-item' href='/cart'>
                            Panier
                        </a>
                    </div>
                    <div className='navbar-end'>
                        <div className='navbar-item'>
                            <div className='buttons'>
                                {isLoggedIn ? (
                                    <button className='button is-danger' onClick={logout}>
                                        Se déconnecter
                                    </button>
                                ) : (
                                    <>
                                        <a className='button is-info' href='/register'>
                                            <strong>S&#39;enregistrer</strong>
                                        </a>
                                        <a className='button is-success has-text-weight-bold' href='/login'>
                                            Se connecter
                                        </a>
                                    </>
                                )}
                            </div>
                        </div>
                    </div>
                </div>
            </nav>
        </div>
    );
}
