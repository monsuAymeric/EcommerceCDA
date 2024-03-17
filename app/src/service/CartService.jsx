import axios from "axios";
import CartModel from "../models/cart/CartModel";
import ReferenceService from "./ReferenceService";

async function addToCart(id) {
    const products = await ReferenceService.fetchProducts(id);
    let cart = JSON.parse(localStorage.getItem("cart"));
    cart.products.push({ id: products[0].id });
    const response = await axios.put("http://localhost:8080/carts", cart);
    localStorage.setItem("cart", JSON.stringify(cart));
    return response;
}

async function removeFromCart(id) {
    let cart = JSON.parse(localStorage.getItem("cart"));
    cart.products = cart.products.filter((product) => product.id !== id);
    const response = await axios.put("http://localhost:8080/carts", cart);
    localStorage.setItem("cart", JSON.stringify(cart));
    return response;
}

async function emptyCart() {
    let cart = JSON.parse(localStorage.getItem("cart"));
    cart.products = [];
    console.log("Cart is empty", cart);
    const response = await axios.put("http://localhost:8080/carts", cart);
    console.log("Cart is empty", response);
    localStorage.setItem("cart", JSON.stringify(cart));
    return response;
}

async function fetchCart(id) {
    const response = await axios.get("http://localhost:8080/carts/" + id);
    const cart = new CartModel(response.data.id, response.data.user, response.data.products);
    localStorage.setItem("cart", JSON.stringify(cart));
    return cart;
}

export default {
    addToCart,
    removeFromCart,
    emptyCart,
    fetchCart,
};
