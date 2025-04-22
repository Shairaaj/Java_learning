import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number: ");
      int num = sc.nextInt();
      String str= Integer.toString(num);
      ArrayList<Integer> arr= new ArrayList<>();
      for (int i=0; i<str.length(); i++){
         int temp=0;
         temp=str.charAt(i)-'0';
         arr.add(temp);
      }
      System.out.println(arr);

      int number= reverseNumber(arr);
      System.out.println("The reversed number for "+num+ " is "+number);
   }
   public static int reverseNumber(ArrayList<Integer> arr){
      ArrayList <Integer>array= new ArrayList<>();
      for(int i= arr.size()-1; i>=0;i--) {
         array.add(arr.get(i));
      }
      System.out.println(array);
      int num=0;
      for (int digit:array){
         num=num*10+digit;
      }
      return num;
   }
}
