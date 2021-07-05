
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Namer extends JFrame {

    public static void main(String[] args) {
        Namer part1 = new Namer();
    }

    private JButton buttonOK;
    private JButton depositOK;
    private JButton createOK;
    private JButton test;
    private JButton submitbutton;
    private JButton depositbutton;
    private JTextField deposit_amount;

    private JTextField textName;
    private JTextField password;

    public Namer() {
        this.setSize(325, 100);
        this.setTitle("Banking Application");
        this.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);

        ButtonListener bl = new ButtonListener();

        JPanel panel1 = new JPanel();

        panel1.add(new JLabel("Enter your deposit amount: "));
//            textName = new JTextField(15);
//            panel1.add(textName);
//
//            password = new JTextField(15);
//            panel1.add(password);

        buttonOK = new JButton("OK");
        buttonOK.addActionListener(bl);
        depositOK = new JButton("depost");
        depositOK.addActionListener(bl);
        createOK = new JButton("create account");
        createOK.addActionListener(bl);
        test = new JButton("test");
        test.addActionListener(bl);
        depositbutton = new JButton("deposit");
        depositbutton.addActionListener(bl);

        panel1.add(test);
        panel1.add(buttonOK);
        panel1.add(depositOK);
        panel1.add(createOK);

        this.add(panel1);

        this.setVisible(true);
    }


//public static JPanel newPanel() {
//    JPanel panel_testing = new JPanel();
//
//    panel_testing.setSize(325,100);
//    panel_testing.setTitle("Banking Application");
//    panel_testing.setDefaultCloseOperation(
//            JFrame.EXIT_ON_CLOSE);
//
//    ButtonListener bl = new ButtonListener();
//
//    JPanel panel1 = new JPanel();
//
//    panel_testing.add(new JLabel("Enter your deposit amount: "));
//            textName = new JTextField(15);
//            panel1.add(textName);
//
//            password = new JTextField(15);
//            panel1.add(password);
//
//    buttonOK = new JButton("OK");
//    buttonOK.addActionListener(bl);
//    panel1.add(buttonOK);
//    panel_testing.
//    panel_testing.setVisible(true);
//
//    //return panel_testing;
//}

    private class ButtonListener implements
            ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Bank variables:
