/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jFrame;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.ResultSet;


/**
 *
 * @author dell
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form SignUpPage
     */
    public LoginPage() {
        initComponents();
    }
    
    //validation
    
    public boolean validateLogin(){
        String name = txt_Username.getText();
        String pwd = txt_Password.getText();
        
        if(name.equals("")){
            JOptionPane.showMessageDialog(this,"please enter username");
            return false;
        }
        if(pwd.equals("")){
            JOptionPane.showMessageDialog(this,"please enter password");
            return false;
        }
        return true;
    }
    
    //verify credentials
    
    public void login(){
        String name = txt_Username.getText();
        String pwd = txt_Password.getText();
        
        try{    
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_ms","root","mysql123");
            
            PreparedStatement pst = con.prepareStatement("select * from users where name = ? and password = ?");
            pst.setString(1,name);
            pst.setString(2,pwd);
            
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(this, "login successfull");
                HomePage home = new HomePage();
                home.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Incorrect Username or Password");
            }
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_Username = new app.bolivia.swing.JCTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_Password = new app.bolivia.swing.JCTextField();
        jLabel11 = new javax.swing.JLabel();
        rSMaterialButtonCircle1 = new rojerusan.RSMaterialButtonCircle();
        rSMaterialButtonCircle2 = new rojerusan.RSMaterialButtonCircle();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Advance Library");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 310, 50));

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Management");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 120, -1));

        jLabel4.setFont(new java.awt.Font("Britannic Bold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Library");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/library-3.png.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 740, 580));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Welcome To");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 220, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 830));

        jPanel2.setBackground(new java.awt.Color(102, 102, 225));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 50, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 20, 20));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Welcome! Login to your Account");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 260, 40));

        txt_Username.setBackground(new java.awt.Color(102, 102, 225));
        txt_Username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_Username.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txt_Username.setPlaceholder("Enter Username...");
        txt_Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_UsernameFocusLost(evt);
            }
        });
        txt_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UsernameActionPerformed(evt);
            }
        });
        jPanel2.add(txt_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 250, 30));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Username");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 80, 40));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Secure_50px.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 50, 50));

        txt_Password.setBackground(new java.awt.Color(102, 102, 225));
        txt_Password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_Password.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txt_Password.setPlaceholder("Enter Password...");
        txt_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PasswordActionPerformed(evt);
            }
        });
        jPanel2.add(txt_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 250, 30));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Password");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 80, 40));

        rSMaterialButtonCircle1.setBackground(new java.awt.Color(51, 51, 255));
        rSMaterialButtonCircle1.setText("Log In");
        rSMaterialButtonCircle1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rSMaterialButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSMaterialButtonCircle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 260, 70));

        rSMaterialButtonCircle2.setBackground(new java.awt.Color(255, 51, 51));
        rSMaterialButtonCircle2.setText("Sign Up");
        rSMaterialButtonCircle2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rSMaterialButtonCircle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle2ActionPerformed(evt);
            }
        });
        jPanel2.add(rSMaterialButtonCircle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 260, 70));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Login Page");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 140, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 530, 830));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UsernameActionPerformed

    private void txt_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PasswordActionPerformed

    private void rSMaterialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle1ActionPerformed
        if(validateLogin()){
          login();  
        }
    }//GEN-LAST:event_rSMaterialButtonCircle1ActionPerformed

    private void rSMaterialButtonCircle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle2ActionPerformed
        
    }//GEN-LAST:event_rSMaterialButtonCircle2ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void txt_UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_UsernameFocusLost
        
    }//GEN-LAST:event_txt_UsernameFocusLost

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle1;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle2;
    private app.bolivia.swing.JCTextField txt_Password;
    private app.bolivia.swing.JCTextField txt_Username;
    // End of variables declaration//GEN-END:variables
}
