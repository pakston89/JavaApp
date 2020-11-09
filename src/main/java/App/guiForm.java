package App;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.Job;

public class guiForm{
    private JButton button1;
    private JPanel panel1;
    private JTextField textField1;
    private JLabel LabelJob;

    public guiForm() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hi");
                Job job = new Job("Junior developer", 35, 3.5);
                guiForm.this.textField1.setText(job.getName());
            }
            });
        }

        public static void main(String[] args) {
            JFrame frame = new JFrame("GUI");
            frame.setContentPane(new guiForm().panel1);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }

    }
