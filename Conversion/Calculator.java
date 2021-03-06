/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Conversion;

/**
 *
 * @author eljon
 */
public class Calculator extends javax.swing.JFrame {
    double fnum;
    double snum;
    double result;
    String operators;
    
    public Calculator() {
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

        jPanel1 = new javax.swing.JPanel();
        jTextField1Results = new javax.swing.JTextField();
        jB1 = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();
        jB_add = new javax.swing.JButton();
        jB3 = new javax.swing.JButton();
        jB_minus = new javax.swing.JButton();
        jB4 = new javax.swing.JButton();
        jB5 = new javax.swing.JButton();
        jB6 = new javax.swing.JButton();
        jB_multiply = new javax.swing.JButton();
        jB7 = new javax.swing.JButton();
        jB8 = new javax.swing.JButton();
        jB9 = new javax.swing.JButton();
        jB_divide = new javax.swing.JButton();
        jB_0 = new javax.swing.JButton();
        jB_posneg = new javax.swing.JButton();
        jB_decimal = new javax.swing.JButton();
        jB_reset = new javax.swing.JButton();
        jB_equals = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");

        jPanel1.setBackground(new java.awt.Color(194, 194, 194));
        jPanel1.setForeground(new java.awt.Color(194, 194, 194));
        jPanel1.setToolTipText("");

        jTextField1Results.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField1Results.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1Results.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ResultsActionPerformed(evt);
            }
        });

        jB1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB1.setText("1");
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jB2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB2.setText("2");
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });

        jB_add.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB_add.setText("+");
        jB_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_addActionPerformed(evt);
            }
        });

        jB3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB3.setText("3");
        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });

        jB_minus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB_minus.setText("-");
        jB_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_minusActionPerformed(evt);
            }
        });

        jB4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB4.setText("4");
        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4ActionPerformed(evt);
            }
        });

        jB5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB5.setText("5");
        jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB5ActionPerformed(evt);
            }
        });

        jB6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB6.setText("6");
        jB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });

        jB_multiply.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB_multiply.setText("x");
        jB_multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_multiplyActionPerformed(evt);
            }
        });

        jB7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB7.setText("7");
        jB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB7ActionPerformed(evt);
            }
        });

        jB8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB8.setText("8");
        jB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB8ActionPerformed(evt);
            }
        });

        jB9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB9.setText("9");
        jB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB9ActionPerformed(evt);
            }
        });

        jB_divide.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB_divide.setText("/");
        jB_divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_divideActionPerformed(evt);
            }
        });

        jB_0.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB_0.setText("0");
        jB_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_0ActionPerformed(evt);
            }
        });

        jB_posneg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jB_posneg.setText("+/-");
        jB_posneg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_posnegActionPerformed(evt);
            }
        });

        jB_decimal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB_decimal.setText(".");
        jB_decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_decimalActionPerformed(evt);
            }
        });

        jB_reset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB_reset.setText("C");
        jB_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_resetActionPerformed(evt);
            }
        });

        jB_equals.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB_equals.setText("=");
        jB_equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_equalsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField1Results)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jB_add, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jB_0, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB_posneg, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jB_reset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jB_decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB_divide, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jB_equals, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jTextField1Results, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_add, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jB_0, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jB_decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jB_divide, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jB_posneg, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_equals, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ResultsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ResultsActionPerformed

   // when button clicked - num becomes string - then sa operation magpaparse
    private void jB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB5ActionPerformed
        String Enter_num = jTextField1Results.getText() + jB5.getText();
        jTextField1Results.setText(Enter_num);    }//GEN-LAST:event_jB5ActionPerformed

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
        String Enter_num = jTextField1Results.getText() + jB1.getText();
        jTextField1Results.setText(Enter_num);
    }//GEN-LAST:event_jB1ActionPerformed

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
        String Enter_num = jTextField1Results.getText() + jB2.getText();
        jTextField1Results.setText(Enter_num);    }//GEN-LAST:event_jB2ActionPerformed

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB3ActionPerformed
        String Enter_num = jTextField1Results.getText() + jB3.getText();
        jTextField1Results.setText(Enter_num);    }//GEN-LAST:event_jB3ActionPerformed

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB4ActionPerformed
        String Enter_num = jTextField1Results.getText() + jB4.getText();
        jTextField1Results.setText(Enter_num);    }//GEN-LAST:event_jB4ActionPerformed

    private void jB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB6ActionPerformed
        String Enter_num = jTextField1Results.getText() + jB6.getText();
        jTextField1Results.setText(Enter_num);    }//GEN-LAST:event_jB6ActionPerformed

    private void jB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB7ActionPerformed
        String Enter_num = jTextField1Results.getText() + jB7.getText();
        jTextField1Results.setText(Enter_num);    }//GEN-LAST:event_jB7ActionPerformed

    private void jB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB8ActionPerformed
        String Enter_num = jTextField1Results.getText() + jB8.getText();
        jTextField1Results.setText(Enter_num);    }//GEN-LAST:event_jB8ActionPerformed

    private void jB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB9ActionPerformed
        String Enter_num = jTextField1Results.getText() + jB9.getText();
        jTextField1Results.setText(Enter_num);    }//GEN-LAST:event_jB9ActionPerformed

    private void jB_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_0ActionPerformed
        String Enter_num = jTextField1Results.getText() + jB_0.getText();
        jTextField1Results.setText(Enter_num);    }//GEN-LAST:event_jB_0ActionPerformed

    private void jB_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_addActionPerformed
        fnum = Double.parseDouble(jTextField1Results.getText());
        jTextField1Results.setText("");
        
        operators = "+";

    }//GEN-LAST:event_jB_addActionPerformed

    private void jB_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_minusActionPerformed
        fnum = Double.parseDouble(jTextField1Results.getText());
        jTextField1Results.setText("");
        
        operators = "-";    }//GEN-LAST:event_jB_minusActionPerformed

    private void jB_multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_multiplyActionPerformed
        fnum = Double.parseDouble(jTextField1Results.getText());
        jTextField1Results.setText("");
        
        operators = "*";    }//GEN-LAST:event_jB_multiplyActionPerformed

    private void jB_divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_divideActionPerformed
        fnum = Double.parseDouble(jTextField1Results.getText());
        jTextField1Results.setText("");
        
        operators = "/";    }//GEN-LAST:event_jB_divideActionPerformed

    private void jB_decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_decimalActionPerformed
        String Enter_num = jTextField1Results.getText() + jB_decimal.getText();
        jTextField1Results.setText(Enter_num);
    }//GEN-LAST:event_jB_decimalActionPerformed

    private void jB_posnegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_posnegActionPerformed
        double ops = Double.parseDouble(String.valueOf(jTextField1Results.getText()));
        
        ops = ops * (-1);
        jTextField1Results.setText(String.valueOf(ops));
    }//GEN-LAST:event_jB_posnegActionPerformed

    private void jB_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_resetActionPerformed
        jTextField1Results.setText("");
    }//GEN-LAST:event_jB_resetActionPerformed

    private void jB_equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_equalsActionPerformed
        String answer;
        
        snum = Double.parseDouble(jTextField1Results.getText());
            if ("+".equals(operators)){
                result = fnum + snum;
                answer = String.format("%.Of", result);
                jTextField1Results.setText(answer);
            }
            else if ("-".equals(operators)){
                result = fnum - snum;
                answer = String.format("%.Of", result);
                jTextField1Results.setText(answer);
            }
            else if ("*".equals(operators)){
                result = fnum * snum;
                answer = String.format("%.Of", result);
                jTextField1Results.setText(answer);
            }
            else if ("/".equals(operators)){
                result = fnum / snum;
                answer = String.format("%.Of", result);
                jTextField1Results.setText(answer);
            }
            else if ("%".equals(operators)){
                result = fnum % snum;
                answer = String.format("%.Of", result);
                jTextField1Results.setText(answer);
            }
    }//GEN-LAST:event_jB_equalsActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB2;
    private javax.swing.JButton jB3;
    private javax.swing.JButton jB4;
    private javax.swing.JButton jB5;
    private javax.swing.JButton jB6;
    private javax.swing.JButton jB7;
    private javax.swing.JButton jB8;
    private javax.swing.JButton jB9;
    private javax.swing.JButton jB_0;
    private javax.swing.JButton jB_add;
    private javax.swing.JButton jB_decimal;
    private javax.swing.JButton jB_divide;
    private javax.swing.JButton jB_equals;
    private javax.swing.JButton jB_minus;
    private javax.swing.JButton jB_multiply;
    private javax.swing.JButton jB_posneg;
    private javax.swing.JButton jB_reset;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1Results;
    // End of variables declaration//GEN-END:variables
}
