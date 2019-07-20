/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showbitsdemo;

/**
 *
 * @author Dell
 */
public class ShowBitsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);
        
        System.out.println("123 в двоичном представлении: ");
        b.show(123);
        System.out.println("\n87987 в двоичном представлении: ");
        i.show(87987);
        System.out.println("\n237658768 в двоичном представлении: ");
        li.show(237658768);
        
        //Можно также отобразить сладшие разряды любого целого числа
        System.out.println("\nМладшие 8 битов числа 87987 "
                + "в двичном представлении: ");
        b.show(87987);
    }
    
}
