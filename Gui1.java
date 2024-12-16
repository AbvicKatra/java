import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui1 {

    public static void main(String[] args) {
        Myscreen screen = new Myscreen();
        screen.inIt();
        
    }  
    
}
class Myscreen{
    private JFrame frame;
    private JLabel l1;
    private JButton b1,b2,b3;

    public void inIt(){
        frame = new JFrame();
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        l1= new JLabel("");
        l1.setText("ABVIC");

        b1 = new JButton("OK");
        b3 = new JButton("somesh ");
        b2 = new JButton("Cancel");
        b1.setBounds(100, 50, 100, 60);
        b3.setBounds(200, 120, 100, 60);
        b2.setBounds(100, 200, 100, 60);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);

        frame.add(l1);
        
        
        
        frame.setVisible(true);

    }

}
