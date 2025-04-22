import java.util.*;
public class Main {
   public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the string: ");
      String st= sc.nextLine();
      String str= st.toUpperCase();
      ArrayList<Character> arr= new ArrayList<>();
      for (int i=0; i<str.length(); i++){
         arr.add(str.charAt(i));
      }
      System.out.println(arr);
      String pal=(isPalindrome(arr)?"The given string "+st+" is palindrome":"The given string "+st+" is not palindrome");
      System.out.println(pal);
      }
   public static boolean isPalindrome(ArrayList<Character>arr){
      int n=arr.size();
      for(int i=0;i<n/2;i++){
         if(arr.get(i)!=arr.get(n-1-i)){
            return false;
         }
      }return true;
   }
}