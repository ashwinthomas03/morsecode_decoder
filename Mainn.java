import java.awt.EventQueue;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mainn {

    private JFrame frame;
    morsecode morse =  new morsecode();
    private JTextField textField;
    private JTextField textField_1;


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Mainn window = new Mainn();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Mainn() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Morse Code decoder");
        lblNewLabel.setBounds(140, 23, 151, 16);
        frame.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Enter Morse Code: ");
        lblNewLabel_1.setBounds(40, 90, 128, 16);
        frame.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Decoded Text: ");
        lblNewLabel_2.setBounds(40, 207, 128, 16);
        frame.getContentPane().add(lblNewLabel_2);

        JButton btnNewButton = new JButton("Decode");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField_1.setText(decode.decoder(textField.getText()) + " ");
                decode.text= "";
            }
        });
        btnNewButton.setBounds(54, 139, 177, 29);
        frame.getContentPane().add(btnNewButton);

        textField = new JTextField();
        textField.setBounds(180, 85, 246, 26);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(180, 202, 246, 26);
        frame.getContentPane().add(textField_1);
        textField_1.setColumns(10);
        textField_1.setEditable(false);
        
        JButton btnNewButton_1 = new JButton("Clear");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		textField.setText("");
        		textField_1.setText("");
        	}
        });
        btnNewButton_1.setBounds(236, 139, 163, 29);
        frame.getContentPane().add(btnNewButton_1);


        String code = "••••_•_•-••_•_-•_ _--•_••-#";




    }

}
