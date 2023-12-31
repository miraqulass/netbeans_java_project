
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author james
 */
public class Sign_Up extends javax.swing.JFrame {

    /**
     * Creates new form Sign_Up
     */
    public Sign_Up() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        firstName = new javax.swing.JTextField();
        logIn = new javax.swing.JButton();
        signUp = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        pass2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        jLabel1.setText("First Name:");

        jLabel2.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        jLabel2.setText("Last Name:");

        jLabel3.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        jLabel3.setText("Password:");

        jLabel4.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        jLabel4.setText("Confirm Password:");

        lastName.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N

        firstName.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N

        logIn.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        logIn.setText("Log In");
        logIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInActionPerformed(evt);
            }
        });

        signUp.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        signUp.setText("Sign Up");
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        jLabel5.setText("Email:");

        email.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N

        pass.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N

        pass2.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lastName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstName)
                            .addComponent(pass)
                            .addComponent(pass2, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(logIn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logIn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerformed
        if (evt.getSource() == signUp) {
            String FirstName = firstName.getText();
            String LastName = lastName.getText();
            String Email = email.getText();
            char[] Pass1 = pass.getPassword();
            char[] Pass = pass2.getPassword();
            String s8 = new String(Pass1);
            String s9 = new String(Pass);
            if (s8.equals(s9)) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/salon_java_project", "jamess", "New$Things1");
                    PreparedStatement ps = con1.prepareStatement("insert into reg(first_name, last_name, email, password) values(?,?,?,?)");
                    ps.setString(1, FirstName);
                    ps.setString(2, LastName);
                    ps.setString(3, Email);
                    ps.setString(4, s9);
                    ps.executeUpdate();

                    UserHome ah = new UserHome();
                    ah.setTitle("ELEGANCE SALON");
                    new UserHome().setVisible(true);
                    this.dispose();
                    JOptionPane.showMessageDialog(null, "Sign Up Successfull");

                } catch (Exception ex) {
                    System.out.println(ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Password Does Not Match");
            }
        }
    }//GEN-LAST:event_signUpActionPerformed

    private void logInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInActionPerformed
        Log_in ah = new Log_in();
        ah.setTitle("ELEGANCE SALON");
        new Log_in().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logInActionPerformed

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
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign_Up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField lastName;
    private javax.swing.JButton logIn;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JButton signUp;
    // End of variables declaration//GEN-END:variables
}
