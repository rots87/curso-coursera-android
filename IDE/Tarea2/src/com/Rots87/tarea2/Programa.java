/*
 * The MIT License
 *
 * Copyright 2016 Rots87.
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
 * @author Rots87.
 */
public class Programa {
  private String titulo;
  private String genero;
  private String creador;
  private boolean visto;

  public Programa(){
      this.visto = false;
  }
  
 /* public Programa(){
  
  }*/
  
  public Programa(String titulo, String genero){
      this.titulo = titulo;
      this.genero = genero;
      this.creador = null;
      this.visto = false;
  }
  
  public Programa(String titulo, String genero, String creador){
      this.titulo = titulo;
      this.genero = genero;
      this.creador = creador;
      this.visto = false;
  }
  
    public Programa(String titulo, String creador, boolean visto){
      this.titulo = titulo;
      this.genero = null;
      this.creador = creador;
      this.visto = visto;
  }
  
    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }
  
  
}
