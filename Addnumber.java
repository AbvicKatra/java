public class Addnumber {
    public static void main(String []args){
        Main obj = new Main();
        Main.sum(5, 5);
        Main.sum(5.5, 4.3);
        obj.sum("Rahul","Jauhari");
    }
    
    
}
class Main{
    public static void sum(int x, int y){
        System.out.println("Total "+(x+y));
    }
    public static void sum(double x, double y){
        System.out.println("Total "+(x+y));
    }
    public  void sum(String x, String y){
        System.out.println("Total "+(x+y));
        
    }
}
