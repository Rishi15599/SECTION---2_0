class staticMain{
    static int i=50;
    public static void m1(){
        System.out.println("m1() is static");
        System.out.println(i);
        System.out.println(staticMain.i);
    }
    public static void main(String[] args) {
        System.out.println("Main start");
        System.out.println(i);
        m1();
        staticMain.m1();
        System.out.println("Main End");
    }
}