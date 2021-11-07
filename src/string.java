import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class string
{
    public static void main(String[] args) throws IOException {
//        DataInputStream ob=new DataInputStream(System.in);
//        System.out.println("please enter the number a");
//      String s,y;
//            int a,b,c;
//            s=ob.readLine();
//            a=Integer.parseInt(s);
//        System.out.println("please enter the number b");
//            y=ob.readLine();
//            b=Integer.parseInt(y);
//
//            c=a+b;
//            System.out.println("the sum is "+c);
//        String word="Programing";
//        for(int i=0;i<word.length();i++)
//      //  {
//            System.out.println(Character.toString(word.charAt(2)));
//
//      //  }
//        File mn=new File("C:\\Users\\Students\\Desktop\\vb.txt");
//        Scanner cs=new Scanner(mn);
//
//        while(cs.hasNext())
//        {
//            System.out.print(cs.next());
//        }
//

        LinkedList<String> mm=new LinkedList<>();
        BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
        for(int i=0;i<10;i++)
        {
          mm.add(br.readLine());
            if (mm.equals(-1))
            {
                System.out.print("please enter the number");

                if (mm.contains(br.readLine()))
                {
                    System.out.print(mm);
                }
            }


        }






    }
}
