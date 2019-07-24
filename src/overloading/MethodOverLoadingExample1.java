package overloading;

public class MethodOverLoadingExample1 {

    public static void main(String...args){
        Child1 child1 = new Child1();
        child1.display();
        child1.show();
        Super1 child2 = new Child1();
        child2.display();
        child2.show();
    }
}

class Super1{
    public static void display(){
        System.out.println("inside display of super1");
    }

    public void show(){
        System.out.println("inside show of super1");
    }
}

class Child1 extends Super1{
    public static void display(){
        System.out.println("inside display of Child1");
    }

    public void show(){
        System.out.println("inside show of Child1");
    }
}
