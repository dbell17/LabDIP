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
public class MessageService {
    public void produceMessage(MessageInput t){
    t.copyMessage();
    t.writeMessage();
}
}