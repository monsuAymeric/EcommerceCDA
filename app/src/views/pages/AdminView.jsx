import Header from "../components/Header";
import ProductImage from "../../utils/ProductImages";
import { Link } from "react-router-dom";

export default function AdminView({ refs, deleteCallback }) {
    const getRandomNumber = (max) => {
        return Math.floor(Math.random() * max);
    };

    return (
        <>
            <Header />
            <div className='columns is-centered is-multiline'>
                <div className='column is-full is-flex is-justify-content-space-around'>
                    <a className='button is-success' href='/refForm'>
                        Ajouter un nouvel article
                    </a>
                </div>
                {refs
                    ? refs.map((ref, i) => (
                          <div className='column is-4' key={i}>
                              <div className='card'>
                                  <div className='card-image'>
                                      <figure className='image is-4by3'>
                                          <img src={ProductImage[getRandomNumber(5)]} alt='Product' />
                                      </figure>
                                  </div>
                                  <div className='card-content'>
                                      <div className='media'>
                                          <div className='media-content'>
                                              <p className='title is-6'>{ref.name}</p>
                                              <p className='subtitle is-6'>{ref.price}€</p>
                                          </div>
                                      </div>
                                      <div className='columns'>
                                          <div className='column is-10 content'>
                                              <p>
                                                  {ref.description} <br />
                                                  Couleur {ref.color} <br />
                                                  Stock: {ref.products.length} <br />
                                              </p>
                                          </div>
                                          <Link className='button is-warning mr-3' to={"/refForm/" + ref.id}>
                                              <span className='icon'>
                                                  <img src='/assets/icons/pen.svg' alt='modifier' />
                                              </span>
                                          </Link>
                                          <button
                                              className='button is-danger'
                                              onClick={() => {
                                                  deleteCallback(ref.id);
                                              }}>
                                              <span className='icon'>
                                                  <img src='/assets/icons/trash.svg' alt='supprimer' />
                                              </span>
                                          </button>
                                      </div>
                                  </div>
                              </div>
                          </div>
                      ))
                    : null}
            </div>
        </>
    );
}
