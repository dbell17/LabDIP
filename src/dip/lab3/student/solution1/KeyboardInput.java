/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author Don
 */
public class KeyboardInput implements MessageInput {

    Scanner keyboard = new Scanner(System.in);
    public static String str = "";

    @Override
    public void copyMessage() {
        System.out.println("Enter the text to be output");
        str = keyboard.nextLine();

    }

    @Override
    public void writeMessage() {
        System.out.println(" the text you have entered is " + KeyboardInput.str);
    }
}
