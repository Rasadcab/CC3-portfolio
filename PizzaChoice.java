package pizzachoice;
import javax.swing.JOptionPane;
public class PizzaChoice {
    
    public static void main(String[] args) {
        int decide =0;
        do{
            double [] price ={6.99,8.99,12.50,15.00};
            String choice =JOptionPane.showInputDialog("Enter Pizza Size (S, M, L or X)");
            char a = choice.charAt(0);

            if ( a =='S'){
                JOptionPane.showMessageDialog(null,"The prize of a Small pizza is $"+price[0]);
            }else if (a=='M'){
                JOptionPane.showMessageDialog(null,"The prize of a Medium pizza is $"+price[1]);
            }else if (a=='L'){
                JOptionPane.showMessageDialog(null,"The prize of a Large pizza is $"+price[2]);
            }else if (a=='X'){
                JOptionPane.showMessageDialog(null,"The prize of a Extra Large pizza is $"+price[3]);
            }else{
            JOptionPane.showMessageDialog(null,"Invalid"," ",JOptionPane.ERROR_MESSAGE);
            } 
            decide=JOptionPane.showConfirmDialog(null, "Do you want to try again? ");
        }while(decide == JOptionPane.YES_NO_OPTION);
        if(decide == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null,"Have a nice day!");
        }
    }
}
