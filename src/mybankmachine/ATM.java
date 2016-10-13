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
public class ATM {
    
    int currentBalance;
    String bankName;
    Scanner scanner = new Scanner(System.in);
    
    public ATM(String _bankName, int _currentBalance){
        
        currentBalance = _currentBalance;
        bankName = _bankName;
    }
    
    public void withdrawMoney(){
        int withdrawBalance;
        System.out.println("How much would you like to withdraw?");
        withdrawBalance = scanner.nextInt();
        if(currentBalance >= withdrawBalance){
            currentBalance -= withdrawBalance;
            displayBalance();
        }else{
            System.out.println("You cannot withdraw more than you have. Try again.");
            withdrawMoney();
        }
    }
    
    public void depositMoney(){
        int depositBalance;
        System.out.println("How much would you like to withdraw?");
        depositBalance = scanner.nextInt();
        currentBalance += depositBalance;
        displayBalance();
        
    }
    
    public void displayBalance(){
        
    }
    
    public void addDailyInterest(){
        
    }
    
    public void menu(){
        
        System.out.println("1.\tWithdraw\n2.\tDeposit\n3.\tDisplay Current Balance"
                + "\n4.\tAdd Daily Interest\n5.\tExit");
        
        int choice = scanner.nextInt();
        
        if(choice == 1){
            withdrawMoney();
        }else if(choice == 2){
            depositMoney();
        }else if(choice == 3){
            displayBalance();
        }else if(choice == 4){
            addDailyInterest();
        }else if(choice == 5){
            System.exit(0);
        }else{
            System.out.println("Invalid choice. Please enter an integer between 1 and 6.");
            menu();
        }
    }
    
}
