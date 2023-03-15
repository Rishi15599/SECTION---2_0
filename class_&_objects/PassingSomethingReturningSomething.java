public class PassingSomethingReturningSomething {
    public static double m1(int i, String s){
        System.out.println(i);
        System.out.println(s);
        return 4.5;
    }
    public static void main(String[] args) {
        System.out.println(m1(10, "java"));
    }
}
