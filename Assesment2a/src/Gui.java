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

    private JComboBox combStormType;
    private JTextField txtfStormName;
    private JTextField txtfWindSpeed;
    private JTextField txtfTemp;
    private JLabel lblAdvice;

    private JButton btnCreate;
    private JButton btnDelete;
    private JButton btnEdit;

    private String[] stormTypes = {"", "Tornado", "Blizzard", "Hurricane"};

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
        lblTemp = new JLabel("Enter Temperature, \n if Storm type is Blizzard");
        lblAdvicePrompt = new JLabel("Here's your advice:");

        combStormType = new JComboBox(stormTypes);
        txtfStormName = new JTextField();
        txtfWindSpeed = new JTextField();
        txtfTemp = new JTextField();
        lblAdvice = new JLabel();

        btnCreate = new JButton("Add Storm");
        btnDelete = new JButton("DeleteStorm");
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

        constraints.gridy = 8;
        constraints.gridx = 0;
        this.add(lblWindSpeed, constraints);

        constraints.gridy = 12;
        constraints.gridx = 0;
        constraints.gridwidth = 2;
        constraints.gridheight = 5;
        this.add(lblTemp, constraints);

        constraints.gridy = 20;
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        this.add(lblAdvicePrompt, constraints);

        constraints.gridy = 1;
        constraints.gridx = 2;
        constraints.gridwidth = 3;
        constraints.gridheight = 1;
        this.add(combStormType, constraints);

        constraints.gridy = 2;
        constraints.gridx = 2;
        constraints.gridwidth = 6;
        constraints.gridheight = 6;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txtfStormName, constraints);

        constraints.gridy = 8;
        constraints.gridx = 2;
        constraints.gridwidth = 6;
        constraints.gridheight = 6;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txtfWindSpeed, constraints);

        constraints.gridy = 12;
        constraints.gridx = 2;
        constraints.gridwidth = 6;
        constraints.gridheight = 6;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txtfTemp, constraints);

        constraints.gridy = 20;
        constraints.gridx = 2;
        constraints.gridwidth = 6;
        constraints.gridheight = 6;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(lblAdvice, constraints);

        constraints.gridy = 30;
        constraints.gridx = 0;
        constraints.gridheight = 5;
        constraints.gridwidth = 5;
        this.add(btnCreate, constraints);

        constraints.gridy = 30;
        constraints.gridx = 10;
        constraints.gridheight = 5;
        constraints.gridwidth = 5;
        this.add(btnEdit, constraints);

        constraints.gridy = 30;
        constraints.gridx = 20;
        constraints.gridheight = 5;
        constraints.gridwidth = 5;
        this.add(btnDelete, constraints);

    }
}
