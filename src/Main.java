public class Main{
    public static void main(String [] args) {
        String str1= "Rahul";
        String str2= new String("Rahul");
        String str3= new String("Rahul");
        String str4= "Rahul";

        System.out.println(str1==str4);
        System.out.println(str2==str3);
        System.out.println(str1==str2);
        System.out.println(str3.equals(str2));
    }
}