/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author ESTUDIANTE
 */
class Autor {  
    private String nombreEditorial;
     private Libro libro;
    

   


public Autor(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    public String getNombreEditorial() {
        
       
return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }
    
    public Libro getLibro() {
        return libro;
    }

    
    public void setLibro(Libro libro) {
        this.libro = libro;
    }
}


    