//            double Balance;
//            String Username;
//            String customerName;
//            String customerID;
//            String Password;

            Bank BA = new Bank();


            ButtonListener bl1= new ButtonListener();

            if(e.getSource() == buttonOK){
                JFrame ButtonOKFrame = new JFrame();

                JButton newpanelbutton = new JButton();
                newpanelbutton.addActionListener(bl1);
                newpanelbutton.setText("click here for more");
                ButtonOKFrame.setSize(500,500);
                ButtonOKFrame.setTitle("testting");
                ButtonOKFrame.add(newpanelbutton);
                ButtonOKFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                ButtonOKFrame.pack();
                ButtonOKFrame.setVisible(true);
                //this needs to be changed
                if(e.getSource() == newpanelbutton){
                    JOptionPane.showMessageDialog(Namer.this, "depositing", "hellooooo", JOptionPane.INFORMATION_MESSAGE);
                }

                //JOptionPane.showMessageDialog(Namer.this, "hello there", "hellooooo", JOptionPane.INFORMATION_MESSAGE);
            }else if(e.getSource() == depositOK){
                JFrame depositOKFrame = new JFrame();
                depositOKFrame.setSize(600,600);
                //depositOKFrame.setLocation(100,150);

                JPanel depositOKPanel = new JPanel(new GridLayout(2,1));

                JLabel deposit_label = new JLabel();
                //deposit_label.setBounds(50,50,100,10);
                deposit_label.setText("Please enter your deposit amount :");
                //JTextField deposit_amount = new JTextField();

                //if user inputs hello, then textfield = "hello"
                //if user inputs 55, textfield = "55"
                //Integer.parseInt(textfield <--- ("55" String ) ) = 55 integer
                //BA.balance is an int/double



                //deposit_amount.setBounds(50,100,100,10);
                //JButton depositOKbutton = new JButton();
                depositbutton.setText("deposit");
                //depositOKbutton.setBounds(100,200, 20, 20);
                deposit_amount = new JTextField("deposit this money");
                JLabel msg = new JLabel();
                depositOKPanel.add(deposit_label);
                depositOKPanel.add(deposit_amount);
                depositOKPanel.add(msg);
                depositOKPanel.add(depositbutton);

                depositOKFrame.add(depositOKPanel);
                depositOKFrame.setTitle("Depositing");
                depositOKFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                //depositOKFrame.pack();
                depositOKFrame.setVisible(true);
                //JOptionPane.showMessageDialog(Namer.this, "depositing" + BA.Balance, "hellooooo", JOptionPane.INFORMATION_MESSAGE);
            }else if(e.getSource() == createOK){

                //1. create new Jframe for user to create account
                //2. use the user input username and password to create a new bank class
                JFrame createaccountOKFrame = new JFrame();
                createaccountOKFrame.setSize(300,300);
                createaccountOKFrame.setLocation(100,150);


                JPanel ButtonOKPanel = new JPanel(new GridLayout(3,1));


                //setting up labels for the username and password fields
                JLabel user_label = new JLabel();
                user_label.setText("Username :");
                JLabel password_label = new JLabel();
                password_label.setText("Password :");

                JTextField username = new JTextField();
                username.setBounds(100,50,100,10);
                JPasswordField pass = new JPasswordField();
                pass.setBounds(100,100,100,10);

                JButton submitbutton = new JButton();
                //submitbutton.addActionListener(bl1);
                submitbutton.setText("submit");

                JLabel message = new JLabel();

                ButtonOKPanel.add(user_label);
                ButtonOKPanel.add(username);
                ButtonOKPanel.add(password_label);
                ButtonOKPanel.add(pass);
                ButtonOKPanel.add(message);
                ButtonOKPanel.add(submitbutton);




                createaccountOKFrame.setTitle("Create Account");
                createaccountOKFrame.add(ButtonOKPanel,BorderLayout.CENTER);
                createaccountOKFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                //createaccountOKFrame.pack();
                createaccountOKFrame.setVisible(true);


                //JOptionPane.showMessageDialog(Namer.this, "creating account", "hellooooo", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(e.getSource() == test){
                JFrame testing = new testPanel();

                testing.setVisible(true);
            }

            if(e.getSource() == depositbutton){
                System.out.println("old balance = " + BA.Balance);
                int deMoney = Integer.parseInt(deposit_amount.getText());
                BA.deposit(deMoney);
                System.out.println("new balance = " + BA.Balance);
            }



            //JPanel panel_testing = Namer.newPanel();
            //if (e.getSource() == buttonOK) {

                //add(panel_testing);
                //JOptionPane.showMessageDialog(Namer.this, "hello there", "hellooooo", JOptionPane.INFORMATION_MESSAGE);

                //String name = textName.getText();

                //int deposit = Integer.parseInt(textName.getText());
                //String name = scanner.nextLine();
                //JOptionPane.showMessageDialog(Namer.this, "you are depositing this much money" + deposit, "successful", JOptionPane.INFORMATION_MESSAGE);

//            if (name.length() == 0)
//            {
//                JOptionPane.showMessageDialog(
//                        Namer.this,
//                        "You didn't enter a name",
//                        "ERROR",
//                        JOptionPane.INFORMATION_MESSAGE);
//            }
// else
//            {
//                JOptionPane.showMessageDialog(
//                        Namer.this,
//                        "Good morning " + name,
//                        "Salutations",
//                        JOptionPane.INFORMATION_MESSAGE);
//            }
//            textName.requestFocus();
//            }
//        }
            //}
        }


        }
    }




