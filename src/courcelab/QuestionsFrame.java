/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courcelab;

import java.awt.ComponentOrientation;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author attar
 */
public class QuestionsFrame extends javax.swing.JFrame {

    /**
     * Creates new form QuestionsFrame
     */
    private ButtonGroup buttongroup1;
    private ButtonGroup buttongroup2;
    private ButtonGroup buttongroup3;
    private ButtonGroup buttongroup4;
    private JOptionPane joptionpane1;

    public QuestionsFrame() {
        initComponents();
        this.setContentPane(jScrollPane1);
        
        setBounds(0, 0, 950, 750);
        jTextArea1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        buttongroup1 = new ButtonGroup();
        buttongroup1.add(jRadioButton1);
        buttongroup1.add(jRadioButton2);
        buttongroup1.add(jRadioButton3);
        buttongroup1.add(jRadioButton4);
        /**
         * **********السؤال الاول ************
         */
        jTextArea2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        buttongroup2 = new ButtonGroup();
        buttongroup2.add(jRadioButton5);
        buttongroup2.add(jRadioButton6);
        buttongroup2.add(jRadioButton7);
        buttongroup2.add(jRadioButton8);
        /**
         * *****************************
         */
        jTextArea3.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        buttongroup3 = new ButtonGroup();
        buttongroup3.add(jRadioButton9);
        buttongroup3.add(jRadioButton10);
        buttongroup3.add(jRadioButton11);
        buttongroup3.add(jRadioButton12);
        /**
         * **************************
         */
        jTextArea4.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        buttongroup4 = new ButtonGroup();
        buttongroup4.add(jRadioButton13);
        buttongroup4.add(jRadioButton14);
        buttongroup4.add(jRadioButton15);
        buttongroup4.add(jRadioButton16);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setTitle("الأسئلة");
        setResizable(false);
        getContentPane().setLayout(null);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arabic Typesetting", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("الأسئلة");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(420, 0, 110, 35);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(153, 153, 153));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jTextArea1.setText("السؤال الأول :_ \nاختر الإجابة من بين الاجابات المعروضة ,,,,\n1)\t من  أشكال النصوص المكتوبة في برامج الوسائط المتعددة ..........................\n");
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(0, 40, 940, 75);

        jRadioButton1.setForeground(new java.awt.Color(255, 51, 51));
        jRadioButton1.setText("The All");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(120, 130, 80, 23);

        jRadioButton2.setForeground(new java.awt.Color(255, 51, 51));
        jRadioButton2.setText("-Scanning text");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(270, 130, 110, 23);

        jRadioButton3.setForeground(new java.awt.Color(255, 51, 51));
        jRadioButton3.setText("Hyper text");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(460, 130, 90, 23);

