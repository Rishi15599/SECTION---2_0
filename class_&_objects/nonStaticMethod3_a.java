public class nonStaticMethod3_a {
    static int i=100;
    public static void wish(){
        System.out.println("wish is static");
    }
    public void show(){
        System.out.println("show is non-static");
        System.out.println(i);
        wish();
    }
    public static void main(String[] args) {
        System.out.println("main start");
        nonStaticMethod3_a n1=new nonStaticMethod3_a();
        n1.show();
        System.out.println("main ends");
    }
}
