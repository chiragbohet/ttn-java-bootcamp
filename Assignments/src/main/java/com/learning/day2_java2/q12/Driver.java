package main.java.com.learning.day2_java2.q12;


/*
* 12.What will be the  output on new Child(); ?

    class Parent extends Grandparent {

        {
        System.out.println("instance - parent");
        }

        public Parent() {
        System.out.println("constructor - parent");
        }

        static {
        System.out.println("static - parent");
        }
    }

    class Grandparent {

        static {
        System.out.println("static - grandparent");
        }

        {
        System.out.println("instance - grandparent");
        }

        public Grandparent() {
        System.out.println("constructor - grandparent");
        }
    }

    class Child extends Parent {

        public Child() {
        System.out.println("constructor - child");
        }

        static {
        System.out.println("static - child");
        }

        {
        System.out.println("instance - child");
        }
    }

*
* */

/***
 * Output produced :

        static - grandparent
        static - parent
        static - child
        instance - grandparent
        constructor - grandparent
        instance - parent
        constructor - parent
        instance - child
        constructor - child

    Explanation :

        - Classes are lazy loaded (only when they are needed in the program)
        - When a object of Class child is created using new(), it implicitly calls the constructor of its parent class using super() within its constructor.
        - This constructor chaining happens all the way to Object class.
        - So the order of class loading is as follows
            1) Object
            2) Grandparent
            3) Parent
            4) Child
        - Once all these classes have been loaded, their static blocks are executed in the order in which they were loaded.
        - After this, Object instantiation is done. Which consists of two steps :
            - non static blocks are executed.
            - constructors are executed.
        - These happen in constructor execution order.

    References :

        - https://javarevisited.blogspot.com/2012/07/when-class-loading-initialization-java-example.html
        - http://www.planetofbits.com/jvm/when-are-classes-loaded-in-java/
        - https://stackoverflow.com/questions/19561332/in-what-order-do-static-blocks-and-initialization-blocks-execute-when-using-inhe


 */

class Parent extends Grandparent {

    {
        System.out.println("instance - parent");
    }

    public Parent() {
        System.out.println("constructor - parent");
    }

    static {
        System.out.println("static - parent");
    }
}

class Grandparent {

    static {
        System.out.println("static - grandparent");
    }

    {
        System.out.println("instance - grandparent");
    }

    public Grandparent() {
        System.out.println("constructor - grandparent");
    }
}

class Child extends Parent {

    public Child() {
        System.out.println("constructor - child");
    }

    static {
        System.out.println("static - child");
    }

    {
        System.out.println("instance - child");
    }
}
public class Driver {
    public static void main(String[] args) {
        new Child();
    }
}
