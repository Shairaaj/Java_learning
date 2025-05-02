import java.util.*;
public class Main {
   public static void main(String[] args) {
       int num=30;
       int count=0;
       for(int i=1; i<=num; i++){
           String n=Integer.toString(i);
           int sum=0;
           for(int j=0;j<n.length();j++){
               sum+=n.charAt(j)-'0';
           }
           if(sum%2==0){
               ++count;
           }
       }
       System.out.println(count);
   }
}