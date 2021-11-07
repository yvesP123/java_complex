import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class input3
{
    public static void main(String[] args)throws IOException
    {
        int a;
        int b;
        int c;
        int avg;
        String q,w,t;
        BufferedReader ty=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the marks 1");
        q=ty.readLine();
        a=Integer.parseInt(q);
        System.out.println("enter the marks 2");
        w=ty.readLine();
        b=Integer.parseInt(w);
        System.out.println("enter the marks 3");
        t=ty.readLine();
        c=Integer.parseInt(t);
        avg=(a+b+c)/3;
        System.out.println("the average of those three number is "+avg);

    }
}
