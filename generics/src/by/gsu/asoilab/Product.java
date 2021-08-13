package by.gsu.asoilab;

import static by.gsu.asoilab.Constants.SEPARATOR;

public class Product implements Item {
    private String product;
    private Byn price;

    public Product() {
    }

    public Product(String product, Byn price) {
        this.product = product;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Byn getPrice() {
        return price;
    }

    public void setPrice(Byn price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  product +  SEPARATOR + price;
    }
}
