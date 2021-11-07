import java.io.DataInputStream;
import java.io.IOException;

public class input2
{
    public static void main(String[] args)throws IOException
    {
        String a,b,c,d,e;
        DataInputStream dt=new DataInputStream(System.in);
        int n;
        System.out.println("Enter the names");
        b=dt.readLine();
        System.out.println("Enter the Sex");
        c=dt.readLine();
        System.out.println("Enter the Age");
        a=dt.readLine();
        n=Integer.parseInt(a);
        System.out.println("Your name is: "+b);
        System.out.println("Your Sex is: "+c);
        System.out.println("Your Age is: "+n);
    }
    }
