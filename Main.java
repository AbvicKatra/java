import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String []args){
        int x=0,y=0,z=0;
        Scanner scn = new Scanner(System.in);
        try {
            System.out.println("Enter the x");
            
            x=scn.nextInt();
            System.out.println("Enter the y");
            y=scn.nextInt();
        } 
        catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            scn.nextLine();
            y=scn.nextInt();
        }
        finally{  
            z=x +y;
            System.out.println("sum= "+z);
        }
        
        
    }
}
