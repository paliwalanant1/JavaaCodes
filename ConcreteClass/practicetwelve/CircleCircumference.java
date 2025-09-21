package classes.ConcreteClass.practicetwelve;

public class CircleCircumference {
    public int radius;

    public CircleCircumference(int radius){
        this.radius = radius;
    }
    public void display(){
        System.out.println("Circumference of Circle: " + 2 * Math.PI * radius);
    }
}
