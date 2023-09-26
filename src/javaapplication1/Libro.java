/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author ESTUDIANTE
 */
class Libro {
    private String titulo;
    private Autor autor;
    private Editorial editorial;
    private Libro enciclopedia; //una enciclopedia es un libro de esa manera hace relacion reflexiva 

    public Libro(String titulo, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        
       
        this.autor = autor;
        this.editorial = editorial;
      
        
    }
public Libro getEnciclopedia() {
        return enciclopedia;
    }

    public void setEnciclopedia(Libro enciclopedia) {
        this.enciclopedia = enciclopedia;
    }
    
    public Autor getAutor() {
        return autor;
    }

    
public String getTitulo() {
        return titulo;
        }


    public Editorial getEditorial() {
        return editorial;
    }

    }

    
   