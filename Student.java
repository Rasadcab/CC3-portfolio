package student;
import java.util.Scanner;
public class Student {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        ShowStudent cab = new ShowStudent(); 
         
        System.out.print("Enter I.d No: "); 
        String idno = sc.next(); 
        cab.setIdNo(idno); 
   
        System.out.print("Enter Credit Hours: "); 
        int ch = sc.nextInt(); 
        cab.setCreditHours(ch); 
        
        System.out.println("Points Earned: " + cab.computePoints()); 
        System.out.println("GPA : " + cab.computeGpa()); 
        System.out.println("Classification: " + cab.studLevel()); 
         
    }
    
}
