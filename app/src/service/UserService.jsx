import axios from "axios";
import UserModel from "../models/user/UserModel";

async function fetchUsers() {
    const response = await axios.get("http://localhost:8080/users");
    let users = [];
    response.data.map((user) => users.push(new UserModel(user.id, user.username, null, user.email)));
    return users;
}

async function createUser(user) {
    const response = await axios.post("http://localhost:8080/users", user);
    return response.data;
}

export default {
    fetchUsers,
    createUser,
};
