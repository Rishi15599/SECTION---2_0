class demo {
    static char ch = 'A';
    static boolean b = true;

    public static void display() {
        System.out.println("display is in demo class");
    }
}

public class staticMethod1_b {
    static int i = 50;
    static double d = 4.3;

    public static void wish() {
        System.out.println("wish is in static method class");
        demo.display();
        System.out.println(demo.ch);
        System.out.println(demo.b);
    }

    public static void fly() {
        System.out.println("fly is in static method class");
        wish();
    }

    public static void main(String[] args) {
        System.out.println("main start");
        fly();
        System.out.println("main ends");
    }
}
