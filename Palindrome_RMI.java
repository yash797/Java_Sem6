// Client class 

package Mypackage;

import java.rmi.Naming;
import java.rmi.*;

public class Client {
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        PrintI obj1 = (PrintI) Naming.lookup("rmi://localhost:5000/SHOWMSG");
        // obj1.printmsg();
        obj1.checkPass();
    }
}
// Server class
package Mypackage;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        Registry registry = LocateRegistry.createRegistry(5000);
        printC obj = new printC();
        registry.bind("SHOWMSG", obj);
        System.out.println("Server Started");
    }
}

// Printc.java

package Mypackage;

import java.util.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class printC extends UnicastRemoteObject implements PrintI {
    Scanner sc = new Scanner(System.in);

public printC() 
		throws RemoteException {
// TODO Auto-generated constructor stub
super();
}

@Override
public void printmsg() throws RemoteException {
// TODO Auto-generated method stub
String s;
System.out.println("Enter the String");
s=sc.next();
int n=s.length();
int flag=0;
for(int i=0;i<n/2;i++)
{
if(s.charAt(i)!=s.charAt(n-i-1))
{
flag=1;
break;
}
}
if(flag==1)
{
System.out.println("Not a Palindrome");
}
else
{
System.out.println("Given string is a Palindrome");
}
}

@Override
public void checkPass() throws RemoteException {
String pass;
String ref="dspitct";
System.out.println("Enter the password");
pass=sc.next();
pass="dspitct";
if(pass==ref)
{
System.out.println("Welcome");
}
else
{
System.out.println("Please Enter valid password");
}
}
}

// printi.java
package Mypackage;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PrintI extends Remote {
    public void printmsg() throws RemoteException;

    public void checkPass() throws RemoteException;
}