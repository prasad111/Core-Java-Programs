package polymorphism.overloading;


class A29{
    public float show(){
        System.out.println("Inside SHow Of Parent");
        return 0.0f;
    }

    public void methodOne(){
        System.out.println("Inside methodOne Of Parent");
    }
}

class B29 extends A29 {
    public int show(){
        System.out.println("Inside SHow Of Chile");
        return 12;
    }

    public void methodTwo(){
        System.out.println("Inside methodOne Of Parent");
    }
}

public class Example_MethodOverriding {
    public static void main(String...args){

         A29 a28 = new A29();
        a28.show();
        a28.methodOne();
//        a28.methodTwo();  // Compile time error
        A29 a = new B29();
        a.methodOne();
        a.show();
//        a.methodTwo();  // Compile time error
    }
}
