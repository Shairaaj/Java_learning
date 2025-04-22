import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the string : ");
      String st = sc.nextLine();
      String str=st.toLowerCase();
      ArrayList<Character> arr= new ArrayList<>();
      for(int i=0; i<str.length(); i++){
         char temp;
         temp=str.charAt(i);
         arr.add(temp);
      }
      ArrayList<Integer> result= new ArrayList<>();
      result= countVowCon(arr);
      System.out.println(result);
   }
   public static ArrayList<Integer> countVowCon(ArrayList<Character> arr){
      ArrayList<Integer> count= new ArrayList<>();
      int countVow=0;
      int countCon=0;
      for (int i=0; i<arr.size(); i++){
         if(arr.get(i)==' ') continue;
         if(arr.get(i)=='a' || arr.get(i)=='e'|| arr.get(i)=='i'|| arr.get(i)=='o' || arr.get(i)=='u'){
            ++countVow;
         }
         else{
            ++countCon;
         }
      }
      count.add(countVow);
      count.add(countCon);
      return count;
   }
}
