
import javax.swing.JOptionPane;


public class CalculatorForm extends javax.swing.JFrame {

    /**
     * Creates new form CalculatorForm
     */
    public CalculatorForm() {
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

        firstNumber = new javax.swing.JTextField();
        secondNumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        plusButton = new javax.swing.JButton();
        minusButon = new javax.swing.JButton();
        ansText = new javax.swing.JLabel();
        multiplybutton = new javax.swing.JButton();
        dividebutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple Calculator");

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("First Num");

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Second Num");

        plusButton.setBackground(new java.awt.Color(51, 255, 51));
        plusButton.setText("+");
        plusButton.setToolTipText("ADDITION");
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });

        minusButon.setBackground(new java.awt.Color(255, 102, 102));
        minusButon.setText("-");
        minusButon.setToolTipText("SUBTRACTION");
        minusButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButonActionPerformed(evt);
            }
        });

        ansText.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        ansText.setText("The answer is: ");

        multiplybutton.setBackground(new java.awt.Color(51, 51, 255));
        multiplybutton.setText("X");
        multiplybutton.setToolTipText("Multiply");
        multiplybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplybuttonActionPerformed(evt);
            }
        });

        dividebutton.setBackground(new java.awt.Color(255, 102, 255));
        dividebutton.setText("/");
        dividebutton.setToolTipText("Divide");
        dividebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(secondNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(plusButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(minusButon)
                                        .addGap(18, 18, 18)
                                        .addComponent(multiplybutton)
                                        .addGap(18, 18, 18)
                                        .addComponent(dividebutton))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(ansText, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(secondNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plusButton)
                    .addComponent(minusButon)
                    .addComponent(multiplybutton)
                    .addComponent(dividebutton))
                .addGap(32, 32, 32)
                .addComponent(ansText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusButtonActionPerformed
        int number1, number2;
        try {
            number1 = Integer.parseInt(this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e, "bad First Number", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            number2 = Integer.parseInt(this.secondNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e, "bad Second Number", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int ans = number1 + number2;
        this.ansText.setText("The answer is: " + ans);
        
    }//GEN-LAST:event_plusButtonActionPerformed

    private void minusButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButonActionPerformed
        int number1, number2;
        try {
            number1 = Integer.parseInt(this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e, "bad First Number", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            number2 = Integer.parseInt(this.secondNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e, "bad Second Number", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int ans = number1 - number2;
        this.ansText.setText("The answer is: " + ans);
        
    }//GEN-LAST:event_minusButonActionPerformed

    private void multiplybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplybuttonActionPerformed
        int number1, number2;
        try {
            number1 = Integer.parseInt(this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e, "bad First Number", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            number2 = Integer.parseInt(this.secondNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e, "bad Second Number", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int ans = number1 * number2;
        this.ansText.setText("The answer is: " + ans);
    }//GEN-LAST:event_multiplybuttonActionPerformed

    private void dividebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividebuttonActionPerformed
        int number1, number2;
        try {
            number1 = Integer.parseInt(this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e, "bad First Number", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            number2 = Integer.parseInt(this.secondNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e, "bad Second Number", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int ans = number1 / number2;
        this.ansText.setText("The answer is: " + ans);
    }//GEN-LAST:event_dividebuttonActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ansText;
    private javax.swing.JButton dividebutton;
    private javax.swing.JTextField firstNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton minusButon;
    private javax.swing.JButton multiplybutton;
    private javax.swing.JButton plusButton;
    private javax.swing.JTextField secondNumber;
    // End of variables declaration//GEN-END:variables
}
