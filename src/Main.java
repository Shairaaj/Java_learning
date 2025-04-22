import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the string 1: ");
      String str1= sc.nextLine();
      System.out.println("Enter the string 2:");
      String str2= sc.nextLine();

      char [] arr1= new char[str1.length()];
      char [] arr2= new char[str2.length()];

      for (int i=0; i<str1.length(); i++){
         arr1[i]=str1.charAt(i);
      }
      for (int j=0; j<str2.length(); j++){
         arr2[j]=str2.charAt(j);
      }
      System.out.println(Arrays.toString(arr1)+"\n"+Arrays.toString(arr2));
      System.out.println(isAnagram(arr1,arr2));
   }
   public static boolean isAnagram(char[] arr1, char[] arr2){
      ArrayList<Character> array= new ArrayList<>();
      outer:
      for (int i=0; i< arr1.length; i++){
         for(int j=0; j<arr2.length; j++){
            if(arr1[i]==arr2[j]){
               array.add(arr1[i]);
               continue outer;
            }
         }
      }
      if(array.size()==arr1.length){
         return true;
      }
      return false;
   }
}
