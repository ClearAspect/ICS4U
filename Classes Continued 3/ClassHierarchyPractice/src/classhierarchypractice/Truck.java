/*
Roan Mason
03/28/24
Truck class extends to automobile
 */
package classhierarchypractice;

/**
 *
 * @author roanm
 */
public class Truck extends Automobile {
    
    boolean hasBedLoad;
    
    public Truck(String name, String model, boolean hasBedLoad) {
        super(name, model);
        this.hasBedLoad = hasBedLoad;
    }
    
    public boolean isfull() {
        return hasBedLoad;
    }
    
    public void setLoad(boolean hasBedLoad) {
        this.hasBedLoad = hasBedLoad;
    }
    
    public Truck clone() {
        Truck newTruck = new Truck(name, model, hasBedLoad);
        return newTruck;
    }

    public boolean equals(Truck other) {
        return (other.isfull() == hasBedLoad && other.getName().equals(name) && other.getModel().equals(model));
    }
    
}
