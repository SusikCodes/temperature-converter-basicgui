import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

class TemperatureConverter
{
    //Declaring the GUI Elements
    public static JFrame mainFrame;
    public static JLabel labelCelcius;
    public static JTextField textCelcius;
    public static JLabel labelFarenheit;
    public static JTextField textFarenheit;
    public static JButton btnCalculateCtoF;
    public static JButton btnCalculateFtoC;

    public static void main(String[] args)
    {
        //Setting up the Frame
        mainFrame = new JFrame("Temperature Converter by Susrik");
        mainFrame.setSize(600, 400);
        mainFrame.setLayout(new FlowLayout()); 

        //Creating GUI Elements
        labelCelcius = new JLabel("Celcius:");
        textCelcius = new JTextField(10);
        labelFarenheit = new JLabel("Farenheit:");
        textFarenheit = new JTextField(10);
        btnCalculateCtoF = new JButton("Convert C to F");

        //Adding Action Listener
        btnCalculateCtoF.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    //Convert C to F
                    String cText = textCelcius.getText();
                    double c = Double.parseDouble(cText);
                    double f = (c * 9 / 5) + 32;
                    textFarenheit.setText(String.valueOf(f));
                    

                }
                    
            }
        );


        btnCalculateFtoC = new JButton("Convert F to C");

        //Adding Action Listener
        btnCalculateFtoC.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    //Convert F to C
                    String fText = textFarenheit.getText();
                    double f = Double.parseDouble(fText);
                    double c = (f - 32) * 5 / 9;
                    textCelcius.setText(String.valueOf(c));


                }
                    
            }
        );

        //Inserting the GUI Elements in the Frame
        mainFrame.add(labelCelcius);
        mainFrame.add(textCelcius);
        mainFrame.add(labelFarenheit);
        mainFrame.add(textFarenheit);
        mainFrame.add(btnCalculateCtoF);
        mainFrame.add(btnCalculateFtoC);

        //Making the Frame Visible
        mainFrame.setVisible(true);


    }
}
