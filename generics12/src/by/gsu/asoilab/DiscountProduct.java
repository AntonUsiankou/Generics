package by.gsu.asoilab;

import static by.gsu.asoilab.Constants.SEPARATOR;

public class DiscountProduct extends Product {
    private Byn priceDiscount;

    public DiscountProduct(){
    }

    public DiscountProduct(String product, Byn price, Byn priceDiscount){
        super(product, price);
        this.priceDiscount = priceDiscount;
    }

    public Byn getPriceDiscount() {
        return priceDiscount;
    }

    public void setPriceDiscount(Byn priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    @Override
    public Byn getPrice() {
        return super.getPrice().subtraction(priceDiscount);
    }

    @Override
    public String toString() {
        return priceDiscount + ";";
    }
}
