/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basta;

import javax.swing.JOptionPane;

/**
 *
 * @author neilg
 */
public class CustomerInfo extends javax.swing.JFrame {
        /** Manila to Batanes
         Private*/
    String [] mbpfname = new String[14];
    String [] mbpmname = new String[14];
    String [] mbplname = new String[14];
    String [] mbpage = new String[14];
    String [] mbpnum = new String[14];
    /** Regular */
     String [] mbrfname = new String[23];
    String [] mbrmname = new String[23];
    String [] mbrlname = new String[23];
    String [] mbrage = new String[23];
    String [] mbrnum = new String[23];
    /** Business */
    String [] mbbfname = new String[48];
    String [] mbbmname = new String[48];
    String [] mbblname = new String[48];
    String [] mbbage = new String[48];
    String [] mbbnum = new String[48];
    
    /** Batanes to manila
         Private*/
    String [] bmpfname = new String[14];
    String [] bmpmname = new String[14];
    String [] bmplname = new String[14];
    String [] bmpage = new String[14];
    String [] bmpnum = new String[14];
    /** Regular */
     String [] bmrfname = new String[23];
    String [] bmrmname = new String[23];
    String [] bmrlname = new String[23];
    String [] bmrage = new String[23];
    String [] bmrnum = new String[23];
    /** Business */
    String [] bmbfname = new String[48];
    String [] bmbmname = new String[48];
    String [] bmblname = new String[48];
    String [] bmbage = new String[48];
    String [] bmbnum = new String[48];
     /** Manila to Palawan
         Private*/
    String [] mppfname = new String[14];
    String [] mppmname = new String[14];
    String [] mpplname = new String[14];
    String [] mppage = new String[14];
    String [] mppnum = new String[14];
    /** Regular */
     String [] mprfname = new String[23];
    String [] mprmname = new String[23];
    String [] mprlname = new String[23];
    String [] mprage = new String[23];
    String [] mprnum = new String[23];
    /** Business */
    String [] mpbfname = new String[48];
    String [] mpbmname = new String[48];
    String [] mpblname = new String[48];
    String [] mpbage = new String[48];
    String [] mpbnum = new String[48];   
    
    /** Palawan to Manila
         Private*/
    String [] pmpfname = new String[14];
    String [] pmpmname = new String[14];
    String [] pmplname = new String[14];
    String [] pmpage = new String[14];
    String [] pmpnum = new String[14];
    /** Regular */
     String [] pmrfname = new String[23];
    String [] pmrmname = new String[23];
    String [] pmrlname = new String[23];
    String [] pmrage = new String[23];
    String [] pmrnum = new String[23];
    /** Business */
    String [] pmbfname = new String[48];
    String [] pmbmname = new String[48];
    String [] pmblname = new String[48];
    String [] pmbage = new String[48];
    String [] pmbnum = new String[48];
        /** Manila to South Korea
         Private*/
    String [] mskpfname = new String[14];
    String [] mskpmname = new String[14];
    String [] mskplname = new String[14];
    String [] mskpage = new String[14];
    String [] mskpnum = new String[14];
    /** Regular */
     String [] mskrfname = new String[23];
    String [] mskrmname = new String[23];
    String [] mskrlname = new String[23];
    String [] mskrage = new String[23];
    String [] mskrnum = new String[23];
    /** Business */
    String [] mskbfname = new String[48];
    String [] mskbmname = new String[48];
    String [] mskblname = new String[48];
    String [] mskbage = new String[48];
    String [] mskbnum = new String[48];
    
    /** South Korea to Manila
         Private*/
    String [] skmpfname = new String[14];
    String [] skmpmname = new String[14];
    String [] skmplname = new String[14];
    String [] skmpage = new String[14];
    String [] skmpnum = new String[14];
    /** Regular */
     String [] skmrfname = new String[23];
    String [] skmrmname = new String[23];
    String [] skmrlname = new String[23];
    String [] skmrage = new String[23];
    String [] skmrnum = new String[23];
    /** Business */
    String [] skmbfname = new String[48];
    String [] skmbmname = new String[48];
    String [] skmblname = new String[48];
    String [] skmbage = new String[48];
    String [] skmbnum = new String[48];
    
    /** Manila to Japan
         Private*/
    String [] mjpfname = new String[14];
    String [] mjpmname = new String[14];
    String [] mjplname = new String[14];
    String [] mjpage = new String[14];
    String [] mjpnum = new String[14];
    /** Regular */
     String [] mjrfname = new String[23];
    String [] mjrmname = new String[23];
    String [] mjrlname = new String[23];
    String [] mjrage = new String[23];
    String [] mjrnum = new String[23];
    /** Business */
    String [] mjbfname = new String[48];
    String [] mjbmname = new String[48];
    String [] mjblname = new String[48];
    String [] mjbage = new String[48];
    String [] mjbnum = new String[48];
    
