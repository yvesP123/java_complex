import java.util.Scanner;

public class Students
{
    public static void main(String[] args) {
        detail obj=new detail();
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("please enter the Age");
        a=sc.nextInt();
        System.out.println("please enter the Name");
        String b;
        b=sc.next();
        System.out.println("please enter the Gender");
        String c;
        c=sc.next();
        String d;
        System.out.println("please enter the Address");
        d=sc.next();

        obj.set_values(a,b,c,d);
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
        System.out.println(obj.getGender());
        System.out.println(obj.getAddress());
    }
}
