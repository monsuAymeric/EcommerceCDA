import { useEffect, useState } from "react";
import ReferenceService from "../../service/ReferenceService";
import HomeView from "../../views/pages/HomeView";

export default function GetHomeController() {
    const [references, setReferences] = useState([]);

    const addToCart = (id) => {
        ReferenceService.addToCart(id);
    };

    const fetchReferences = async () => {
        console.log(await ReferenceService.fetchReferences());
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
