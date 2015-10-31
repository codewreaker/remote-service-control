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
        mv.setVisible(true);
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
                    mv.labelOne().setBackground(Color.green);
                }else if(e.getSource() == mv.serviceOneStop()){
                    //do something
                    mv.labelOne().setBackground(Color.red);
                }else if(e.getSource() == mv.serviceOneLog()){
                    //do something
                }else if(e.getSource() == mv.serviceTwoStart()){
                    //do something
                    mv.labelTwo().setBackground(Color.green);
                }else if(e.getSource() == mv.serviceTwoStop()){
                    //do something
                    mv.labelTwo().setBackground(Color.red);
                }else if(e.getSource() == mv.serviceTwoLog()){
                    //do something
                }else if(e.getSource() == mv.serviceThreeStart()){
                    //do something
                    mv.labelThree().setBackground(Color.green);
                }else if(e.getSource() == mv.serviceThreeStop()){
                    //do something
                    mv.labelThree().setBackground(Color.red);
                }else if(e.getSource() == mv.serviceThreeLog()){
                    //do something
                }else if(e.getSource() == mv.serviceFourStart()){
                    //do something
                    mv.labelFour().setBackground(Color.green);
                }else if(e.getSource() == mv.serviceFourStop()){
                    //do something
                    mv.labelFour().setBackground(Color.red);
                }else if(e.getSource() == mv.serviceFourLog()){
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
        /**/    }else if(e.getSource() == cv.newConnection()){
                    //do something
                }else if(e.getSource() == cv.connectButton()){
                    //do something
                }else if(e.getSource() == cv.cancel()){
                    //do something
                    cv.dispose();
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
        cv.newConnection().addMouseListener(mouseListener);
        cv.connectButton().addMouseListener(mouseListener);
        cv.cancel().addMouseListener(mouseListener);
        
        
    }
   
}
