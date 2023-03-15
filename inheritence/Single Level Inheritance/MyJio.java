/**
 * MyJio
 */
class MyJio {

    public void mobile(){
        System.out.println("Mobile details");
        System.out.println("Mobile recharge");
    }
}


class WithMyJio extends MyJio {
    public void Jiofiber(){
        System.out.println("jiofiber details");
        System.out.println("jiofiber recharge");
    }
}

class NewMyJio{
    public static void main(String[] args) {
        WithMyJio jio=new WithMyJio();
        System.out.println("Details of my jio app :");
        jio.mobile();
        jio.Jiofiber();
    }
}