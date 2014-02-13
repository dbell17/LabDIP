/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3.student.solution1;

/**
 *
 * @author Don
 */
public class StartUp {
    public static void main(String[] args) {
        
    
    MessageInput keyboard1 = new KeyboardInput();
    MessageService key1 = new MessageService();
    key1.produceMessage(keyboard1);
    
    MessageService key2 = new MessageService();
    MessageInput gui1 = new GuiInput();
    key2.produceMessage(gui1);
    }
}
