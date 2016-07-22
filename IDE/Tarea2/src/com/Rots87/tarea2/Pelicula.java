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
public class Pelicula {
  private String titulo;
  private String genero;
  private String creador;
  private short año;
  private short duracion; //en minutos
  private boolean visto;

  public Pelicula(){
    //Constructor por default
  }

  public Pelicula(String titulo, String genero){
    //Segundo constructor
    this.creador = null;
    this.año = 0;
    this.duracion = 0;
    this.visto = false;
  }

  public Pelicula(String titulo, String genero, String creador, short año, short duracion){
    //Tercer constructor
    this.visto = false;//No dice que lo creemos pero por logica asumo que es la mejor forma de iniciar el objeto en este contructor
  }

  public String getTitulo(){
    return this.titulo;
  }

  public String getGenero(){
    return this.genero;
  }

  public String getCreador(){
    return this.creador;
  }

  public short getAño(){
    return this.año;
  }

  public short getDuracion(){
    return this.duracion;
  }

  public void setTitulo(String titulo){
    this.titulo = titulo;
  }

  public void setGenero(String genero){
    this.genero = genero;
  }

  public void setCreador(String creador){
    this.creador = creador;
  }

  public void setAño(short año){
    this.año = año;
  }

  public void setDuracion(short  duracion){
    this.duracion = duracion;
  }
  
  @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
  
}
