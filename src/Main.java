import java.sql.SQLOutput;
import java.util.*;
public class Main {
   public static void main(String[] args){
       String s= "dog cat dog cat";
       String[] str= s.split(" ");
      System.out.println(Arrays.toString(str));
       String pattern= "abba";
       pattern=pattern.strip();
       LinkedHashSet<Character> sP= new LinkedHashSet<>();
       
       for(Character c: pattern.toCharArray()){
          sP.add(c);
       }
       LinkedHashSet<String> sS = new LinkedHashSet<>(Arrays.asList(str));

       LinkedHashMap<String,Character> linkedHashMap= new LinkedHashMap<>();
       Iterator<Character> i1= sP.iterator();
       Iterator<String> i2= sS.iterator();

       while(i1.hasNext() && i2.hasNext()){
          linkedHashMap.put(i2.next(),i1.next());
       }
      System.out.println(linkedHashMap);
       int i=0;
       for(String st: str){
          if(linkedHashMap.get(st)!=pattern.charAt(i)){
             System.out.println("false");
          }
          i++;
       }
   }
}