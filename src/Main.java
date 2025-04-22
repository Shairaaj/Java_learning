import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value1 : ");
      int num1 = sc.nextInt();
      System.out.println("Enter the value2 : ");
      int num2= sc.nextInt();

      System.out.println(num1+" "+num2);
      // 10    ,     7
      num2= num1+num2; //17
      num1=num2-num1;  //7
      num2= num2-num1;




      System.out.println(num1+" "+num2);
   }
}
