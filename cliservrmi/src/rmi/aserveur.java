/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rmi;

//import com.sun.org.apache.xml.internal.utils.StopParseException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.ServerNotActiveException;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.JFrame;

import javax.swing.JOptionPane;

//import sun.java2d.Disposer;

/**
 *
 * @author PC
 */
public class aserveur extends UnicastRemoteObject implements servinterface {

    public aserveur() throws RemoteException{
    }

    
    

    
    
    public void exe (String d){
            try{
        
       servinterface abc = new aserveur();
        LocateRegistry.createRegistry(Integer.parseInt(d));
         Naming.rebind("rmi://127.0.0.1:"+d+"/servinterface", abc);
        System.out.println("server is ready .");
    }catch(Exception e){
        System.out.println(" server failed:"+e);
         JOptionPane.showMessageDialog(new JFrame(), "LE SERVEUR N'EST PAS CONNECTER");
    }
    }

    
    

    @Override
    public double inter(double a, double b) throws RemoteException, ServerNotActiveException {
double result = 0;

System.out.println("ggggggggg   "+a);

try {
result = a* b;
    System.out.println("weeeeeeeeeeeeeeee");
    

    
  Serv.it.add(result);
  System.out.println("sise00 :"+Serv.it.size());
}
          catch(Exception e){
              System.out.println("llllllllllllllaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa:"+e);
          }
return result;
    }

    @Override
    public double somme(String c) throws RemoteException, ServerNotActiveException {
double som=0;
try {

    System.out.println("sise :"+Serv.it.size());
    for (int i = 0; i < Serv.it.size(); i++) {
     som=Double.parseDouble(Serv.it.get(i).toString())+som;   
    }
 
  
}
          catch(Exception e){
              System.out.println("llllllllllaaaa:"+e);
          }
return som;

    }

  


    
}
        
    
    
    
    
    
    
    

