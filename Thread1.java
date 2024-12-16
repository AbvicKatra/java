public class Thread1 {
    public static void main(String []args){
        A obj1 = new A();
        B obj2 = new B();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
            
    }
    
}
class A implements Runnable{
    public void run(){
        f();
    }
    public void f(){
        for(int n=0 ; n<100;n++){
            System.out.println("n= "+n);
        }
    }
   
}
class B implements Runnable{
    public void run(){
        f();
    }
    public void f(){
        for(int n=0 ; n<100;n++){
            System.out.println("a "+n);
        }
    }
    
}
