import javax.swing.*;

public class testPanel extends JFrame {
    public static void main(String[] args) {
    }

    private JButton buttonOK;
    private JButton depositOK;
    private JButton createOK;

    private JTextField textName;
    private JTextField password;

    public testPanel() {

        this.setSize(325, 100);
        this.setTitle("TESTING");
        this.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);



        JPanel panel1 = new JPanel();

        panel1.add(new JLabel("Enter your deposit amount: "));

        this.add(panel1);

        this.setVisible(true);

    }
}
