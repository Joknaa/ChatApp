/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author AnhTu
 */
public class SignUpPanel extends javax.swing.JPanel {

    /**
     * Creates new form SignUpPanel
     */
    public SignUpPanel() {
        initComponents();
    }

    public JButton getBtSignUp() {
        return btSignUp;
    }

    public JButton getLbBack_signup() {
        return lbBack_signup;
    }

    public JTextField getTfID() {
        return tfID;
    }

    public JPasswordField getTfPass() {
        return tfPass;
    }

    public JPasswordField getTfPass2() {
        return tfPass2;
    }
    
    public void clearTf() {
        tfID.setText("");
        tfPass.setText("");
        tfPass2.setText("");
        
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
        logoPanel = new javax.swing.JPanel();
        appLogo = new javax.swing.JLabel();
        appName = new javax.swing.JLabel();
        inputPanel = new javax.swing.JPanel();
        tfID = new javax.swing.JTextField();
        loginLabel = new javax.swing.JLabel();
        loginSeparator = new javax.swing.JSeparator();
        tfPass = new javax.swing.JPasswordField();
        passwordLabel = new javax.swing.JLabel();
        passwordSeparator = new javax.swing.JSeparator();
        passwordRepeatLabel = new javax.swing.JLabel();
        tfPass2 = new javax.swing.JPasswordField();
        passwordRepeatSeparator = new javax.swing.JSeparator();
        btSignUp = new javax.swing.JButton();
        lbBack_signup = new javax.swing.JButton();

        jPanel1.setEnabled(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 500));

        logoPanel.setBackground(new java.awt.Color(74, 78, 105));
        logoPanel.setPreferredSize(new java.awt.Dimension(450, 500));

        appLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ChatApp/chat_bubble_127px.png"))); // NOI18N

        appName.setFont(new java.awt.Font("Source Code Pro", 0, 48)); // NOI18N
        appName.setForeground(new java.awt.Color(242, 233, 228));
        appName.setText("BreadCost");

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addGroup(logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(logoPanelLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(appLogo))
                    .addGroup(logoPanelLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(appName)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(appLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(appName, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inputPanel.setBackground(new java.awt.Color(154, 140, 152));
        inputPanel.setPreferredSize(new java.awt.Dimension(450, 500));
        inputPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputPanelMouseClicked(evt);
            }
        });

        tfID.setBackground(new java.awt.Color(154, 140, 152));
        tfID.setForeground(new java.awt.Color(244, 252, 231));
        tfID.setText("username");
        tfID.setBorder(null);
        tfID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfIDFocusGained(evt);
            }
        });
        tfID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIDActionPerformed(evt);
            }
        });

        loginLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ChatApp/name_45px.png"))); // NOI18N

        loginSeparator.setBackground(new java.awt.Color(244, 252, 231));

        tfPass.setBackground(new java.awt.Color(154, 140, 152));
        tfPass.setForeground(new java.awt.Color(244, 252, 231));
        tfPass.setText("password");
        tfPass.setBorder(null);
        tfPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPassFocusGained(evt);
            }
        });

        passwordLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ChatApp/lock_45px.png"))); // NOI18N

        passwordSeparator.setBackground(new java.awt.Color(244, 252, 231));

        passwordRepeatLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ChatApp/lock_45px.png"))); // NOI18N

        tfPass2.setBackground(new java.awt.Color(154, 140, 152));
        tfPass2.setForeground(new java.awt.Color(244, 252, 231));
        tfPass2.setText("password");
        tfPass2.setBorder(null);
        tfPass2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPass2FocusGained(evt);
            }
        });

        passwordRepeatSeparator.setBackground(new java.awt.Color(244, 252, 231));

        btSignUp.setBackground(new java.awt.Color(76, 96, 133));
        btSignUp.setForeground(new java.awt.Color(244, 252, 231));
        btSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ChatApp/add_80px.png"))); // NOI18N
        btSignUp.setToolTipText("");
        btSignUp.setBorder(null);
        btSignUp.setContentAreaFilled(false);
        btSignUp.setFocusPainted(false);
        btSignUp.setFocusable(false);
        btSignUp.setMaximumSize(new java.awt.Dimension(100, 38));
        btSignUp.setMinimumSize(new java.awt.Dimension(100, 38));
        btSignUp.setPreferredSize(new java.awt.Dimension(100, 38));
        btSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSignUpActionPerformed(evt);
            }
        });

        lbBack_signup.setBackground(new java.awt.Color(76, 96, 133));
        lbBack_signup.setForeground(new java.awt.Color(244, 252, 231));
        lbBack_signup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ChatApp/back_arrow_50px.png"))); // NOI18N
        lbBack_signup.setToolTipText("");
        lbBack_signup.setBorder(null);
        lbBack_signup.setContentAreaFilled(false);
        lbBack_signup.setFocusPainted(false);
        lbBack_signup.setFocusable(false);
        lbBack_signup.setMaximumSize(new java.awt.Dimension(100, 38));
        lbBack_signup.setMinimumSize(new java.awt.Dimension(100, 38));
        lbBack_signup.setPreferredSize(new java.awt.Dimension(100, 38));
        lbBack_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbBack_signupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addComponent(passwordRepeatLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfPass2)
                                    .addComponent(passwordRepeatSeparator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(loginLabel))
                                .addGap(26, 26, 26)
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(loginSeparator)
                                    .addComponent(tfID)
                                    .addComponent(tfPass)
                                    .addComponent(passwordSeparator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(lbBack_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(loginSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(loginLabel))
                .addGap(24, 24, 24)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(passwordSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(passwordLabel))
                .addGap(24, 24, 24)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addComponent(tfPass2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(passwordRepeatSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(passwordRepeatLabel))
                .addGap(18, 18, 18)
                .addComponent(btSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(lbBack_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfIDFocusGained
        tfID.setText("");
    }//GEN-LAST:event_tfIDFocusGained

    private void tfIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIDActionPerformed
    }//GEN-LAST:event_tfIDActionPerformed

    private void tfPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPassFocusGained
        tfPass.setText("");
    }//GEN-LAST:event_tfPassFocusGained

    private void btSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSignUpActionPerformed
    }//GEN-LAST:event_btSignUpActionPerformed

    private void tfPass2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPass2FocusGained
    }//GEN-LAST:event_tfPass2FocusGained

    private void lbBack_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbBack_signupActionPerformed
    }//GEN-LAST:event_lbBack_signupActionPerformed

    private void inputPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputPanelMouseClicked
    }//GEN-LAST:event_inputPanelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appLogo;
    private javax.swing.JLabel appName;
    private javax.swing.JButton btSignUp;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lbBack_signup;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JSeparator loginSeparator;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordRepeatLabel;
    private javax.swing.JSeparator passwordRepeatSeparator;
    private javax.swing.JSeparator passwordSeparator;
    private javax.swing.JTextField tfID;
    private javax.swing.JPasswordField tfPass;
    private javax.swing.JPasswordField tfPass2;
    // End of variables declaration//GEN-END:variables
}
