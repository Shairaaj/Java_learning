import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the value:");
      String str= sc.nextLine();  //MCMXCIV
      HashMap<Character,Integer> LHMap= new LinkedHashMap<>();
      LHMap.put('I',1);
      LHMap.put('V',5);
      LHMap.put('X',10);
      LHMap.put('L',50);
      LHMap.put('C',100);
      LHMap.put('D',500);
      LHMap.put('M',1000);
      System.out.println(LHMap);
      HashMap<String,Integer> combinedStr= new LinkedHashMap<>();
      combinedStr.put("IV",4);
      combinedStr.put("IX",9);
      combinedStr.put("XL",40);
      combinedStr.put("XC",90);
      combinedStr.put("CD",400);
      combinedStr.put("CM",900);
      ArrayList <String> arr = new ArrayList<>();
      ArrayList<Character> singleChar= new ArrayList<>();
      for (String sub : combinedStr.keySet()) {
         if (str.contains(sub)) {
            str=str.replace(sub,"");
            System.out.println(str);
            arr.add(sub);
            System.out.println(arr);
         }
      }
      System.out.println(str);

      for (int i=0; i<str.length();i++){
         singleChar.add(str.charAt(i));
      }
      System.out.println(singleChar);
      int result=0;
       for (Character character : singleChar) {
           if (LHMap.containsKey(character)) {
               result = result + LHMap.get(character);
           }
       }
      System.out.println("Single Character: "+result);

       for(String s: arr){
          if(combinedStr.containsKey(s)){
             result=result+combinedStr.get(s);
          }
       }
      System.out.println("Final result: "+result);
   }
}

