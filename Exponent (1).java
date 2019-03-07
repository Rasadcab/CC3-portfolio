package exponent;
import java.util.Scanner;
public class Exponent {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner ( System.in);
        
        System.out.println("Enter an Integer ");
        int num = sc.nextInt();
        
        System.out.println("Choose to solve"
                + "\n[1] Square "
                + "\n[2] Cube");
        
        int choice = sc.nextInt();
        if(choice ==1){
            Square(num);
        
        }else if ( choice ==2){
            Cube(num);
        }else 
            System.out.println("Ginagawa mo? 1 and 2 lang po");
        
    }
    
    static int Square ( int num ){
        num = num * num;
        System.out.println("The Square of your integer is "+ num);
        return num;
    }
    static int Cube ( int num ){
        num = num * num *num;
        System.out.println("The Cube of your integer is "+ num);
        return num;
    }
    
}
