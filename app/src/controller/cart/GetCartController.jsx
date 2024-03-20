import { useEffect, useState } from "react";
import CartView from "../../views/pages/CartView";
import CartService from "../../service/CartService";
import ReferenceService from "../../service/ReferenceService";

export default function GetCartController() {
    const [products, setProducts] = useState();
    const [refs, setRefs] = useState();

    const fetchRefs = async () => {
        const refs = await ReferenceService.fetchReferencesByProducts(products);
        setRefs(() => {
            return refs;
        });
    };

    const fetchProducts = async () => {
        const user = JSON.parse(localStorage.getItem("user"));
        const cart = await CartService.fetchCart(user.id);
        setProducts(() => {
            return cart.products;
        });
    };

    useEffect(() => {
        fetchProducts();
    }, []);

    useEffect(() => {
        if (products && products.length > 0) fetchRefs();
    }, [products]);

    const removeFromCart = async (id) => {
        await CartService.removeFromCart(id);
        fetchProducts();
    };

    const emptyCart = async () => {
        await CartService.emptyCart();
        window.location.reload();
    };

    return <CartView products={refs} callback={removeFromCart} validCallback={emptyCart} />;
}
