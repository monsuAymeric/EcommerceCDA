import axios from "axios";
import ReferenceModel from "../models/reference/ReferenceModel";
import ProductModel from "../models/product/ProductModel";

/**
 * @returns {ReferenceModel[]} An array of all references
 */
async function fetchReferences() {
    const res = await axios.get("http://localhost:8080/refs");
    let references = [];
    res.data.forEach((ref) => {
        let newRef = new ReferenceModel(ref.id, ref.name, ref.price, ref.color, ref.description, ref.products);
        references.push(newRef);
    });
    return references;
}

/**
 * @param {number} id The id of the reference to fetch
 * @returns {[ProductModel]} An array of all products in this reference
 */
async function fetchProducts(id) {
    const res = await axios.get("http://localhost:8080/refs/" + id);
    let products = [];
    res.data.products.forEach((product) => {
        let newProduct = new ProductModel(product.id);
        products.push(newProduct);
    });
    return products;
}

/**
 * @param {ProductModel[]} products The products in the cart.
 * @returns {[{products: ProductModel, references: ReferenceModel}]} A map of all products in the cart with their corresponding reference.
 */
async function fetchReferencesByProducts(products) {
    let refs = [];
    for (let i = 0; i < products.length; i++) {
        let product = new ProductModel(products[i].id);
        const res = await axios.post("http://localhost:8080/refs/product", product);
        refs.push({ product: product, ref: res.data });
    }
    return refs;
}

export default {
    fetchReferences,
    fetchProducts,
    fetchReferencesByProducts,
};
