package by.gsu.asoilab;

import static by.gsu.asoilab.Constants.*;

public class PurchaseUtils {
    private Purchase purchase;

    public PurchaseUtils() {
    }

    public PurchaseUtils(Purchase purchase) {
        this.purchase = purchase;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void printPurchase(){
        System.out.println(purchase);
    }

    public void printCost(){
        System.out.println(COST_EQUALS + purchase.getCost() + BYN);
    }

    public void printCostDiff(Purchase pur) {
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

    public void printIsSameCost(Purchase ... purchases){
        String str = Constants.EMPTY;
        System.out.println(Constants.SAME);
        for (Purchase pur : purchases) {
            if (pur.getCost().equals(purchase.getCost())) {
                System.out.println(pur);
            } else {
                str = Constants.NOT_FOUND;
            }
        }
        System.out.println(str);
    }
}
