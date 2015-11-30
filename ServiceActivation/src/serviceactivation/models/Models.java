/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceactivation.models;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author israelagyeman-prempeh
 * This is where models and operations go
 */
public class Models {
    
    /**
     * A sample function that returns a String saying prophet is awesome
    */
    public boolean connect(){
        return true;
    }
    
    public void startService1(){
        try{
            Process process = Runtime.getRuntime().exec(new String[] {"cmd.exe", "/C", "C:\\Program Files\\bat\\startaudio.lnk"});
        }
         catch (Exception ex) {
         System.out.println("Exception on new process: " + ex);
        }
    }
    
    public void startService2(){
        try{
            Process process = Runtime.getRuntime().exec(new String[] {"cmd.exe", "/C", "C:\\Program Files\\bat\\startfirewall.lnk"});
        }
         catch (Exception ex) {
         System.out.println("Exception on new process: " + ex);
        }
    }
    
    public void startService3(){
        try{
            Process process = Runtime.getRuntime().exec(new String[] {"cmd.exe", "/C", "C:\\Program Files\\bat\\startwifi.lnk"});
        }
         catch (Exception ex) {
         System.out.println("Exception on new process: " + ex);
        }
    }
    
        public void startService4(){
        try{
            Process process = Runtime.getRuntime().exec(new String[] {"cmd.exe", "/C", "C:\\Program Files\\bat\\startwindowsupdate.lnk"});
        }
         catch (Exception ex) {
         System.out.println("Exception on new process: " + ex);
        }
    }
    
        public void stopService1(){
        try{
            Process process = Runtime.getRuntime().exec(new String[] {"cmd.exe", "/C", "C:\\Program Files\\bat\\stopaudio.lnk"});
        }
         catch (Exception ex) {
         System.out.println("Exception on new process: " + ex);
        }
    }
    
    public void stopService2(){
        try{
            Process process = Runtime.getRuntime().exec(new String[] {"cmd.exe", "/C", "C:\\Program Files\\bat\\stopfirewall.lnk"});
        }
         catch (Exception ex) {
         System.out.println("Exception on new process: " + ex);
        }
    }
    
    public void stopService3(){
        try{
            Process process = Runtime.getRuntime().exec(new String[] {"cmd.exe", "/C", "C:\\Program Files\\bat\\stopwifi.lnk"});
        }
         catch (Exception ex) {
         System.out.println("Exception on new process: " + ex);
        }
    }
    
        public void stopService4(){
        try{
            Process process = Runtime.getRuntime().exec(new String[] {"cmd.exe", "/C", "C:\\Program Files\\bat\\stopwindowsupdate.lnk"});
        }
         catch (Exception ex) {
         System.out.println("Exception on new process: " + ex);
         System.out.println("kay");
        }
    }
}
