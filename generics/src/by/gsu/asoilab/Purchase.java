package by.gsu.asoilab;

import static by.gsu.asoilab.Constants.NUMBER_NULL;
import static by.gsu.asoilab.Constants.SEPARATOR;

public class Purchase {
    private Item product;
    private double number;

    public Purchase(){
    }

    public Purchase(Item product, double number){
        this.product = product;
        this.number = number;
    }

    public Item getProduct() {
        return product;
    }

    public void setProduct(Item product) {
        this.product = product;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public Byn getCost() {
        return product.getPrice().multiply(number, RoundMethod.CEIL, NUMBER_NULL);
    }

    @Override
    public String toString() {
        return  product +  SEPARATOR + number;
    }
}
