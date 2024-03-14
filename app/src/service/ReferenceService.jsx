import axios from "axios";

function fetchReferences() {
    return axios.get("http://localhost:8080/refs");
}

export default {
    fetchReferences,
};
