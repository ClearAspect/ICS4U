/*
Roan Mason
03/28/24
Automobile implements vehicle
 */
package classhierarchypractice;

/**
 *
 * @author roanm
 */
abstract class Automobile implements Vehicle {
    
    protected String name, model;
    protected double velocity;
    
    public Automobile(String name, String model) {
        this.name = name;
        this.model = model;
    }
    
    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }
    
    public final String getModel() {
        return model;
    }

    public final void setModel(String name) {
        this.model = model;
    }

    public final double getVelocity() {
        return velocity;
    }

    public final void setVelocity(double velocity) {
        this.velocity = velocity;
    }
    
    
}
