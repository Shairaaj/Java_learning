import java.util.Scanner;

public class Main{
   public static void main(String [] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the number");
      int num= sc.nextInt();

      int num1=0;
      int num2=1;
      int n=0;
      System.out.println("The number "+(n++)+ " is "+num1);
      System.out.println("The number "+(n++)+ " is "+num2);
      int temp=0;
      for(int i=num-1; i>0; i--){
         temp = num1 + num2;
         System.out.println("The number " + (n++) + " is " + temp);
         num1=num2;
         num2=temp;
      }
   }
}