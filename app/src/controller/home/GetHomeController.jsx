import { useEffect, useState } from "react";
import ReferenceService from "../../service/ReferenceService";
import CartService from "../../service/CartService";
import HomeView from "../../views/pages/HomeView";

export default function GetHomeController() {
    const [references, setReferences] = useState([]);

    const addToCart = (id) => {
        CartService.addToCart(id);
    };

    const fetchReferences = async () => {
        const refs = await ReferenceService.fetchReferences();
        setReferences(() => {
            return refs;
        });
    };

    useEffect(() => {
        fetchReferences();
    }, []);

    return <HomeView references={references} callback={addToCart}/>;
}
