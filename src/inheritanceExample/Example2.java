package inheritanceExample;

/**
 * IF WE WILL DECLARE STATIC KEYWORD TO SHOW() IN PARENT CLASS - IT WILL SHWO COMPILE TIME ERROR - DUPLICATE CLASS FOUND
 *
 * IF WE WILL DECLARE FINAL KEYWORD TO SHOW() IN PARENT CLASS - IT WILL SHWO COMPILE TIME ERROR - DUPLICATE CLASS FOUND
 *
 * IF WE WILL DECLARE STATIC TO BOTH THE METHODS - IT WILL RUN
 */

/**
 * NOTE
 * Final methods cannot be overridden.
 *
 */


class Base2 {
    public static void show() {
        System.out.println("Base::show() called");
    }
}

class Derived2 extends Base2 {
    public static void show() {
        System.out.println("Derived::show() called");
    }
}

class Example2 {
    public static void main(String[] args) {
        Base2 b = new Derived2();
        b.show();
    }
}
