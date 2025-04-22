import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number: ");
      int num = sc.nextInt();
      ArrayList <Integer> array= new ArrayList<>();
      array=checkPrime(num);
      System.out.println(array);
   }
   public static ArrayList<Integer> checkPrime(int num){
      ArrayList <Integer> arr= new ArrayList<>();
      int j=0;
      for(int i=2; i<=num; ++i){
         if(i==2 || i==3 || i==5 || i==7){
            continue;
         }
         if(i%2==0 || i%3==0 || i%5==0 || i%7==0){
            continue;
         }
         else{
            arr.add(i);
            ++j;
         }
      }
      return arr;
   }
}
