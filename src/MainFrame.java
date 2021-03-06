import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MainFrame extends JFrame {
  JPanel mainPanel;
  JPanel buttonPanel;
  JLabel aboutLabel;
  JLabel questionLabel;

  String[] answers = {
    "jgui",
    "swing",
    "window",
    "jwindow"
  };

  JRadioButton[] options = new JRadioButton[4];
  ButtonGroup bGroup;
  JButton checkButton;
  JButton delButton;
  JButton exitButton;

  public MainFrame() {

    // create components
    this.mainPanel = new JPanel();
    this.buttonPanel = new JPanel();
    this.aboutLabel = new JLabel("Balogh Csenge, 2022.04.26, Szoft_I_N");
    this.questionLabel = new JLabel("Melyik Java GUI könyvtár?");

    for (int i=0; i<4;i++) {
      this.options[i] = new JRadioButton(answers[i]);
    }

    this.bGroup = new ButtonGroup();
    this.checkButton = new JButton("Vizsgál");
    this.delButton = new JButton("Törlés");
    this.exitButton = new JButton("Kilépés");

    // add components
    this.add(mainPanel);

    this.mainPanel.setLayout(
      new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS)
    );

    this.mainPanel.add(aboutLabel);
    this.mainPanel.add(questionLabel);
    for (int i=0; i<4;i++) {
      this.mainPanel.add(options[i]);
      this.bGroup.add(options[i]);
    }

    this.mainPanel.add(buttonPanel);
    this.buttonPanel.setLayout(
      new BoxLayout(buttonPanel, BoxLayout.LINE_AXIS)
    );
    this.buttonPanel.add(checkButton);
    this.buttonPanel.add(delButton);
    this.buttonPanel.add(exitButton);

    this.checkButton.addActionListener(a -> verifyAnswer());
    this.delButton.addActionListener(a -> deleteAnswer());
    this.exitButton.addActionListener(a -> exitProgram());

    // frame settins
    this.setTitle("App");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(400, 300);
    this.setVisible(true);

  }

  private void verifyAnswer() {
    if (this.options[1].isSelected()) {
      this.setTitle("Helyes válasz");
    } else {
      this.setTitle("Rossz válasz");
    }
  }

  private void deleteAnswer() {

    for(int i=0;i<4;i++) {
      this.bGroup.clearSelection();
    }
  }

  private void exitProgram() {
    System.exit(0);
  }
}
