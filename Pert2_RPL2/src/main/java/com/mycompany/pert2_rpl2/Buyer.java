/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert2_rpl2;

/**
 *
 * @author hp
 */
public class Buyer extends User{
    
    @Override
    public void login() {
        System.out.println("Buyer melakukan Login");
    }
    
    public void logout() {
        System.out.println("Buyer melakukan logout");
    }
}
