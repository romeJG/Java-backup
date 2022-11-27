/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgcase.study;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import pkgcase.study.Professor;
import pkgcase.study.TEJUCO;

/**
 *
 * @author jenin
 */
public class addProf extends javax.swing.JFrame {

    /**
     * Creates new form addProf
     */
    public addProf() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void computeSalary(String j, int tot_hrs){
       int nhrs, overtime, tsalary, extra, s_base = 1200;
            
       double ha, ma, ta, net;
        if(j=="Head of Faculty"){
            nhrs = 8;
        }
        else if(j=="Coordinator"){
            nhrs = 13;
        }
        else{
            nhrs = 18;
        }
        
        if(tot_hrs>nhrs){
            overtime =  tot_hrs - nhrs;
        }else{
            overtime = 0;
        }
        
        String over = String.valueOf(overtime);
        ot.setText(over);
        
        extra = overtime * 325;
        tsalary = extra + s_base;
        ha = tsalary*0.10;
        ma = tsalary*0.03;
        ta = tsalary*0.05;
        net = tsalary+ha+ma+ta;
        
        String sal = String.valueOf(tsalary);
        String home = String.valueOf(ha);
        String med = String.valueOf(ma);
        String trans = String.valueOf(ta);
        String nets = String.valueOf(net);
        try{
            File f = new File("Professors.txt");
            TEJUCO.write(tHrs.getText(), f);
            TEJUCO.write(",", f);
            TEJUCO.write(ot.getText(), f);
            TEJUCO.write(",", f);
            TEJUCO.write(sal, f);
            TEJUCO.write(",", f);
            TEJUCO.write(home, f);
            TEJUCO.write(",", f);
            TEJUCO.write(med, f);
            TEJUCO.write(",", f);
            TEJUCO.write(trans, f);
            TEJUCO.write(",", f);
            TEJUCO.write(nets, f);
            
            TEJUCO.write("\n", f);
        }catch(IOException e){
            JOptionPane.showMessageDialog(rootPane, "Cannot Write to file");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ID_num = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        dept = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        desig = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        tHrs = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ot = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Professor");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Number:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gender:");

        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gender", "Male", "Female" }));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Department:");

        dept.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Department", "Business", "Computing" }));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Designation:");

        desig.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Designation", "Head of Faculty", "Coordinator", "Lecturer" }));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("No. of Teaching hours:");

        tHrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tHrsActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Overtime:");

        ot.setEditable(false);

        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel10))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(56, 56, 56)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(56, 56, 56)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dept, 0, 86, Short.MAX_VALUE)
                                    .addComponent(lname)
                                    .addComponent(fname)
                                    .addComponent(tHrs)
                                    .addComponent(ID_num, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(desig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel6))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(gender, 0, 102, Short.MAX_VALUE)
                                                .addComponent(phone)
                                                .addComponent(address))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(add)
                                            .addComponent(ot, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(back)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ID_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(desig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tHrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(ot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(back))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Professor prof = new Professor();
        prof.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        try{
            int a = Integer.parseInt(ID_num.getText());
        }catch(Exception e){
            if("".equals(ID_num.getText())){
                JOptionPane.showMessageDialog(ID_num, "Please Enter Phone number.");
            }else{
                JOptionPane.showMessageDialog(rootPane, "Invalid input. Please try again.");
            }
            ID_num.setText(null);
        }
        try{
            int b = Integer.parseInt(phone.getText());
        }catch(Exception e){
            if("".equals(phone.getText())){
                JOptionPane.showMessageDialog(rootPane, "Please Enter Phone number.");
            }else{
                JOptionPane.showMessageDialog(rootPane, "Invalid input. Please try again.");
            }
            
            phone.setText(null);
        }
        try{
            int b = Integer.parseInt(tHrs.getText());
        }catch(Exception e){
            if("".equals(tHrs.getText())){
                JOptionPane.showMessageDialog(rootPane, "Please Enter Phone number.");
            }else{
                JOptionPane.showMessageDialog(rootPane, "Invalid input. Please try again.");
            }
            tHrs.setText(null);
        }
        
        if ("".equals(fname.getText())){
            JOptionPane.showMessageDialog(rootPane, "Please Enter a First name");
        }
        //else if(TEJUCO.searchIfExist("Students.txt", this.idNo.getText())){
        //    JOptionPane.showMessageDialog(rootPane, "The ID Number Already Exist");
       // }
        else if ("".equals(lname.getText())){
            JOptionPane.showMessageDialog(rootPane, "Please Enter a Last name");
        }
        else if("Gender".equals(gender.getSelectedItem().toString())){
            JOptionPane.showMessageDialog(rootPane, "Please Choose a gender");
        }
        else if ("".equals(phone.getText())){
            JOptionPane.showMessageDialog(rootPane, "Please Enter a Phone number");
        }
        else if ("".equals(address.getText())){
            JOptionPane.showMessageDialog(rootPane,"Please Enter a Email Adress");
        }
        else if("Department".equals(dept.getSelectedItem().toString())){
            JOptionPane.showMessageDialog(rootPane, "Please Choose a Department");
        }
        else if("Designation".equals(desig.getSelectedItem().toString())){
            JOptionPane.showMessageDialog(rootPane, "Please Choose a Designation");
        }
        else{
            ot.setText("0");
            int x;
            x = Integer.parseInt(tHrs.getText());
            
            try{
                File f = new File("Professors.txt");
                TEJUCO.write(ID_num.getText(), f);
                TEJUCO.write(",", f);
                TEJUCO.write(fname.getText(), f);
                TEJUCO.write(",", f);
                TEJUCO.write(lname.getText(), f);
                TEJUCO.write(",", f);
                TEJUCO.write(gender.getSelectedItem().toString(), f);
                TEJUCO.write(",", f);
                TEJUCO.write(phone.getText(), f);
                TEJUCO.write(",", f);
                TEJUCO.write(address.getText(), f);
                TEJUCO.write(",", f);
                TEJUCO.write(dept.getSelectedItem().toString(), f);
                TEJUCO.write(",", f);
                TEJUCO.write(desig.getSelectedItem().toString(), f);
                TEJUCO.write(",", f);
                computeSalary(desig.getSelectedItem().toString(),x);
                JOptionPane.showMessageDialog(rootPane, "Added!");
                /*Student stud = new Student();       //student button
                stud.setVisible(true);
                this.dispose();*/
                ID_num.setText(null);
                fname.setText(null);
                lname.setText(null);
                gender.setAction(null);
                phone.setText(null);
                address.setText(null);
                tHrs.setText(null);
                gender.setSelectedItem("Gender");
                dept.setSelectedItem("Department");
                desig.setSelectedItem("Designation");
                ot.setText(null);
                
                
            }
            catch(IOException e){
                JOptionPane.showMessageDialog(rootPane, "Cannot Write to file");
            }
  
        }
    }//GEN-LAST:event_addActionPerformed

    private void tHrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tHrsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tHrsActionPerformed

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
            java.util.logging.Logger.getLogger(addProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addProf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID_num;
    private javax.swing.JButton add;
    private javax.swing.JTextField address;
    private javax.swing.JButton back;
    private javax.swing.JComboBox dept;
    private javax.swing.JComboBox desig;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField ot;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField tHrs;
    // End of variables declaration//GEN-END:variables
}