    /** Japan to Manila
         Private*/
    String [] jmpfname = new String[14];
    String [] jmpmname = new String[14];
    String [] jmplname = new String[14];
    String [] jmpage = new String[14];
    String [] jmpnum = new String[14];
    /** Regular */
     String [] jmrfname = new String[23];
    String [] jmrmname = new String[23];
    String [] jmrlname = new String[23];
    String [] jmrage = new String[23];
    String [] jmrnum = new String[23];
    /** Business */
    String [] jmbfname = new String[48];
    String [] jmbmname = new String[48];
    String [] jmblname = new String[48];
    String [] jmbage = new String[48];
    String [] jmbnum = new String[48];
    
    /** Manila to Vietnam
         Private*/
    String [] mvpfname = new String[14];
    String [] mvpmname = new String[14];
    String [] mvplname = new String[14];
    String [] mvpage = new String[14];
    String [] mvpnum = new String[14];
    /** Regular */
     String [] mvrfname = new String[23];
    String [] mvrmname = new String[23];
    String [] mvrlname = new String[23];
    String [] mvrage = new String[23];
    String [] mvrnum = new String[23];
    /** Business */
    String [] mvbfname = new String[48];
    String [] mvbmname = new String[48];
    String [] mvblname = new String[48];
    String [] mvbage = new String[48];
    String [] mvbnum = new String[48];
    
    /** Vietnam to Manila
         Private*/
    String [] vmpfname = new String[14];
    String [] vmpmname = new String[14];
    String [] vmplname = new String[14];
    String [] vmpage = new String[14];
    String [] vmpnum = new String[14];
    /** Regular */
     String [] vmrfname = new String[23];
    String [] vmrmname = new String[23];
    String [] vmrlname = new String[23];
    String [] vmrage = new String[23];
    String [] vmrnum = new String[23];
    /** Business */
    String [] vmbfname = new String[48];
    String [] vmbmname = new String[48];
    String [] vmblname = new String[48];
    String [] vmbage = new String[48];
    String [] vmbnum = new String[48];
    
        
    public CustomerInfo() {
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

        lblfname = new javax.swing.JLabel();
        fnametxt = new javax.swing.JTextField();
        lblmname = new javax.swing.JLabel();
        mnametxt = new javax.swing.JTextField();
        lbllname = new javax.swing.JLabel();
        lnametxt = new javax.swing.JTextField();
        lbllage = new javax.swing.JLabel();
        agetxt = new javax.swing.JTextField();
        lbllnum = new javax.swing.JLabel();
        numtxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblfname.setText("Enter First Name:");

        fnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnametxtActionPerformed(evt);
            }
        });

        lblmname.setText("Enter Middle Name:");

        lbllname.setText("Enter Last Name:");

        lbllage.setText("Enter Age:");

        lbllnum.setText("Enter Phone Number:");

        jButton1.setText("Proceed to Airline Type");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbllnum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblfname)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                    .addComponent(fnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblmname)
                                        .addComponent(lbllname)
                                        .addComponent(lbllage))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(mnametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                        .addComponent(lnametxt)
                                        .addComponent(agetxt))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(336, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfname)
                    .addComponent(fnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmname)
                    .addComponent(mnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbllname))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbllage))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbllnum)
                    .addComponent(numtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnametxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
     
          Transaction obj = new Transaction();
        int age = Integer.parseInt(agetxt.getText());
        if ( age < 19 && age >=0){
        
           JOptionPane.showMessageDialog(this,"need guidance");
        }
        
         else if (age < 0)
         {
         JOptionPane.showMessageDialog(this,"invalid age");
         }
         else{
         this.dispose();
         Destination desti = new Destination();
          desti.setVisible(true);
         
       
         mbpfname[0] = fnametxt.getText();
         mbpmname[0] = mnametxt.getText();
         mbplname[0] =lnametxt.getText();
         obj.fnamelbl.setText(mbpfname[0]);
         obj.mnamelbl.setText(mbpmname[0]);
         obj.lnamelbl.setText(mbplname[0]);
         }
         
         
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField agetxt;
    public javax.swing.JTextField fnametxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblfname;
    private javax.swing.JLabel lbllage;
    private javax.swing.JLabel lbllname;
    private javax.swing.JLabel lbllnum;
    private javax.swing.JLabel lblmname;
    public javax.swing.JTextField lnametxt;
    public javax.swing.JTextField mnametxt;
    public javax.swing.JTextField numtxt;
    // End of variables declaration//GEN-END:variables
}
