 class MAin
{
    private String name;
    private String sex;
    private int Age;

    public void set_value(String n, String s, int a)
    {
        name=n;
        sex=s;
        Age=a;


    }
    String getdata()
    {
        return name;
    }
    String getSex()
    {
        return sex;
    }
    int getAge()
    {
        return Age;
    }


}
public class strundet {


    public static void main(String[] args) {
        MAin nmn=new MAin();
        nmn.set_value("kaman","Male",12);
        System.out.print(nmn.getAge());
        System.out.print(nmn.getdata());
        System.out.print(nmn.getSex());


    }
}
