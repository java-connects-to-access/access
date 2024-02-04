package finalproj;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StudentRecords extends JFrame {

    /** Creates new form GUI */
    public StudentRecords() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        // Set icon to PUP logo
        ImageIcon img = new ImageIcon(getClass().getResource("logo.png"));
        setIconImage(img.getImage());
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student Records");
        setResizable(false);

        // top panel
        panelTitle = new JPanel();
        labelTitle = new JLabel();
        labelFileOpen = new JLabel();
        buttonOpen = new JButton();
        buttonShow = new JButton();

        // adding and viewing panels
        panelAdd = new JPanel();
        labelAddID = new JLabel();
        textAddID = new JTextField();
        labelAddFirst = new JLabel();
        textAddFirst = new JTextField();
        labelAddLast = new JLabel();
        textAddLast = new JTextField();
        labelAddCourse = new JLabel();
        textAddProgram = new JTextField();
        labelAddAddress = new JLabel();
        textAddAddress = new JTextField();
        labelAddPhone = new JLabel();
        textAddPhone = new JTextField();
        labelAddMail = new JLabel();
        textAddMail = new JTextField();
        labelAddSex = new JLabel();
        textAddSex = new JTextField();
        labelAddDOB = new JLabel();
        textAddDOB = new JTextField();
        labelAddEnrollment = new JLabel();
        textAddEnrollment = new JTextField();
        buttonAdd = new JButton();

        panelView = new JPanel();
        labelViewID = new JLabel();
        textViewID = new JTextField();
        labelViewFirst = new JLabel();
        textViewFirst = new JTextField();
        labelViewLast = new JLabel();
        textViewLast = new JTextField();
        labelViewProgram = new JLabel();
        textViewProgram = new JTextField();
        labelViewAddress = new JLabel();
        textViewAddress = new JTextField();
        labelViewPhone = new JLabel();
        textViewPhone = new JTextField();
        labelViewMail = new JLabel();
        textViewMail = new JTextField();
        labelViewSex = new JLabel();
        textViewSex = new JTextField();
        labelViewDOB = new JLabel();
        textViewDOB = new JTextField();
        labelViewEnrollment = new JLabel();
        textViewEnrollment = new JTextField();
        buttonSearch = new JButton();
        buttonDelete = new JButton();

        labelFileOpen.setHorizontalAlignment(SwingConstants.RIGHT);
        labelFileOpen.setText(" ");
        labelFileOpen.setFont(new java.awt.Font("Tahoma", 0, 14));

        buttonOpen.setText("Open File");
        buttonOpen.addActionListener(this::buttonOpenActionPerformed);

        buttonShow.setText("Show Database");
        buttonShow.setEnabled(false);
        buttonShow.addActionListener(this::buttonShowActionPerformed);

        labelTitle.setText("Student Records");
        labelTitle.setFont(new java.awt.Font("Tahoma", 1, 24));

        GroupLayout panelTitleLayout = new GroupLayout(panelTitle);
        panelTitle.setLayout(panelTitleLayout);
        panelTitleLayout.setHorizontalGroup(
                panelTitleLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelTitleLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelTitle)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)
                                .addComponent(labelFileOpen, GroupLayout.PREFERRED_SIZE, 159,
                                        GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(buttonOpen, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonShow)
                                .addContainerGap()));
        panelTitleLayout.setVerticalGroup(
                panelTitleLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelTitleLayout.createSequentialGroup()
                                .addGroup(panelTitleLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(panelTitleLayout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addGroup(panelTitleLayout
                                                        .createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(panelTitleLayout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addComponent(labelFileOpen))
                                                        .addGroup(panelTitleLayout
                                                                .createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(buttonOpen, GroupLayout.PREFERRED_SIZE,
                                                                        40, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(buttonShow, GroupLayout.PREFERRED_SIZE,
                                                                        40, GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(panelTitleLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(labelTitle)))
                                .addContainerGap()));

        panelAdd.setBorder(BorderFactory.createTitledBorder(null, "Add a New Student Record",
                TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Tahoma", 1, 11)));

        labelAddID.setText("Student ID");
        textAddID.setEnabled(false);

        labelAddFirst.setText("First Name");
        textAddFirst.setEnabled(false);

        labelAddLast.setText("Last Name");
        textAddLast.setEnabled(false);

        labelAddCourse.setText("Program");
        textAddProgram.setEnabled(false);

        labelAddAddress.setText("Address");
        textAddAddress.setEnabled(false);

        labelAddPhone.setText("Phone Number");
        textAddPhone.setEnabled(false);

        labelAddMail.setText("E-Mail Address");
        textAddMail.setEnabled(false);

        labelAddSex.setText("Sex");
        textAddSex.setEnabled(false);

        labelAddDOB.setText("Date of Birth");
        textAddDOB.setEnabled(false);

        labelAddEnrollment.setText("Enrollment Date");
        textAddEnrollment.setEnabled(false);

        buttonAdd.setText("Add Student");
        buttonAdd.setEnabled(false);
        buttonAdd.addActionListener(this::buttonAddActionPerformed);

        GroupLayout panelAddLayout = new GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
                panelAddLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelAddLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelAddLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(labelAddEnrollment)
                                        .addComponent(labelAddLast)
                                        .addComponent(labelAddFirst)
                                        .addComponent(labelAddID)
                                        .addComponent(labelAddCourse)
                                        .addComponent(labelAddAddress)
                                        .addComponent(labelAddPhone)
                                        .addComponent(labelAddMail)
                                        .addComponent(labelAddSex)
                                        .addComponent(labelAddDOB))
                                .addGap(44, 44, 44)
                                .addGroup(panelAddLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(textAddProgram, GroupLayout.Alignment.LEADING)
                                        .addComponent(textAddAddress, GroupLayout.Alignment.LEADING)
                                        .addComponent(textAddPhone, GroupLayout.Alignment.LEADING)
                                        .addComponent(textAddMail, GroupLayout.Alignment.LEADING)
                                        .addComponent(textAddSex, GroupLayout.Alignment.LEADING)
                                        .addComponent(textAddID, GroupLayout.PREFERRED_SIZE, 190,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textAddFirst)
                                        .addComponent(textAddLast)
                                        .addComponent(textAddDOB, GroupLayout.Alignment.LEADING)
                                        .addComponent(textAddEnrollment, GroupLayout.Alignment.LEADING))
                                .addContainerGap())
                        .addGroup(panelAddLayout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(buttonAdd, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        panelAddLayout.setVerticalGroup(
                panelAddLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelAddLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelAddLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelAddID)
                                        .addComponent(textAddID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelAddLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelAddFirst)
                                        .addComponent(textAddFirst, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelAddLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelAddLast)
                                        .addComponent(textAddLast, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelAddLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelAddCourse)
                                        .addComponent(textAddProgram, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelAddLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelAddAddress)
                                        .addComponent(textAddAddress, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelAddLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelAddPhone)
                                        .addComponent(textAddPhone, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelAddLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelAddMail)
                                        .addComponent(textAddMail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelAddLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelAddSex)
                                        .addComponent(textAddSex, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelAddLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(textAddDOB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelAddDOB))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelAddLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(textAddEnrollment, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelAddEnrollment))
                                .addGap(18, 18, 18)
                                .addComponent(buttonAdd, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        panelView.setBorder(BorderFactory.createTitledBorder(null, "View or Delete Record",
                TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Tahoma", 1, 11)));

        labelViewID.setText("Student ID");
        textViewID.setEnabled(false);

        labelViewFirst.setText("First Name");
        textViewFirst.setEnabled(false);

        labelViewLast.setText("Last Name");
        textViewLast.setEnabled(false);

        labelViewProgram.setText("Program");
        textViewProgram.setEnabled(false);

        labelViewAddress.setText("Address");
        textViewAddress.setEnabled(false);

        labelViewPhone.setText("Phone Number");
        textViewPhone.setEnabled(false);

        labelViewMail.setText("E-Mail Address");
        textViewMail.setEnabled(false);

        labelViewSex.setText("Sex");
        textViewSex.setEnabled(false);

        labelViewDOB.setText("Date of Birth");
        textViewDOB.setEnabled(false);

        labelViewEnrollment.setText("Enrollment Date");
        textViewEnrollment.setEnabled(false);

        buttonSearch.setText("Search by ID");
        buttonSearch.setEnabled(false);
        buttonSearch.addActionListener(this::buttonSearchActionPerformed);

        buttonDelete.setText("Delete Record");
        buttonDelete.setEnabled(false);
        buttonDelete.addActionListener(this::buttonDeleteActionPerformed);

        GroupLayout panelViewLayout = new GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
                panelViewLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelViewLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelViewLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(GroupLayout.Alignment.LEADING, panelViewLayout.createSequentialGroup()
                                                .addGroup(panelViewLayout
                                                        .createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelViewLast)
                                                        .addComponent(labelViewFirst)
                                                        .addComponent(labelViewID)
                                                        .addComponent(labelViewProgram)
                                                        .addComponent(labelViewAddress)
                                                        .addComponent(labelViewPhone)
                                                        .addComponent(labelViewMail)
                                                        .addComponent(labelViewSex)
                                                        .addComponent(labelViewDOB)
                                                        .addComponent(labelViewEnrollment))
                                                .addGap(44, 44, 44)
                                                .addGroup(panelViewLayout
                                                        .createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(textViewProgram, GroupLayout.Alignment.LEADING)
                                                        .addComponent(textViewAddress, GroupLayout.Alignment.LEADING)
                                                        .addComponent(textViewPhone, GroupLayout.Alignment.LEADING)
                                                        .addComponent(textViewMail, GroupLayout.Alignment.LEADING)
                                                        .addComponent(textViewSex, GroupLayout.Alignment.LEADING)
                                                        .addComponent(textViewID, GroupLayout.PREFERRED_SIZE, 190,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(textViewFirst)
                                                        .addComponent(textViewLast)
                                                        .addComponent(textViewDOB, GroupLayout.Alignment.LEADING)
                                                        .addComponent(textViewEnrollment,
                                                                GroupLayout.Alignment.LEADING))
                                                .addContainerGap())
                                        .addGroup(panelViewLayout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(buttonSearch, GroupLayout.PREFERRED_SIZE, 109,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
                                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(buttonDelete, GroupLayout.PREFERRED_SIZE, 109,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)))));
        panelViewLayout.setVerticalGroup(
                panelViewLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelViewLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelViewLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelViewID)
                                        .addComponent(textViewID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelViewLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelViewFirst)
                                        .addComponent(textViewFirst, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelViewLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelViewLast)
                                        .addComponent(textViewLast, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelViewLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelViewProgram)
                                        .addComponent(textViewProgram, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelViewLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelViewAddress)
                                        .addComponent(textViewAddress, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelViewLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelViewPhone)
                                        .addComponent(textViewPhone, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelViewLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelViewMail)
                                        .addComponent(textViewMail, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelViewLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelViewSex)
                                        .addComponent(textViewSex, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelViewLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(textViewDOB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelViewDOB))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelViewLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(textViewEnrollment, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelViewEnrollment))
                                .addGap(18, 18, 18)
                                .addGroup(panelViewLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonSearch, GroupLayout.PREFERRED_SIZE, 40,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonDelete, GroupLayout.PREFERRED_SIZE, 40,
                                                GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(panelTitle, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(panelAdd, GroupLayout.PREFERRED_SIZE,
                                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(panelView, GroupLayout.PREFERRED_SIZE,
                                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panelTitle, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(panelAdd, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addComponent(panelView, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pack();
        setLocationRelativeTo(null);
    }

    private void buttonOpenActionPerformed(java.awt.event.ActionEvent evt) {
        openFile();
    }

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {
        addStudent();
    }

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {
        searchStudent();
    }

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        deleteStudent();
    }

    private void buttonShowActionPerformed(java.awt.event.ActionEvent evt) {
        showDatabaseTable();
    }

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRecords.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRecords().setVisible(true);
            }
        });
    }

    // FUNCTIONS
    // Function for file handling
    private void openFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Microsoft Access Database (.accdb)", "accdb"));
        int response = fileChooser.showOpenDialog(null);
        if (response == JFileChooser.APPROVE_OPTION) {
            file = new File(fileChooser.getSelectedFile().getAbsolutePath());
            openedFileName = file.getName();
            if (!openedFileName.endsWith(".accdb")) { // Error if file is not an MS Access db file
                JOptionPane.showMessageDialog(null, "The selected file is not an Access Database (.accdb) file.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // Activate buttons if db is successfully loaded
                labelFileOpen.setText(openedFileName);
                buttonShow.setEnabled(true);
                textAddFirst.setEnabled(true);
                textAddLast.setEnabled(true);
                textAddAddress.setEnabled(true);
                textAddDOB.setEnabled(true);
                textAddEnrollment.setEnabled(true);
                textAddID.setEnabled(true);
                textAddMail.setEnabled(true);
                textAddPhone.setEnabled(true);
                textAddProgram.setEnabled(true);
                textAddSex.setEnabled(true);
                buttonAdd.setEnabled(true);
                textViewID.setEnabled(true);
                buttonSearch.setEnabled(true);
                System.out.println("Opened file path: " + file);
            }
        }
    }
    
    // clear the forms
    private void clearForm(javax.swing.JPanel container){
        for (java.awt.Component component : container.getComponents()) {
            if (component instanceof javax.swing.JTextField) {
                ((javax.swing.JTextField) component).setText("");
            }
        }
    }
    
    // Show Database function
    private void showDatabaseTable() {
        String query;
        String access_db_table = "table1";
        DefaultTableModel tableModel = new DefaultTableModel();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            con = DriverManager.getConnection("jdbc:ucanaccess://" + file);
            query = String.format("SELECT * FROM %s", access_db_table);
            preparedStatement = con.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

            ResultSetMetaData metaData = resultSet.getMetaData();
            int columns = metaData.getColumnCount();

            // Add column names to the table model
            for (int i = 1; i <= columns; i++) {
                tableModel.addColumn(metaData.getColumnName(i));
            }

            // Add data rows to the table model
            while (resultSet.next()) {
                Object[] rowData = new Object[columns];
                for (int i = 1; i <= columns; i++) {
                    rowData[i - 1] = resultSet.getString(i);
                }
                tableModel.addRow(rowData);
            }

            // Create a JTable with the populated table model
            JTable table = new JTable(tableModel);

            // Display the table in a JFrame with JScrollPane
            JFrame frame = new JFrame("Table Data");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.getContentPane().add(new JScrollPane(table));
            frame.setLocationRelativeTo(null); // Center the frame
            frame.pack();
            frame.setVisible(true);

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Close resources (PreparedStatement, ResultSet, Connection) in a finally block if needed
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Function for adding a student record
    private void addStudent() {
        String q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;

        // Storing Values of Input in a String
        q1 = textAddID.getText();
        q2 = textAddFirst.getText();
        q3 = textAddLast.getText();
        q4 = textAddProgram.getText();
        q5 = textAddAddress.getText();
        q6 = textAddPhone.getText();
        q7 = textAddMail.getText();
        q8 = textAddSex.getText();
        q9 = textAddDOB.getText();
        q10 = textAddEnrollment.getText();

        // Do not allow empty inputs
        if (areFieldsEmpty(q1, q2, q3, q4, q5, q6, q7, q8, q9, q10)) {
            JOptionPane.showMessageDialog(null, "Enter all required values", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Connecting to Database
            con = DriverManager.getConnection("jdbc:ucanaccess://" + file);
            Statement st = con.createStatement();

            // Inserting the Inputs in the Database
            int a = st.executeUpdate("Insert into Table1 values('" + q2 + "','" + q3 + "','" + q4 + "','" + q5 + "','"
                    + q6 + "','" + q7 + "','" + q8 + "','" + q1 + "','" + q9 + "','" + q10 + "')");

            // Checking if the inputs are properly added
            if (a == 1) {
                JOptionPane.showMessageDialog(this, "Student Record Added");
                clearForm(panelAdd);
            }
            else{
                JOptionPane.showMessageDialog(this, "Error in Inserting Data", "Insertion Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Function to check if fields are empty
    private boolean areFieldsEmpty(String... fields) {
        for (String field : fields) {
            if (field.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    // Function for searching a student record by ID
    private void searchStudent() {
        String idSearch = textViewID.getText();

        // Show error when textfield for ID is just empty
        if (idSearch.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter a valid Student ID", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Connecting to Database
        try {
            con = DriverManager.getConnection("jdbc:ucanaccess://" + file);
            st = con.createStatement();

            String query = "Select * from Table1 where StudentID='" + idSearch + "'";
            rs = st.executeQuery(query);

            if (rs.next()) {
                // If Student Found
                JOptionPane.showMessageDialog(this, "Student Found");

                // Retrieve values from the result set
                String s1 = rs.getString("FirstName");
                String s2 = rs.getString("LastName");
                String s3 = rs.getString("Program");
                String s4 = rs.getString("Address");
                String s5 = rs.getString("PhoneNumber");
                String s6 = rs.getString("Email");
                String s7 = rs.getString("Sex");
                String s8 = rs.getString("DateOfBirth");
                String s9 = rs.getString("EnrollmentDate");

           } else {
               // Student not found
               JOptionPane.showMessageDialog(this, "Student Not Found", "Error", JOptionPane.ERROR_MESSAGE);
              // Clear the text field or handle accordingly
               clearForm(panelView);
           }
           
           // Close the result set and statement
           rs.close();
           st.close();

            } else {
                // Student not found
                JOptionPane.showMessageDialog(this, "Student Not Found", "Error", JOptionPane.ERROR_MESSAGE);
                textViewFirst.setText(""); // Clear the text field or handle accordingly
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            // Close the result set, statement and connection
            try {
                if (con != null) con.close();
                if (rs != null) rs.close();
                if (st != null) st.close(); 
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }                        
    }

    // Function for deleting a student record by ID
    private void deleteStudent() {
        String idSearch = textViewID.getText();

        // Show error when ID field is empty
        if (idSearch.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter a valid Student ID", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Connecting to Database
        try {
            con = DriverManager.getConnection("jdbc:ucanaccess://" + file);
            st = con.createStatement();

            String query = "SELECT * FROM Table1 WHERE StudentID='" + idSearch + "'";
            rs = st.executeQuery(query);

            if (rs.next()) {
                // Retrieve values from the result set
                String s1 = rs.getString("FirstName");
                String s2 = rs.getString("LastName");
                String s3 = rs.getString("Program");
                String s4 = rs.getString("Address");
                String s5 = rs.getString("PhoneNumber");
                String s6 = rs.getString("Email");
                String s7 = rs.getString("Sex");
                String s8 = rs.getString("DateOfBirth");
                String s9 = rs.getString("EnrollmentDate");

                // Modifying the textfield
                textViewFirst.setText(s1);
                textViewLast.setText(s2);
                textViewProgram.setText(s3);
                textViewAddress.setText(s4);
                textViewPhone.setText(s5);
                textViewMail.setText(s6);
                textViewSex.setText(s7);
                textViewDOB.setText(s8);
                textViewEnrollment.setText(s9);

                // Confirm deletion with the user
                int confirmDialogResult = JOptionPane.showConfirmDialog(this,
                        "Are you sure you want to delete this student record?",
                        "Confirmation", JOptionPane.YES_NO_OPTION);

                if (confirmDialogResult == JOptionPane.YES_OPTION) {
                    // Deletion of data
                    int result = st.executeUpdate("DELETE FROM Table1 WHERE StudentID='" + idSearch + "'");

                        if (result > 0) {
                            JOptionPane.showMessageDialog(this, "Student Record Deleted Successfully");
                            // Clear the text fields or handle accordingly after successful deletion
                            

                        // Clear other text fields as needed
                    } else {
                        JOptionPane.showMessageDialog(this, "Failed to delete Student Record");
                    }
                } else {
                    // User canceled the deletion
                    JOptionPane.showMessageDialog(this, "Deletion canceled by user");
                }
            } else {
                // Student not found
                JOptionPane.showMessageDialog(this, "Student Not Found");
                textViewFirst.setText(""); // Clear the text field or handle accordingly
            }
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "An error occurred while deleting the student record");
            } finally {
                // Close the results set
                try {
                    if (con != null) con.close();
                    if (rs != null) rs.close();
                    if (st != null) st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                } 
            }
        }


    // User Variables
    private Connection con;
    private Statement st;
    private ResultSet rs;
    private String openedFileName;
    private File file;

    // JVariables declaration
    private JButton buttonAdd, buttonDelete, buttonOpen, buttonSearch, buttonShow;
    private JLabel labelAddAddress, labelAddCourse, labelAddDOB, labelAddEnrollment, labelAddFirst, labelAddID,
            labelAddLast, labelAddMail, labelAddPhone, labelAddSex, labelFileOpen, labelTitle, labelViewAddress,
            labelViewDOB, labelViewEnrollment, labelViewFirst, labelViewID, labelViewLast, labelViewMail,
            labelViewPhone, labelViewProgram, labelViewSex;
    private JPanel panelAdd, panelTitle, panelView;
    private JTextField textAddAddress, textAddDOB, textAddEnrollment, textAddFirst, textAddID, textAddLast, textAddMail,
            textAddPhone, textAddProgram, textAddSex, textViewAddress, textViewDOB, textViewEnrollment, textViewFirst,
            textViewID, textViewLast, textViewMail, textViewPhone, textViewProgram, textViewSex;

    private String getFilePathString(File file) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
