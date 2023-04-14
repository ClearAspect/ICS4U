/*
Roan Mason
03/22/23
Program that recieves input from the user to calculate the pay of an employee
*/
package employeepayrollsystem;

import java.util.Scanner;

public class EmployeePayrollSystem {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //instantiate scanner
        //variables
        Employee emp;
        String name;
        int type = -1;
        double rate;
        int hours;
        String prompt;
        boolean moreInput = true;
        boolean invalidType;
        boolean invalidRate;
        boolean invalidHours;

        while (moreInput) { //While program is running
            //prompt user for input
            System.out.println("Enter employee data");
            System.out.println("  Name(or q to quit):");
            name = reader.nextLine(); //read input
            if (name.equalsIgnoreCase("q")) { //if user is done then end the program
                moreInput = false;
            } else {
                
                invalidType = true; //start the loop
                while (invalidType) {
                    prompt = " Type (" + Employee.getTypeRules() + ")";
                    System.out.println(prompt); //prompt user
                    type = Integer.parseInt(reader.nextLine()); //get input
                    if (Employee.typeOK(type)) { //check if type is valid
                        invalidType=false;
                    }
                }

                
                if (type == 1) { //depending on the type, insiantiate the correct employee object
                    emp = new FullTimeEmployee();
                } else {
                    emp = new PartTimeEmployee();
                }
                emp.setName(name);
                
                invalidRate = true; //start the loop
                while (invalidRate) {
                    prompt = " Hourly Rate (" + Employee.getRateRules() + "): ";
                    System.out.println(prompt); //prompt user
                    rate = Double.parseDouble(reader.nextLine()); //get input
                    if (emp.setRate(rate)) { //if rate is valid then end the loop
                        invalidRate = false;
                    }
                }

                invalidHours = true; //start the loop
                while (invalidHours){
                    prompt = " Hours worked (" + Employee.getHoursRules() + "): ";
                    System.out.println(prompt); //prompt user
                    hours = Integer.parseInt(reader.nextLine()); //get input
                    if(emp.setHours(hours)){ //if # of hours is valid then end the loop
                        invalidHours = false;
                    }
                }
            
                //output employee information to user
                System.out.println(" The weekly pay for " + emp.getName() + " is " + emp.getPay());
            }

        }
        //output total pay of employees
        System.out.println("\nTotal pay: " + Employee.getTotalPay());
    }

}
