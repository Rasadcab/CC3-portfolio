package airplane;

import java.util.Scanner;

public class Airplane {
    public static char tab[][]= new char [13][6];
    public static void main(String[] args) {
        upuan();
        upuan2();
    }
    public static void upuan(){
        
        
        for(int i =0; i<13;i++){
            for(int j=0; j<6;j++){
                tab[i][j] = '*';
                System.out.print("\t"+tab[i][j]);
            }
            System.out.println("");
        }
        
    }
    public static void upuan2(){
        Scanner sc = new Scanner (System.in);
        System.out.println("\nEnter ticket type:"
                           + "\n[1] First Class\n"
                           + "[2] Business\n"
                           + "[3] Economy");
        int choice=sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Enter rows[1-3]");
                int row=sc.nextInt();
                System.out.println("Enter column[1-6]");
                int col=sc.nextInt();
                
                if(row>=1 && row <=3){
                    if(tab[row-1][col-1]=='X'){
                        System.out.println("The seat is occupied");
                        
                    }else{
                        tab[row-1][col-1]='X';
                        for (int z =0; z <13; z++){
                            for(int x=0;x<6;x++){
                                System.out.print("\t"+tab[z][x]);
                            }
                            System.out.println("");
                        }
                    }
                }else {
                    System.out.println("Enter 1-3 only. Thank you!");
                }
                break;
            case 2:
                System.out.println("Enter rows[4-8]");
                int row1=sc.nextInt();
                System.out.println("Enter column[1-6]");
                int col1=sc.nextInt();
                if(tab[row1-1][col1-1]=='X'){
                    System.out.println("The seat is occupied");
                }else
                    if(row1 >=4 && row1<=8){
                        tab[row1-1][col1-1]='X';
                        for (int z =0; z <13; z++){
                            for(int x=0;x<6;x++){
                                System.out.print("\t"+tab[z][x]);
                            }
                            System.out.println("");
                        }
                    }else{
                        System.out.println("Enter 4-8 only. Thank you!");
                    }
                break;
            case 3:
                System.out.println("Enter rows[9-13]");
                int row2=sc.nextInt();
                System.out.println("Enter column[1-6]");
                int col2 =sc.nextInt();
                if(tab[row2-1][col2-1]=='X'){
                    System.out.println("The seat is occupied");
                }else
                    if(row2 >=9 && col2<=13 ){
                        tab[row2-1][col2-1]='X';
                        for (int z =0; z <13; z++){
                            for(int x=0;x<6;x++){
                                System.out.print("\t"+tab[z][x]);
                            }
                            System.out.println("");
                        }
                    }
                    else{
                        System.out.println("Enter 9-13 only. Thank you!");
                    }
                break;
            default:
                System.out.println("Enter 1-3 only. Thank you!");
        }
        
        int decide2=0;
        System.out.println("Would you like to try again?"
                           + "\n[1]yes"
                           + "\n[2]no");
        decide2=sc.nextInt();
        if(decide2==1){
            upuan2();
        }else
            System.out.println("Thank you!");
    }
}