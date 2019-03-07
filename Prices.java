package prices;
import java.util.*;

public class Prices {

    public static void main(String[] args) {
        int decide =0;
        do{
            int SPri[]=new int [20];
            Scanner sc= new Scanner (System.in);

            System.out.println("\nEnter 20 prices ");
            for(int i =0; i<SPri.length;i++){
                System.out.print("$ ");
                SPri[i]=sc.nextInt();
            }
            System.out.println("\nEnter a number of your choice: \n"
                    + "[1]sum of all prices\n"
                    + "[2]Values less than $5.00\n"
                    + "[3]Average of the prices\n"
                    + "[4]Prices that are higher than the calculated average\n");

            System.out.print("You pick:  ");
            int choice = sc.nextInt();

            if (choice == 1){
                int sum=Arrays.stream(SPri).sum();
                System.out.println("The sum of all prices: "+sum);
            }else if(choice == 2){
                System.out.print("\nValues less than $5.00 are:  ");
                for(int j=0; j<SPri.length;j++){
                    if(SPri[j]< 5.00){
                        System.out.print(" "+SPri[j]+",");
                    } 
                }
            }else if(choice == 3){
                int sum=Arrays.stream(SPri).sum();
                double ave=(double)sum/SPri.length;
                System.out.println("The Average of all prices: "+ave);
            }
            else if (choice == 4){
                int sum=Arrays.stream(SPri).sum();
                double ave=(double)sum/SPri.length;

                System.out.println("Price that higher than ave:  ");
                for(int k=0; k<SPri.length;k++){
                    if(SPri[k]>ave){
                        System.out.print(SPri[k]+", ");
                    }
                }
            }
            System.out.println("\nWould you like to try again? \n"
                    + "[1] YES\n"
                    + "[2] NO\n");
            System.out.print("You pick:  ");
            decide=sc.nextInt();
            
        
            if(decide == 1){
                
            }
            else if(decide ==2 ){
                System.out.println("\nHave a nice day!");
                break;
            }
        }while(true );
    }
    
}
