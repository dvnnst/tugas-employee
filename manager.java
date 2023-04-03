/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author ACER
 */
public class manager extends employ {
    String jabatan = "Manager";
    int gaji = 20000000;
    
    int hitung(int gaji, int jKerja){
        int potong = (super.jKerja - jKerja)*super.potong;
        int hasil = gaji - potong;
        return hasil;
    }
}
