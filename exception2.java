import java.util.InputMismatchException;
import java.util.Scanner;

public class exception2 {
    public static void main(String []args){
        int x,y;
        System.out.println("enter the value");
        Scanner scn = new Scanner(System.in);
        try {
            
            x= scn.nextInt();
            y= scn.nextInt();
            int z =x/y;
            System.out.println(z);

        }
        catch(InputMismatchException e){
            System.out.println("pls input value "+e.getMessage());
        }
        catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Finally chal gya ");
        }
        
        int a,b;
        System.out.println("enter the value");
        scn.nextLine();
        a= scn.nextInt();
        b= scn.nextInt();
        int c =a+b;
        System.out.println("sum= "+c);
    }
    
}
