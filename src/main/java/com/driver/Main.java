// Class A with method meth
class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

// Class B extending A
class B extends A {
    // Overriding method meth
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

// Main class to test method overriding
public class Main {
    public static void main(String[] args) {
        // Creating object of class B
        B objB = new B();

        // Calling method meth of class A using objB
        String str1 = objB.meth();
        System.out.println( str1);

        // Calling overridden method meth of class B using objB
        String str2 = objB.meth();
        System.out.println(str2);
    }
}
