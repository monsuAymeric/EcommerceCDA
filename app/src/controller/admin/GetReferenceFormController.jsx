import { useEffect, useState } from "react";
import ReferenceFormView from "../../views/pages/ReferenceFormView";
import ReferenceService from "../../service/ReferenceService";
import { useParams } from "react-router-dom";
import ReferenceModel from "../../models/reference/ReferenceModel";
import ProductModel from "../../models/product/ProductModel";

export default function GetReferenceFormController() {
    const [reference, setReference] = useState(new ReferenceModel(null, null, null, null, null, null));

    const { id } = useParams();

    const fetchReference = async (idRef) => {
        const refs = await ReferenceService.fetchReferenceById(idRef);
        setReference(() => {
            return refs;
        });
    };

    useEffect(() => {
        if (id) fetchReference(id);
    }, []);

    const addReference = async (ref) => {
        ref.products = [new ProductModel()];
        await ReferenceService.addReference(ref);
        fetchReference();
    };
    
    const modifyReference = async (ref) => {
        ref.products = [new ProductModel()];
        await ReferenceService.updateReference(ref);
        fetchReference();
    };

    return <ReferenceFormView reference={reference} addCallback={addReference} modifyCallback={modifyReference} />;
}
