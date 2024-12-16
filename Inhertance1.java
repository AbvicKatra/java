public class Inhertance1{
    public static void main(String[]args){
        C obj;
        obj = new C();
        obj.Dog();
        obj.Cat();
    }
    
}

class  A{
    public void Dog(){
        System.out.println("Dog is barking");
    }
}
class B extends A{
    public void Cat(){
        System.out.println("Cat is meao");
    }
}
class C extends B{
    public void Cow(){
        System.out.println("Cow is meao");
    }
}