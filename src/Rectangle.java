public class Rectangle{
    float l;
    float b;
    public Rectangle(float l, float b){
        this.l=l;
        this.b=b;
        System.out.println(this.l+" from Constructor 1");
    }

    public float Area(){
        return this.l*this.b;
    }
}
