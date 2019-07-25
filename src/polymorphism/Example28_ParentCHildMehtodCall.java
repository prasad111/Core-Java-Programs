package polymorphism;

class A28{
    public void show(){
        System.out.println("Inside SHow Of Parent");
    }

    public void methodOne(){
        System.out.println("Inside methodOne Of Parent");
    }
}

class B28 extends A28{
    public void show(){
        System.out.println("Inside SHow Of Chile");
    }

    public void methodTwo(){
        System.out.println("Inside methodOne Of Parent");
    }
}

public class Example28_ParentCHildMehtodCall {
    public static void main(String...args){

        A28 a28 = new A28();
        a28.show();
        a28.methodOne();
//        a28.methodTwo();  // Compile time error
        A28 a = new B28();
        a.methodOne();
        a.show();
//        a.methodTwo();  // Compile time error
    }
}
