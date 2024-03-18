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
        await ReferenceService.deleteReference(id);
        fetchReferences();
    };

    useEffect(() => {
        fetchReferences();
    }, []);

    return <AdminView refs={refs} deleteCallback={removeReference} />;
}
