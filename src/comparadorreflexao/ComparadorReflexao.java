/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadorreflexao;

import java.util.List;

/**
 *
 * @author Admin
 */
public class ComparadorReflexao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Pessoa p = new Pessoa("Claucio", "Zitha", 27, "Programmer");
        Pessoa p1 = new Pessoa("Claucio", "Zitha", 26, "Reseacher");
        
        List<Diferenca> difs = Comparador.comparar(p, p1);
        
        difs.forEach(System.out::println);
    }
    
}
