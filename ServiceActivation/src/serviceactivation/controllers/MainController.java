/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceactivation.controllers;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import serviceactivation.models.Models;
import serviceactivation.views.ConnectView;
import serviceactivation.views.MainView;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author israelagyeman-prempeh
 */
public class MainController {
    ConnectView cv;
    MainView mv;
    Models m;
    MouseListener mouseListener;
    
    /**
     * This is where the action happens, all the controlling of the application happens here
     * @param cv
     * @param mv
     * @param m 
     */
    public MainController(ConnectView cv, MainView mv, Models m){
        this.cv = cv;
        this.mv = mv;
        this.m = m;
        cv.setVisible(true);
        this.control();
    }
    
    public void control(){
        mv.setAllToRed();
        /**
         * Creating a new instance of a mouse listener
         */
        mouseListener = new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getSource() == mv.serviceOneStart()){
                    //do something
                    //Starting the audio service
                    //m.startService1();
                    m.sendCommand("startAudio");
                    mv.labelOne().setBackground(Color.green);
                }else if(e.getSource() == mv.serviceOneStop()){
                    //do something
                    //Stoping the audio service
                    //m.stopService1();
                    m.sendCommand("stopAudio");
                    mv.labelOne().setBackground(Color.red);
                }else if(e.getSource() == mv.serviceOneLog()){
                    //do something
                }else if(e.getSource() == mv.serviceTwoStart()){
                    //do something
                    //Starting the firewall service
                    //m.startService2();
                    m.sendCommand("startWifi");
                    mv.labelTwo().setBackground(Color.green);
                }else if(e.getSource() == mv.serviceTwoStop()){
                    //do something
                    //Stoping the firewall service
                    m.sendCommand("stopWifi");
                    //m.stopService2();
                    mv.labelTwo().setBackground(Color.red);
                }else if(e.getSource() == mv.serviceTwoLog()){
                    //do something
                }else if(e.getSource() == mv.serviceThreeStart()){
                    //do something
                    //Starting the wifi service
                    //m.startService3();
                    m.sendCommand("startFirewall");
                    mv.labelThree().setBackground(Color.green);
                }else if(e.getSource() == mv.serviceThreeStop()){
                    //do something
                    //Stoping the wifi service
                    //m.stopService3();
                    m.sendCommand("stopFirewall");
                    mv.labelThree().setBackground(Color.red);
                }else if(e.getSource() == mv.serviceThreeLog()){
                    //do something
                }else if(e.getSource() == mv.serviceFourStart()){
                    //do something
                    //Start the windows update seervice
                    //m.startService4();
                    m.sendCommand("startWindowsUpdate");
                    mv.labelFour().setBackground(Color.green);
                }else if(e.getSource() == mv.serviceFourStop()){
                    //do something
                    //Stoping the windows update service
                    //m.stopService4();
                    m.sendCommand("stopWindowsUpdate");
                    mv.labelFour().setBackground(Color.red);
                }else if(e.getSource() == mv.serviceFourLog()){
                    System.out.println("Explanation");
                    //do something
                }else if(e.getSource() == mv.serviceFiveStart()){
                    //do something
                    mv.labelFive().setBackground(Color.green);
                }else if(e.getSource() == mv.serviceFiveStop()){
                    //do something
                    mv.labelFive().setBackground(Color.red);
                }else if(e.getSource() == mv.serviceFiveLog()){
                    //do something
                }else if(e.getSource() == mv.newConnectionBtn()){
                    //do something
                    cv.setVisible(true);
        /**/    }
                /**
                 * This function starts a server for others to listen to it
                 */
                else if(e.getSource() == cv.startServerBtn()){
                    if(m.startServer(Integer.parseInt(cv.getOpenPort().getText()))){
                        JOptionPane.showMessageDialog(cv, "Successfully Created A Network", "Remote Connection", 1);
                    }else{
                        JOptionPane.showMessageDialog(cv, "Failed to create a service", "Remote Connection", 1);
                    }
                }
                /**
                 * This part of the code allows the client to control the services of a server
                 */
                else if(e.getSource() == cv.connectButton()){
                    String remoteIp = cv.getIp().getText();
                    int remotePort;
                    if(cv.getConnectPort().getText().equals("")){
                        JOptionPane.showMessageDialog(cv, "Please Enter A Port Number", "Error", 1);
                    }else{
                        remotePort = Integer.parseInt(cv.getConnectPort().getText());
                        if(m.connectToRemote(remoteIp,remotePort)){
                            JOptionPane.showMessageDialog(cv, "Successfully Connected", "Connected to Remote PC", 1);
                            mv.setVisible(true);
                            cv.dispose();
                        }else{
                            JOptionPane.showConfirmDialog(cv, "Failed to Connect Please Try Again", "Failed", 1);
                        }
                    }
                    
                    
                }
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
               
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        };
        
        /**
         * Adding the mouselisteners to the various elements in the different views
         */
        
        mv.serviceOneStart().addMouseListener(mouseListener);
        mv.serviceTwoStart().addMouseListener(mouseListener);
        mv.serviceThreeStart().addMouseListener(mouseListener);
        mv.serviceFourStart().addMouseListener(mouseListener);
        mv.serviceFiveStart().addMouseListener(mouseListener);
        mv.serviceOneStop().addMouseListener(mouseListener);
        mv.serviceTwoStop().addMouseListener(mouseListener);
        mv.serviceThreeStop().addMouseListener(mouseListener);
        mv.serviceFourStop().addMouseListener(mouseListener);
        mv.serviceFiveStop().addMouseListener(mouseListener);
        mv.serviceOneLog().addMouseListener(mouseListener);
        mv.serviceTwoLog().addMouseListener(mouseListener);
        mv.serviceThreeLog().addMouseListener(mouseListener);
        mv.serviceFourLog().addMouseListener(mouseListener);
        mv.serviceFiveLog().addMouseListener(mouseListener);
        mv.newConnectionBtn().addMouseListener(mouseListener);
        
        /** adding mouselisteners to elements in connect view **/
        cv.startServerBtn().addMouseListener(mouseListener);
        cv.connectButton().addMouseListener(mouseListener);
        
        
    }
   
}
