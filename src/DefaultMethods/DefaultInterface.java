package DefaultMethods;

 interface DefaultInterface {
    default void display(){
        System.out.println("this is default method :)");
    }
    void displayMore(String msg);

    static void show(String msg){
        System.out.println(msg);
    }
}

