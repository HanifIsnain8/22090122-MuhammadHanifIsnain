/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarbe;

import java.sql.Connection;

public class Ujikoneksi {
    public static void main(String[] args){
        Connection c = Koneksi.sambung_ke_db();
    }
    
}
