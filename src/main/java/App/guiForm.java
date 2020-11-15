package App;

import Model.Job;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

                CloseableHttpClient httpClient = HttpClients.createDefault();

                HttpGet httpGet = new HttpGet("https://gorest.co.in/public-api/users");

                try {
                    HttpResponse httpresponse = httpClient.execute(httpGet);
                    HttpEntity entity = httpresponse.getEntity();

                    if (entity != null) {
                        // return it as a String
                        String result = EntityUtils.toString(entity);
                        System.out.println(result);
                    }
                } catch (Exception exception) {
                    exception.toString();
                }
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
