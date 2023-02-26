import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

     public class Calculator extends JFrame {
        JTextField num_field;

        public Calculator(){
            JFrame frame = new JFrame("Calculator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());
            frame.setVisible(true);

            Container container = super.getContentPane();
            container.setLayout(new GridLayout( 4, 4, 2,10));
            //JLabel num = new JLabel("Input your numerous ");
            num_field = new JTextField("", 1);
            //container.add(num);
            container.add(num_field, BorderLayout.SOUTH);
            JButton one_button = new JButton("1");
            container.add(one_button);
            JButton two_button = new JButton("2");
            container.add(two_button);
            JButton three_button = new JButton("3");
            container.add(three_button);
            JButton addition_button = new JButton("+");
            container.add(addition_button);
            JButton four_button = new JButton("4");
            container.add(four_button);
            JButton five_button = new JButton("5");
            container.add(five_button);
            JButton six_button = new JButton("6");
            container.add(six_button);
            JButton substraction_button = new JButton("-");
            container.add(substraction_button);
            JButton seven_button = new JButton("7");
            container.add(seven_button);
            JButton eight_button = new JButton("8");
            container.add(eight_button);
            JButton nine_button = new JButton("9");
            container.add(nine_button);
            JButton multiply_button = new JButton("*");
            container.add(multiply_button);
            JButton zero_button = new JButton("0");
            container.add(zero_button);
            JButton division_button = new JButton("/");
            container.add(division_button);
            JButton dot_button = new JButton(".");
            container.add(dot_button);
            JButton equals_button = new JButton("=");
            container.add(equals_button);



            equals_button.addActionListener(new ButtonEventManager());
            }
     class ButtonEventManager implements ActionListener{

         @Override
         public void actionPerformed(ActionEvent e) {
             String command = e.getActionCommand();
             Label inputField = new Label();
             String input = inputField.getText();
             Label outputLabel = new Label();
             double result = Double.parseDouble(outputLabel.getText());
             switch (command) {
                 case "0":
                 case "1":
                 case "2":
                 case "3":
                 case "4":
                 case "5":
                 case "6":
                 case "7":
                 case "8":
                 case "9":
                 case ".":
                     inputField.setText(input + command);
                     break;
                 case "+":
                     inputField.setText("");
                     outputLabel.setText("" + (result + Double.parseDouble(input)));
                     break;
                 case "-":
                     inputField.setText("");
                     outputLabel.setText("" + (result - Double.parseDouble(input)));
                     break;
                 case "*":
                     inputField.setText("");
                     outputLabel.setText("" + (result * Double.parseDouble(input)));
                     break;
                 case "/":
                     inputField.setText("");
                     outputLabel.setText("" + (result / Double.parseDouble(input)));
                     break;
                 case "=":
                     inputField.setText("");
                     break;
             }
         }}
     }



