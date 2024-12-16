public class Array {
   public static void main(String[]arg){
    Main obj = new Main();
     
    obj.appand(10);

    obj.appand(20);
    obj.appand(30);
    obj.appand(40);
    obj.printArray();
    //obj.insert(100, 2);
    //obj.insert(100, 2);
    obj.edit(3,50);
    System.out.println();

  
    obj.printArray();

    System.out.println("Total element in Array "+obj.totalElement());
   }
}
class Main{
    private int  lastIndex=-1;
    private int  size =10;
    int []a= new int[size];
    public void  appand(int data){

    
        if(lastIndex < size-1){
        a[++lastIndex]= data;
        }else{
            System.out.println("Index out of bound");
        }
    }
    public void  printArray(){
        for(int n=0 ;n<=lastIndex;n++){
            System.out.println(a[n]);
        }
    }
    public boolean isEmpty(){
        return lastIndex == -1;
    }
    public void insert(int data , int index){
        lastIndex++;
        for(int n= lastIndex;n>= index-1;n--){
            a[n+1]= a[n];   
        }
        a[index-1]=data;
    }
    public int totalElement(){
        return lastIndex+1;
    }
    public void edit(int index , int value){
        if(index >-1 || index < lastIndex){
        a[index-1]= value;
        }
    else{
        System.out.println("Index out of bound ");
    } 
}
}