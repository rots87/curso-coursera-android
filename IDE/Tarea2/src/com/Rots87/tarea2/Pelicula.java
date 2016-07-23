/*
 * The MIT License
 *
 * Copyright 2016 Rots87
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.Rots87.tarea2;

/**
 *
 * @author SOPORTE-T
 */
public class Pelicula extends Programa{
    
  private short año;
  private short duracion; //en minutos
  


  public Pelicula(){
    //Constructor por default
  }

  public Pelicula(String titulo, String genero){
    //Segundo constructor
    super(titulo,genero);
    this.año = 0;
    this.duracion = 0;
  }

  public Pelicula(String titulo, String genero, String creador, short año, short duracion){
    //Tercer constructor
    super(titulo,genero,creador);
    this.año = año;
    this.duracion = duracion;
    
  }

  public short getAño(){
    return this.año;
  }

  public short getDuracion(){
    return this.duracion;
  }



  public void setAño(short año){
    this.año = año;
  }

  public void setDuracion(short  duracion){
    this.duracion = duracion;
  }
  
  @Override
    public String toString() {
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("año: " + this.año);
        System.out.println("Genero: " + this.getGenero());
        System.out.println("Director: "+this.getCreador());
        System.out.println("Visto: "+this.isVisto());
        System.out.println("Duracion: "+this.duracion);
        return "";
    }
  
}
