/*
Roan Mason
03/28/24
Creating class heirarchy practice from Classes Continued 3
 */
package classhierarchypractice;

/**
 *
 * @author roanm
 */
public class ClassHierarchyPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vehicle v1 = new Truck("Roan", "Mason", true);
        Vehicle v2 = ((Truck)v1).clone();
        if (((Truck)v1).equals((Truck)v2)) {
            System.out.println("true");
        }
        
        Vehicle v3 = new Car("Roan", "Mason", 4);
        Vehicle v4 = ((Car)v3).clone();
        if (((Car)v3).equals((Car)v4)) {
            System.out.println("true");
        }

    }
    
}
