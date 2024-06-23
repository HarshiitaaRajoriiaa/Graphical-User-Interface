import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
// * Frame: The Frame is the container that contain title bar and border and can have menu bars. 
// * It can have other components like button, text field, scrollbar etc. Frame is most widely used container while developing an AWT application.
public class Frame {
    public static void main(String[] args) {
        // * USING OBJECT INSTANCE FOR MAKING FRAMES:
        JFrame frame = new JFrame(); //instance of this class
        frame.setVisible(true); //setVisible() to make frame visible
        frame.setSize(400,400); //setSize() to set size
        frame.setTitle("my first frame");
        // frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //do nothing even when user is clicking the red cross button
        // frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //hide the frame , but frame will work in the background
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit the frame on close
        frame.setResizable(false); //prevent from being resize manually with cursor

        // * setting custom image on the place of normal java logo:
        ImageIcon image = new ImageIcon("frame.jpg");
        frame.setIconImage(image.getImage());

        // * setting background color:
        frame.getContentPane().setBackground(Color.BLACK);
        frame.getContentPane().setBackground(Color.BLUE);
        //Range is 0 to 255
        frame.getContentPane().setBackground(new Color(255,255,255));  // * white
        frame.getContentPane().setBackground(new Color(0,255,255)); // * blue tone
        frame.getContentPane().setBackground(new Color(255,0,255)); // * Pink
        //using hexadecimal value of colors: can search on google for hexadecimal numbers of all the colors.
        frame.getContentPane().setBackground(new Color(0x123456)); // * dark blue
        frame.getContentPane().setBackground(new Color(0x126742)); //* green 

        // * Calling constructor of Frame1 class:
        Frame1 frame1 = new Frame1();
        new Frame1();
        
    }
}


// * frame making as Inheritance:
class Frame1 extends JFrame{
    Frame1(){
        this.setTitle("second frame");
        this.setVisible(true);
        this.setSize(500 ,500);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(0x121313));
        ImageIcon image = new ImageIcon("frame.jpg");
        this.setIconImage(image.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

}
