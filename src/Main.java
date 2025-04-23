import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int [] array= new int [10];
      for (int i=0; i<array.length;i++){
          System.out.print("Enter the number:");
          array[i]=sc.nextInt();
      }
       System.out.println(Arrays.toString(array));
      int big=0;
      int small=array[0];
      for (int i=0; i<array.length;i++){
          if(big<=array[i]){
              big=array[i];
          }
          if(array[i]<small){
              small=array[i];
          }
      }
       System.out.println("The biggest number is: "+big);
       System.out.println("The smallest number is: "+small);
      }
}
