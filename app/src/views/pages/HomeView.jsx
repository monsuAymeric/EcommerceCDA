import Header from "../components/Header";
import ProductImage from "../../utils/ProductImages";

export default function HomeView({ references, callback }) {
    const getRandomNumber = (max) => {
        return Math.floor(Math.random() * max);
    };

    return (
        <div>
            <Header />
            <div className='columns'>
                <div className='column is-8 is-offset-2'>
                    <div className='columns is-centered is-multiline'>
                        {references
                            ? references.map((ref, i) => (
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
                                                      <div className="column is-2">
                                                          <button className='button is-info' onClick={() => callback(ref.id)}>
                                                              <span className='icon'>
                                                                  <img src='/assets/icons/plus.svg' alt='logo' />
                                                              </span>
                                                          </button>
                                                  </div>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              ))
                            : null}
                    </div>
                </div>
            </div>
        </div>
    );
}
