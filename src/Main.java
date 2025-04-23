import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the sentence : ");
      String st = sc.nextLine();
      String stUp= st.toUpperCase();
      String str= stUp.replaceAll("[. ;:,]","");
      System.out.println(str);
      System.out.println(checkPalindrome(str));
   }
   public static boolean checkPalindrome(String str){
      for (int i=0; i<str.length()/2; i++){
         if(str.charAt(i)!=str.charAt(str.length()-1-i)){
            return false;
         }
      }return true;
   }
}
