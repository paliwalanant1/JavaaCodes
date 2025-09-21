package classes.finalclass.practicethree;

public final class CircleArea {
    private int radius;

    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public void display(){
        System.out.println("Area of Circle: " + Math.PI * (radius*radius));
    }
}
