import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
// * Frame: The Frame is the container that contain title bar and border and can have menu bars. 
// * It can have other components like button, text field, scrollbar etc. Frame is most widely used container while developing an AWT application.
public class Frame {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame(); //instance of frame class
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

        // * setting background colr:
        frame.getContentPane().setBackground(Color.BLACK);
        frame.getContentPane().setBackground(Color.BLUE);
        //Range is 0 to 255
        frame.getContentPane().setBackground(new Color(255,255,255));  // * white
        frame.getContentPane().setBackground(new Color(0,255,255)); // * blue tone
        frame.getContentPane().setBackground(new Color(255,0,255)); // * Pink
        //using hexadecimal value of colors: can search on google for hexadecimal numbers of all the colors.
        frame.getContentPane().setBackground(new Color(0x123456)); // * dark blue
        frame.getContentPane().setBackground(new Color(0x126742)); //* green 
    }
}
