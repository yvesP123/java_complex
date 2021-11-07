public class detail
{
    private int Age;
    private String name;
    private String Gender;
    private String Address;
   public detail()
    {
//        Age=12;
        name="yves";
        Gender="male";
        Address="kigali";
    }
    public void set_values(int r,String n,String g,String a)
    {
        Age=r;
        name=n;
        Gender=g;
        Address=a;
    }

//    @Override
//    public String toString() {
//        return "detail{" +
//                "Age=" + Age +
//                ", name='" + name + '\'' +
//                ", Gender='" + Gender + '\'' +
//                ", Address='" + Address + '\'' +
//                '}';
//    }
    public int getAge()
    {return Age;}
    public String getName() {
        return name;
    }
        public String getGender(){
            return Gender;

    }
    public String getAddress() {
        return Address;
    }
}
