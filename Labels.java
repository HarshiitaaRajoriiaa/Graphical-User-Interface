// * JLabel is used to display a short string or an image icon. JLabel can display text, image or both
import java.awt.Color;
import javax.swing.*;

public class Labels {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("frame.jpg");
        JLabel label = new JLabel();
        label.setText("Bro, do you even code?"); 
        JLabel label2 = new JLabel("Hey bro!!!");
        label.setIcon(image);
        








        JFrame frame = new JFrame(); 
        frame.setTitle("Labels");
        frame.setVisible(true); 
        frame.setSize(400,400);
        frame.getContentPane().setBackground(new Color (0x9E9EE8));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);


    }
}
