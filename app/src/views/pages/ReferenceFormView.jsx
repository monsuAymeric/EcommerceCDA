import { useState } from "react";
import Header from "../components/Header";
import ReferenceModel from "../../models/reference/ReferenceModel";

export default function ReferenceFormView({ reference, addCallback, modifyCallback }) {
    const [name, setName] = useState(reference.name);
    const [price, setPrice] = useState(reference.price);
    const [color, setColor] = useState(reference.color);
    const [description, setDescription] = useState(reference.description);

    const handleInputChange = (e) => {
        const { name, value } = e.target;
        switch (name) {
            case "name":
                setName(value);
                break;
            case "price":
                setPrice(value);
                break;
            case "color":
                setColor(value);
                break;
            case "description":
                setDescription(value);
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
                        <label className='label'>Nom du produit</label>
                        <div className='control'>
                            <input className='input is-dark' type='text' name='name' value={name} onChange={handleInputChange} />
                        </div>
                    </div>

                    <div className='field'>
                        <label className='label'>Prix du produit</label>
                        <div className='control'>
                            <input
                                className='input is-dark'
                                type='number'
                                name='price'
                                value={price}
                                onChange={handleInputChange}
                            />
                        </div>
                    </div>

                    <div className='field'>
                        <label className='label'>Couleur du produit</label>
                        <div className='control'>
                            <input
                                className='input is-dark'
                                type='text'
                                name='color'
                                value={color}
                                onChange={handleInputChange}
                            />
                        </div>
                    </div>

                    <div className='field'>
                        <label className='label'>Description du produit</label>
                        <div className='control'>
                            <input
                                className='input is-dark'
                                type='text'
                                name='description'
                                value={description}
                                onChange={handleInputChange}
                            />
                        </div>
                    </div>

                    <div className='field is-grouped'>
                        <div className='control'>
                            <button
                                className='button is-link'
                                onClick={() => {
                                    reference != null
                                        ? modifyCallback(
                                              new ReferenceModel(
                                                  reference.id,
                                                  name,
                                                  price,
                                                  color,
                                                  description,
                                                  reference.products
                                              )
                                          )
                                        : addCallback(new ReferenceModel(null, name, price, color, description, []));
                                }}>
                                Ajouter
                            </button>
                        </div>
                        <div className='control'>
                            <a className='button is-danger' href='/admin'>
                                Annuler
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </>
    );
}
