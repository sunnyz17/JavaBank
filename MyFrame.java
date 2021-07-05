//import java.awt.Graphics;
//import java.awt.GridBagConstraints;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//
//public class MyFrame extends JFrame{
//
//    public myFrame(){
//        // create GUI
//        this.setSize(500, 500);
//        this.setVisible(true);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setTitle("BULLS EYE");
//
//        JButton oButton = new JButton("Click me hard!");
//        oButton.addActionListener(new ButtonAction());
//        this.add(oButton);
//    }
//
//    public static void main (String args []) {
//        // start action here by creating the JFrame
//        MyFrame oFrame = new MyFrame();
//        oFrame.setVisible(true);
//    }
//
//
//    public ButtonAction implements ActionListener{
//        public void actionPerformed(ActionEvent oEvent) {
//            if(oEvent.getSource instanceOf JButton){ // check if Action is triggered by JButton
//                JButton oButton = (JButton)oEvent.getSource(); // get Button (if needed)
//
//                MyFrame.this.doFunnyThings(); // call function of the JFrame
//            }
//        }
//    }
//
//}