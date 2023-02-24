import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

     public class Calculator extends JFrame {
        JTextField num_field;
        JTextField email_field;
        JRadioButton male, female;
        JCheckBox check;
        public Calculator(){
            super("Calculator");
            super.setBounds(200, 100, 400, 400);
            super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Container container = super.getContentPane();
            container.setLayout(new GridLayout( 5, 4, 2,10));
            JLabel num = new JLabel("Input your numerous ");
            num_field = new JTextField("", 1);
            container.add(num);
            container.add(num_field);
            JButton one_button = new JButton("1");
            container.add(one_button);
            JButton two_button = new JButton("2");
            container.add(two_button);
            JButton three_button = new JButton("3");
            container.add(three_button);
            JButton four_button = new JButton("4");
            container.add(four_button);
            JButton five_button = new JButton("5");
            container.add(five_button);
            JButton six_button = new JButton("6");
            container.add(six_button);
            JButton seven_button = new JButton("7");
            container.add(seven_button);
            JButton eight_button = new JButton("8");
            container.add(eight_button);
            JButton nine_button = new JButton("9");
            container.add(nine_button);
            JButton zero_button = new JButton("0");
            container.add(zero_button);

            ButtonGroup group = new ButtonGroup();
            group.add(one_button);
           group.add(two_button);
           group.add(three_button);
           group.add(four_button);
           group.add(five_button);



            }}



