/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentinformationsystem;

/**
 *
 * @author Meem
 */
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        
        //Make the frame fullscreen
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int width = (int) toolkit.getScreenSize().getWidth();
        int height = (int) toolkit.getScreenSize().getHeight();
        this.setSize(width, height);
        
        //Show time and date
        showTimeAndDate();
    }
    
    void showTimeAndDate(){
        Date d = new Date();
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        jLabel_Time.setText(time.format(d));
        jLabel_Date.setText(date.format(d)); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel_Base = new javax.swing.JPanel();
        jPanel_Top = new javax.swing.JPanel();
        jLabel_Top = new javax.swing.JLabel();
        jPanel_Title = new javax.swing.JPanel();
        jLabel_Title = new javax.swing.JLabel();
        jPanel_Login = new javax.swing.JPanel();
        jLabel_LoginHere = new javax.swing.JLabel();
        jLabel_Message = new javax.swing.JLabel();
        jButton_Reset = new javax.swing.JButton();
        jButton_Exit = new javax.swing.JButton();
        jButton_Login = new javax.swing.JButton();
        jRadioButton_Student = new javax.swing.JRadioButton();
        jRadioButton_Admin = new javax.swing.JRadioButton();
        jLabel_Password = new javax.swing.JLabel();
        jPasswordField_Password = new javax.swing.JPasswordField();
        jLabel_Username = new javax.swing.JLabel();
        jSeparator_Password = new javax.swing.JSeparator();
        jTextField_Username = new javax.swing.JTextField();
        jSeparator_Username = new javax.swing.JSeparator();
        jCheckBox_ShowPassword = new javax.swing.JCheckBox();
        jLabel_IconShow = new javax.swing.JLabel();
        jPanel_TimeDate = new javax.swing.JPanel();
        jPanel_Now = new javax.swing.JPanel();
        jLabel_Now = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel_Time = new javax.swing.JLabel();
        jLabel_Date = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel_Bottom = new javax.swing.JPanel();
        jLabel_Bottom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");

        jPanel_Top.setBackground(new java.awt.Color(102, 102, 102));
        jPanel_Top.setPreferredSize(new java.awt.Dimension(600, 36));

        jLabel_Top.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Top.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Top.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_Top.setText("Phone: 01782390567, 02943856   Email:stuinfo@gmail.com");

        javax.swing.GroupLayout jPanel_TopLayout = new javax.swing.GroupLayout(jPanel_Top);
        jPanel_Top.setLayout(jPanel_TopLayout);
        jPanel_TopLayout.setHorizontalGroup(
            jPanel_TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TopLayout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel_Top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_TopLayout.setVerticalGroup(
            jPanel_TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Top, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jPanel_Title.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_Title.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_Title.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Title.setText("STUDENT INFORMATION SYSTEM");

        javax.swing.GroupLayout jPanel_TitleLayout = new javax.swing.GroupLayout(jPanel_Title);
        jPanel_Title.setLayout(jPanel_TitleLayout);
        jPanel_TitleLayout.setHorizontalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 1273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel_TitleLayout.setVerticalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel_Login.setBackground(new java.awt.Color(102, 102, 102));
        jPanel_Login.setForeground(new java.awt.Color(255, 255, 255));

        jLabel_LoginHere.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_LoginHere.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_LoginHere.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_LoginHere.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentinformationsystem/Icon/login_here.png"))); // NOI18N
        jLabel_LoginHere.setText("Login Here...");

        jLabel_Message.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_Message.setForeground(new java.awt.Color(204, 204, 204));
        jLabel_Message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Message.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentinformationsystem/Icon/forgot_pass.png"))); // NOI18N
        jLabel_Message.setText("For password problems, please contact with the admin");

        jButton_Reset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentinformationsystem/Icon/reset.png"))); // NOI18N
        jButton_Reset.setText("Reset");
        jButton_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ResetActionPerformed(evt);
            }
        });

        jButton_Exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentinformationsystem/Icon/exit.png"))); // NOI18N
        jButton_Exit.setText("Exit");
        jButton_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExitActionPerformed(evt);
            }
        });

        jButton_Login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentinformationsystem/Icon/login.png"))); // NOI18N
        jButton_Login.setText("Login");
        jButton_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoginActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton_Student);
        jRadioButton_Student.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton_Student.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton_Student.setSelected(true);
        jRadioButton_Student.setText("Student");

        buttonGroup1.add(jRadioButton_Admin);
        jRadioButton_Admin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton_Admin.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton_Admin.setText("Admin");

        jLabel_Password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Password.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentinformationsystem/Icon/password.png"))); // NOI18N
        jLabel_Password.setText("Password:");

        jPasswordField_Password.setBackground(new java.awt.Color(102, 102, 102));
        jPasswordField_Password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField_Password.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordField_Password.setText("...........................................................");
        jPasswordField_Password.setBorder(null);
        jPasswordField_Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField_PasswordMouseClicked(evt);
            }
        });

        jLabel_Username.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Username.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Username.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentinformationsystem/Icon/user.png"))); // NOI18N
        jLabel_Username.setText("Username:");

        jTextField_Username.setBackground(new java.awt.Color(102, 102, 102));
        jTextField_Username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Username.setForeground(new java.awt.Color(204, 204, 204));
        jTextField_Username.setText("Enter ID");
        jTextField_Username.setBorder(null);
        jTextField_Username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_UsernameMouseClicked(evt);
            }
        });

        jCheckBox_ShowPassword.setBackground(new java.awt.Color(102, 102, 102));
        jCheckBox_ShowPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox_ShowPassword.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox_ShowPassword.setText("Show Password");
        jCheckBox_ShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_ShowPasswordActionPerformed(evt);
            }
        });

        jLabel_IconShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_IconShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentinformationsystem/Icon/show_pass.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_LoginLayout = new javax.swing.GroupLayout(jPanel_Login);
        jPanel_Login.setLayout(jPanel_LoginLayout);
        jPanel_LoginLayout.setHorizontalGroup(
            jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_LoginHere, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_LoginLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_Password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Username, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_LoginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_Message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_LoginLayout.createSequentialGroup()
                                .addComponent(jButton_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(jButton_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60))
                    .addGroup(jPanel_LoginLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel_LoginLayout.createSequentialGroup()
                                .addComponent(jRadioButton_Student, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField_Username, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField_Password, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator_Password, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator_Username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel_LoginLayout.createSequentialGroup()
                                .addComponent(jLabel_IconShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox_ShowPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_LoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
        );
        jPanel_LoginLayout.setVerticalGroup(
            jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_LoginLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel_LoginHere, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_Username, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jTextField_Username))
                .addGap(0, 0, 0)
                .addComponent(jSeparator_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_LoginLayout.createSequentialGroup()
                        .addComponent(jPasswordField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox_ShowPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel_IconShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_Student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton_Admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton_Login)
                .addGap(17, 17, 17)
                .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_Message, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel_TimeDate.setBackground(new java.awt.Color(153, 153, 153));

        jPanel_Now.setBackground(new java.awt.Color(204, 204, 204));

        jLabel_Now.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_Now.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_Now.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_Now.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Now.setText("Now...");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel_Time.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_Time.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel_Time.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_Time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Time.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentinformationsystem/Icon/time.png"))); // NOI18N
        jLabel_Time.setText("Time");

        jLabel_Date.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_Date.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel_Date.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_Date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Date.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentinformationsystem/Icon/date.png"))); // NOI18N
        jLabel_Date.setText("Date");

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel_NowLayout = new javax.swing.GroupLayout(jPanel_Now);
        jPanel_Now.setLayout(jPanel_NowLayout);
        jPanel_NowLayout.setHorizontalGroup(
            jPanel_NowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_NowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_NowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_NowLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel_NowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_NowLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jSeparator3)
                                .addGap(9, 9, 9))
                            .addComponent(jSeparator2))
                        .addGap(10, 10, 10))
                    .addComponent(jSeparator6)
                    .addComponent(jLabel_Date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Now, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addGap(11, 11, 11))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_NowLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel_NowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_NowLayout.createSequentialGroup()
                        .addComponent(jSeparator5)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_NowLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator4)
                        .addGap(28, 28, 28))))
        );
        jPanel_NowLayout.setVerticalGroup(
            jPanel_NowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_NowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Now, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(jSeparator1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3)
                .addGap(30, 30, 30)
                .addComponent(jLabel_Time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48)
                .addComponent(jSeparator4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel_TimeDateLayout = new javax.swing.GroupLayout(jPanel_TimeDate);
        jPanel_TimeDate.setLayout(jPanel_TimeDateLayout);
        jPanel_TimeDateLayout.setHorizontalGroup(
            jPanel_TimeDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TimeDateLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel_Now, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel_TimeDateLayout.setVerticalGroup(
            jPanel_TimeDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TimeDateLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel_Now, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        jPanel_Bottom.setBackground(new java.awt.Color(0, 0, 0));

        jLabel_Bottom.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Bottom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Bottom.setText("Copyright © Group-4 Spring 2017");

        javax.swing.GroupLayout jPanel_BottomLayout = new javax.swing.GroupLayout(jPanel_Bottom);
        jPanel_Bottom.setLayout(jPanel_BottomLayout);
        jPanel_BottomLayout.setHorizontalGroup(
            jPanel_BottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_BottomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Bottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_BottomLayout.setVerticalGroup(
            jPanel_BottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Bottom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel_BaseLayout = new javax.swing.GroupLayout(jPanel_Base);
        jPanel_Base.setLayout(jPanel_BaseLayout);
        jPanel_BaseLayout.setHorizontalGroup(
            jPanel_BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_Top, javax.swing.GroupLayout.DEFAULT_SIZE, 1325, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_BaseLayout.createSequentialGroup()
                .addComponent(jPanel_TimeDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel_Bottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_BaseLayout.setVerticalGroup(
            jPanel_BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BaseLayout.createSequentialGroup()
                .addComponent(jPanel_Top, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(jPanel_BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_TimeDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(jPanel_Bottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Base, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_UsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_UsernameMouseClicked
        jTextField_Username.setText("");
    }//GEN-LAST:event_jTextField_UsernameMouseClicked

    private void jPasswordField_PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField_PasswordMouseClicked
        jPasswordField_Password.setText("");
    }//GEN-LAST:event_jPasswordField_PasswordMouseClicked

    //Show password
    private void jCheckBox_ShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_ShowPasswordActionPerformed
        if(jCheckBox_ShowPassword.isSelected()) {
            jPasswordField_Password.setEchoChar((char)0);
        }
        else {
            jPasswordField_Password.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox_ShowPasswordActionPerformed

    //Login
    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoginActionPerformed
        // Create database connection
        dbMysqlConnection ob=new dbMysqlConnection();
        Connection conn = null; 
	conn=ob.getConnection();
        
        PreparedStatement preparedStatement = null;
        
        //SQL query for checking login information
        String query = "select * from st_general where id = ? and pass = ?";
        
        try {
        int ID = Integer.parseInt(jTextField_Username.getText()); //Store login id
        
        preparedStatement= conn.prepareStatement(query);
        preparedStatement.setInt(1, ID);
        preparedStatement.setString(2, jPasswordField_Password.getText()); 
        
        ResultSet resultSet = preparedStatement.executeQuery();
        
        //Check login details for admin 
        if(jTextField_Username.getText().contains("1000") && jPasswordField_Password.getText().contains("a0") && jRadioButton_Admin.isSelected()) {
            jPasswordField_Password.setText("");
            jTextField_Username.setText("");
            jCheckBox_ShowPassword.setSelected(false);
            jPasswordField_Password.setEchoChar('*');
            
            //Connect admin module
            Admin admin = new Admin();
            admin.setVisible(true);
            }
        //check login details for students
        else if(jRadioButton_Student.isSelected() && resultSet.next()) {
            jPasswordField_Password.setText("");
            jTextField_Username.setText("");
            jCheckBox_ShowPassword.setSelected(false);
            jPasswordField_Password.setEchoChar('*');
            
            JOptionPane.showMessageDialog(null, "Login Successful...");
            //Connect student module
            //User1 u = new User1();
           // u.setVisible(true);
            new Student(ID).setVisible(true);
            }
        //Login fails
        else {
            jPasswordField_Password.setText("");
            jTextField_Username.setText("");
            jCheckBox_ShowPassword.setSelected(false);
            jPasswordField_Password.setEchoChar('*');
            
            JOptionPane.showMessageDialog(null, "Invalid Login Details!!!");
            }
        }
        catch(Exception e) {
            jPasswordField_Password.setText("");
            jTextField_Username.setText("");
            jCheckBox_ShowPassword.setSelected(false);
            jPasswordField_Password.setEchoChar('*');
            
            JOptionPane.showMessageDialog(null, "Invalid Login Details!!!!");
        }
    }//GEN-LAST:event_jButton_LoginActionPerformed

    //Reset
    private void jButton_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ResetActionPerformed
        jPasswordField_Password.setText("");
        jTextField_Username.setText("");
        jCheckBox_ShowPassword.setSelected(false);
        jPasswordField_Password.setEchoChar('*');
    }//GEN-LAST:event_jButton_ResetActionPerformed

    // Exit
    private void jButton_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExitActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit the system?", "Exit", JOptionPane.YES_NO_OPTION);
        
        if(confirm==JOptionPane.YES_OPTION) {
            System.exit(0);
        }  
    }//GEN-LAST:event_jButton_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton_Exit;
    private javax.swing.JButton jButton_Login;
    private javax.swing.JButton jButton_Reset;
    private javax.swing.JCheckBox jCheckBox_ShowPassword;
    private javax.swing.JLabel jLabel_Bottom;
    private javax.swing.JLabel jLabel_Date;
    private javax.swing.JLabel jLabel_IconShow;
    private javax.swing.JLabel jLabel_LoginHere;
    private javax.swing.JLabel jLabel_Message;
    private javax.swing.JLabel jLabel_Now;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_Time;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JLabel jLabel_Top;
    private javax.swing.JLabel jLabel_Username;
    private javax.swing.JPanel jPanel_Base;
    private javax.swing.JPanel jPanel_Bottom;
    private javax.swing.JPanel jPanel_Login;
    private javax.swing.JPanel jPanel_Now;
    private javax.swing.JPanel jPanel_TimeDate;
    private javax.swing.JPanel jPanel_Title;
    private javax.swing.JPanel jPanel_Top;
    private javax.swing.JPasswordField jPasswordField_Password;
    private javax.swing.JRadioButton jRadioButton_Admin;
    private javax.swing.JRadioButton jRadioButton_Student;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator_Password;
    private javax.swing.JSeparator jSeparator_Username;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}