/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author dangt
 */
public class Bai1Server {
    public static void main(String[] args) {
        try{
           ServerSocket s = new ServerSocket(8888);
            System.out.println("Server is connecting....");
            Socket sk = s.accept();
            System.out.println("Server is connect");
             DataInputStream intput = new DataInputStream(
            sk.getInputStream()
            );
             DataOutputStream out = new DataOutputStream(
            sk.getOutputStream());
             while(true){
                 double n1 = intput.readDouble();
                 double n2 = intput.readDouble();
                 System.out.println("2 so nhan duoc tu Client la: "+n1+" "+n2);
                 double sum = n1 + n2;
                 out.writeDouble(sum);
                 out.flush();
                 System.out.println("Tong 2 so la: "+ sum);
             }
           
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
