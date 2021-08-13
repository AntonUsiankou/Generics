package by.gsu.asoilab;

import static by.gsu.asoilab.Constants.*;

public class Service implements Item {
    private String serviceName;
    private Byn totalCost;
    private int numberOfUsers;

    public Service(){
    }

    public Service(String serviceName, Byn totalCost, int numberOfUsers){
        this.serviceName = serviceName;
        this.totalCost = totalCost;
        this.numberOfUsers = numberOfUsers;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Byn getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Byn totalCost) {
        this.totalCost = totalCost;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public void setNumberOfUsers(int numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
    }

    @Override
    public Byn getPrice() {
        return totalCost.multiply(NUMBER_ONE_DOT_NULL / numberOfUsers , RoundMethod.ROUND, NUMBER_NULL);
    }

    @Override
    public String toString() {
        return  serviceName +  SEPARATOR + totalCost +  SEPARATOR + numberOfUsers;
    }

}
