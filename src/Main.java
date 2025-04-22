import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number: ");
      int num = sc.nextInt();
      System.out.println(checkPrime(num));
   }
   public static boolean checkPrime(int num){
      if(num%2==0 || num%3==0 || num%5==0 || num%7==0){
         return false;
      }return true;
   }
}
