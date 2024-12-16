import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception3{
    public static void main(String []args){
        Bank obj = new Bank();
  
    
        try{

            obj.withdraw();
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException e){
        
        System.out.println(e.getMessage());
        }
    
        System.out.println("programm done       ");
     
    }
}
class Bank {
    void withdraw()throws ArithmeticException ,InputMismatchException,LowBalance{
        
        
        int ab,bal,amount;
        Scanner scn = new Scanner(System.in);
        System.out.println("enter balance");
        ab= scn.nextInt();
        System.out.println("Debit Amount");
        bal = scn.nextInt();
        amount = ab- bal;
        if(bal > ab)
        {
            throw new LowBalance();
        }
            System.out.println("balance is "+ amount);
    }
    
}
class LowBalance extends ArithmeticException{
    LowBalance(){
        System.out.println("widhdra right amount");
    }
    LowBalance(String msg){
        super("widhdra right amount "+msg);
        
    }
}