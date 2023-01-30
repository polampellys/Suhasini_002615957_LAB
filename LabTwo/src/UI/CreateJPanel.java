/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.Customer;
import Model.DeliveryPackage;
import Model.Product;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    
    private DeliveryPackage delPackage;
    
    private Boolean validate = false;
    
    public CreateJPanel() {
        initComponents();
        
    }

    CreateJPanel(DeliveryPackage deliveryPackage) {
        initComponents();
        
        // logic to take information from the user and store it in the delivery package
        this.delPackage = deliveryPackage;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        packageId = new javax.swing.JTextField();
        packageWt = new javax.swing.JTextField();
        custId = new javax.swing.JTextField();
        productId1 = new javax.swing.JTextField();
        productName1 = new javax.swing.JTextField();
        productPrice1 = new javax.swing.JTextField();
        custName1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        saveProductbtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(packageId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 90, 30));
        add(packageWt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 90, 30));
        add(custId, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 80, 30));
        add(productId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 90, 30));
        add(productName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 90, 30));
        add(productPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 90, 30));

        custName1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                custName1FocusLost(evt);
            }
        });
        add(custName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 80, 30));

        jLabel1.setText("Customer ID");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, 20));

        jLabel2.setText("Package ID");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setText("Package Weight");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel4.setText("Product ID");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 20));

        jLabel5.setText("Product Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 20));

        jLabel6.setText("Product Price");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 20));

        jLabel7.setText("Customer name");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, 20));

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

        saveProductbtn.setText("SAVE PRODUCT");
        saveProductbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveProductbtnActionPerformed(evt);
            }
        });
        add(saveProductbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 140, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        // get the data
        String id = packageId.getText();
        String weight = packageWt.getText();
        
        String customerId = custId.getText();
        String customername = custName1.getText();
        
        
        
        // store the data
        this.delPackage.setPackageId(Integer.valueOf(id));
        this.delPackage.setPackageWeight(Double.valueOf(weight));
        
     
        Customer customer = this.delPackage.getCustomer();
        customer.setCustomerId(Integer.valueOf(customerId));
        customer.setFullName(customername);
        
        if(validate) {
            JOptionPane.showMessageDialog(null, "Pleae fill all fields");
        } else {
            JOptionPane.showMessageDialog(null, "Saved!");
        }
        
                
    }//GEN-LAST:event_btnSaveActionPerformed

    private void saveProductbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveProductbtnActionPerformed
        // TODO add your handling code here:
        String productId = productId1.getText();
        String productName = productName1.getText();
        String productPrice = productPrice1.getText();
        
        Product product = this.delPackage.createProduct(Integer.valueOf(productId), productName, Double.valueOf(productPrice));
       
         JOptionPane.showMessageDialog(null, "Added Product");
    }//GEN-LAST:event_saveProductbtnActionPerformed

    private void custName1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_custName1FocusLost
        // TODO add your handling code here:
        
        System.out.println(custName1.getText() + " -- the customer name");
        String name = custName1.getText();
        
        if(name.isEmpty()) {
           // JOptionPane.showMessageDialog(null, "Please fill name");
            this.validate = true;
        } else {
            this.validate = false;
        }
    }//GEN-LAST:event_custName1FocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JTextField custId;
    private javax.swing.JTextField custName1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField packageId;
    private javax.swing.JTextField packageWt;
    private javax.swing.JTextField productId1;
    private javax.swing.JTextField productName1;
    private javax.swing.JTextField productPrice1;
    private javax.swing.JButton saveProductbtn;
    // End of variables declaration//GEN-END:variables
}
