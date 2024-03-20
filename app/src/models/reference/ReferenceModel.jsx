export default class ReferenceModel {
    id;
    name;
    price;
    color;
    description;
    products;

    /**
     * 
     * @param {number} id 
     * @param {string} name 
     * @param {number} price 
     * @param {string} color 
     * @param {string} description 
     * @param {ProductModel[]} products 
     */
    constructor(id, name, price, color, description, products) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.color = color;
        this.description = description;
        this.products = products;
    }
}
