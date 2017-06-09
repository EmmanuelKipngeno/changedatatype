/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package changedatatype;

/**
 *
 * @author Manusoft
 */
public class ChangeDatatype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 465;
        char one =' ';
        char two =' ';
        char three=' ';
        
        String x =String.valueOf(n);
        one= x.charAt(0);
        two= x.charAt(1);
        three= x.charAt(2);
        
        System.out.println("Look at me! I have been reversed:");
       System.out.print(three);
       System.out.print(two);
       System.out.println(one);
    }
    
}
