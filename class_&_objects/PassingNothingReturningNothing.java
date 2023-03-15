public class PassingNothingReturningNothing {
    public static void m1(){
        System.out.println("m1 is method");
        return;
    }
    public static void main(String[] args) {
        System.out.println("main start");
        m1();
        System.out.println("mzin ends");
    }
}
