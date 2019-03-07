package intarray;

import java.util.*;

public class IntArray {
    
    public static void main(String[] args) {
        
        int arr [] = new int [5];
        
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<arr.length;i++){
            System.out.print("Enter an Integer:  ");
            arr[i] =sc.nextInt();
        }
        System.out.print("first to last ");
        for(int j = 0; j <arr.length; j++){
            System.out.print(arr[j]+" ");
        }
        System.out.print("\nlast to first ");
        for(int k =5; 0<k ;k-- ){
            System.out.print(arr[k-1]+" ");
            
        }
    }
    
}
