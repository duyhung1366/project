/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package giaodien3;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class test extends javax.swing.JFrame {
    
    DefaultTableModel tableModel;

    /**
     * Creates new form test
     */
    public test() {
        initComponents();
        
        tableModel = (DefaultTableModel) tbl_info.getModel();
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_info = new javax.swing.JTable();
        btn_output = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("hiển thị thông tin");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        tbl_info.setBackground(new java.awt.Color(0, 0, 0));
        tbl_info.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_info.setForeground(new java.awt.Color(255, 255, 255));
        tbl_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "stt", "full-name", "gender", "date", "address", "department", "hsl", "exprience", "salary-basic", "salary-standard"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_info);

        btn_output.setBackground(new java.awt.Color(0, 0, 0));
        btn_output.setForeground(new java.awt.Color(153, 255, 51));
        btn_output.setText("in thông tin");
        btn_output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_outputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(btn_output, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(295, 295, 295))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btn_output, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_outputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_outputActionPerformed
        // TODO add your handling code here:
        List<Employee> list_Employee = new ArrayList<>();
        
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        
        try {
            fileInputStream = new FileInputStream("nhanvien.dat");
           
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            String chardata = new String();
            String[] linetext ; 
            String[] propertiestext ; 
            
            int data ;
            
            while((data = bufferedInputStream.read()) != -1){
                char x = (char)data; 
                chardata += x;
            }
            
            linetext = chardata.split("\\r?\\n"); // convert string chardata sang array chứa các nhân viên
            
            for (String linetext1 : linetext) {
                propertiestext = linetext1.split("\\$"); // convert linetext -> array chứa các thuộc tính
                
                Employee employee = new Employee(); 
                employee.setFullName(propertiestext[0]);
                employee.setDate(propertiestext[1]);
                employee.setAddress(propertiestext[2]);
                employee.setGender(propertiestext[3]);
                employee.setDepartment(propertiestext[4]);
                employee.setHsl(Float.parseFloat(propertiestext[5]));
                employee.setExperience(Byte.parseByte(propertiestext[6]));
                employee.setSalary_basic(Double.parseDouble(propertiestext[7]));
                list_Employee.add(employee);
            }
            for(int i = 0; i< list_Employee.size(); i++){
                tableModel.addRow(new Object[] {
                    tableModel.getRowCount() + 1, list_Employee.get(i).getFullName(),
                    list_Employee.get(i).getGender(),
                    list_Employee.get(i).getDate(),
                    list_Employee.get(i).getAddress(),
                    list_Employee.get(i).getDepartment(),
                    list_Employee.get(i).getHsl(),
                    list_Employee.get(i).getExperience(),
                    list_Employee.get(i).getSalary_basic(),
                    list_Employee.get(i).getSalary_Standard(),
                });
            }
        } catch(IOException | NumberFormatException e){
            
        } finally {
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException ex) {
                }
            }
            if(bufferedInputStream != null){
                try {
                    bufferedInputStream.close();
                } catch (IOException ex) {
                }
            }
        }
    }//GEN-LAST:event_btn_outputActionPerformed

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
    private javax.swing.JButton btn_output;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_info;
    // End of variables declaration//GEN-END:variables
}
