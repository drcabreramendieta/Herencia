/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author hola
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro perro = new Perro();
        perro.setColor("negro");
        
        Gato gato = new Gato();
        gato.setEdad(10);
        
        Animal animal = new Animal();
        animal.setPeso(20);
    }
    
}
