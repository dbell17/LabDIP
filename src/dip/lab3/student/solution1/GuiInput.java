/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author Don
 */
public class GuiInput implements MessageInput{
    private String str = "";
    private String msg = " the text you have entered is ";
    @Override
    public void copyMessage() {
        str = JOptionPane.showInputDialog("Enter the text to be output");
        

    }

    @Override
    public void writeMessage() {
        JOptionPane.showMessageDialog(null, msg + str);
    }
}
