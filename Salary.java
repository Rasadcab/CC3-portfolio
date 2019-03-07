package salary;
import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        
        System.out.println("Enter your hourly PayRate ");
        int PayRate= sc.nextInt();
        System.out.println("Enter your regular hour/s ");
        int RegularHour= sc.nextInt();
        System.out.println("Enter your Overtime hour/s ");
        int OvertimeHour = sc.nextInt();
        
        CalcuOT ( PayRate, RegularHour , OvertimeHour);
        System.out.println("Would you like to try again?" );
        int choice =sc.nextInt();
        if(choice == 1 ){
            
        CalcuOT ( PayRate, RegularHour , OvertimeHour);
        }else 
            System.out.println("Thank you");
            
    }
    static double CalcuOT(int PayRate , int RegularHour , int OvertimeHour){
        double formula = RegularHour * PayRate + OvertimeHour * 1.5 * PayRate;
        System.out.println("The calculation for your Overtime is "+ formula);
        return formula;
    }
    
}
