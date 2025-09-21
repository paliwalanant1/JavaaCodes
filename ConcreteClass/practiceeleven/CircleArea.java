package classes.ConcreteClass.practiceeleven;

public class CircleArea {
    public int radius;

    public CircleArea(int radius){
        this.radius = radius;
    }
    public void display(){
        System.out.println("Area of Circle: " + Math.PI * (radius * radius));
    }
}
