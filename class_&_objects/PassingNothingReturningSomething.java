public class PassingNothingReturningSomething {
    public static double m1(){
        System.out.println("mi return type is double");
        return 3.5;
    }
    public static void main(String[] args) {
        m1();
        System.out.println(m1());
    }
}
