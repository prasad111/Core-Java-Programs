package inheritanceExample;

/**
 * the overrided method inside child class should be superior than the parent class
 * if the method in super class is private, then the overrided method inside child class must be provate or more superior than private
 *
 * if you declare method as protected and u declared the overrided method in child class as private
 * then it will show error
 *
 */

class Base4 {
    private void foo() { System.out.println("Base"); }
}

class Derived4 extends Base4 {
    protected void foo() { System.out.println("Derived"); }
}

public class Example4_PrivateMethodAccess {
    public static void main(String args[]) {
        Base4 b = new Derived4();
//        b.foo();  // it will show compile time error - foo have private access
    }
}

/**
 * OUTPUT
 * it will show compile time error - foo have private access
 */