        jRadioButton4.setForeground(new java.awt.Color(255, 51, 51));
        jRadioButton4.setText("  Printing text");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(620, 130, 100, 23);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(153, 153, 153));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jTextArea2.setText("2)\tمن معايير توظيف اللغة المنطوقة في برامج الوسائط المتعددة التفاعلية ......................");
        jScrollPane3.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(0, 170, 940, 66);

        jRadioButton5.setForeground(new java.awt.Color(255, 51, 51));
        jRadioButton5.setText("استخدامها كخلفية للبرنامج ");
        jRadioButton5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton5);
        jRadioButton5.setBounds(220, 240, 161, 23);

        jRadioButton6.setForeground(new java.awt.Color(255, 51, 51));
        jRadioButton6.setText("ألا يكرر التعليق نفس محتوي النص المكتوب");
        jRadioButton6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton6);
        jRadioButton6.setBounds(600, 240, 221, 23);

        jRadioButton7.setForeground(new java.awt.Color(255, 51, 51));
        jRadioButton7.setText("أن تستخدم في المقدمة ");
        jRadioButton7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton7);
        jRadioButton7.setBounds(220, 270, 161, 23);

        jRadioButton8.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButton8.setText("أن تظهر تدريجياً وتختفي تدريجياً");
        jRadioButton8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton8);
        jRadioButton8.setBounds(600, 270, 221, 23);

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(153, 153, 153));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jTextArea3.setText("3)\tللرسوم والتكوينات الخطية أنماط ........................");
        jScrollPane4.setViewportView(jTextArea3);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(0, 310, 940, 54);

        jRadioButton9.setForeground(new java.awt.Color(255, 51, 51));
        jRadioButton9.setText("جميع ما سبق ");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton9);
        jRadioButton9.setBounds(120, 380, 93, 23);

        jRadioButton10.setForeground(new java.awt.Color(255, 51, 51));
        jRadioButton10.setText("كاريكاتير");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton10);
        jRadioButton10.setBounds(320, 380, 61, 23);

        jRadioButton11.setForeground(new java.awt.Color(255, 51, 51));
        jRadioButton11.setText("خرائط");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton11);
        jRadioButton11.setBounds(460, 380, 51, 23);

        jRadioButton12.setForeground(new java.awt.Color(255, 51, 51));
        jRadioButton12.setText("رسوم بيانية");
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton12);
        jRadioButton12.setBounds(620, 380, 79, 23);

        jTextArea4.setBackground(new java.awt.Color(153, 153, 153));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jTextArea4.setText("4) من الفوائد التربوية لاستخدام الرسومات المتحركة في برامج الوسائط المتعددة ..................");
        jScrollPane5.setViewportView(jTextArea4);

        jPanel1.add(jScrollPane5);
        jScrollPane5.setBounds(0, 430, 940, 57);

        jRadioButton13.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButton13.setText("ب- التعبير عن الاشياء المتغيرة كمراحل نمو النبات ");
        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton13);
        jRadioButton13.setBounds(230, 510, 251, 23);

        jRadioButton14.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButton14.setText("أ- لفت الانتباه الي الزمن");
        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton14);
        jRadioButton14.setBounds(610, 510, 135, 23);

        jRadioButton15.setForeground(new java.awt.Color(255, 0, 51));
        jRadioButton15.setText("د- ( أ , ب ) ");
        jRadioButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton15);
        jRadioButton15.setBounds(230, 550, 77, 23);

        jRadioButton16.setForeground(new java.awt.Color(255, 0, 51));
        jRadioButton16.setText("ج- ليست ( أ, ب )");
        jRadioButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton16);
        jRadioButton16.setBounds(610, 560, 105, 23);

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courcelab/forward1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(510, 660, 100, 20);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courcelab/home-.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(390, 640, 70, 60);

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 950, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        PlaySooound playSooound = new PlaySooound();
        playSooound.playSound("D:\\my work\\CourceLab\\bad.wav");
        JOptionPane.showMessageDialog(null, "sorry false chose");
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        PlaySooound playSooound = new PlaySooound();
        playSooound.playSound("D:\\my work\\CourceLab\\bad.wav");
        JOptionPane.showMessageDialog(null, "sorry false chose");
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        PlaySooound playSooound = new PlaySooound();
        playSooound.playSound("D:\\my work\\CourceLab\\bad.wav");
        JOptionPane.showMessageDialog(null, "sorry false chose");
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        PlaySooound playSooound = new PlaySooound();
        playSooound.playSound("D:\\my work\\CourceLab\\good.WAV");
        JOptionPane.showMessageDialog(null, "nice,that is right");

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        PlaySooound playSooound = new PlaySooound();
        playSooound.playSound("D:\\my work\\CourceLab\\good.WAV");
        JOptionPane.showMessageDialog(null, "nice,that is right");
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        PlaySooound playSooound = new PlaySooound();
        playSooound.playSound("D:\\my work\\CourceLab\\bad.wav");
        JOptionPane.showMessageDialog(null, "sorry false chose");
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        PlaySooound playSooound = new PlaySooound();
        playSooound.playSound("D:\\my work\\CourceLab\\bad.wav");
        JOptionPane.showMessageDialog(null, "sorry false chose");
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        PlaySooound playSooound = new PlaySooound();
        playSooound.playSound("D:\\my work\\CourceLab\\bad.wav");
        JOptionPane.showMessageDialog(null, "sorry false chose");
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        PlaySooound playSooound = new PlaySooound();
        playSooound.playSound("D:\\my work\\CourceLab\\bad.wav");
        JOptionPane.showMessageDialog(null, "sorry false chose");
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        PlaySooound playSooound = new PlaySooound();
        playSooound.playSound("D:\\my work\\CourceLab\\bad.wav");
        JOptionPane.showMessageDialog(null, "sorry false chose");
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        PlaySooound playSooound = new PlaySooound();
        playSooound.playSound("D:\\my work\\CourceLab\\bad.wav");
        JOptionPane.showMessageDialog(null, "sorry false chose");
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        PlaySooound playSooound = new PlaySooound();
        playSooound.playSound("D:\\my work\\CourceLab\\good.WAV");
        JOptionPane.showMessageDialog(null, "nice,that is right");
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        QuestionFrame3 questionFrame2 = new QuestionFrame3();
        questionFrame2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
        PlaySooound playSooound = new PlaySooound();
        playSooound.playSound("D:\\my work\\CourceLab\\bad.wav");
        JOptionPane.showMessageDialog(null, "sorry false chose"); // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed
        PlaySooound playSooound = new PlaySooound();
        playSooound.playSound("D:\\my work\\CourceLab\\bad.wav");
        JOptionPane.showMessageDialog(null, "sorry false chose");        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton13ActionPerformed

    private void jRadioButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton15ActionPerformed
        PlaySooound playSooound = new PlaySooound();
        playSooound.playSound("D:\\my work\\CourceLab\\good.WAV");
        JOptionPane.showMessageDialog(null, "nice,that is right");        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton15ActionPerformed

    private void jRadioButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton16ActionPerformed
        PlaySooound playSooound = new PlaySooound();
        playSooound.playSound("D:\\my work\\CourceLab\\bad.wav");
        JOptionPane.showMessageDialog(null, "sorry false chose");        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton16ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MasterFrame masterFrame = new MasterFrame()        // TODO add your handling code here:
                ;
        masterFrame.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(QuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
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
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration//GEN-END:variables
}
