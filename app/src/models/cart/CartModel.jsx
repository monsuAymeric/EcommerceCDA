export default class CartModel {
    id;
    user;
    products;

    constructor(id, user, products) {
        this.id = id;
        this.user = user;
        this.products = products;
    }
    
}