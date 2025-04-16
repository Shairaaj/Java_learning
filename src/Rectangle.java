public class Rectangle{
    float l;
    public Rectangle(){
        this(12.0f,12);
        System.out.println(this.l);
    }
    public Rectangle(float l,float b){
        this.l=l;

        System.out.println(this.l+" from Constructor 1");
    }

    public float Area(){
        return this.l;
    }
}
