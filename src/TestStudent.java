import java.util.Scanner;

public class TestStudent
{
    public static void main(String[] args) {
//        int aa;
//        String nn;
//        String ss;
//        String rr;
//        Scanner vb=new Scanner(System.in);
////        System.out.print("please enter the Age");
////        aa=vb.nextInt();
//        System.out.print("please enter the Sex");
//        ss=vb.next();
//        System.out.print("please enter the name");
//        nn=vb.next();
//        System.out.print("please enter the RegNumber");
//        rr=vb.next();
//
//
//        Student st=new Student(nn,ss,rr);
//        System.out.println("Name"+st.getName());
//        System.out.println("Age:"+st.getAge());
//        System.out.println("Sex:"+st.sex());
//        System.out.println("Reg:"+st.getreg());
        Student st=new Student();
        st.setage(12);
        System.out.print(st.getAge());

    }
}
