export default class ReferenceModel {
    id;
    name;
    price;
    color;
    description;
    products;

    constructor(id, name, price, color, description, products) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.color = color;
        this.description = description;
        this.products = products;
    }
}
