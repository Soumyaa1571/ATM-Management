/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.management;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author KIIT
 */
public class FASTCASH extends javax.swing.JFrame {
String y;
int n,i=1;
    /**
     * Creates new form FASTCASH
     */
    public FASTCASH(String z) {
        y=z;
        initComponents();
       try{
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost/atm","root","");
           PreparedStatement p=c.prepareStatement("select * from account where accountnumber=?");
           p.setString(1,y);
           ResultSet r =p.executeQuery();
           if(r.next())
           {
            String a=r.getString(10);
            jLabel3.setText(a);
            n=Integer.parseInt(a);
           }
           
       
       } 
       catch(Exception ex)
       {
           System.out.println(ex);
       }
       
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("ATM MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(477, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 255));
        jButton1.setText("Rs 500");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 255));
        jButton2.setText("Rs 1000");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 255));
        jButton3.setText("Rs 2000");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 255));
        jButton4.setText("Rs 100");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 51, 255));
        jButton5.setText("Rs 5000");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 51, 255));
        jButton6.setText("Rs 10000");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("FAST CASH");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Balance");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Back");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(502, 502, 502))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(328, 328, 328)
                        .addComponent(jButton6)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel3)))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     try{
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost/atm","root","");
    PreparedStatement p=c.prepareStatement("update account set balance=? where accountnumber=?");
    p.setString(2, y);
    int m=n-1000;
    p.setInt(1,m);
    p.execute();
    if(m>0)
    {
        JOptionPane.showMessageDialog(rootPane,"Balance updated");
        String str=String.valueOf(m);
        jLabel3.setText(str);
    }
    else
    {
        JOptionPane.showMessageDialog(rootPane,"Not enough Balance");
        
    }
    
    }   
    catch(Exception ex)
    {
        System.out.println(ex);
    }
      
 
    try{
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost/atm","root","");
          PreparedStatement p=c.prepareStatement("insert into MiniStm values (?, ?, ?, ?, ?)");
          
          Calendar b=Calendar.getInstance();
          String q="1000";
          int d=b.get(Calendar.DATE);
          int m=b.get(Calendar.MONTH);
          int k=b.get(Calendar.YEAR);
          p.setString(1,i+"" );
          p.setString(2, y);
          p.setString(3,"FastCash");
          p.setString(4,d+"- "+(m-1)+"-"+k);
          p.setString(5, q);
          p.execute();
    }
    catch(Exception ex)
    {
       System.out.println(ex); 
    }



        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
    MAINMENU m=new MAINMENU(y);
    m.setVisible(true);
    setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    try{
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost/atm","root","");
    PreparedStatement p=c.prepareStatement("update account set balance=? where accountnumber=?");
    p.setString(2, y);
    int m=n-100;
    p.setInt(1,m);
    p.execute();
    if(m>0)
    {
        JOptionPane.showMessageDialog(rootPane,"Balance updated");
          String str=String.valueOf(m);
        jLabel3.setText(str);
    }
    else
    {
        JOptionPane.showMessageDialog(rootPane,"Not enough Balance ");
        
    }
    
    }   
    catch(Exception ex)
    {
        System.out.println(ex);
    }
    
    try{
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost/atm","root","");
          PreparedStatement p=c.prepareStatement("insert into MiniStm values (?, ?, ?, ?, ?)");
          
          Calendar b=Calendar.getInstance();
          String q="100";
          int d=b.get(Calendar.DATE);
          int m=b.get(Calendar.MONTH);
          int k=b.get(Calendar.YEAR);
          p.setString(1,i+"" );
          p.setString(2, y);
          p.setString(3,"FastCash");
          p.setString(4,d+"- "+(m-1)+"-"+k);
          p.setString(5, q);
          p.execute();
    }
    catch(Exception ex)
    {
       System.out.println(ex); 
    }


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       try{
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost/atm","root","");
    PreparedStatement p=c.prepareStatement("update account set balance=? where accountnumber=?");
    p.setString(2, y);
    int m=n-2000;
    p.setInt(1,m);
    p.execute();
    if(m>0)
    {
        JOptionPane.showMessageDialog(rootPane,"Balance updated");
          String str=String.valueOf(m);
        jLabel3.setText(str);
    }
    else
    {
        JOptionPane.showMessageDialog(rootPane,"Not enough Balance");
        ;
    }
    
    }   
    catch(Exception ex)
    {
        System.out.println(ex);
    }
       
        try{
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost/atm","root","");
          PreparedStatement p=c.prepareStatement("insert into MiniStm values (? ? ? ? ?)");
          
          Calendar b=Calendar.getInstance();
          String q="2000";
          int d=b.get(Calendar.DATE);
          int m=b.get(Calendar.MONTH);
          int k=b.get(Calendar.YEAR);
          p.setString(1,i+"" );
          p.setString(2, y);
          p.setString(3,"FastCash");
          p.setString(4,d+"- "+(m-1)+"-"+k);
          p.setString(5, q);
          p.execute();
    }
    catch(Exception ex)
    {
       System.out.println(ex); 
    }
       



// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      try{
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost/atm","root","");
    PreparedStatement p=c.prepareStatement("update account set balance=? where accountnumber=?");
    p.setString(2, y);
    int m=n-500;
    p.setInt(1,m);
    p.execute();
    if(m>0)
    {
        JOptionPane.showMessageDialog(rootPane,"Balance updated");
              String str=String.valueOf(m);
        jLabel3.setText(str);
    }
    else
    {
        JOptionPane.showMessageDialog(rootPane,"Not enough Balance");
    ;
    }
    
    }   
    catch(Exception ex)
    {
        System.out.println(ex);
    }
    
          try{
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost/atm","root","");
          PreparedStatement p=c.prepareStatement("insert into MiniStm values (? ? ? ? ?)");
          
          Calendar b=Calendar.getInstance();
          String q="500";
          int d=b.get(Calendar.DATE);
          int m=b.get(Calendar.MONTH);
          int k=b.get(Calendar.YEAR);
          p.setString(1,i+"" );
          p.setString(2, y);
          p.setString(3,"FastCash");
          p.setString(4,d+"- "+(m-1)+"-"+k);
          p.setString(5, q);
          p.execute();
    }
    catch(Exception ex)
    {
       System.out.println(ex); 
    }

      

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       try{
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost/atm","root","");
    PreparedStatement p=c.prepareStatement("update account set balance=? where accountnumber=?");
    p.setString(2, y);
    int m=n-5000;
    p.setInt(1,m);
    p.execute();
    if(m>0)
    {
        JOptionPane.showMessageDialog(rootPane,"Balance updated");
         String str=String.valueOf(m);
        jLabel3.setText(str);
    }
    else
    {
        JOptionPane.showMessageDialog(rootPane,"Not enough Balance");
         
    }
    
    }   
    catch(Exception ex)
    {
        System.out.println(ex);
    }
       
          try{
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost/atm","root","");
          PreparedStatement p=c.prepareStatement("insert into MiniStm values (? ? ? ? ?)");
          
          Calendar b=Calendar.getInstance();
          String q="5000";
          int d=b.get(Calendar.DATE);
          int m=b.get(Calendar.MONTH);
          int k=b.get(Calendar.YEAR);
          p.setString(1,i+"" );
          p.setString(2, y);
          p.setString(3,"FastCash");
          p.setString(4,d+"- "+(m-1)+"-"+k);
          p.setString(5, q);
          p.execute();
    }
    catch(Exception ex)
    {
       System.out.println(ex); 
    }
 
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      try{
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost/atm","root","");
    PreparedStatement p=c.prepareStatement("update account set balance=? where accountnumber=?");
    p.setString(2, y);
    int m=n-10000;
    p.setInt(1,m);
    p.execute();
    if(m>0)
    {
        JOptionPane.showMessageDialog(rootPane,"Balance updated");
         String str=String.valueOf(m);
        jLabel3.setText(str);
    }
    else
    {
        JOptionPane.showMessageDialog(rootPane,"Not enough Balance ");
         
    }
    
    }   
    catch(Exception ex)
    {
        System.out.println(ex);
    }
       
        try{
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost/atm","root","");
          PreparedStatement p=c.prepareStatement("insert into MiniStm values (? ? ? ? ?)");
          
          Calendar b=Calendar.getInstance();
          String q="10000";
          int d=b.get(Calendar.DATE);
          int m=b.get(Calendar.MONTH);
          int k=b.get(Calendar.YEAR);
          p.setString(1,i+"" );
          p.setString(2, y);
          p.setString(3,"FastCash");
          p.setString(4,d+"- "+(m-1)+"-"+k);
          p.setString(5, q);
          p.execute();
    }
    catch(Exception ex)
    {
       System.out.println(ex); 
    }
      
// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(FASTCASH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FASTCASH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FASTCASH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FASTCASH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FASTCASH(args.length > 0 ? args[0] : "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}