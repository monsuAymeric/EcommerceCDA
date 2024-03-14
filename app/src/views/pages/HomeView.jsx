import { useEffect } from "react";
import Header from "../components/Header";

export default function HomeView({ references }) {
    useEffect(() => {
        console.log(references);
    }, [references]);

    return (
        <div>
            <Header />
            <div className='columns'>
                <div className='column is-8 is-offset-2'>
                    <div className='columns is-centered is-multiline'>
                        {references
                            ? references.map((ref, i) => (
                                  <div className='column is-4' key={i}>
                                      <div className='content'>
                                          <h1>Nom du produit : {ref.name}</h1>
                                          <p>Description : {ref.description}</p>
                                          <p>Prix : {ref.price}€</p>
                                          <p>Couleur : {ref.color}</p>
                                          <p>Quantité : {ref.products.length}</p>
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
