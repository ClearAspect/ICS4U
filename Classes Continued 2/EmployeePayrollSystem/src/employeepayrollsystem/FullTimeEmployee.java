/*
Roan Mason
03/23/23
Full time employee that extends to Employee
*/
package employeepayrollsystem;

public class FullTimeEmployee extends Employee{
    
    /**
     * Constructor
     * Creates a full time employee with default attributes
     */
    public FullTimeEmployee(){
        super(); 
    }
    
    /**
     * Method
     * Calculates and returns the pay of the employee
     * @return - a double
     */
    public double getPay(){
        double pay;
        if(hours <=40){ //hours are less than 40
            pay = rate * hours;
        }else{ //incorporate overtime
            pay = rate * 40 + (rate * 2 * (hours - 40));
        }
        totalPay = totalPay + pay;
        return pay;
    }
}
