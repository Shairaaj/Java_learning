import java.util.*;
public class Main {
   public static void main(String[] args){
      String[] str= new String[]{"neat","code","love","you"};
      String convStr= encode(str);
      System.out.println(convStr);
      String[] deStr= decode(convStr,str.length);
   }
   public static String encode(String[] str){
      StringBuilder stb= new StringBuilder();
      for(String s: str){
         int n= s.length();
         stb.append(n);
         stb.append(s);
         stb.append('#');
      }
      return new String(stb);
   }
   public static String[] decode(String str,int n){
      String[] res= new String[n];
      System.out.println(str.length());
      int pos=0; int i=0; int skip= str.charAt(pos)-'0'; int range=0; range=skip;
      while(range<str.length()) {
         if (str.charAt(range + 1) == '#') {
            String subStr = str.substring(pos + 1, range+1);
            res[i] = subStr;
            System.out.println(Arrays.toString(res));
            i++;
         }
         if(i<n){
         pos=range+2;
         System.out.println("First value:"+pos);
         skip = str.charAt(range+2)-'0';
         System.out.println("Skip value: "+skip);
         range=range+skip+2;
      }
         else{
            break;
         }
      }
      return res;
   }
}
