/*
Roan Mason
03/23/23
Part time employee extends to employee
*/
package employeepayrollsystem;

public class PartTimeEmployee extends Employee{
    
    /**
     * Constructor
     * creates a new partime employee with default attributes
     */
    public PartTimeEmployee(){
        super();
    }
    
    /**
     * Method that calculates the pay that the employee has totally received
     * @return - a double
     */
    public double getPay(){
        double pay;        
        pay = rate * hours;
        totalPay = totalPay + pay;
        return pay;
    }
}
