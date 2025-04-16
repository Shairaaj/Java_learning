public class Main {
   public static void main(String[] args) {
      float l=12;
      float b=12;
      Rectangle rec2 = new Rectangle();
      Rectangle rec1 = new Rectangle(l,b);
      float area= rec1.Area();
      System.out.println(area);
   }
}