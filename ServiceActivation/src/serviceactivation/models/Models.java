/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceactivation.models;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author israelagyeman-prempeh
 * This is where models and operations go
 */
public class Models {
    String hostIp;
    Socket sock;
    PrintWriter pout;
    int port;
    String cmd = "waiting";
    /**
     * A function to connect to a remote pc
     * @param hostIp
     * @param port
     * @return 
     */
    public boolean connectToRemote(String hostIp,int port){
        this.hostIp = hostIp;
        this.port = port;
        boolean status = false;
        try {
            status = true;
            sock = new Socket(hostIp,port);    
 
            /* Reading the Date from another pc via socket */
            
            pout = new PrintWriter(sock.getOutputStream(),true);
                    pout.println("Connected");
                    sock.close();
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return status;
    }
    /**
     * A function to start a server for other to listen to 
     * @param port
     * @return 
     */
   public boolean startServer(int port){

        boolean status = false;
       try {
      ServerSocket sock = new ServerSocket(port);
      
      /* now listen for connections */
      while (true) {
        Socket client = sock.accept();
        InputStream in = client.getInputStream();
         BufferedReader bin = new
        BufferedReader(new InputStreamReader(in));
      
      /* read the date from the socket */
      String line;
      while ( (line = bin.readLine()) != null){
        System.out.println(line);
        cmd=line;
      }
      if(cmd.equals("startAudio")){
        startService1();
      }
      else if(cmd.equals("stopAudio")){
          stopService1();
      }
      else if(cmd.equals("startWifi")){
          startService2();
      }
      else if(cmd.equals("stopWifi")){
          stopService2();
      }
      else if(cmd.equals("startFirewall")){
          startService3();
      }
      else if(cmd.equals("stopFirewall")){
          stopService3();
      }
      else if(cmd.equals("startWindowsUpdate")){
          startService4();
      }
      else if(cmd.equals("stopWindowUpdate")){
          stopService4();
      }
      else{
          System.err.print("Error!");
      }
   
      /* close the socket and resume */
      /* listening for connections */
      client.close();
      }
    }
    catch (IOException ioe) {
      System.err.println(ioe);
    }
           /**
            * TODO actions 
            */
        return status;
    }
   
   /**
    * This function receives click functions and sends command
    * @param cmd
    * @return 
    */
   public boolean sendCommand(String cmd){
        boolean status = false;
        try {
            status = true;
            sock = new Socket(hostIp,port); 
            /* Reading the Date from another pc via socket */
            
            PrintWriter pout = new PrintWriter(sock.getOutputStream(),true);
                    pout.println(cmd);
                    sock.close();
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return status;
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
