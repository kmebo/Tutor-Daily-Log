import javax.swing.*;

public class TutorGUI extends JFrame{
    private JCheckBox tutoringCheckBox;
    private JTextField studentFirstName;
    private JTextField studentLastName;
    private JTextField studentID;
    private JTextField courseName;
    private JTextField courseNumber;
    private JTextField instructorFirstName;
    private JTextField instructorLastName;
    private JTextField timeIN;
    private JTextField timeOut;
    private JTextField textField1;
    private JPanel MainPanel;
    private JButton saveButton;

    public TutorGUI(){
        setContentPane(MainPanel);
        setTitle("Daily Log");
        setSize(700, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
