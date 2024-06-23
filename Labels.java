// * JLabel is used to display a short string or an image icon. JLabel can display text, image or both
import javax.swing.*;

public class Labels {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); 
        frame.setTitle("Labels");
        frame.setVisible(true); 
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel();
        label.setText("Label01");
        


    }
}
