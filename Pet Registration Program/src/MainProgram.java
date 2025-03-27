import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import java.time.Month;
import java.time.Year;
import java.util.Vector;

public class MainProgram extends MyFrame implements ActionListener, MouseListener, KeyListener, WindowListener {
    private JLabel lblID, lblName, lblType, lblGender, lblColor, lblBreed, lblPrice;
    private JTextField txtID, txtName, txtColor, txtPrice;
    private JComboBox<String> cboGender, cboType, cboBreed;
    private final Font f = new Font("Arial", Font.BOLD, 16);

    private JLabel lblAge;
    private JTextField txtAge;
    private JComboBox<Month> cboMonth;
    private JComboBox<Integer> cboDay;
    private JComboBox<Integer> cboYear;
    private int age;
    private final int current_year = Year.now().getValue();
    private JButton btnAdd, btnClear, btnUpdate, btnDelete, btnClose;
    private JLabel lblSearch;
    private JTextField txtSearch;
    private JTable tbl_Pet;
    private DefaultTableModel model_pet;
    private Vector<String> columns, rowData;
    private TableRowSorter tbl_sort;
    private JPanel panelPetInfo;
    private JPanel panelBirthdate;
    private JPanel panelButtons;
    private JPanel panelTable;
    private JButton btnBreed;
    private JButton btnType;
    private Database db = new Database("Pet.txt");
    private JFrame breedFrame;
    private JFrame typeFrame;

    public void initializeComponent() {
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

        cboGender = new JComboBox<>();
        cboType = new JComboBox<>();
        cboBreed = new JComboBox<>();
        loadToComboBox();

        btnAdd = new JButton("Add New", new ImageIcon("IMAGES/icon/add_user.png"));
        btnClear = new JButton("Clear", new ImageIcon("IMAGES/icon/clear.png"));

        btnUpdate = new JButton("Update");
        btnDelete = new JButton("Delete");
        btnClose = new JButton("Close");

        btnBreed = new JButton("Breed");
        btnType = new JButton("Type");
    }

    public void panelPetButtons() {
        panelButtons = new JPanel();
        panelButtons.setLayout(new GridLayout(1, 5, 4, 2));
        panelButtons.add(btnAdd);
        panelButtons.add(btnClear);

        panelButtons.add(new JLabel(""));

        panelButtons.add(btnUpdate);
        panelButtons.add(btnDelete);
        panelButtons.add(btnClose);
    }

    public void petInfo() {
        panelPetInfo = new JPanel();
        panelPetInfo.setBorder(BorderFactory.createTitledBorder("Pet Registration Form"));
        panelPetInfo.setLayout(new GridLayout(7, 2));
        panelPetInfo.setFont(f);
        panelPetInfo.setOpaque(false);

        panelPetInfo.add(lblID); panelPetInfo.add(txtID);
        panelPetInfo.add(lblName); panelPetInfo.add(txtName);
        panelPetInfo.add(lblGender); panelPetInfo.add(cboGender);
        panelPetInfo.add(lblType); panelPetInfo.add(cboType);
        panelPetInfo.add(lblBreed); panelPetInfo.add(cboBreed);
        panelPetInfo.add(lblColor); panelPetInfo.add(txtColor);
        panelPetInfo.add(lblPrice); panelPetInfo.add(txtPrice);
    }

    public void panelPetBirthdate() {
        panelBirthdate = new JPanel();
        lblAge = new JLabel("Age");
        txtAge = new JTextField("0", 5);
        txtAge.setEditable(false);
        txtAge.setToolTipText("Age");

        cboMonth = new JComboBox<>(Month.values());
        cboDay = new JComboBox<>();
        cboYear = new JComboBox<>();

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

        cboYear.setEditable(true);
        cboYear.addActionListener(this);
    }

