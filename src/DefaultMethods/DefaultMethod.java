package DefaultMethods;

public class DefaultMethod implements DefaultInterface{
     public void displayMore(String msg) {
         System.out.println(msg);
    }
    @Override
    public void display(){
        System.out.println("Hello Override Default Method !!");
    }

    public static void main(String[] args){
        DefaultMethod defaultMethod = new DefaultMethod();
         defaultMethod.display();
         defaultMethod.displayMore("Hello Raj Abstract Method");
         DefaultInterface.show("Hello Raj Static");
    }


}
