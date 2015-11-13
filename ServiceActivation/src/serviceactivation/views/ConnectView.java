/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceactivation.views;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.net.*;
import java.io.*;


/**
 *
 * @author israelagyeman-prempeh
 */
public class ConnectView extends javax.swing.JFrame {
    
    ConnectView newConnectView;
    Socket sock;
    /**
     * Creates new form ConnectView
     */
    public ConnectView() {
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

        hostIp = new javax.swing.JTextField();
        port = new javax.swing.JTextField();
        connectionName = new javax.swing.JTextField();
        newConnection = new javax.swing.JButton();
        connect = new javax.swing.JButton();
        cancelConnection = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SysService-Connect");
        setMaximumSize(new java.awt.Dimension(600, 520));
        setMinimumSize(new java.awt.Dimension(600, 520));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hostIp.setBackground(new java.awt.Color(222, 226, 230));
        hostIp.setForeground(new java.awt.Color(42, 60, 51));
        hostIp.setBorder(null);
        hostIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostIpActionPerformed(evt);
            }
        });
        getContentPane().add(hostIp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 210, 30));

        port.setBackground(new java.awt.Color(222, 223, 230));
        port.setForeground(new java.awt.Color(42, 61, 51));
        port.setBorder(null);
        port.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portActionPerformed(evt);
            }
        });
        port.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                portKeyTyped(evt);
            }
        });
        getContentPane().add(port, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 60, 20));

        connectionName.setBackground(new java.awt.Color(222, 226, 230));
        connectionName.setForeground(new java.awt.Color(42, 51, 61));
        connectionName.setBorder(null);
        getContentPane().add(connectionName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 130, 30));

        newConnection.setText("NEW CONNECTION");
        newConnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newConnectionActionPerformed(evt);
            }
        });
        getContentPane().add(newConnection, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 160, 30));

        connect.setText("CONNECT");
        connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectActionPerformed(evt);
            }
        });
        getContentPane().add(connect, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 160, 30));

        cancelConnection.setText("CANCEL");
        cancelConnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelConnectionActionPerformed(evt);
            }
        });
        getContentPane().add(cancelConnection, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 160, 30));

        jLabel1.setBackground(new java.awt.Color(222, 222, 222));
        jLabel1.setForeground(new java.awt.Color(42, 60, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bg-02.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelConnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelConnectionActionPerformed
        // TODO add your handling code here:
//        try{
//            sock.close();
//        }catch(IOException ioe){System.err.println("Done");}
        
    }//GEN-LAST:event_cancelConnectionActionPerformed

    private void connectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectActionPerformed
        // TODO add your handling code here:
        try{
            sock = new Socket(hostIp.getText(),Integer.parseInt(port.getText()));
        }catch(IOException ioe){System.err.println("Done");}
    }//GEN-LAST:event_connectActionPerformed

    private void newConnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newConnectionActionPerformed
        // TODO add your handling code here:
//        try{
//            hostIp.setText("");
//            port.setText("");
//            sock.close();
//        }catch(IOException ioe){System.err.println("Done");}
    }//GEN-LAST:event_newConnectionActionPerformed

    private void hostIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostIpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hostIpActionPerformed

    private void portActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_portActionPerformed

    private void portKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_portKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c))){
            evt.consume();
        }
    }//GEN-LAST:event_portKeyTyped

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
            java.util.logging.Logger.getLogger(ConnectView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConnectView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConnectView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConnectView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new ConnectView().setVisible(true);
            }
        });
    }
    
    /**
     * A function that returns the host ip textfield
     * @return 
     */
    public JTextField getIp(){
        return hostIp;
    }
    
    /**
     * A function that returns the host port textfield
     * @return JTextField port
     */
    public JTextField getPort(){
        return port;
    }
    
    /**
     * A function that returns the host connection Name textfield
     * @return JTextField connectionName
     */
    public JTextField getConnectionName(){
        return connectionName;
    }
    
    /**
     * This function returns a button to be used to create a new connection
     * @return JButton newConnection
     */
    public JButton newConnection(){
        return newConnection;
    }
    
    /**
     * This function returns a button to be used to connect after details have been entered
     * @return JButton connect
     */
    public JButton connectButton(){
        return connect;
    }
    
    /**
     * This function returns a button to cancel the page
     * @return JButton connect
     */
    public JButton cancel(){
        return cancelConnection;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelConnection;
    private javax.swing.JButton connect;
    private javax.swing.JTextField connectionName;
    private javax.swing.JTextField hostIp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton newConnection;
    private javax.swing.JTextField port;
    // End of variables declaration//GEN-END:variables
}
