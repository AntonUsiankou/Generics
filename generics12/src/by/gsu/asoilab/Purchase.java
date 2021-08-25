package by.gsu.asoilab;

import static by.gsu.asoilab.Constants.NUMBER_NULL;

public class Purchase <T extends Item, N extends Number>{
    private T item;
    private N number;

    public Purchase(){
    }

    public Purchase(T item, N number) {
        this.item = item;
        this.number = number;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public N getNumber() {
        return number;
    }

    public void setNumber(N number) {
        this.number = number;
    }

    public Byn getCost() {
        return item.getPrice().multiply(number.doubleValue(), RoundMethod.CEIL, NUMBER_NULL);
    }
    @Override
    public String toString() {
        return item + Constants.SEPARATOR + number + Constants.SEPARATOR + getCost();
    }
}
