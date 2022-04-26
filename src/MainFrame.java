import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MainFrame extends JFrame {
  JPanel mainPanel;
  JLabel aboutLabel;
  JLabel questionLabel;
  // JRadioButton opt_1;
  // JRadioButton opt_2;
  // JRadioButton opt_3;
  // JRadioButton opt_4;

  // helyett tomb :) 

  JRadioButton[] options = new JRadioButton[4];

  JButton checkButton;

  public MainFrame() {

    this.setTitle("App");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(400, 300);
    this.setVisible(true);

    this.mainPanel = new JPanel();

    this.aboutLabel = new JLabel("Balogh Csenge, 2022.04.26, Szoft_I_N");
    this.questionLabel = new JLabel("Melyik Java GUI könyvtár?");

    for (int i=0; i<4;i++) {
      this.options[i] = new JRadioButton();

    }

    this.checkButton = new JButton("Vizsgál");


    //add components

    this.add(mainPanel);

    // add the rest to the JPanel

    this.mainPanel.add(aboutLabel);
    this.mainPanel.add(questionLabel);
    for (int i=0; i<4;i++) {
      this.mainPanel.add(options[i]);
    }
    this.mainPanel.add(checkButton);
    
  }
}
