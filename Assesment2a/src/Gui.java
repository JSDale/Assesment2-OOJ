import javax.swing.*;
import java.awt.*;
import java.awt.GridBagConstraints;

public class Gui extends JFrame
{
    private JLabel lblStormType;
    private JLabel lblStormName;
    private JLabel lblWindSpeed;
    private JLabel lblTemp;
    private JLabel lblAdvicePrompt;
    private JLabel lblTitle;

    private JCheckBox chkbStormType;
    private JTextField txtfStormName;
    private JTextField txtfWindSpeed;
    private JTextField txtfTemp;
    private JLabel lblAdvice;

    private JButton btnCreate;
    private JButton btnDelte;
    private JButton btnEdit;

    public Gui()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        var constraints = new GridBagConstraints();
        InitComponents();
        LayoutComponents(constraints);
    }

    private void InitComponents()
    {
        lblTitle = new JLabel("Storm Information App");
        lblStormType = new JLabel("Choose Storm Type");
        lblStormName = new JLabel("Enter Storm Name");
        lblWindSpeed = new JLabel("Enter Wind Speed");
        lblTemp = new JLabel("Enter Temperature, if Storm type is Blizzard");
        lblAdvicePrompt = new JLabel("Here's your advice:");

        btnCreate = new JButton("Add Storm");
        btnDelte = new JButton("DeleteStorm");
        btnEdit = new JButton("Edit/ Show Storm Info");
    }

    private void LayoutComponents(GridBagConstraints constraints)
    {
        constraints.gridy = 0;
        constraints.gridx = 0;
        constraints.gridwidth = 2;
        this.add(lblTitle, constraints);

        constraints.gridy = 1;
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        this.add(lblStormType, constraints);

        constraints.gridy = 2;
        constraints.gridx = 0;
        this.add(lblStormName, constraints);

        constraints.gridy = 3;
        constraints.gridx = 0;
        this.add(lblWindSpeed, constraints);

        constraints.gridy = 4;
        constraints.gridx = 0;
        this.add(lblTemp, constraints);

        constraints.gridy = 2;
        constraints.gridx = 0;
        this.add(lblAdvicePrompt, constraints);
    }
}
