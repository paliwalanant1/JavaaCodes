package classes.nestedclass.practicetwelve;

class OuterAgain {
    private class Inner {
        void display() {
            System.out.println("Private inner class");
        }
    }
    public void privateClassAccess(){
        System.out.println("Object can be created, inside the Outer class");
        Inner inner = new Inner();
    }
}
