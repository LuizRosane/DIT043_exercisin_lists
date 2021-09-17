/*
(Financial application: payroll) Write a program that reads the following information
and prints a payroll statement:

 Employee's name (e.g., Smith)
 Number of hours worked in a week (e.g., 10)
 Hourly pay rate (e.g., 9.75)
 Federal tax withholding rate (e.g., 20%)
 State tax withholding rate (e.g., 9%)
 */

package list_1_variables;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employeee's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        int hoursWorked = scanner.nextInt();

        System.out.print("Enter hourly pay rate: ");
        double hourlyPayRate = scanner.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = scanner.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateTax = scanner.nextDouble();

        scanner.nextLine();

        double grossTotal = hourlyPayRate * hoursWorked;
        double federalWithholding = grossTotal * federalTax;
        double stateWithholding = grossTotal * stateTax;
        double totalDeduction = federalWithholding + stateWithholding;
        double netPay = grossTotal - totalDeduction;

        System.out.println("Employee name: " + name + "\n" +
                            "Hours Worked: " + hoursWorked + "\n" +
                            "Pay Rate: " + hourlyPayRate + "\n" +
                            "Gross total: " + grossTotal + "\n" +
                            "--------Deductions-------" + "\n" +
                            "Federal Withholding(" + (federalTax * 100) + "%): $" + federalWithholding + "\n" +
                            "State Withholding(" + (stateTax * 100) + "%): %" + stateWithholding + "\n" +
                            "Total Deduction: $" + totalDeduction + "\n" +
                            "Net Pay: $" + netPay);

    }
}
