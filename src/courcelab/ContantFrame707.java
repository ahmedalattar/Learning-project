/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courcelab;

import java.awt.ComponentOrientation;

/**
 *
 * @author attar
 */
public class ContantFrame707 extends javax.swing.JFrame {

    /**
     * Creates new form ContantFrame72
     */
    public ContantFrame707() {
        initComponents();
        setBounds(0, 0, 950, 750);
        jTextArea1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setTitle("الفصل الثانى");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("دواعي عدم استخدام الرسوم المتحركة:- \n•\tالتعبيرعن مواقف اجتماعية تسجيلها بالفيديو كالفنون الشعبية والمهرجانات والحفلات \n•\tالتعبير عن سلوك ظاهر يرتبط الكائن بالبيئة مثل سلوك الحيوانات \n•\tالتعبير عن صورة ثابتة كاستعراض تترات مقدمة برنامج \nوالفكرة المحورية لتكنولوجيا الواقع الافتراضي هي مفهوم الشعور بالانغماس \nفي تلك العوالم الصناعية المشيدة من الارقام والرموز ويتولد هذا  الشعور بالانغماس بفعل ثلاثة عوامل متطافرة وهي :\n\tخداع واقعيتها\n\tتوليد الاشكال المجسمة ثلاثية الابعاد\n\tرد فعل النظام ديناميكيا مع حركات الرأس او العين ‘او الجسد ‘او الاطراف\n ويحتوي الواقع الافتراضي علي ثلاثة انواع وهي:\nنافذةعلي العالم Window on World  :\n   ويعرف هذا النوع للمتعاملين مع العاب الفيديو ومسارح المقعد المتحرك الانغماس-الاحتجاب- الواقع الافتراضي Immersive :\n    وهو نظام يعمل بشاشة عرض رأسية وبيئة افتراضية ثلاثية الابعاد ‘ ويسمح للمشارك فيه بالدخول الي بيئة الواقع الافتراضي ‘ والانغماس بها \nالشخص الاخر بالواقع الافتراضي Second person VR:\nتوفير مع الواقع الافتراضي والمخاطب كاميرا لالتقاط صورة المشارك بالبرنامج وادخالها في\n الواقع الافتراضي ‘ ومن ثم مشاهدة المتعلمين صورهم بشاشة العرض حيث يتفاعلون مع الاشياء المتواجدة بالواقع الافتراضي \n");
        jTextArea1.setToolTipText("الفصل الثانى");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 940, 630);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courcelab/home-.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(460, 650, 70, 70);

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courcelab/forward1.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(570, 680, 80, 20);

        jButton3.setBackground(new java.awt.Color(153, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courcelab/back1.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(340, 680, 80, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 950, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ContantFrame8 contantFrame72 = new ContantFrame8()        // TODO add your handling code here:
                ;
        contantFrame72.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MasterFrame masterFrame = new MasterFrame()        // TODO add your handling code here:
                ;
        masterFrame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ContantFrame706 contantFrame71 = new ContantFrame706()        // TODO add your handling code here:
                ;
        contantFrame71.setVisible(true);
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
            java.util.logging.Logger.getLogger(ContantFrame707.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContantFrame707.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContantFrame707.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContantFrame707.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContantFrame707().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
