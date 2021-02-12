/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PayRoll_System;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Hrishi
 */
public class LectSal extends javax.swing.JFrame {
    
    public LectSal() {
        initComponents();
    }
    public int Stringsplit(String s1){
        int status=0;
        String[] stringArray = s1.split(",");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
           String numberAsString = stringArray[i];
           intArray[i] = Integer.parseInt(numberAsString);
           if(intArray[i]>31){
               status=1;
               break;
           }
        }
        return status;
    }
    public int abc(float noOfdate,String dates){
        int status=0;
        char c =','; 
        int cnt =0;     
        for(int i=0;i<dates.length();i++){
            if(noOfdate==0){
                noOfdate=1;
                break;
            }else if(dates.charAt(i)==c){
                cnt++;
            }
        }
        if(!(cnt==noOfdate-1)){
                status=1;
        }
        return status;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        txt8 = new javax.swing.JTextField();
        txt9 = new javax.swing.JTextField();
        txt10 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lecture1 = new javax.swing.JTextField();
        practical = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jC1 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jC2 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        txt11 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt12 = new javax.swing.JTextField();
        txt13 = new javax.swing.JTextField();
        txt14 = new javax.swing.JTextField();
        txt15 = new javax.swing.JTextField();
        txt16 = new javax.swing.JTextField();
        txt17 = new javax.swing.JTextField();
        txt18 = new javax.swing.JTextField();
        txt19 = new javax.swing.JTextField();
        txt20 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALLOWANCE");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Select Month");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Number of Lecture");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Number of Practicals");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Week");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("First Week");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Second Week");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Third Week");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Forth Week");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Fifth Week");

        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1KeyTyped(evt);
            }
        });

        txt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2KeyTyped(evt);
            }
        });

        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });
        txt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3KeyTyped(evt);
            }
        });

        txt4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4KeyTyped(evt);
            }
        });

        txt5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5KeyTyped(evt);
            }
        });

        txt6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6KeyTyped(evt);
            }
        });

        txt7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt7KeyTyped(evt);
            }
        });

        txt8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt8KeyTyped(evt);
            }
        });

        txt9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt9KeyTyped(evt);
            }
        });

        txt10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt10KeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Rs/lecture");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Rs/practical");

        lecture1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lecture1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lecture1KeyTyped(evt);
            }
        });

        practical.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        practical.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                practicalKeyTyped(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/clear1.png"))); // NOI18N
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Department");

        jC1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jC1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer Science", "Mathematics", "Chemistry", "Physics", "Botony", "Zoology" }));
        jC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC1ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Faculty Id");

        jC2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC2ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Select Year");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June ", "July", "August", "September", "October", "November", "December" }));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Dates of Lecture");

        txt11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt11KeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Dates of Practical");

        txt12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt12KeyTyped(evt);
            }
        });

        txt13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt13KeyTyped(evt);
            }
        });

        txt14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt14KeyTyped(evt);
            }
        });

        txt15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt15KeyTyped(evt);
            }
        });

        txt16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt16KeyTyped(evt);
            }
        });

        txt17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt17KeyTyped(evt);
            }
        });

        txt18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt18KeyTyped(evt);
            }
        });

        txt19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt19KeyTyped(evt);
            }
        });

        txt20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt20KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel7))
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt15, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt14, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt13, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt12, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                .addComponent(txt19, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt18, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt17, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt16, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(50, 50, 50)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(91, 91, 91)
                                        .addComponent(jLabel16)
                                        .addGap(18, 18, 18)
                                        .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(69, 69, 69)
                                        .addComponent(jC1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18)
                                        .addComponent(jC2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(31, 31, 31)
                                .addComponent(lecture1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(practical, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(115, 115, 115)
                                .addComponent(jButton2)
                                .addGap(99, 99, 99)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel8)
                            .addComponent(jLabel18))))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lecture1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(practical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(2, 2, 2)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel3, jLabel5, jLabel6, jLabel7, jLabel9});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyTyped
        // TODO add your handling code here:
        char i=evt.getKeyChar();
        if((i< '0' || i >'9') && i!='\b'){
            evt.consume();
            jLabel11.setText("* Only numbers are allowed");
        }else{
            jLabel11.setText("");
        }
    }//GEN-LAST:event_txt1KeyTyped

    private void txt2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyTyped
        // TODO add your handling code here:
        char i=evt.getKeyChar();
        if((i< '0' || i >'9') && i!='\b'){
            evt.consume();
            jLabel11.setText("* Only numbers are allowed");
        }else{
            jLabel11.setText("");
        }
    }//GEN-LAST:event_txt2KeyTyped

    private void txt3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3KeyTyped
        // TODO add your handling code here:
        char i=evt.getKeyChar();
        if((i< '0' || i >'9') && i!='\b'){
            evt.consume();
            jLabel11.setText("* Only numbers are allowed");
        }else{
            jLabel11.setText("");
        }
    }//GEN-LAST:event_txt3KeyTyped

    private void txt4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4KeyTyped
        // TODO add your handling code here:
        char i=evt.getKeyChar();
        if((i< '0' || i >'9') && i!='\b'){
            evt.consume();
            jLabel11.setText("* Only numbers are allowed");
        }else{
            jLabel11.setText("");
        }
    }//GEN-LAST:event_txt4KeyTyped

    private void txt5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5KeyTyped
        // TODO add your handling code here:
        char i=evt.getKeyChar();
        if((i< '0' || i >'9') && i!='\b'){
            evt.consume();
            jLabel11.setText("* Only numbers are allowed");
        }else{
            jLabel11.setText("");
        }
    }//GEN-LAST:event_txt5KeyTyped

    private void txt6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6KeyTyped
        // TODO add your handling code here:
        char i=evt.getKeyChar();
        if((i< '0' || i >'9') && i!='\b'){
            evt.consume();
            jLabel11.setText("* Only numbers are allowed");
        }else if((i< '0' || i >'3') && i!='\b'){
            JOptionPane.showMessageDialog(this,"practicals not more than3 in week!");
        }else{
            jLabel11.setText("");
        }
    }//GEN-LAST:event_txt6KeyTyped

    private void txt7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7KeyTyped
        // TODO add your handling code here:
        char i=evt.getKeyChar();
        if((i< '0' || i >'9') && i!='\b'){
            evt.consume();
            jLabel11.setText("* Only numbers are allowed");
        }else if((i< '0' || i >'3') && i!='\b'){
            JOptionPane.showMessageDialog(this,"practicals not more than3 in week!");
        }else{
            jLabel11.setText("");
        }
    }//GEN-LAST:event_txt7KeyTyped

    private void txt8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8KeyTyped
        // TODO add your handling code here:
        char i=evt.getKeyChar();
        if((i< '0' || i >'9') && i!='\b'){
            evt.consume();
            jLabel11.setText("* Only numbers are allowed");
        }else if((i< '0' || i >'3') && i!='\b'){
            JOptionPane.showMessageDialog(this,"practicals not more than3 in week!");
        }else{
            jLabel11.setText("");
        }
    }//GEN-LAST:event_txt8KeyTyped

    private void txt9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9KeyTyped
        // TODO add your handling code here:
        char i=evt.getKeyChar();
        if((i< '0' || i >'9') && i!='\b'){
            evt.consume();
            jLabel11.setText("* Only numbers are allowed");
        }else if((i< '0' || i >'3') && i!='\b'){
            JOptionPane.showMessageDialog(this,"practicals not more than3 in week!");
        }else{
            jLabel11.setText("");
        }
    }//GEN-LAST:event_txt9KeyTyped

    private void txt10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt10KeyTyped
        // TODO add your handling code here:
       char i=evt.getKeyChar();
        if((i< '0' || i >'9') && i!='\b'){
            evt.consume();
            jLabel11.setText("* Only numbers are allowed");
        }else if((i< '0' || i >'3') && i!='\b'){
            JOptionPane.showMessageDialog(this,"practicals not more than3 in week!");
        }else{
            jLabel11.setText("");
        }
    }//GEN-LAST:event_txt10KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(jC2.getSelectedItem().toString());
        String month=jComboBox1.getSelectedItem().toString();       
        int year=jYearChooser1.getYear();
        String monthY=month+year;
        
        if(txt1.getText().isEmpty() || txt2.getText().isEmpty() || txt3.getText().isEmpty() || 
                txt4.getText().isEmpty() || txt9.getText().isEmpty() || txt6.getText().isEmpty() || 
                txt7.getText().isEmpty() || txt8.getText().isEmpty() ||txt5.getText().isEmpty() || 
                txt10.getText().isEmpty() || lecture1.getText().isEmpty() || practical.getText().isEmpty() ||
                txt11.getText().isEmpty() || txt11.getText().isEmpty() || txt13.getText().isEmpty() || 
                txt14.getText().isEmpty() || txt15.getText().isEmpty() || txt16.getText().isEmpty() || 
                txt17.getText().isEmpty() || txt18.getText().isEmpty() || txt19.getText().isEmpty() || txt20.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Fill all details");
        }else{
            int lecture=Integer.parseInt(lecture1.getText());int prac=Integer.parseInt(practical.getText());
            float l1=Integer.parseInt(txt1.getText());float l2=Integer.parseInt(txt2.getText());
            float l3=Integer.parseInt(txt3.getText());float l4=Integer.parseInt(txt4.getText());
            float l5=Integer.parseInt(txt5.getText());float p1=Integer.parseInt(txt6.getText());
            float p2=Integer.parseInt(txt7.getText());float p3=Integer.parseInt(txt8.getText());
            float p4=Integer.parseInt(txt9.getText());float p5=Integer.parseInt(txt10.getText());
            String dl1=txt11.getText();String dl2=txt12.getText();String dl3=txt13.getText();
            String dl4=txt14.getText();String dl5=txt15.getText();String dp1=txt16.getText();
            String dp2=txt17.getText();String dp3=txt18.getText();String dp4=txt19.getText();
            String dp5=txt20.getText();int xyz1=abc(l1,dl1);int xyz2=abc(l2,dl2);
            int s1=Stringsplit(dl1);int s2=Stringsplit(dl2);int s3=Stringsplit(dl3);
            int s4=Stringsplit(dl4);int s5=Stringsplit(dl5);int s6=Stringsplit(dp1);
            int s7=Stringsplit(dp2);int s8=Stringsplit(dp3);int s9=Stringsplit(dp4);
            int s10=Stringsplit(dp5);
            int xyz3=abc(l3,dl3);int xyz4=abc(l4,dl4);int xyz5=abc(l5,dl5);int xyz6=abc(p1,dp1);
            int xyz7=abc(p2,dp2);int xyz8=abc(p3,dp3);int xyz9=abc(p4,dp4);int xyz10=abc(p5,dp5);
            if(xyz1==1 || xyz2==1 || xyz1==1 || xyz3==1 || xyz4==1 || xyz5==1 || xyz6==1 || xyz7==1 ||
                    xyz8==1 || xyz9==1){
                JOptionPane.showMessageDialog(this,"number of dates not match with dates of lecture & practical!");   
            }else if(s1==1 || s2==1 || s3==1 || s4==1 || s5==1 || s6==1 || s7==1 || s8==1 || s9==1 || s10==1 ){
                    JOptionPane.showMessageDialog(this, "Please enter valid dates!");
            }
            else{
                float hl1=(l1*50)/60;float hl2=(l2*50)/60;float hl3=(l3*50)/60;float hl4=(l4*50)/60;                      
                float hl5=(l5*50)/60;float hp1=(p1*50)/60;float hp2=(p2*50)/60;float hp3=(p3*50)/60;
                float hp4=(p4*50)/60;float hp5=(p5*50)/60;float rl1=hl1*lecture;float rl2=hl2*lecture;
                float rl3=hl3*lecture;float rl4=hl4*lecture;float rl5=hl5*lecture;float rp1=hp1*prac;
                float rp2=hp2*prac;float rp3=hp3*prac;float rp4=hp4*prac;float rp5=hp5*prac;
                float nOlect=l1+l2+l3+l4+l5;float nOpract=p1+p2+p3+p4+p5;float nOhlect=hl1+hl2+hl3+hl4+hl5;
                float nOhpract=hp1+hp2+hp3+hp4+hp5;int ltotal=(int)(rl1+rl2+rl3+rl4+rl5);
                int ptotal=(int)(rp1+rp2+rp3+rp4+rp5);int total=ltotal+ptotal;
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
                        PreparedStatement ps=con.prepareStatement("insert into lecture values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                        ps.setInt(1, id);ps.setString(2, monthY);ps.setFloat(3, l1);ps.setString(4, dl1);ps.setFloat(5, l2);ps.setString(6, dl2);
                        ps.setFloat(7, l3);ps.setString(8, dl3);ps.setFloat(9, l4);ps.setString(10, dl4);ps.setFloat(11, l5);ps.setString(12, dl5);
                        ps.setFloat(13, p1);ps.setString(14, dp1);ps.setFloat(15, p2);ps.setString(16, dp2);ps.setFloat(17, p3);ps.setString(18, dp3);
                        ps.setFloat(19, p4);ps.setString(20, dp4);ps.setFloat(21, p5);ps.setString(22, dp5);ps.setFloat(23, hl1);ps.setFloat(24, hl2);
                        ps.setFloat(25, hl3);ps.setFloat(26, hl4);ps.setFloat(27, hl5);ps.setFloat(28, hp1);ps.setFloat(29, hp2);ps.setFloat(30, hp3);
                        ps.setFloat(31, hp4);ps.setFloat(32, hp5);ps.setFloat(33, rl1);ps.setFloat(34, rl2);ps.setFloat(35, rl3);
                        ps.setFloat(36,rl4);ps.setFloat(37, rl5);ps.setFloat(38, rp1);ps.setFloat(39, rp2);ps.setFloat(40, rp3);
                        ps.setFloat(41, rp4);ps.setFloat(42, rp5);ps.setFloat(43, nOlect);ps.setFloat(44, nOpract);
                        ps.setFloat(45, nOhlect);ps.setFloat(46, nOhpract);ps.setInt(47, total); 
                        if(ps.executeUpdate()==1){
                            JOptionPane.showMessageDialog(this,"Salary details Added Successfully!");
                            txt1.setText("");txt2.setText("");txt3.setText("");txt4.setText("");txt5.setText("");
                            txt6.setText("");txt7.setText("");txt8.setText("");txt9.setText("");txt10.setText("");
                            txt11.setText("");txt12.setText("");txt13.setText("");txt14.setText("");txt15.setText("");
                            txt16.setText("");txt17.setText("");txt18.setText("");txt19.setText("");txt20.setText("");
                        }else{
                            JOptionPane.showMessageDialog(this,"Unble to Add");
                        }
                    }catch(SQLIntegrityConstraintViolationException e){
                        JOptionPane.showMessageDialog(this,"Duplicate Entry!");
                    }catch(Exception e){
                        System.out.println(e);
                    }
                }
            }   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lecture1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lecture1KeyTyped
        // TODO add your handling code here:
        char i=evt.getKeyChar();
        if((i< '0' || i >'9') && i!='\b'){
            evt.consume();
            jLabel11.setText("* Only numbers are allowed");
        }else{
            jLabel11.setText("");
        }
    }//GEN-LAST:event_lecture1KeyTyped

    private void practicalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_practicalKeyTyped
        // TODO add your handling code here:
        char i=evt.getKeyChar();
        if((i< '0' || i >'9') && i!='\b'){
            evt.consume();
            jLabel11.setText("* Only numbers are allowed");
        }else{
            jLabel11.setText("");
        }
    }//GEN-LAST:event_practicalKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
        adminhome ab=new adminhome();
        ab.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC1ActionPerformed
        // TODO add your handling code here:
        int itemCount = jC2.getItemCount();
        for(int i=0;i<itemCount;i++){
            jC2.removeItemAt(0);
        }
        //fill second combo box
        String comboBox1text = String.valueOf(jC1.getSelectedItem());
        if (!comboBox1text.isEmpty() || comboBox1text != null) {
            
            String sal="C.H.B.";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
                PreparedStatement ps = con.prepareStatement("select faculty_id from facultydetails where Department = '" + comboBox1text + "' AND Salary_Type='"+sal+"'");
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    jC2.addItem(rs.getString("faculty_id"));
                }
            } catch(Exception e) {
                System.out.println("Error:"+e.getMessage());
            }
        }
    }//GEN-LAST:event_jC1ActionPerformed

    private void jC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jC2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:     
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt11KeyTyped
        // TODO add your handling code here:
        char i=evt.getKeyChar();
        if((i< '0' || i >'9') && (i!='\b') && (i!=',')){
            evt.consume();
            jLabel11.setText("* Only numbers are allowed");
        }else{
            jLabel11.setText("");
        }
    }//GEN-LAST:event_txt11KeyTyped

    private void txt12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt12KeyTyped
        // TODO add your handling code here:
        char i=evt.getKeyChar();
        if((i< '0' || i >'9') && (i!='\b') && (i!=',')){
            evt.consume();
            jLabel11.setText("* Only numbers are allowed");
        }else{
            jLabel11.setText("");
        }
    }//GEN-LAST:event_txt12KeyTyped

    private void txt13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt13KeyTyped
        // TODO add your handling code here:
        char i=evt.getKeyChar();
        if((i< '0' || i >'9') && (i!='\b') && (i!=',')){
            evt.consume();
            jLabel11.setText("* Only numbers are allowed");
        }else{
            jLabel11.setText("");
        }
    }//GEN-LAST:event_txt13KeyTyped

    private void txt14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt14KeyTyped
        // TODO add your handling code here:
        char i=evt.getKeyChar();
        if((i< '0' || i >'9') && (i!='\b') && (i!=',')){
            evt.consume();
            jLabel11.setText("* Only numbers are allowed");
        }else{
            jLabel11.setText("");
        }
    }//GEN-LAST:event_txt14KeyTyped

    private void txt15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt15KeyTyped
        // TODO add your handling code here:
        char i=evt.getKeyChar();
        if((i< '0' || i >'9') && (i!='\b') && (i!=',')){
            evt.consume();
            jLabel11.setText("* Only numbers are allowed");
        }else{
            jLabel11.setText("");
        }
    }//GEN-LAST:event_txt15KeyTyped

    private void txt16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt16KeyTyped
        // TODO add your handling code here:
        char i=evt.getKeyChar();
        if((i< '0' || i >'9') && (i!='\b') && (i!=',')){
            evt.consume();
            jLabel11.setText("* Only numbers are allowed");
        }else{
            jLabel11.setText("");
        }
    }//GEN-LAST:event_txt16KeyTyped

    private void txt17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt17KeyTyped
        // TODO add your handling code here:
        char i=evt.getKeyChar();
        if((i< '0' || i >'9') && (i!='\b') && (i!=',')){
            evt.consume();
            jLabel11.setText("* Only numbers are allowed");
        }else{
            jLabel11.setText("");
        }
    }//GEN-LAST:event_txt17KeyTyped

    private void txt18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt18KeyTyped
        // TODO add your handling code here:
        char i=evt.getKeyChar();
        if((i< '0' || i >'9') && (i!='\b') && (i!=',')){
            evt.consume();
            jLabel11.setText("* Only numbers are allowed");
        }else{
            jLabel11.setText("");
        }
    }//GEN-LAST:event_txt18KeyTyped

    private void txt19KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt19KeyTyped
        // TODO add your handling code here:
        char i=evt.getKeyChar();
        if((i< '0' || i >'9') && (i!='\b') && (i!=',')){
            evt.consume();
            jLabel11.setText("* Only numbers are allowed");
        }else{
            jLabel11.setText("");
        }
    }//GEN-LAST:event_txt19KeyTyped

    private void txt20KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt20KeyTyped
        // TODO add your handling code here:
        char i=evt.getKeyChar();
        if((i< '0' || i >'9') && (i!='\b') && (i!=',')){
            evt.consume();
            jLabel11.setText("* Only numbers are allowed");
        }else{
            jLabel11.setText("");
        }
    }//GEN-LAST:event_txt20KeyTyped

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt3ActionPerformed

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
            java.util.logging.Logger.getLogger(LectSal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LectSal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LectSal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LectSal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LectSal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jC1;
    private javax.swing.JComboBox<String> jC2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JTextField lecture1;
    private javax.swing.JTextField practical;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt10;
    private javax.swing.JTextField txt11;
    private javax.swing.JTextField txt12;
    private javax.swing.JTextField txt13;
    private javax.swing.JTextField txt14;
    private javax.swing.JTextField txt15;
    private javax.swing.JTextField txt16;
    private javax.swing.JTextField txt17;
    private javax.swing.JTextField txt18;
    private javax.swing.JTextField txt19;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt20;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    // End of variables declaration//GEN-END:variables
}
