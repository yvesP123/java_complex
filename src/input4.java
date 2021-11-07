import javax.swing.*;
public class input4{
    public static void main(String args[]){
        JOptionPane op=new JOptionPane();
        String N1=op.showInputDialog("Enter Number  1:");
        int a=Integer.parseInt(N1);
        String N2=op.showInputDialog("Enter Number 2:");
        int b=Integer.parseInt(N2);
        int c=a*b;
        op.showMessageDialog(null, "the  \nProduct= "+c);
    }
}
