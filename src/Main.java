import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number: ");
      int num = sc.nextInt();

      String st= Integer.toString(num);
      int [] arr= new int[st.length()];
      for (int i=0;i<arr.length; i++){
         arr[i]=st.charAt(i)-'0';
      }
      int greatest= greatestNum(arr);
      System.out.println("The greatest number is: "+greatest);
   }
   public static int greatestNum(int[] arr){
      int greatest =arr[0];
      for(int digit: arr){
         if(digit>=greatest){
            greatest=digit;
         }
      }
      return greatest;
   }
}
