/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rmi;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.ServerNotActiveException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class client {
    
public double exe_client (double a,double b,String u,String ee) throws NotBoundException, MalformedURLException, RemoteException, ServerNotActiveException{
     
  double v = 0 ;  
    
System.out.println("ccccccccc "+u+"  eeee "+ee);
servinterface lp=(servinterface) Naming.lookup("rmi://"+u+":"+ee+"/servinterface");
System.out.println("ddddddddddddd ");

 v=   lp.inter(a, b);
 

    
   return v;
}
public double exe_cli_somme (String c,String u,String ee) throws NotBoundException, MalformedURLException, RemoteException, ServerNotActiveException{
     
  double v = 0 ;  
    
System.out.println("ccccccccc "+u+"  eeee "+ee);
servinterface lp=(servinterface) Naming.lookup("rmi://"+u+":"+ee+"/servinterface");
System.out.println("ddddddddddddd ");

 v=   lp.somme(c);
 

    
   return v;
}
    
public static void main(String[] argv) {
    
}
}
