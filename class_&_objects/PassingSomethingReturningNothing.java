public class PassingSomethingReturningNothing {
    public static void m1(int i,String s){
        System.out.println(i);
        System.out.println(s);
    }
    public static void main(String[] args) {
        m1(10, "java");
    }
}