/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
/**
 *
 * @author Nikesh
 */
public class Reverse {

    static String reverseWords(String str) 
    { 
  
   
        Pattern pattern = Pattern.compile("\\s"); 
  
     
        String[] temp = pattern.split(str); 
        String result = ""; 
  
     
        for (int i = 0; i < temp.length; i++) { 
            if (i == temp.length - 1) 
                result = temp[i] + result; 
            else
                result = " " + temp[i] + result; 
        } 
        return result; 
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String word = JOptionPane.showInputDialog(null,"Enter A Sentence"); 
        System.out.println(reverseWords(word)); 
    }
    
}
