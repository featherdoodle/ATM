/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mybankmachine;

import java.util.Scanner;

/**
 *
 * @author SyBye8898
 */
public class MyBankMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("What is your bank?");
        String bankName = scanner.nextLine();
        System.out.println("What is your balance?");
        int currentBalance = scanner.nextInt();
        
        ATM atm = new ATM(bankName, currentBalance);
        
        atm.menu();
        
        
    }     
}
    

