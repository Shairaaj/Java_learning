public class Main{
    public static void main(String [] args) {
        int[] array ={32,23,234};
        try{
            System.out.println(array[2]/0);
        }catch(Exception expt1){
            System.out.println(expt1);
        }
        System.out.println("hi");
   }
}