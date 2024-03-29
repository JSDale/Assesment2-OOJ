import javax.swing.*;
import java.awt.*;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame implements ActionListener
{
    private Storm hurricane = new Huricane();
    private Storm tornado = new Tornado();
    private Storm blizzard = new Blizzard();


    private JLabel lblStormType;
    private JLabel lblStormName;
    private JLabel lblWindSpeed;
    private JLabel lblTemp;
    private JLabel lblTempCont;
    private JLabel lblAdvicePrompt;
    private JLabel lblTitle;

    private JComboBox<String> combStormType;
    private JTextField txtfStormName;
    private JTextField txtfWindSpeed;
    private JTextField txtfTemp;
    private JLabel lblAdvice;

    private JButton btnCreate;
    private JButton btnDelete;
    private JButton btnShowStormInfo;
    private JButton btnUpdateStorm;

    private JList<String> lstStorm;
    private JScrollPane scrlList;

    private String[] stormTypes = {"", "Tornado", "Blizzard", "Hurricane"};
    private CreateStorm createStorm = new CreateStorm();
    private StormAdviceCentre stormAdviceCentre = new StormAdviceCentre();
    private DefaultListModel<String> stormHolder = new DefaultListModel<String>();

    public Gui()
    {
        super("Storm Database");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        InitComponents();
        LayoutComponents(constraints);

    }

    private void InitComponents()
    {
        lblTitle = new JLabel("Storm Storage App");
        lblStormType = new JLabel("Choose Storm Type");
        lblStormName = new JLabel("Enter Storm Name");
        lblWindSpeed = new JLabel("Enter Wind Speed");
        lblTemp = new JLabel("Enter Temperature,");
        lblTempCont = new JLabel("if Storm type is Blizzard");
        lblAdvicePrompt = new JLabel("Here's your advice: ");

        combStormType = new JComboBox<>(stormTypes);
        txtfStormName = new JTextField();
        txtfWindSpeed = new JTextField();
        txtfTemp = new JTextField();
        lblAdvice = new JLabel();

        btnCreate = new JButton("Add Storm");
        btnCreate.addActionListener(this);
        btnDelete = new JButton("DeleteStorm");
        btnDelete.addActionListener(this);
        btnShowStormInfo = new JButton("Show Storm Info");
        btnShowStormInfo.addActionListener(this);
        btnUpdateStorm = new JButton("Update Storm Info");
        btnUpdateStorm.addActionListener(this);

        lstStorm = new JList(stormHolder.toArray());
        scrlList = new JScrollPane(lstStorm, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        this.add(scrlList);
        lstStorm.setVisibleRowCount(5);

    }

    private void LayoutComponents(GridBagConstraints constraints)
    {
        constraints.gridy = 0;
        constraints.gridx = 0;
        constraints.gridwidth = 2;
        this.add(lblTitle, constraints);

        constraints.gridy = 5;
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        this.add(lblStormType, constraints);

        constraints.gridy = 10;
        constraints.gridx = 0;
        this.add(lblStormName, constraints);

        constraints.gridy = 20;
        constraints.gridx = 0;
        this.add(lblWindSpeed, constraints);

        constraints.gridy = 30;
        constraints.gridx = 0;
        this.add(lblTemp, constraints);

        constraints.gridy = 40;
        constraints.gridx = 0;
        this.add(lblTempCont, constraints);

        constraints.gridy = 50;
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        this.add(lblAdvicePrompt, constraints);

        constraints.gridy = 5;
        constraints.gridx = 2;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        this.add(combStormType, constraints);

        constraints.gridy = 10;
        constraints.gridx = 2;
        constraints.gridwidth = 6;
        constraints.gridheight = 6;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txtfStormName, constraints);

        constraints.gridy = 20;
        constraints.gridx = 2;
        constraints.gridwidth = 6;
        constraints.gridheight = 6;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txtfWindSpeed, constraints);

        constraints.gridy = 30;
        constraints.gridx = 2;
        constraints.gridwidth = 6;
        constraints.gridheight = 6;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txtfTemp, constraints);

        constraints.gridy = 40;
        constraints.gridx = 2;
        constraints.gridwidth = 6;
        constraints.gridheight = 6;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(lblAdvice, constraints);

        constraints.gridy = 75;
        constraints.gridx = 0;
        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        this.add(btnCreate, constraints);

        constraints.gridy = 75;
        constraints.gridx = 1;
        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        this.add(btnShowStormInfo, constraints);

        constraints.gridy = 95;
        constraints.gridx = 1;
        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        this.add(btnUpdateStorm, constraints);

        constraints.gridy = 75;
        constraints.gridx = 2;
        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        this.add(btnDelete, constraints);

        constraints.gridy = 10;
        constraints.gridx = 9;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(scrlList, constraints);

    }

    @Override
    public void actionPerformed(ActionEvent ev)
    {
        if(ev.getSource().equals(btnCreate))
        {
            Resources.tempIsInt = false;
            Resources.windSpeedIsInt = false;

            //hurricane
            if(combStormType.getSelectedItem().toString().equals("Hurricane"))
            {
                createStorm.PopulateStormVariables(txtfWindSpeed.getText(), txtfStormName.getText(),
                        combStormType.getSelectedItem().toString(), txtfTemp.getText(), hurricane);

                if(Resources.windSpeedIsInt)
                {
                    if(stormAdviceCentre.AddStorm(hurricane))
                    {
                        DisplayAdvice(hurricane);

                        AddStormToList(txtfStormName.getText());

                        setInputEmpty();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Storm Already Exists.");
                    }
                }
                else{JOptionPane.showMessageDialog(null, "Please enter a positive integer into the wind speed"); }
            }

            else if(combStormType.getSelectedItem().toString().equals("Blizzard"))
            {
                createStorm.PopulateStormVariables(txtfWindSpeed.getText(), txtfStormName.getText(),
                    combStormType.getSelectedItem().toString(), txtfTemp.getText(), blizzard);

                //blizzard
                if(Resources.windSpeedIsInt && Resources.tempIsInt)
                {
                    if(stormAdviceCentre.AddStorm(blizzard))
                    {
                        DisplayAdvice(blizzard);

                        AddStormToList(txtfStormName.getText());

                        setInputEmpty();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Storm Already Exists.");
                    }
                }
                else{JOptionPane.showMessageDialog(null, "Please enter a positive integer into the wind speed and or temp"); }
            }

            //tornado
            else if(combStormType.getSelectedItem().toString().equals("Tornado"))
            {
               createStorm.PopulateStormVariables(txtfWindSpeed.getText(), txtfStormName.getText(),
                        combStormType.getSelectedItem().toString(), txtfTemp.getText(), tornado);

               if(Resources.windSpeedIsInt)
               {
                    if(stormAdviceCentre.AddStorm(tornado))
                    {
                        DisplayAdvice(tornado);

                        AddStormToList(txtfStormName.getText());

                        setInputEmpty();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Storm Already Exists.");
                    }
               }
               else{JOptionPane.showMessageDialog(null, "Please enter a positive integer into the wind speed."); }
            }
            //no Storm type entered
            else
            {
                JOptionPane.showMessageDialog(null, "Please enter a storm type");
            }

        }

        else if(ev.getSource().equals(btnShowStormInfo))
        {
            if(stormAdviceCentre.GetStormInfo(txtfStormName.getText()))
            {
                txtfWindSpeed.setText(Integer.toString(Resources.tempStormWindSpeed));
                txtfTemp.setText(Integer.toString(Resources.tempStormTemp));
                combStormType.setSelectedItem(Resources.tempStormType);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Storm not found, check name is correct");

                setInputEmpty();
            }

        }
        else if(ev.getSource().equals((btnUpdateStorm)))
        {
            Resources.stormUpdated = false;

            switch(combStormType.getSelectedItem().toString())
            {
                case "Hurricane":
                    createStorm.PopulateStormVariables(txtfWindSpeed.getText(), txtfStormName.getText(),
                            combStormType.getSelectedItem().toString(), txtfTemp.getText(), hurricane);

                    stormAdviceCentre.UpdateStormData(txtfStormName.getText(), hurricane);
                    break;
                case "Blizzard":
                    createStorm.PopulateStormVariables(txtfWindSpeed.getText(), txtfStormName.getText(),
                            combStormType.getSelectedItem().toString(), txtfTemp.getText(), blizzard);

                    stormAdviceCentre.UpdateStormData(txtfStormName.getText(), blizzard);
                    break;
                case "Tornado":
                    createStorm.PopulateStormVariables(txtfWindSpeed.getText(), txtfStormName.getText(),
                            combStormType.getSelectedItem().toString(), txtfTemp.getText(), tornado);

                    stormAdviceCentre.UpdateStormData(txtfStormName.getText(), tornado);
                    break;
                case "":
                    JOptionPane.showMessageDialog(null, "Please enter the storm type. \nIf unknown refer to show storm info button");
                    break;
            }

            if(Resources.stormUpdated == true)
            {
                JOptionPane.showMessageDialog(null, "Storm updated.");
                setInputEmpty();
            }
            else { JOptionPane.showMessageDialog(null, "Storm couldn't update. \nCheck name/storm type is correct"); }
        }

        else if(ev.getSource().equals(btnDelete))
        {
            if (stormAdviceCentre.DeleteAStorm(txtfStormName.getText()))
            {
                JOptionPane.showMessageDialog(null, "Storm deleted");
                RemoveStormFromList(txtfStormName.getText());
                setInputEmpty();
            }
            else {JOptionPane.showMessageDialog(null, "Storm couldn't be deleted, check name is correct");}

            txtfWindSpeed.setText(Resources.defaultValueForTextFields);
            txtfTemp.setText(Resources.defaultValueForTextFields);
            combStormType.setSelectedItem(Resources.defaultValueForTextFields);
        }
    }

    private void DisplayAdvice(Storm storm)
    {
        stormAdviceCentre.GetCorrectAdvice( storm);
        lblAdvice.setText(storm.getAdvice());
    }

    private void setInputEmpty()
    {
        txtfStormName.setText(Resources.defaultValueForTextFields);
        txtfWindSpeed.setText(Resources.defaultValueForTextFields);
        txtfTemp.setText(Resources.defaultValueForTextFields);
        combStormType.setSelectedItem(Resources.defaultValueForTextFields);
    }

    private void AddStormToList(String stormName)
    {
        stormHolder.addElement(stormName);
        lstStorm.setModel(stormHolder);
    }
    private void RemoveStormFromList(String stormName)
    {
        stormHolder.removeElement(stormName);
        lstStorm.setModel(stormHolder);
    }
}
