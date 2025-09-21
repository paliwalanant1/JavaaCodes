package classes.ConcreteClass.practicenine;

public class RectangleArea {
    public int length;
    public int width;

    public RectangleArea(int length, int width){
        this.length = length;
        this.width = width;
    }
    public void display(){
        System.out.println("Area of Rectangle: " + (length*width));
    }
}
