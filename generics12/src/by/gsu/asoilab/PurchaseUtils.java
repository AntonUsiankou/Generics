package by.gsu.asoilab;

import static by.gsu.asoilab.Constants.*;

public class PurchaseUtils <T extends Item, N extends Number>{
    private Purchase <T, N> purchase;

    public PurchaseUtils() {
    }

    public PurchaseUtils(Purchase <T, N> purchase) {
        this.purchase = purchase;
    }

    public Purchase <T, N> getPurchase() {
        return  purchase;
    }

    public void printPurchase(){
        System.out.println(purchase);
    }

    public void printCost(){
        System.out.println(COST_EQUALS + purchase.getCost() + BYN);
    }

    public void printCostDiff(Purchase <? extends Item, ? extends Number> pur) {
        Byn costDiff = purchase.getCost().subtraction(pur.getCost());
        String result = costDiff + BYN;
        int diffCompare = purchase.getCost().compareTo(pur.getCost());
        if (diffCompare > NUMBER_NULL) {
            result = Constants.POSITIVE_DIFF + result;
        } else if (diffCompare < NUMBER_NULL) {
            result = Constants.NEGATIVE_DIFF + result;
        }
        System.out.println(result);
    }

    public void printIsSameCost(Purchase <? extends Item, ? extends Number>... purchases){
        boolean isEqual = false;
        System.out.println(Constants.SAME);
        for (Purchase<? extends Item, ? extends Number> p : purchases) {
            if (p.getCost().equals(purchase.getCost())) {
                isEqual = true;
                break;
            }
        }
        if (isEqual) {
            System.out.println(Constants.FOUND);
        } else {
            System.out.println(Constants.NOT_FOUND);
        }
    }
}
