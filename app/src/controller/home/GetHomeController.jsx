import { useEffect, useState } from "react";
import ReferenceService from "../../service/ReferenceService";
import HomeView from "../../views/pages/HomeView";
import ReferenceModel from "../../models/reference/ReferenceModel";

export default function GetHomeController() {
    const [references, setReferences] = useState([]);

    const fetchReferences = async () => {
        console.log(await ReferenceService.fetchReferences());
        const references = await ReferenceService.fetchReferences();
        console.log("references", references);
        let newReferences = [];
        references.data.forEach((ref) => {
            console.log("ref", ref);
            let newRef = new ReferenceModel();
            newRef.id = ref.id;
            newRef.name = ref.name;
            newRef.price = ref.price;
            newRef.color = ref.color;
            newRef.description = ref.description;
            newRef.products = ref.products;
            newReferences.push(newRef);
        });
        setReferences(() => {
            return newReferences;
        });
    };

    useEffect(() => {
        fetchReferences();
    }, []);

    return <HomeView references={references} />;
}
