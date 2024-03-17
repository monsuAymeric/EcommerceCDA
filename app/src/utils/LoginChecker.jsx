function checkLogged() {
    const user = JSON.parse(localStorage.getItem("user"));
    const cart = JSON.parse(localStorage.getItem("cart"));
    if (user && cart) {
        return true;
    }
    return false;
}

export default {
    checkLogged,
};
