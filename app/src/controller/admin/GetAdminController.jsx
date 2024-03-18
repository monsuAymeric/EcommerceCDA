import { useEffect, useState } from "react";
import AdminView from "../../views/pages/AdminView";
import ReferenceService from "../../service/ReferenceService";

export default function GetAdminController() {
    const [refs, setRefs] = useState(null);

    const fetchReferences = async () => {
        const refs = await ReferenceService.fetchReferences();
        setRefs(() => {
            return refs;
        });
    };

    const removeReference = async (id) => {
        const res = await ReferenceService.deleteReference(id);
        console.log(res);
        if (res === 500) {
            alert("Le produit est dans le panier d'un utilisateur");
        } else {
            fetchReferences();
        }
    };

    useEffect(() => {
        fetchReferences();
    }, []);

    return <AdminView refs={refs} deleteCallback={removeReference} />;
}
