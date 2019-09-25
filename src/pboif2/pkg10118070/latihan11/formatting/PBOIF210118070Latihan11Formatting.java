/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118070.latihan11.formatting;

/**
 *
 * @author
 * NAMA     : Aufa Ilyasha
 * Kelas    : IF2
 * NIM      : 10118070
 */
public class PBOIF210118070Latihan11Formatting {

    
    public static void main(String[] args) {
        int i=3546764;
        int IMinus= -i;
        System.out.println("i : "+i);
        System.out.printf("%%d : %d %n", i);
        System.out.printf("%%10d: %+10d%n", i);
        System.out.printf("%%+10d : %+10d%n",IMinus);
        System.out.printf("%%,10d : %,10d%n",i);
        System.out.printf("%%,10d : %,-10d%n",i);
        
        
        double f=5675482.982;
        System.out.println("f : "+f);
        System.out.printf("%%f : %f%n",f);
        System.out.printf("%%.2f : %.2f%n",f);
        System.out.printf("%%12.2f : %12.2f%n",f);
                
      
    }
    
}
