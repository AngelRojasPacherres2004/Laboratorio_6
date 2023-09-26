/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author ESTUDIANTE
 */
public class Reporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Autor autor = new Autor("Juan y pedro"); 

        
        Editorial editorial = new Editorial("La Paz");

         Libro enciclopedia = new Libro("enciclopedia Miguel de Cervantes", autor, editorial);
        
       

        Libro libro = new Libro("Don Quijote", autor, editorial);

        
   libro.setEnciclopedia(enciclopedia);
        
// Mostrar el reporte
        System.out.println("Titulo del libro: " + libro.getTitulo());
        System.out.println("Nombre  del autor: " + libro.getAutor().getNombreEditorial());
        System.out.println("Nombre de la editorial del libro: " + libro.getEditorial().getNombreEditorial());
       if (libro.getEnciclopedia() != null) {
            System.out.println("Nombre de la enciclopedia relacionada: " + libro.getEnciclopedia().getTitulo());
        }

    }
    }
    

