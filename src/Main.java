import java.util.*;
public class Main {
   public static void main(String[] args){
      int[] nums={1,1,1,2,2,3};
      int k=2;
      HashMap<Integer,Integer> hashMap= new HashMap<>();
      for(int num: nums){
         hashMap.put(num, hashMap.getOrDefault(num,0)+1);
      }
      System.out.println(hashMap);
      List<int[]>list= new ArrayList<>();
      for(Map.Entry<Integer,Integer> entry: hashMap.entrySet()){
         list.add(new int[]{entry.getValue(),entry.getKey()});
      }
      list.sort((a,b)->(b[0]-a[0]));
      int[] arr= new int[k];
      for(int i=0; i<k; i++){
         arr[i]=list.get(i)[1];
      }
      System.out.println(Arrays.toString(arr));
   }
}