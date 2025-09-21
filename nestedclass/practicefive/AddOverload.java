package classes.nestedclass.practicefive;

public class AddOverload {
    public class Inner{
        public int add(int a, int  b){
            return a + b;
        }
        public int add(int a, int b, int c){
            return (a + b + c);
        }
    }
}
