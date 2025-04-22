import java.util.*;
public class Main{
   public static void main(String [] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the number");
      int num= sc.nextInt();

      String str= Integer.toString(num); //Converted to String
      System.out.println(str.length());
      int arr[] = new int[str.length()]; //Initialized an array
      for (int i=0; i< arr.length; i++)   {
         arr[i]= str.charAt(i)-'0';
         System.out.println(arr[i]);
      }
      System.out.println("The array is "+ Arrays.toString(arr));
      System.out.println(sumDigits(arr));
      }
      public static int sumDigits(int[] arr){
      int temp=0;
      for(int i=0; i<arr.length; i++){
         temp=arr[i]+temp;
      }
      return temp;
   }
}