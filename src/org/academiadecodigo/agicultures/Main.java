package org.academiadecodigo.agicultures;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Tu que queres?");
        String ip = sc.next();


        System.out.println("InetAddress of Named Host : " + InetAddress.getByName(ip));

        System.out.println("InetAddress of Local Host : " + InetAddress.getLocalHost());

        if(InetAddress.getByName(ip).isReachable(1000)){
            System.out.println("Boa jovem o "+ip+ " esta Top");
            return;
        }
        System.out.println("Belo coco o " +ip+ " nao respondeu");
    }

}
