package classes.singletonclass.singleseven;

public class Check {
    private static Check check;
    private Check(){}
    public static Check getCheck(){
        synchronized(Check.class){
            if(check == null){
                check = new Check();
            }
            return check;
        }
    }
}
