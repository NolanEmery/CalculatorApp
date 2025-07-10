import javax.swing.*;
import java.awt.*;

public class ImplementFunctionality {
    private static JButton jButtonAdd;
    private static JButton jButtonSub;
    private static JButton jButtonMul;
    private static JButton jButtonDiv;
    private static JButton jButtonEquals;

    public void setJButtonAdd() {
        jButtonAdd = new JButton("+");
        jButtonAdd.setBackground(Color.orange);
        jButtonAdd.setToolTipText("Add");
    }

    public void setJButtonSub() {
        jButtonSub = new JButton("-");
        jButtonSub.setBackground(Color.orange);
        jButtonSub.setToolTipText("Subtract");
    }

    public void setJButtonMul() {
        jButtonMul = new JButton("*");
        jButtonMul.setBackground(Color.orange);
        jButtonMul.setToolTipText("Multiply");
    }

    public void setJButtonDiv() {
        jButtonDiv = new JButton("/");
        jButtonDiv.setBackground(Color.orange);
        jButtonDiv.setToolTipText("Divide");
    }

    public void setJButtonEquals() {
        jButtonEquals = new JButton("=");
        jButtonEquals.setBackground(Color.orange);
        jButtonEquals.setToolTipText("Equals");
    }

    public JButton getJButtonAdd() {
        return jButtonAdd;
    }

    public JButton getJButtonSub() {
        return jButtonSub;
    }

    public JButton getJButtonMul() {
        return jButtonMul;
    }

    public JButton getJButtonDiv() {
        return jButtonDiv;
    }

    public JButton getJButtonEquals() {
        return jButtonEquals;
    }
}
