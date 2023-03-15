public class staticMethod1_a {
    static int i = 100;
    static boolean b = true;

    public static int m1() {
        System.out.println("m1 is int return type");
        return 5;
    }

    public static void m2() {
        System.out.println("m2 return type is void");
        System.out.println(i);
        System.out.println(b);
        System.out.println(m1());
        System.out.println("m2 ends");
    }

    public static void main(String[] args) {
        System.out.println("main start");
        m2();
        System.out.println("main ends");
    }
}
