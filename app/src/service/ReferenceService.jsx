import axios from "axios";
import ReferenceModel from "../models/reference/ReferenceModel";

async function fetchReferences() {
    const res = await axios.get("http://localhost:8080/refs");
    let references = [];
    res.data.forEach((ref) => {
        let newRef = new ReferenceModel(ref.id, ref.name, ref.price, ref.color, ref.description, ref.products);
        references.push(newRef);
    });
    return references;
}

export default {
    fetchReferences,
};
