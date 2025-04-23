import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the sentence : ");
      String st = sc.nextLine();
      String sent= st.toUpperCase();
      String sentence= sent.replaceAll("[ .;]","");
      int size=sentence.length();
      System.out.println(checkPangram(sentence,size));

   }
   public static boolean checkPangram(String sentence,int size){
      ArrayList<Character> arr= new ArrayList<>();
      for (int i=0; i<sentence.length();i++){
         int digit= sentence.charAt(i);
         for (int j=65; j<=90; j++){
            if(digit==j){
               arr.add(sentence.charAt(i));
            }
         }
      }
      return arr.size()==size;

   }
}
