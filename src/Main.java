import java.util.*;
public class Main {
   public static void main(String[] args) {
       String s="leetcode";
       StringBuilder sb= new StringBuilder();
       HashMap<Character,Integer> alpha= new HashMap<>();
       for(char i = 'a'; i<='z'; i++){
           alpha.put(i,i-'a'+1);
       }
       for(int i=0; i<s.length();i++){
           char c;
           c=s.charAt(i);
           sb.append(alpha.get(c));
       }
       System.out.println(sb);
       int k=0;
       int sum=0;
       while(k<2) {
           sum=0;
           int num=0;
           for (int i = 0; i < sb.length(); i++) {
               num = sb.charAt(i)-'0';
               sum += num;
           }
           sb = new StringBuilder();
           System.out.println(sum);
           sb.append(sum);
           k++;
       }
       System.out.println(sum);
   }
}