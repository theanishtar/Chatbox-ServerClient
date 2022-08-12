/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author dangt
 */
public class Bai1Client {
    public static void main(String[] args) {
        try{
            System.out.println("Client is Connecting....");
            Socket s = new Socket("localhost",8888);
            System.out.println("Client is Connect");
            DataOutputStream out = new DataOutputStream(
            s.getOutputStream());
            DataInputStream intput = new DataInputStream(
            s.getInputStream()
            );
            while(true){
                System.out.println("Nhap so thu 1: ");
                out.writeDouble(new Scanner(System.in).nextDouble());
                out.flush();
                System.out.println("Nhap so thu 2: ");
                out.writeDouble(new Scanner(System.in).nextDouble());
                out.flush();
                System.out.println("Tong 2 so: "+intput.readDouble());
                System.out.println("Tiep tuc (y/n): ");
                String traloi = new Scanner(System.in).nextLine();
                if(traloi.equalsIgnoreCase("n")||traloi.equalsIgnoreCase("N")){
                    break;
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
