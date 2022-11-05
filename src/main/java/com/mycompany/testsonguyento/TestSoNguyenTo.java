/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testsonguyento;

/**
 *
 * @author admin
 */
public class TestSoNguyenTo {

    public static void main(String[] args) {
        int[] a = { 2,3,5,7,8,9};
        
        int sum = 0;
        for(int x:a)
            if(Utils.ktNt(x)==true)
                sum += x;
        System.out.println(sum);
    }
}
