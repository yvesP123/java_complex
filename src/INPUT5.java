import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class INPUT5
{
    public static void main(String[] args) throws IOException {
        float a;
        String s1;
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please enter the number a");
//        s1=reader.readLine();
        s1=reader.readLine();
        a=Float.parseFloat(s1);
        if (a%2==0){

            System.out.println("the number you entered is even");
        }
        else
        {
            System.out.println("the number you entered is odd");
        }



    }
}
