/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingpractice;

import java.util.Scanner;

/**
 *
 * @author irene
 */
public class TestingPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter password");
        Scanner sc = new Scanner(System.in); 
    }
    
    //length >=8 
    public boolean checkLength(String password){
        
        if(password.length() >= 8){
            return true; 
        }
        
        return false; 
    }
    
    //uppercase 
    public boolean checkUpperCase(String password){
        for(int i = 0; i < password.length(); i++){
            if(Character.isUpperCase(password.charAt(i))){
                return true; 
            }
        }
        return false;   
    }
    
    //special character 
    public boolean checkSpecial(String password){
        for(int i = 0; i < password.length(); i++){
            if(!Character.isLetterOrDigit(password.charAt(i))){
                return true; 
            }
        }
        return false; 
    }
    
}
