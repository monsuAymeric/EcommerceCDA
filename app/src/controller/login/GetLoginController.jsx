import UserModel from "../../models/user/UserModel";
import UserService from "../../service/UserService";
import CartService from "../../service/CartService";
import LoginView from "../../views/pages/LoginView";

export default function GetLoginController() {
    const login = async (email, password) => {
        const attempt = await UserService.login(email, password);
        if (attempt !== "failure") {
            const cart = await CartService.fetchCart(attempt);
            localStorage.setItem("user", JSON.stringify(new UserModel(cart.user.id, cart.user.username, null, email)));
            localStorage.setItem("cart", JSON.stringify(cart));
            window.location.assign("/");
        } else {
            // TODO: show error message
        }
    };
    return <LoginView callback={login} />;
}
