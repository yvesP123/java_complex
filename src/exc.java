import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class exc {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> ls = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            System.out.print("please enter the number");
            String b;
            b = br.readLine();
            int a;
            a = Integer.parseInt(b);

            if (a != -1) {
                ls.add(a);
                System.out.print(ls);

            }
            else {
            for (int j = 0; j < 10; j++) {
                System.out.println("please enter the number");
                String v;
                v = br.readLine();
                int x;
                x = Integer.parseInt(v);

                if (ls.contains(x) == ls.contains(a)) {

                    System.out.println("please the number is not included");
                } else {
                    System.out.println("please the number is  included");
                }

            }
        }}
    }
}


