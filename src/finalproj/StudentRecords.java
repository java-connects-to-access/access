package finalproj;

import java.io.File;
import java.sql.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class StudentRecords extends javax.swing.JFrame {

    /** Creates new form GUI */
    public StudentRecords() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitle = new javax.swing.JPanel();
        labelFileOpen = new javax.swing.JLabel();
        buttonOpen = new javax.swing.JButton();
        buttonShow = new javax.swing.JButton();
        labelTitle = new javax.swing.JLabel();
        panelAdd = new javax.swing.JPanel();
        labelAddID = new javax.swing.JLabel();
        textAddID = new javax.swing.JTextField();
        labelAddFirst = new javax.swing.JLabel();
        textAddFirst = new javax.swing.JTextField();
        labelAddLast = new javax.swing.JLabel();
        textAddLast = new javax.swing.JTextField();
        labelAddCourse = new javax.swing.JLabel();
        textAddProgram = new javax.swing.JTextField();
        labelAddAddress = new javax.swing.JLabel();
        textAddAddress = new javax.swing.JTextField();
        labelAddPhone = new javax.swing.JLabel();
        textAddPhone = new javax.swing.JTextField();
        labelAddMail = new javax.swing.JLabel();
        textAddMail = new javax.swing.JTextField();
        labelAddSex = new javax.swing.JLabel();
        textAddSex = new javax.swing.JTextField();
        labelAddDOB = new javax.swing.JLabel();
        textAddDOB = new javax.swing.JTextField();
        labelAddEnrollment = new javax.swing.JLabel();
        textAddEnrollment = new javax.swing.JTextField();
        buttonAdd = new javax.swing.JButton();
        panelView = new javax.swing.JPanel();
        labelViewID = new javax.swing.JLabel();
        textViewID = new javax.swing.JTextField();
        labelViewFirst = new javax.swing.JLabel();
        textViewFirst = new javax.swing.JTextField();
        labelViewLast = new javax.swing.JLabel();
        textViewLast = new javax.swing.JTextField();
        labelViewProgram = new javax.swing.JLabel();
        textViewProgram = new javax.swing.JTextField();
        labelViewAddress = new javax.swing.JLabel();
        textViewAddress = new javax.swing.JTextField();
        labelViewPhone = new javax.swing.JLabel();
        textViewPhone = new javax.swing.JTextField();
        labelViewMail = new javax.swing.JLabel();
        textViewMail = new javax.swing.JTextField();
        labelViewSex = new javax.swing.JLabel();
        textViewSex = new javax.swing.JTextField();
        labelViewDOB = new javax.swing.JLabel();
        textViewDOB = new javax.swing.JTextField();
        labelViewEnrollment = new javax.swing.JLabel();
        textViewEnrollment = new javax.swing.JTextField();
        buttonSearch = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student Records");
        setResizable(false);

        labelFileOpen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelFileOpen.setText(" ");
        labelFileOpen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        buttonOpen.setText("Open File");
        buttonOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOpenActionPerformed(evt);
            }
        });

        buttonShow.setText("Show Database");
        buttonShow.setEnabled(false);
        buttonShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonShowActionPerformed(evt);
            }
        });

        labelTitle.setText("Student Records");
        labelTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        javax.swing.GroupLayout panelTitleLayout = new javax.swing.GroupLayout(panelTitle);
        panelTitle.setLayout(panelTitleLayout);
        panelTitleLayout.setHorizontalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelFileOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(buttonOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonShow)
                .addContainerGap())
        );
        panelTitleLayout.setVerticalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addGroup(panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTitleLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTitleLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(labelFileOpen))
                            .addGroup(panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(buttonOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonShow, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelTitleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelTitle)))
                .addContainerGap())
        );

        panelAdd.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add a New Student Record", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        labelAddID.setText("Student ID");

        textAddID.setEnabled(false);
        textAddID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAddIDActionPerformed(evt);
            }
        });

        labelAddFirst.setText("First Name");

        textAddFirst.setEnabled(false);
        textAddFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAddFirstActionPerformed(evt);
            }
        });

        labelAddLast.setText("Last Name");

        textAddLast.setEnabled(false);
        textAddLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAddLastActionPerformed(evt);
            }
        });

        labelAddCourse.setText("Program");

        textAddProgram.setEnabled(false);
        textAddProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAddProgramActionPerformed(evt);
            }
        });

        labelAddAddress.setText("Address");

        textAddAddress.setEnabled(false);
        textAddAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAddAddressActionPerformed(evt);
            }
        });

        labelAddPhone.setText("Phone Number");

        textAddPhone.setEnabled(false);
        textAddPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAddPhoneActionPerformed(evt);
            }
        });

        labelAddMail.setText("E-Mail Address");

        textAddMail.setEnabled(false);
        textAddMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAddMailActionPerformed(evt);
            }
        });

        labelAddSex.setText("Sex");

        textAddSex.setEnabled(false);
        textAddSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAddSexActionPerformed(evt);
            }
        });

        labelAddDOB.setText("Date of Birth");

        textAddDOB.setEnabled(false);
        textAddDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAddDOBActionPerformed(evt);
            }
        });

        labelAddEnrollment.setText("Enrollment Date");

        textAddEnrollment.setEnabled(false);
        textAddEnrollment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAddEnrollmentActionPerformed(evt);
            }
        });

        buttonAdd.setText("Add Student");
        buttonAdd.setEnabled(false);
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textAddProgram, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textAddAddress, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textAddPhone, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textAddMail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textAddSex, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textAddID, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAddFirst)
                    .addComponent(textAddLast)
                    .addComponent(textAddDOB, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textAddEnrollment, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAddID)
                    .addComponent(textAddID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAddFirst)
                    .addComponent(textAddFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAddLast)
                    .addComponent(textAddLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAddCourse)
                    .addComponent(textAddProgram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAddAddress)
                    .addComponent(textAddAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAddPhone)
                    .addComponent(textAddPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAddMail)
                    .addComponent(textAddMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAddSex)
                    .addComponent(textAddSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textAddDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAddDOB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textAddEnrollment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAddEnrollment))
                .addGap(18, 18, 18)
                .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelView.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View or Delete Record", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        labelViewID.setText("Student ID");

        textViewID.setEnabled(false);
        textViewID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textViewIDActionPerformed(evt);
            }
        });

        labelViewFirst.setText("First Name");

        textViewFirst.setEnabled(false);
        textViewFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textViewFirstActionPerformed(evt);
            }
        });

        labelViewLast.setText("Last Name");

        textViewLast.setEnabled(false);
        textViewLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textViewLastActionPerformed(evt);
            }
        });

        labelViewProgram.setText("Program");

        textViewProgram.setEnabled(false);
        textViewProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textViewProgramActionPerformed(evt);
            }
        });

        labelViewAddress.setText("Address");

        textViewAddress.setEnabled(false);
        textViewAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textViewAddressActionPerformed(evt);
            }
        });

        labelViewPhone.setText("Phone Number");

        textViewPhone.setEnabled(false);
        textViewPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textViewPhoneActionPerformed(evt);
            }
        });

        labelViewMail.setText("E-Mail Address");

        textViewMail.setEnabled(false);
        textViewMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textViewMailActionPerformed(evt);
            }
        });

        labelViewSex.setText("Sex");

        textViewSex.setEnabled(false);
        textViewSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textViewSexActionPerformed(evt);
            }
        });

        labelViewDOB.setText("Date of Birth");

        textViewDOB.setEnabled(false);
        textViewDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textViewDOBActionPerformed(evt);
            }
        });

        labelViewEnrollment.setText("Enrollment Date");

        textViewEnrollment.setEnabled(false);
        textViewEnrollment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textViewEnrollmentActionPerformed(evt);
            }
        });

        buttonSearch.setText("Search by ID");
        buttonSearch.setEnabled(false);
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        buttonDelete.setText("Delete Record");
        buttonDelete.setEnabled(false);
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelViewLayout = new javax.swing.GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelViewLayout.createSequentialGroup()
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textViewProgram, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textViewAddress, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textViewPhone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textViewMail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textViewSex, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textViewID, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textViewFirst)
                            .addComponent(textViewLast)
                            .addComponent(textViewDOB, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textViewEnrollment, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelViewID)
                    .addComponent(textViewID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelViewFirst)
                    .addComponent(textViewFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelViewLast)
                    .addComponent(textViewLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelViewProgram)
                    .addComponent(textViewProgram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelViewAddress)
                    .addComponent(textViewAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelViewPhone)
                    .addComponent(textViewPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelViewMail)
                    .addComponent(textViewMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelViewSex)
                    .addComponent(textViewSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textViewDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelViewDOB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textViewEnrollment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelViewEnrollment))
                .addGap(18, 18, 18)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOpenActionPerformed
        openFile();
    }//GEN-LAST:event_buttonOpenActionPerformed

    private void textAddIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAddIDActionPerformed
    }//GEN-LAST:event_textAddIDActionPerformed

    private void textAddFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAddFirstActionPerformed
    }//GEN-LAST:event_textAddFirstActionPerformed

    private void textAddLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAddLastActionPerformed
    }//GEN-LAST:event_textAddLastActionPerformed

    private void textAddProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAddProgramActionPerformed
    }//GEN-LAST:event_textAddProgramActionPerformed

    private void textAddAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAddAddressActionPerformed
    }//GEN-LAST:event_textAddAddressActionPerformed

    private void textAddPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAddPhoneActionPerformed
    }//GEN-LAST:event_textAddPhoneActionPerformed

    private void textAddMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAddMailActionPerformed
    }//GEN-LAST:event_textAddMailActionPerformed

    private void textAddSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAddSexActionPerformed
    }//GEN-LAST:event_textAddSexActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        // TODO add your handling code here:
        addStudent();
    }//GEN-LAST:event_buttonAddActionPerformed

    private void textViewIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textViewIDActionPerformed
    }//GEN-LAST:event_textViewIDActionPerformed

    private void textViewFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textViewFirstActionPerformed
    }//GEN-LAST:event_textViewFirstActionPerformed

    private void textViewLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textViewLastActionPerformed
    }//GEN-LAST:event_textViewLastActionPerformed

    private void textViewProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textViewProgramActionPerformed
    }//GEN-LAST:event_textViewProgramActionPerformed

    private void textViewAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textViewAddressActionPerformed
    }//GEN-LAST:event_textViewAddressActionPerformed

    private void textViewPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textViewPhoneActionPerformed
    }//GEN-LAST:event_textViewPhoneActionPerformed

    private void textViewMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textViewMailActionPerformed
    }//GEN-LAST:event_textViewMailActionPerformed

    private void textViewSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textViewSexActionPerformed
    }//GEN-LAST:event_textViewSexActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        searchStudent();
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        deleteStudent();
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonShowActionPerformed
        showDatabaseTable();
    }//GEN-LAST:event_buttonShowActionPerformed

    private void textAddDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAddDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAddDOBActionPerformed

    private void textAddEnrollmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAddEnrollmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAddEnrollmentActionPerformed

    private void textViewDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textViewDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textViewDOBActionPerformed

    private void textViewEnrollmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textViewEnrollmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textViewEnrollmentActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

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
            if (!openedFileName.endsWith(".accdb")) {
                JOptionPane.showMessageDialog(null, "The selected file is not an Access Database (.accdb) file.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
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
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
 }
    
    // Function for adding a student record
    private void addStudent(){
        String q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;
        
        //Storing Values of Input in a String
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
        if (q1.isEmpty() || q2.isEmpty() || q3.isEmpty() || q4.isEmpty() || q5.isEmpty() || 
                q6.isEmpty() || q7.isEmpty() || q8.isEmpty() || q9.isEmpty() || q10.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter all required values", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try{
            //Connecting to Database
            con = DriverManager.getConnection("jdbc:ucanaccess://"+ file);
            Statement st = con.createStatement();
            
            //Inserting the Inputs in the Database
            int a = st.executeUpdate("Insert into Table1 values('"+q2+"','"+q3+"','"+q4+"','"+q5+"','"+q6+"','"+q7+"','"+q8+"','"+q1+"','"+q9+"','"+q10+"')");
            
            //Checking if the inputs are properly added
            if(a == 1){
                JOptionPane.showMessageDialog(this, "Student Record Added");
            }
            else{
                JOptionPane.showMessageDialog(this, "Error in Inserting Data", "Insertion Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        //If there's an error in connecting to Database
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);    
        }        
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
           Statement st = con.createStatement();

           String query = "Select * from Table1 where StudentID='" + idSearch + "'";
           ResultSet rs = st.executeQuery(query);

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

               //Modifying the textfield
               textViewFirst.setText(s1);
               textViewLast.setText(s2);
               textViewProgram.setText(s3);
               textViewAddress.setText(s4);
               textViewPhone.setText(s5);
               textViewMail.setText(s6);
               textViewSex.setText(s7);
               textViewDOB.setText(s8);
               textViewEnrollment.setText(s9);
               buttonDelete.setEnabled(true);

           } else {
               // Student not found
               JOptionPane.showMessageDialog(this, "Student Not Found", "Error", JOptionPane.ERROR_MESSAGE);
               textViewFirst.setText("");  // Clear the text field or handle accordingly
           }
           
           // Close the result set and statement
           rs.close();
           st.close();

       } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, ex);
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
            Statement st = con.createStatement();

            String query = "SELECT * FROM Table1 WHERE StudentID='" + idSearch + "'";
            ResultSet rs = st.executeQuery(query);

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
                int confirmDialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this student record?",
                        "Confirmation", JOptionPane.YES_NO_OPTION);

                if (confirmDialogResult == JOptionPane.YES_OPTION) {
                    // Deletion of data
                    int result = st.executeUpdate("DELETE FROM Table1 WHERE StudentID='" + idSearch + "'");

                        if (result > 0) {
                            JOptionPane.showMessageDialog(this, "Student Record Deleted Successfully");
                            // Clear the text fields or handle accordingly after successful deletion
                            textViewFirst.setText("");
                            textViewLast.setText("");
                            textViewProgram.setText("");
                            textViewAddress.setText("");
                            textViewPhone.setText("");
                            textViewMail.setText("");
                            textViewSex.setText("");
                            textViewDOB.setText("");
                            textViewEnrollment  .setText("");

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
                textViewFirst.setText("");  // Clear the text field or handle accordingly
            }

            // Close the result set and statement
            rs.close();
            st.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }        
    }
    
    // User Variables
    private Connection con;
    private String openedFileName;
    private File file;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonOpen;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonShow;
    private javax.swing.JLabel labelAddAddress;
    private javax.swing.JLabel labelAddCourse;
    private javax.swing.JLabel labelAddDOB;
    private javax.swing.JLabel labelAddEnrollment;
    private javax.swing.JLabel labelAddFirst;
    private javax.swing.JLabel labelAddID;
    private javax.swing.JLabel labelAddLast;
    private javax.swing.JLabel labelAddMail;
    private javax.swing.JLabel labelAddPhone;
    private javax.swing.JLabel labelAddSex;
    private javax.swing.JLabel labelFileOpen;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelViewAddress;
    private javax.swing.JLabel labelViewDOB;
    private javax.swing.JLabel labelViewEnrollment;
    private javax.swing.JLabel labelViewFirst;
    private javax.swing.JLabel labelViewID;
    private javax.swing.JLabel labelViewLast;
    private javax.swing.JLabel labelViewMail;
    private javax.swing.JLabel labelViewPhone;
    private javax.swing.JLabel labelViewProgram;
    private javax.swing.JLabel labelViewSex;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JPanel panelView;
    private javax.swing.JTextField textAddAddress;
    private javax.swing.JTextField textAddDOB;
    private javax.swing.JTextField textAddEnrollment;
    private javax.swing.JTextField textAddFirst;
    private javax.swing.JTextField textAddID;
    private javax.swing.JTextField textAddLast;
    private javax.swing.JTextField textAddMail;
    private javax.swing.JTextField textAddPhone;
    private javax.swing.JTextField textAddProgram;
    private javax.swing.JTextField textAddSex;
    private javax.swing.JTextField textViewAddress;
    private javax.swing.JTextField textViewDOB;
    private javax.swing.JTextField textViewEnrollment;
    private javax.swing.JTextField textViewFirst;
    private javax.swing.JTextField textViewID;
    private javax.swing.JTextField textViewLast;
    private javax.swing.JTextField textViewMail;
    private javax.swing.JTextField textViewPhone;
    private javax.swing.JTextField textViewProgram;
    private javax.swing.JTextField textViewSex;
    // End of variables declaration//GEN-END:variables

    private String getFilePathString(File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
