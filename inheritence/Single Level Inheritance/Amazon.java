public class Amazon {
    public void shopping() {
        System.out.println("shopping for mobile");
        System.out.println("shopping for fashion");
    }
}

class AmazonMiniTv extends Amazon {
    public void miniTv() {
        System.out.println("watch video free in miniTv");
        System.out.println("watch web Series , mini Movies and comedy video in miniTv");
    }
}

class Amazon_in{
    public static void main(String[] args) {
        AmazonMiniTv AMT=new AmazonMiniTv();
        System.out.println("Details in Amazon");
        AMT.shopping();
        AMT.miniTv();

    }
}
