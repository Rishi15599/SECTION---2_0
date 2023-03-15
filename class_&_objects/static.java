class static {
    static int i=100;
    static double d=5.3;
}
class main_class{
    static char ch='j';
    static boolean b=true;
    public static void wish(){
        System.out.println("wish is in mainClass");
    }
    public static void main(String[] args) {
        System.out.println("============ some class member ===========");
        System.out.println(ch);
        System.out.println(b);
        wish();
        System.out.println("=============== different class member =============");
        // System.out.println(static.i);
        // System.out.println(static.d);
    }
}

