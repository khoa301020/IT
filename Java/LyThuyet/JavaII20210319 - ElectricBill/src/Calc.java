import javax.swing.*;
import java.awt.event.ActionListener;

public class Form implements ActionListener {
    private JComboBox cbName;
    private JTextField txfOld;
    private JTextField txfDinhMuc;
    private JTextField txfNew;
    private JTextField txfVuotDinhMuc;
    private JTextField txfUsed;
    private JTextField txfPrice;
    private JButton btnPrint;
    private JButton btnCalc;
    private JButton btnExit;
    private JPanel ElectricBill;
    private JTextArea txtPrinted;
    private JLabel lbOld;
    private JTextArea txtQuyUoc;
    Form() {
        btnCalc.addActionListener(this);
        btnPrint.addActionListener(c);
        btnExit.addActionListener(c);
        txfOld.addActionListener(c);
        txfNew.addActionListener(c);
        txfUsed.addActionListener(c);
        txfDinhMuc.addActionListener(c);
        txfVuotDinhMuc.addActionListener(c);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Form");
        frame.setContentPane(new Form().ElectricBill);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }


}
