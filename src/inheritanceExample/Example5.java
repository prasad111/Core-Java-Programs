package inheritanceExample;

// filename Main.java
class Grandparent {
    public void Print() {
        // super.Print();
        //
        System.out.println("Grandparent's Print()");
    }
}

class Parent extends Grandparent {
    public void Print() {
       // super.Print();
        System.out.println("Parent's Print()");
    }
}

class Child extends Parent {
    public void Print() {
       // super.super.Print();
        super.Print();
        System.out.println("Child's Print()");
    }
}

public class Example5 {
    public static void main(String[] args) {
        Child c = new Child();
        c.Print();
    }
}

/**
 * OUTPUT
 * Parent's Print()
 * Child's Print()
 */
