import Header from "../components/Header";
import ProductImage from "../../utils/ProductImages";
import { useEffect, useState } from "react";

export default function CartView({ products, callback, validCallback }) {
    const [totalPrice, setTotalPrice] = useState(0);

    useEffect(() => {
        let total = 0;
        if (products && products.length > 0) {
            products.forEach((product) => {
                total += product.ref.price;
            });
        }
        setTotalPrice(total);
    }, [products]);

    const getRandomNumber = (max) => {
        return Math.floor(Math.random() * max);
    };

    return (
        <>
            <Header />
            <div className='column is-8 is-offset-2'>
                {products && products.length > 0 ? (
                    <div className='columns is-centered mb-6 is-flex is-align-items-center'>
                        <p className='has-text-weight-bold is-size-4 mr-3'>Total : {totalPrice}€</p>
                        <a className='button is-primary' onClick={validCallback}>
                            Valider le panier
                        </a>
                    </div>
                ) : null}
                <div className='columns is-centered'>
                    {products && products.length > 0 ? (
                        products.map((product, i) => (
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
                                                <p className='title is-6'>{product.ref.name}</p>
                                                <p className='subtitle is-6'>{product.ref.price}€</p>
                                            </div>
                                        </div>
                                        <div className='columns'>
                                            <div className='column is-10'>
                                                <div className='content'>
                                                    <p>
                                                        {product.ref.description} <br />
                                                        Couleur {product.ref.color} <br />
                                                    </p>
                                                </div>
                                            </div>
                                            <button className='button is-info' onClick={() => callback(product.product.id)}>
                                                <span className='icon'>
                                                    <img src='/assets/icons/minus.svg' alt='logo' />
                                                </span>
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        ))
                    ) : (
                        <h1 className='title'>Votre panier est vide.</h1>
                    )}
                </div>
            </div>
        </>
    );
}
