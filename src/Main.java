import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//need this for listeners
public class Main
{
    private static int ducks = 0;
    public static void main(String[] args)
    {


        //1 make a frame
        JFrame myFrame = new JFrame();
        myFrame.setSize(600,700);

        //2 make a panel
        JPanel myPanel = new JPanel();
        JPanel topPanel = new JPanel();
        //myPanel.setBackground(Color.orange);
        myPanel.setBackground(new Color(125,5,15));
        myPanel.setLayout(new BorderLayout());
        JLabel myLabel = new JLabel("Duckies Collected: 0");

        //3 add components to panel
        //3A create the components
        JLabel myLabel2 = new JLabel("Your Name Is...");
        JTextField myTextField = new JTextField(10);
        myTextField.setText("Input Name Here :)");
        myTextField.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String password = myTextField.getText();
                myLabel2.setText("Your Name Is " + password);
                myPanel.remove(myTextField);
                myPanel.revalidate();
                myPanel.repaint();
            }
        });
        JButton myButton = new JButton ("CLICK FOR DUCK INCREASE-ISM :)");

        myButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                myLabel.setText("Duckies Collected: " + ducks);
                ducks++;
            }
        });

        //creating an image
        ImageIcon icon1 = new ImageIcon(Main.class.getResource("/images.png"));
        icon1.setImage(icon1.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT));
        JLabel pic = new JLabel(icon1);

        topPanel.add(myButton);
        topPanel.add(myLabel);
        topPanel.add(myLabel2);
        //3B add components to the panel
        //myPanel.add(myLabel);

        myPanel.add(myTextField, BorderLayout.WEST);
        myPanel.add(myLabel2, BorderLayout.NORTH);
        myPanel.add(myLabel, BorderLayout.EAST);
        myPanel.add(myButton, BorderLayout.SOUTH);
        myPanel.add(pic, BorderLayout.CENTER);

        //4 put panel on frame
        myFrame.add(myPanel);

        //5 make the frame visible
        myFrame.setVisible(true);

    }
}
