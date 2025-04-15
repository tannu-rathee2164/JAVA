class Overload {
    void test() {       // No parameter
        System.out.println("No parameter");
    }
    void test(int a) {          // one parameter
        System.out.println("a: " + a);
    }
    void test(int a, int b) {       // two parameter
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }
    double test(double a) {
        System.out.println("Double a: " + a);
        return a*a;
    }
}

public class OverloadingDemo {
    public static void main(String[] args) {
        Overload o1 = new Overload();
        o1.test();
        o1.test(10);
        o1.test(10,20);
        double result = o1.test(10.25);
        System.out.println("Result statement: " + result);
    }
}
