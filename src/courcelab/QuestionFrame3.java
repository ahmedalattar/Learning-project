/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courcelab;

import java.awt.ComponentOrientation;
import java.awt.Rectangle;
import java.math.MathContext;
import javax.swing.JOptionPane;

/**
 *
 * @author attar
 */
public class QuestionFrame3 extends javax.swing.JFrame {

    /**
     * Creates new form QuestionFrame3
     */
    public QuestionFrame3() {
        initComponents();
        this.setContentPane(jScrollPane1);
        setBounds(0, 0, 950, 750);
        jTextArea1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        jTextField1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        jTextArea2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        jTextArea3.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        jTextArea4.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        jTextArea5.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        jTextArea6.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        buttonGroup1.add(jRadioButton3);
        buttonGroup1.add(jRadioButton4);
        buttonGroup2.add(jRadioButton1);
        buttonGroup2.add(jRadioButton2);
        buttonGroup3.add(jRadioButton5);
        buttonGroup3.add(jRadioButton6);
        buttonGroup4.add(jRadioButton7);
        buttonGroup4.add(jRadioButton8);
        buttonGroup5.add(jRadioButton9);
        buttonGroup5.add(jRadioButton10);
        buttonGroup6.add(jRadioButton11);
        buttonGroup6.add(jRadioButton12);

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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setTitle("الاسئلة 2");
        setResizable(false);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setLayout(null);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arabic Typesetting", 1, 24)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 0, 0));
        jTextArea1.setText("السؤال الثاني :_ \nضع كلمة صواب أو خطأ أمام العبارات الآتية :_ \n");
        jTextArea1.setPreferredSize(new java.awt.Dimension(348, 32));
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(0, 0, 940, 70);

        jRadioButton1.setText("خطأ");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(300, 140, 43, 23);

        jRadioButton2.setText("صواب ");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(600, 140, 55, 23);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jTextArea2.setText("6) من أحد أشكال النصوص المكتوبة هي النصوص الفائقة ");
        jScrollPane3.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(10, 550, 930, 50);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jTextField1.setText("1)  للنصوص في برامج الوسائط المتعددة ثلاثة أنواع          ");
        jPanel1.add(jTextField1);
        jTextField1.setBounds(0, 80, 940, 50);

        jRadioButton3.setText("خطأ ");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(300, 610, 47, 23);

        jRadioButton4.setText("صواب");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(600, 610, 51, 23);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jTextArea3.setText("2) من دواعي استخدام الموسيقي والمؤثرات الصوتية \nفي برامج الوسائط المتعددة استخدام النغمات الصوتية المتقاربة");
        jScrollPane4.setViewportView(jTextArea3);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(10, 170, 930, 50);

        jRadioButton5.setText("صواب");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton5);
        jRadioButton5.setBounds(600, 220, 51, 23);

        jRadioButton6.setText("خطأ ");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton6);
        jRadioButton6.setBounds(300, 220, 47, 23);

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jTextArea4.setText("3) في مجال تعليم اللغة اللفظية للأطفال فإن الجانب البصري يحظى\n بدرجة قليلة من الأهمية ");
        jScrollPane5.setViewportView(jTextArea4);

        jPanel1.add(jScrollPane5);
        jScrollPane5.setBounds(10, 260, 930, 50);

        jRadioButton7.setText("صواب");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton7);
        jRadioButton7.setBounds(600, 320, 51, 23);

        jRadioButton8.setText("خطأ ");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton8);
        jRadioButton8.setBounds(300, 320, 47, 23);

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jTextArea5.setText("4) تستخدم الرسوم لتوضيح علاقات منطقية ولا تطابق الواقع \nتماما مثل تركيب الذرة وعلاقاتها بالنواة ");
        jScrollPane6.setViewportView(jTextArea5);

        jPanel1.add(jScrollPane6);
        jScrollPane6.setBounds(10, 350, 930, 50);

        jRadioButton9.setText("صواب");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton9);
        jRadioButton9.setBounds(600, 420, 51, 23);

        jRadioButton10.setText("خطأ ");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton10);
        jRadioButton10.setBounds(300, 410, 47, 23);

        jTextArea6.setEditable(false);
        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jTextArea6.setText("5)من أنواع النصوص في برامج الوسائط المتعددة النصوص المكتوبة ");
        jScrollPane7.setViewportView(jTextArea6);

        jPanel1.add(jScrollPane7);
        jScrollPane7.setBounds(10, 450, 930, 50);

        jRadioButton11.setText("صواب");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton11);
        jRadioButton11.setBounds(600, 510, 51, 23);

        jRadioButton12.setText("خطأ ");
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton12);
        jRadioButton12.setBounds(300, 510, 47, 23);

        jButton2.setBackground(new java.awt.Color(0, 255, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courcelab/back1.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(380, 690, 90, 20);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courcelab/home-.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(510, 670, 70, 60);

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        QuestionsFrame questionFrame2 = new QuestionsFrame(); // TODO add your handling code here:
                
        questionFrame2.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        PlaySooound playSooound = new PlaySooound();
        playSooound.playSound("D:\\my work\\CourceLab\\bad.wav");
        JOptionPane.showMessageDialog(null, "sorry false chose");        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        PlaySooound playSooound = new PlaySooound();
        playSooound.playSound("D:\\my work\\CourceLab\\bad.wav");
        JOptionPane.showMessageDialog(null, "sorry false chose");         // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        PlaySooound playSooound = new PlaySooound();
        playSooound.playSound("D:\\my work\\CourceLab\\good.WAV");
        JOptionPane.showMessageDialog(null, "nice,that is right");         // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        PlaySooound playSooound = new PlaySooound();
        playSooound.playSound("D:\\my work\\CourceLab\\good.WAV");
        JOptionPane.showMessageDialog(null, "nice,that is right");         // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        PlaySooound playSooound = new PlaySooound();
        playSooound.playSound("D:\\my work\\CourceLab\\bad.wav");
        JOptionPane.showMessageDialog(null, "sorry false chose");         // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        PlaySooound playSooound = new PlaySooound();
        playSooound.playSound("D:\\my work\\CourceLab\\bad.wav");
        JOptionPane.showMessageDialog(null, "sorry false chose");         // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        PlaySooound playSooound = new PlaySooound();
        playSooound.playSound("D:\\my work\\CourceLab\\bad.wav");
        JOptionPane.showMessageDialog(null, "sorry false chose");         // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        PlaySooound playSooound = new PlaySooound();
        playSooound.playSound("D:\\my work\\CourceLab\\bad.wav");
        JOptionPane.showMessageDialog(null, "sorry false chose");         // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        PlaySooound playSooound = new PlaySooound();
        playSooound.playSound("D:\\my work\\CourceLab\\good.WAV");
        JOptionPane.showMessageDialog(null, "nice,that is right");         // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        PlaySooound playSooound = new PlaySooound();
        playSooound.playSound("D:\\my work\\CourceLab\\good.WAV");
        JOptionPane.showMessageDialog(null, "nice,that is right");         // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        PlaySooound playSooound = new PlaySooound();
        playSooound.playSound("D:\\my work\\CourceLab\\good.WAV");
        JOptionPane.showMessageDialog(null, "nice,that is right");        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        PlaySooound playSooound = new PlaySooound();
        playSooound.playSound("D:\\my work\\CourceLab\\good.WAV");
        JOptionPane.showMessageDialog(null, "nice,that is right");        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MasterFrame masterFrame = new MasterFrame() // TODO add your handling code here:
        ;
        masterFrame.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(QuestionFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestionFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestionFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestionFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestionFrame3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}