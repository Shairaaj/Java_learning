import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value1 : ");
      int num1 = sc.nextInt();
      System.out.println("Enter the value2 : ");
      int num2= sc.nextInt();

      System.out.println(num1+" "+num2);

      int temp=0;
      temp=num1;
      num1=num2;
      num2=temp;

      System.out.println(num1+" "+num2);
   }
}
