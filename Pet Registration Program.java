import java.awt.*;
import javax.swing.*;
import java.time.Month;
import java.time.Year;
import java.awt.event.ActionListener;

public abstract class MainProgram extends MyFrame implements ActionListener {
    // data fields
    private JLabel lblID, lblName, lblType, lblGender, lblColor, lblBreed, lblPrice;
    private JTextField txtID, txtName, txtColor, txtPrice;
    private JComboBox cboGender, cboType, cboBreed;
    private Font f = new Font("Arial", Font.BOLD, 16);

    // JPanel objects
    private JPanel panelPetInfo, panelPetBirthdate, panelBirthdate, panelButtons, panelSearch, panelTable;

    // data fields - panelBirthdate
    private JLabel lblAge;
    private JTextField txtAge;
    private JComboBox cboMonth, cboDay, cboYear;
    private static int age;
    // get the current year
    private static int current_year = Year.now().getValue();

    // constructor
    public MainProgram() {
        initializedComponents();
        loadToComboBox();

        // buttons with icons
        JButton btnAdd = new JButton("Add New", new ImageIcon("IMAGES/icon/add_user.png"));
        JButton btnClear = new JButton("Clear", new ImageIcon("IMAGES/icon/clear.png"));

        // buttons without icons
        JButton btnUpdate = new JButton("Update");
        JButton btnDelete = new JButton("Delete");
        JButton btnClose = new JButton("Close");

        petInfo(); // method call
        // adding panel to Frame
        add(panelPetInfo).setBounds(10, 10, 300, 250);

        panelPetBirthdate(); // method call
        // adding panel to Frame
        add(panelBirthdate).setBounds(10, 260, 300, 80);

        panelPetButtons(); // method call
        // adding panel to Frame
        add(panelButtons).setBounds(40, 340, 600, 30);

        add(setBackgroundImage("IMAGES/bgImage/bg1.jpg"));
        setMyFrame("Pet Registration Form", 900, 400, true, DISPOSE_ON_CLOSE, true);
        setLocationRelativeTo(null);
        pack();
    } // end of constructor

    public void panelPetBirthdate() {
        panelBirthdate = new JPanel();
        lblAge = new JLabel("Age");
        txtAge = new JTextField("0", 5);
        txtAge.setEditable(false);
        txtAge.setToolTipText("Age");
        cboYear.addActionListener(this); // register to action listener

        // Loads the month to comboBox from built - in enumeration (Month)
        cboMonth = new JComboBox(Month.values());
        cboDay = new JComboBox();
        cboYear = new JComboBox();
        cboYear.addActionListener(this); // register to action listener

        panelBirthdate.setLayout(new FlowLayout(FlowLayout.LEFT, 1, 1));
        panelBirthdate.setBorder(BorderFactory.createTitledBorder("Birthdate"));
        panelBirthdate.add(cboMonth);
        panelBirthdate.add(cboDay);
        panelBirthdate.add(cboYear);
        panelBirthdate.add(lblAge);
        panelBirthdate.add(txtAge);

        for (int i = 1; i <= 31; i++) {
            cboDay.addItem(i);
            cboYear.addItem(i + 1970);

        }
        // let user type instead of choosing items from options
        cboYear.setEditable(true);
    }

    private void loadToComboBox() {
        cboGender.addItem("Male");
        cboGender.addItem("Female");

        cboType.addItem("Dog");
        cboType.addItem("Cat");
        cboType.addItem("Bird");
        cboType.addItem("Fish");
        cboType.addItem("Hamster");
        cboType.addItem("Guinea Pig");
        cboType.addItem("Spider");
        cboType.addItem("Snake");
        cboType.addItem("Chicken");
        cboType.addItem("Hedgehog");

        cboBreed.addItem("Persian");
        cboBreed.addItem("Siamese");
        cboBreed.addItem("Calico");
        cboBreed.addItem("Askal");
        cboBreed.addItem("Siberian");
        cboBreed.addItem("Bulldog");
        cboBreed.addItem("Terrier");
        // add
    }

    private void petInfo() {
        panelPetInfo = new JPanel();
        panelPetInfo.setBorder(BorderFactory.createTitledBorder("Pet Registration Forms"));
        panelPetInfo.setLayout(new GridLayout(7, 2));
        panelPetInfo.setFont(f);
        panelPetInfo.setOpaque(false);

        // adding components
        panelPetInfo.add(lblID);
        panelPetInfo.add(txtID);
        panelPetInfo.add(lblName);
        panelPetInfo.add(txtName);
        panelPetInfo.add(lblGender);
        panelPetInfo.add(cboGender);
        panelPetInfo.add(lblType);
        panelPetInfo.add(cboType);
        panelPetInfo.add(lblBreed);
        panelPetInfo.add(cboBreed);
        panelPetInfo.add(lblColor);
        panelPetInfo.add(txtColor);
        panelPetInfo.add(lblPrice);
        panelPetInfo.add(txtPrice);

    }

    public void panelPetButtons() {
        panelButtons = new JPanel();
        panelButtons.setLayout(new GridLayout(1, 5, 4, 2));
        String btnAdd, btnClear, btnUpdate, btnDelete, btnClose;
        panelButtons.add(btnAdd);
        panelButtons.add(btnClear);

        // creates empty label (invisible) as a seperator
        panelButtons.add(new JLabel(""));

        panelButtons.add(btnUpdate);
        panelButtons.add(btnDelete);
        panelButtons.add(btnClose);
    }

    public void initializedComponents() {
        lblID = new JLabel("ID: ");
        lblName = new JLabel("Name: ");
        lblType = new JLabel("Type: ");
        lblGender = new JLabel("Gender: ");
        lblColor = new JLabel("Color: ");
        lblBreed = new JLabel("Breed: ");
        lblPrice = new JLabel("Price: ");

        txtID = new JTextField(20);
        txtID.setEditable(false);

        txtName = new JTextField(20);
        txtColor = new JTextField(20);
        txtPrice = new JTextField(20);

        cboGender = new JComboBox();
        cboType = new JComboBox();
        cboBreed = new JComboBox();

        int current_year = Year.now().getValue();

        // data fields - panelButtons
        JButton btnAdd, btnClear, btnUpdate, btnDelete, btnClose;

    }

    public void main(String[] args) {
        new MainProgram();

    @Override
    public void actionPerformed Object ActionEvent_e;
        (ActionEvent_e) {
        age = current_year-Integer.parseInt(cboYear.getSelectedItem().toString());
        txtAge.setText(age+"");
        }
    }
}