/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package giaodien1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class test extends javax.swing.JFrame {

    /**
     * Creates new form test
     */
    public test() {
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

        box_container = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        input_fullName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        input_date = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        input_address = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        input_email = new javax.swing.JTextField();
        input_msv = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        input_gender = new javax.swing.JTextField();
        input_diemTK = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btn_addSV = new javax.swing.JButton();
        btn_saveFile = new javax.swing.JButton();
        warnning_text = new javax.swing.JTextField();
        btn_deleteFile = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        console_output = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("nhập thông tin sinh viên");

        box_container.setBackground(new java.awt.Color(255, 255, 255));
        box_container.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        box_container.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("họ tên");

        input_fullName.setBackground(new java.awt.Color(255, 255, 255));
        input_fullName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        input_fullName.setForeground(new java.awt.Color(0, 0, 0));
        input_fullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_fullNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ngày sinh");

        input_date.setBackground(new java.awt.Color(255, 255, 255));
        input_date.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        input_date.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("địa chỉ");

        input_address.setBackground(new java.awt.Color(255, 255, 255));
        input_address.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        input_address.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("email");

        input_email.setBackground(new java.awt.Color(255, 255, 255));
        input_email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        input_email.setForeground(new java.awt.Color(0, 0, 0));

        input_msv.setBackground(new java.awt.Color(255, 255, 255));
        input_msv.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        input_msv.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("mã sinh viên");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("giới tính");

        input_gender.setBackground(new java.awt.Color(255, 255, 255));
        input_gender.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        input_gender.setForeground(new java.awt.Color(0, 0, 0));

        input_diemTK.setBackground(new java.awt.Color(255, 255, 255));
        input_diemTK.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        input_diemTK.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("điểm tổng kết");

        btn_addSV.setBackground(new java.awt.Color(51, 255, 0));
        btn_addSV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_addSV.setForeground(new java.awt.Color(255, 255, 255));
        btn_addSV.setText("thêm sinh viên");
        btn_addSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addSVActionPerformed(evt);
            }
        });

        btn_saveFile.setBackground(new java.awt.Color(51, 255, 255));
        btn_saveFile.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_saveFile.setForeground(new java.awt.Color(255, 255, 255));
        btn_saveFile.setText("lưu dữ liệu");
        btn_saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveFileActionPerformed(evt);
            }
        });

        warnning_text.setEditable(false);
        warnning_text.setBackground(new java.awt.Color(255, 255, 255));
        warnning_text.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        warnning_text.setForeground(new java.awt.Color(204, 0, 0));
        warnning_text.setBorder(null);
        warnning_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warnning_textActionPerformed(evt);
            }
        });

        btn_deleteFile.setBackground(new java.awt.Color(51, 255, 255));
        btn_deleteFile.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_deleteFile.setForeground(new java.awt.Color(255, 255, 255));
        btn_deleteFile.setText("xóa file");
        btn_deleteFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteFileActionPerformed(evt);
            }
        });

        console_output.setEditable(false);
        console_output.setBackground(new java.awt.Color(204, 204, 204));
        console_output.setColumns(20);
        console_output.setForeground(new java.awt.Color(255, 51, 51));
        console_output.setRows(5);
        console_output.setText("thông tin sinh viên");
        jScrollPane1.setViewportView(console_output);

        javax.swing.GroupLayout box_containerLayout = new javax.swing.GroupLayout(box_container);
        box_container.setLayout(box_containerLayout);
        box_containerLayout.setHorizontalGroup(
            box_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(box_containerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(box_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(box_containerLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(box_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(box_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(input_email, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input_msv, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input_gender, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input_address, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input_date, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input_fullName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input_diemTK, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(box_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_deleteFile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_saveFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(box_containerLayout.createSequentialGroup()
                                .addComponent(btn_addSV)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(box_containerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(warnning_text, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        box_containerLayout.setVerticalGroup(
            box_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(box_containerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(warnning_text, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(box_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(box_containerLayout.createSequentialGroup()
                        .addComponent(btn_deleteFile)
                        .addGap(26, 26, 26)
                        .addComponent(btn_addSV)
                        .addGap(24, 24, 24)
                        .addComponent(btn_saveFile))
                    .addGroup(box_containerLayout.createSequentialGroup()
                        .addGroup(box_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(input_fullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(box_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(input_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(box_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(input_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(box_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(input_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(box_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(input_msv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(box_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(input_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(box_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(input_diemTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(box_container, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(box_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addSVActionPerformed
        if (input_address.getText().equals("") || input_date.getText().equals("") || input_diemTK.getText().equals("")
                || input_email.getText().equals("")
                || input_fullName.getText().equals("")
                || input_gender.getText().equals("")
                || input_msv.getText().equals("")) {
            warnning_text.setText("bạn chưa điền hết thông tin ");
        } else {
            Student sv = new Student();
            sv.setFullName(input_fullName.getText());
            sv.setAddress(input_address.getText());
            sv.setDate(input_date.getText());
            sv.setGender(input_gender.getText());
            sv.setMsv(input_msv.getText());
            sv.setEmail(input_email.getText());
            sv.setDiem(Float.parseFloat(input_diemTK.getText()));
            sv.add(sv);
            console_output.setText(console_output.getText() + "\n" + sv.toString() );
            sv.display();
            // reset
            input_address.setText("");
            input_date.setText("");
            input_diemTK.setText("");
            input_email.setText("");
            input_fullName.setText("");
            input_gender.setText("");
            input_msv.setText("");
            // thông báo
            JOptionPane.showMessageDialog(null, "Them Thanh Cong!");
            warnning_text.setText("bạn đã thêm sinh viên thành công");
        }
    }//GEN-LAST:event_btn_addSVActionPerformed

    private void input_fullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_fullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_fullNameActionPerformed

    private void btn_saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveFileActionPerformed
        // TODO add your handling code here:
        Student sv = new Student();
        String information = sv.getInfo_SV();
        FileWriter fileWriter = null;
        try {
            if (information.equals("")) {
                warnning_text.setText("bạn phải ấn vào thêm sinh viên trước đã!!!");
                
            } else {
                fileWriter = new FileWriter("sinhvien1.dat", true);
                fileWriter.write(information);
                JOptionPane.showMessageDialog(null, "lưu thông tin thành công!");
                warnning_text.setText("bạn đã lưu toàn bộ thông tin thành công!!");
            }
        } catch (IOException e) {
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException ex) {
                    Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btn_saveFileActionPerformed

    private void btn_deleteFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteFileActionPerformed
        // TODO add your handling code here:
        File file = new File("sinhvien1.dat");
        if (file.isFile()) {
            file.delete();
            warnning_text.setText("file đã được xóa!");
        } else {
            warnning_text.setText("file chưa được tạo!");
        }
    }//GEN-LAST:event_btn_deleteFileActionPerformed

    private void warnning_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warnning_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_warnning_textActionPerformed

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
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel box_container;
    private javax.swing.JButton btn_addSV;
    private javax.swing.JButton btn_deleteFile;
    private javax.swing.JButton btn_saveFile;
    private javax.swing.JTextArea console_output;
    private javax.swing.JTextField input_address;
    private javax.swing.JTextField input_date;
    private javax.swing.JTextField input_diemTK;
    private javax.swing.JTextField input_email;
    private javax.swing.JTextField input_fullName;
    private javax.swing.JTextField input_gender;
    private javax.swing.JTextField input_msv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField warnning_text;
    // End of variables declaration//GEN-END:variables
}