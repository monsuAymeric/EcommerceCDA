import UserModel from "../../models/user/UserModel";
import UserService from "../../service/UserService";
import RegisterView from "../../views/pages/RegisterView";

export default function GetRegisterController() {
    const register = async (username, email, password) => {
        const user = new UserModel(null, username, email, password);
        await UserService.createUser(user);
        window.location.assign("/login");
    };

    return <RegisterView callback={register} />;
}