    public JPanel panelPetSearch() {
        JPanel panelSearch = new JPanel();
        lblSearch = new JLabel("Search");
        txtSearch = new JTextField(10);
        panelSearch.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 1));
        panelSearch.add(lblSearch);
        panelSearch.add(txtSearch);
        panelSearch.setOpaque(false);
        return  panelSearch;
    }

    public JPanel panelPetTable() {
        panelTable = new JPanel();
        tbl_Pet = new JTable();
        model_pet = new DefaultTableModel();

        panelTable.setLayout(new BorderLayout());
        panelTable.add(new JScrollPane(tbl_Pet), BorderLayout.CENTER);

        String cols[] = {"ID", "Name", "Gender", "Type", "Breed", "Color",
                "Price", "Month", "Day", "Year", "Age"};

        columns = new Vector<>();
        for (String val : cols) {
            columns.add(val);
        }

        model_pet.setColumnIdentifiers(columns);
        tbl_Pet.setModel(model_pet);
        tbl_Pet.setAutoResizeMode(tbl_Pet.AUTO_RESIZE_OFF);

        return  panelTable;
    }

    public JPanel panelBreedType() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 1, 1));
        panel.add(btnBreed);
        panel.add(btnType);
        return panel;
    }

    public void resetComponents() {
        txtID.setText(getRowCount());

        btnAdd.setEnabled(true);
        btnClear.setEnabled(true);
        btnClose.setEnabled(true);

        btnUpdate.setEnabled(false);
        btnUpdate.setEnabled(false);

        txtName.setText("");
        txtPrice.setText("");
        txtColor.setText("");
        txtAge.setText("");

        cboGender.setSelectedIndex(0);
        cboType.setSelectedIndex(0);
        cboBreed.setSelectedIndex(0);
        cboMonth.setSelectedIndex(0);
        cboDay.setSelectedIndex(0);
        cboYear.setSelectedIndex(0);
    }

    public void tableClick() {
        txtID.setText(getRowCount());
        btnAdd.setEnabled(false);
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);
    }

    public MainProgram() {
        initializeComponent();
        petInfo();
        add(panelPetInfo).setBounds(10, 10, 300, 250);
        panelPetBirthdate();
        add(panelBirthdate).setBounds(10, 260, 300, 80);
        panelPetButtons();
        add(panelButtons).setBounds(40, 340, 600, 30);
        add(panelPetSearch()).setBounds(320, 20, 300, 30);
        add(panelPetTable()).setBounds(320, 50, 550, 290);
        add(panelBreedType()).setBounds(700, 345, 300, 30);

        add(setBackgroundImage("IMAGES/bgImage/bg1.jpg"));
        setBackgroundColor(250, 128, 144, 255);
        setLocationRelativeTo(null);
        setMyFrame("Pet Registration Form", 900, 415, true, 3);

        txtID.setText(getRowCount());
        btnAdd.addActionListener(this);
        btnClear.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnDelete.addActionListener(this);
        btnClose.addActionListener(this);
        tbl_Pet.addMouseListener(this);
        txtSearch.addKeyListener(this);
        btnBreed.addActionListener(this);
        btnType.addActionListener(this);

        addWindowListener(this);

        txtName.addKeyListener(this);
        txtPrice.addKeyListener(this);
        txtColor.addKeyListener(this);
        txtColor.addMouseListener(this);

        loadToComboBox();
        db = new Database("Pet.txt");
        db.displayRecords(model_pet);
        resetComponents();

        //pack();
    }

    private void loadToComboBox() {
        cboGender.addItem("Male");
        cboGender.addItem("Female");

        db = new Database("Type.txt");
        db.fillToComboBox(cboType);

        db = new Database("Breed.txt");
        db.fillToComboBox(cboBreed);
    }

    public String getRowCount() {
        return "10" + model_pet.getRowCount();
    }

    public void getData() {
        rowData = new Vector<String>();
        rowData.add(txtID.getText());
        rowData.add(txtName.getText());
        rowData.add(cboGender.getSelectedItem().toString());
        rowData.add(cboType.getSelectedItem().toString());
        rowData.add(cboBreed.getSelectedItem().toString());
        rowData.add(txtColor.getText());
        rowData.add(txtPrice.getText());
        rowData.add(cboMonth.getSelectedItem().toString());
        rowData.add(cboDay.getSelectedItem().toString());
        rowData.add(cboYear.getSelectedItem().toString());
        rowData.add(txtAge.getText());
    }

    public void process() {
        String records = "";
        for (int r = 0; r < model_pet.getRowCount(); r++) {
            for (int c = 0; c < model_pet.getColumnCount(); c++) {
                records += model_pet.getValueAt(r, c) + "#";
            }
            records += "\n";
        }
        db.storeToFile(records);
    }

    public static void main(String[] args) {
        new MainProgram();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(cboYear)) {
            age = current_year - Integer.parseInt(cboYear.getSelectedItem().toString());
            txtAge.setText(String.valueOf(age));
        } else if (e.getSource().equals(btnAdd)) {
            getData();
            model_pet.addRow(rowData);
            txtID.setText(getRowCount());
            resetComponents();
        } else if (e.getSource().equals(btnClear)) {
            resetComponents();
        } else if (e.getSource().equals(btnUpdate)) {
            int i = tbl_Pet.getSelectedRow();
            getData();
            for (int col = 1; col < tbl_Pet.getColumnCount(); col++) {
                tbl_Pet.setValueAt(rowData.get(col), i, col);
            }
            resetComponents();
        } else if (e.getSource().equals(btnDelete)) {
            int i = tbl_Pet.getSelectedRow();
            model_pet.removeRow(i);
            resetComponents();
        } else if (e.getSource().equals(btnClose)) {
            process();
            System.exit(0);
        } else if (e.getSource().equals(btnBreed)) {
            breedFrame.setVisible(true);
            setVisible(false);
        } else if (e.getSource().equals(btnType)) {
            typeFrame.setVisible(true);
            setVisible(false);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource().equals(tbl_Pet)) {
            int i = tbl_Pet.getSelectedRow();
            Color color = Color.decode(tbl_Pet.getValueAt(i, 5) + "");
            txtID.setText(tbl_Pet.getValueAt(i, 0) + "");
            txtName.setText(tbl_Pet.getValueAt(i, 1) + "");
            cboGender.setSelectedItem(tbl_Pet.getValueAt(i, 2) + "");
            cboBreed.setSelectedItem(tbl_Pet.getValueAt(i, 3));
            cboType.setSelectedItem(tbl_Pet.getValueAt(i, 4) + "");
            txtColor.setText(tbl_Pet.getValueAt(i, 5) + "");
            txtColor.setBackground(color);
            txtPrice.setText(tbl_Pet.getValueAt(i, 6) + "");
            cboMonth.setSelectedItem(Month.valueOf(tbl_Pet.getValueAt(i, 7) + ""));
            cboDay.setSelectedItem(tbl_Pet.getValueAt(i, 8) + "");
            cboYear.setSelectedItem(tbl_Pet.getValueAt(i, 9) + "");
            txtAge.setText(tbl_Pet.getValueAt(i, 10) + "");

            tableClick();
        } else if (e.getSource().equals(txtColor)) {
            Color color = JColorChooser.showDialog(null, "Choose", Color.black);
            txtColor.setBackground(color);
            txtColor.setText(color.getRGB() + "");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getSource().equals(txtPrice)) {
            if ((e.getKeyChar() >= 'a' && e.getKeyChar() <= 'z')) {
                e.consume();
            }
        } else if (e.getSource().equals(txtName) || e.getSource().equals(txtColor)) {
            char ch = e.getKeyChar();
            if (!((Character.isWhitespace(ch) || e.getKeyChar() >= 'a' || e.getKeyChar() >= 'A')
                    && (e.getKeyChar() <= 'z' || e.getKeyChar() <= 'Z'))) {
                e.consume();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource().equals(txtSearch)) {
            String search = txtSearch.getText();
            tbl_sort = new TableRowSorter(model_pet);

            tbl_Pet.setRowSorter(tbl_sort);

            tbl_sort.setRowFilter(RowFilter.regexFilter(search, 0, 1));
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        process();
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}