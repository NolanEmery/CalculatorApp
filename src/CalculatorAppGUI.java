import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class CalculatorAppGUI {
    private static final int width = 1000; //Open-Closed
    private static final int height = 500;

    private static double firstNumber;
    private static double secondNumber;
    private static double result;
    private static int code;

    private static JFrame jFrame;
    private static JPanel jPanel;
    private static JTextField jTextFieldFirstNumber;
    private static JTextField jTextFieldSecondNumber;
    private static JTextField jTextFieldResult;
    private static JButton jButtonAdd;
    private static JButton jButtonSubtract;
    private static JButton jButtonMultiply;
    private static JButton jButtonDivide;
    private static JButton jButtonEquals;

    private static ImplementFunctionality implementFunctionality;

    public static void main(String[] args) {
        jFrame = new JFrame("Calculator App"); //build the background
        jFrame.setVisible(true);
        jFrame.setSize(width, height);
        jFrame.setLayout(new FlowLayout());
        jFrame.setLocationRelativeTo(null);
        jPanel = new JPanel();
        jPanel.setSize(width/24, height/24);
        jPanel.setBackground(Color.lightGray);
        Border border = new LineBorder(Color.BLACK);
        jPanel.setBorder(border);
        jPanel.setVisible(true);

        jTextFieldFirstNumber = new JTextField(10); //put the input fields into place
        jTextFieldFirstNumber.setToolTipText("First Number");
        jTextFieldSecondNumber = new JTextField(10);
        jTextFieldSecondNumber.setToolTipText("Second Number");

        implementFunctionality = new ImplementFunctionality();
        implementFunctionality.setJButtonAdd();
        jButtonAdd = implementFunctionality.getJButtonAdd();
        jButtonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                code = 0;
            }
        });
        jTextFieldResult = new JTextField(10);
        jTextFieldResult.setEditable(false);
        implementFunctionality.setJButtonSub();
        jButtonSubtract = implementFunctionality.getJButtonSub();
        jButtonSubtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                code = 1;
            }
        });

        implementFunctionality.setJButtonMul();
        jButtonMultiply = implementFunctionality.getJButtonMul();
        jButtonMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                code = 2;
            }
        });
        implementFunctionality.setJButtonDiv();
        jButtonDivide = implementFunctionality.getJButtonDiv();
        jButtonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                code = 3;
            }
        });
        implementFunctionality.setJButtonEquals();
        jButtonEquals = implementFunctionality.getJButtonEquals();
        jButtonEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                firstNumber = Double.parseDouble(jTextFieldFirstNumber.getText());
                secondNumber = Double.parseDouble(jTextFieldSecondNumber.getText());
                switch (code) {
                    case 0:
                        result = firstNumber + secondNumber;
                        break;
                    case 1:
                        result = firstNumber - secondNumber;
                        break;
                    case 2:
                        result = firstNumber * secondNumber;
                        break;
                    case 3:
                        result = firstNumber / secondNumber;
                        break;
                }
                handleSetText(result);
            }
        });
        jPanel.add(jTextFieldFirstNumber);
        jPanel.add(jButtonAdd);
        jPanel.add(jButtonSubtract);
        jPanel.add(jButtonMultiply);
        jPanel.add(jButtonDivide);
        jPanel.add(jTextFieldSecondNumber);
        jPanel.add(jButtonEquals);
        jPanel.add(jTextFieldResult);
        jFrame.add(jPanel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void handleSetText(double res) {
        jTextFieldResult.setText(Double.toString(res));
    }
}
