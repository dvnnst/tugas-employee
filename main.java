/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class main extends employ{
    static Scanner sken = new Scanner (System.in);
    
    
    public static void main(String[] args) {
        System.out.println("Nama:");
        String nama = sken.nextLine();
        System.out.println("NIP: ");
        int nip = sken.nextInt();
        sken.nextLine();
        System.out.println("Jabatan: ");
        String jabat = sken.nextLine();
        bosz bos = new bosz();
        manager mngr = new manager();
        cleanserv cs = new cleanserv();
        intern itsp = new intern();
        int gaj = 0;
        
        if(jabat.equalsIgnoreCase(bos.jabatan)){
            System.out.println("Waktu lama bekerja: ");
            int lKerja = sken.nextInt();
            gaj = bos.hitung(bos.gaji, lKerja);
            System.out.println("Gaji Max: "+bos.gaji);
            
        }
        else if (jabat.equalsIgnoreCase(mngr.jabatan)){
            System.out.println("Waktu lama bekerja: ");
            int lKerja = sken.nextInt();
            gaj = mngr.hitung(mngr.gaji, lKerja);
            System.out.println("Gaji Max: "+mngr.gaji);
        }
        else if (jabat.equalsIgnoreCase(cs.jabatan)){
            System.out.println("Waktu lama bekerja: ");
            int lKerja = sken.nextInt();
            gaj = cs.hitung(cs.gaji, lKerja);
            System.out.println("Gaji Max: "+cs.gaji);
        }
        else if (jabat.equalsIgnoreCase(itsp.jabatan)){
            System.out.println("Waktu lama kerja: ");
            int jKerja = sken.nextInt();
            gaj = itsp.hitung(itsp.gaji, jKerja);
            System.out.println("Gaji Max: "+itsp.gaji);
        }
 
    }
    
}
