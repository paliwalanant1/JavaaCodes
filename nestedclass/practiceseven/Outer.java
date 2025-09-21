package classes.nestedclass.practiceseven;

public class Outer {
    public class Animal{
        public void sound(){
            System.out.println("Animal generate sound");
        }
    }
    public class Cat extends Animal{
        @Override
        public void sound(){
            super.sound();
            System.out.println("Cat Meoww Meoww");
        }
    }
}
