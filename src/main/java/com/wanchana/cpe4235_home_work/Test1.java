/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanchana.cpe4235_home_work;

import java.util.Scanner;

/**
 *
 * @author wanchana
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float input;
        System.out.print("Enter number : ");
        input = scan.nextFloat();
        if((input - (int)input) == 0){
            System.out.println("Output : " +(int)input);
        }
        else{
            System.out.println("Output : " +input);
        }
    }
    
}
