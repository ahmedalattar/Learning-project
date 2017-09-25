/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courcelab;

import java.awt.ComponentOrientation;
import javafx.scene.text.Font;

/**
 *
 * @author attar
 */
public class GoalsFrame extends javax.swing.JFrame {

    /**
     * Creates new form Goals
     */
    public GoalsFrame() {
        initComponents();
        this.setContentPane(jPanel1);
        setBounds(0, 0, 950, 750);
        jTextArea1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        jTextArea1.setAlignmentX(jTextArea1.RIGHT_ALIGNMENT);
        
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        setTitle("الأهــــــداف");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 153, 153));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arabic Typesetting", 2, 36)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("الاهداف:-\nالهدف العام للمقرر:\n1-ان يعرف الطالب معنى الوسائط المتعدده واهميتها.\n2-ان يتعرف الطالب على عناصر الوسائط المتعدده .\nالاهداف السلوكيه :\n_ أن يتعرف الطالب علي أشكال النصوص المكتوبة وكذلك أنواعها .\n_ أن يلم الطالب بمواضع استخدام النصوص المكتوبة في برامج الوسائط المتعددة .\n_ أن يحدد الطالب معايير توظيف اللغة المنطوقة في برامج الوسائط المتعددة التفاعلية .\n_ أن يوظف الطالب الموسيقي والمؤثرات الصوتية في برامج الوسائط المتعددة توظيفا دقيقاً .\n-يتعاون مع زملائه في شرح مراحل إنتاج الصوت.\n-ينفذ الفوائد التربوية لاستخدام الصوت ف برامج الوسائط المتعددة.\n-يتعاون مع زملائه في تنفيذ القواعد التي يجب مراعاتها عند إضافة الصوت إلي برامج الوسائط المتعددة.\n_ أن يعدد الطالب أنماط الرسوم والتكوينات الخطية .\n_ أن يشعر الطالب بأهمية وجود رسومات وتكوينات خطية في البرنامج .\n_ أن يدرك الطالب فائدة استخدم الصور الثابتة في البرامج .\n_ أن يستطيع الطالب الجمع بين خصائص لقطات الفيديو .\n-ينشي الرسوم المتحركة في برامج الوسائط المتعددة.\n");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 930, 630);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courcelab/home-.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(420, 650, 73, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 950, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GoalsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GoalsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GoalsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GoalsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GoalsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
