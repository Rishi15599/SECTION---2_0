class Marker{
    String brand;
    String color;
    double price;
    static String board = "white board";
    Marker(String markerBrand, String markerColor, double markerPrice){
        brand=markerBrand;
        color=markerColor;
        price=markerPrice;
    }
    public static void main(String[] args) {
        System.out.println("First marker details");
        Marker m1=new Marker("camlin","black",35.5);
        System.out.println("-marker brand : "+m1.brand+"\n-marker color : "+m1.color+"\n-marker price : "+m1.price+"\n-borad :"+board);
        System.out.println("=============================================================");
        System.out.println("Second marker details");
        Marker m2=new Marker("cello","blue",25.5);
        System.out.println("-marker brand : "+m2.brand+"\n-marker color : "+m2.color+"\n-marker price : "+m2.price+"\n-borad :"+board);

    }
}