import java.io.*;
import java.util.Scanner; 

class payStub {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Scanner scan = new Scanner( System.in );
    double hourlyWage;
    double overtimeHourlyWage;
    double hoursWorked;
    double overtimeHoursWorked;
    double totalPay;
    System.out.println("This program calculates weekly gross pay");
    System.out.println("Enter the hourly wage: ");
    hourlyWage = scan.nextDouble();
    System.out.println("Enter the number of regular hours worked: ");
    hoursWorked = scan.nextDouble();
    System.out.println("Enter the number of overtime hours worked");
    overtimeHoursWorked = scan.nextDouble();
    overtimeHourlyWage = 1.5 * hourlyWage;
    totalPay = hourlyWage * hoursWorked + overtimeHoursWorked * overtimeHourlyWage;
    System.out.println("Total pay $" + totalPay);
  }
}

