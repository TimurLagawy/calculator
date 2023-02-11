import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

     public class Calculator extends JFrame {
        JTextField name_field;
        JTextField email_field;
        JRadioButton male, female;
        JCheckBox check;
        public Calculator(){
            super("Calculator");
            super.setBounds(200, 100, 300, 230);
            super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Container container = super.getContentPane();
            container.setLayout(new GridLayout( 5, 2, 2,10));
            JLabel name = new JLabel("Input your name ");
            name_field = new JTextField("", 1);
            JLabel email = new JLabel("Input your e-mail ");
            email_field = new JTextField("@.", 1);

            container.add(name);
            container.add(name_field);
            container.add(email);
            container.add(email_field);

           // male = new JRadioButton("Man");
            //female = new JRadioButton("Woman");
            //check = new JCheckBox("I am sure ", false);//если ТРУ - то галочка стоит
            JButton one_button = new JButton("1");
            JButton two_button = new JButton("2");
            JButton three_button = new JButton("3");
            JButton four_button = new JButton("4");
            JButton five_button = new JButton("5");
            JButton six_button = new JButton("6");
            JButton seven_button = new JButton("7");
            JButton eight_button = new JButton("8");
            JButton nine_button = new JButton("9");
            JButton zero_button = new JButton("0");


//            male.setSelected(true);//изначальный выбор в галочкой
//            container.add(male);
//            container.add(female);
//            ButtonGroup group = new ButtonGroup();
//            group.add(male);
//            group.add(female);

            container.add(check);
            container.add(one_button);
            container.add(two_button);
            container.add(three_button);
            container.add(four_button);
            container.add(five_button);
            container.add(six_button);
            container.add(seven_button);
            container.add(eight_button);
            container.add(nine_button);
            container.add(zero_button);


          //  send_button.addActionListener(new ButtonEventManager());
        }
       // class ButtonEventManager implements ActionListener {

//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String name = name_field.getText();
//                String email = email_field.getText();
//
//                String isMale = "man";
//                if(!male.isSelected())
//                    isMale="Female";
//
//                boolean checkBox = check.isSelected();
//                JOptionPane.showMessageDialog(null, "Your mail: " + email +
//                                "\n Your male:  " + isMale + "\n Do you accept? " + checkBox,
//                        "Hello " + name, JOptionPane.PLAIN_MESSAGE);
            }



