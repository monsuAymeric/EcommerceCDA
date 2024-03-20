export default class UserModel {
    id;
    username;
    password;
    email;

    constructor(id, username, password, email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
