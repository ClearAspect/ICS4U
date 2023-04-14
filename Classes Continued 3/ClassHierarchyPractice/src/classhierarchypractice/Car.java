/*
Roan Mason
03/28/24
Car class extends to automobile
 */
package classhierarchypractice;

/**
 *
 * @author roanm
 */
public class Car extends Automobile {

    protected int numOfSeats;

    public Car(String name, String model, int numOfSeats) {
        super(name, model);
        this.numOfSeats = numOfSeats;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public Car clone() {
        Car newCar = new Car(name, model, numOfSeats);
        return newCar;
    }

    public boolean equals(Car other) {
        return (other.getNumOfSeats() == numOfSeats && other.getName().equals(name) && other.getModel().equals(model));
    }    

}

