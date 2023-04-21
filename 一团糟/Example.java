package Practice;

public class Example {
    private class InnerClass implements Increamtable{
        @Override
        public void increment() {
            System.out.println("Increamtable interface have been initialized");
        }

        @Override
        public void text() {
            System.out.println("this is one text");
        }
    }
    public Increamtable getIN(){
        return new InnerClass();
    }
}
