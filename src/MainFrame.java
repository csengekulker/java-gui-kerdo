import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class MainFrame extends JFrame {
  JLabel aboutLabel;
  JLabel questionLabel;
  // JRadioButton opt_1;
  // JRadioButton opt_2;
  // JRadioButton opt_3;
  // JRadioButton opt_4;

  // helyett tomb :) 

  JRadioButton[] options = new JRadioButton[4];
  public MainFrame() {

    this.setTitle("App");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(400, 300);
    this.setVisible(true);
  }
}
