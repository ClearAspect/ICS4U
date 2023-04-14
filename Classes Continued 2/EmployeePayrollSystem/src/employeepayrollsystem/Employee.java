/*
Roan Mason
03/23/23
Abstract class with methods that all employee type objects must have 
*/
package employeepayrollsystem;

abstract public class Employee {    
    
    protected String name;
    protected double rate;
    protected int hours;
    
    /**
     * Constructor
     * Creates employee with default attributes
     */
    public Employee(){
        name = "";
        rate = 0;
        hours = 0;
    }
    
    /**
     * Mutator
     * sets the name of the employee if it is valid. Then returns a boolean
     * @param nm - new name
     * @return - a boolean
     */
    public boolean setName(String nm){
        if (nm.equals("")){ //if the name contains no characters
            return false; //Name not changed. return false
        }else{ //if name has characters
            name = nm; //update name
            return true; 
        }
    }
    
    /**
     * Mutator
     * sets the rate of the employee if it is valid. then returns a boolean
     * @param rt - new rate
     * @return - a boolean
     */
    public boolean setRate(double rt){
        if (!(LOW_RATE <= rt && rt <=HIGH_RATE)){ //if the new rate isnt valid
            return false; //dont update rate. return false
        }else{ //if rate is between the parameters
            rate = rt; //update rate
            return true;
        }
    }
    
    /**
     * Mutator
     * sets the number of hours an employee has worked if it is valid. then returns a boolean
     * @param hrs - number of hours
     * @return - a boolean
     */
    public boolean setHours(int hrs){
        if (!(LOW_HOURS <= hrs && hrs <=HIGH_HOURS)){ //if hours isnt valid
            return false; //return false
        }else{ //if hours is between the parameters
            hours = hrs; //update the number of hours
            return true;
        }
    }
    
    /**
     * Acccessor
     * returns the name of the employee
     * @return - a string
     */
    public String getName(){
        return name;
    }
    
    //method that all subclasses must have
    abstract public double getPay();
    
    //instantiate variables
    public static double LOW_RATE = 6.75;
    public static double HIGH_RATE= 30.50;
    public static int LOW_HOURS = 1;
    public static int HIGH_HOURS= 60;
    
    protected static double totalPay = 0;
    
    /**
     * Accessor?/Method
     * returns the rules to the user
     * Names must not be blank
     * @return - a String
     */
    public static String getNameRules(){
        return "nonblank";
    }
    
    /**
     * Accessor?/Method
     * returns the rules to the user
     * They type must be 1 or 2
     * @return - a String
     */
    public static String getTypeRules(){
        return "1 or 2";
    }
    
    /**
     * Accessor?/Method
     * returns the rules to the user
     * The rates that the user can input
     * @return - a String
     */
    public static String getRateRules(){
        return getRule(LOW_RATE,HIGH_RATE);
    }
    
    /**
     * Accessor?/Method
     * returns the rules to the user
     * The number of hours the user can input
     * @return - a String
     */
    public static String getHoursRules(){
        return getRule(LOW_HOURS,HIGH_HOURS);
    }
    
    /**
     * Method
     * Checks if the type inputed is valid
     * @return - a boolean
     */
    public static boolean typeOK (int type){
        return type == 1 || type == 2;
    }
    
    /**
     * Accessor
     * returns the total pay of the employee
     * @return 
     */
    public static double getTotalPay(){        
        return totalPay;
    }
    
    /**
     * 
     * @param low
     * @param high
     * @return 
     */
    public static String getRule(double low, double high){        
        return "between " + low + " and  " + high + ", inclusive" ;
    }
     
    
}
