import java.util.*;
public class Main {
   public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the number: ");
      int num= sc.nextInt();

      String str = Integer.toString(num);
      ArrayList<Integer> arr = new ArrayList<>();
      for (int i = 0; i < str.length(); i++) {
         int temp;
         temp=str.charAt(i)-'0';
         arr.add(temp);
      }
      System.out.println("The array is:"+arr);

      String arm=isAmstrong(arr,num)?"The given number "+num+" is an armstrong number":"The given number "+num+" is not an Armstrong number";
      System.out.println(arm);

   }
   public static boolean isAmstrong(ArrayList<Integer> arr,int num) {
      int n=arr.size();
      long temp=0;
      for (int i:arr){
         temp= (long)((Math.pow(i,n))+temp);
         System.out.println(temp);
      }
      return num==temp;
   }
}
