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
 * @author SOPORTE-T
 */
public class Serie extends Programa{

    private byte noTemporadas = 1;
    private short duracion; // Duracion es en minutos
    
    public Serie(){
        //Constructtor por defecto
        
    }
    
    public Serie(String titulo, String creador, boolean visto){
        //Segundo constructor
        super(titulo,creador,visto);
    }
    
    public Serie(String titulo, String creador, byte noTemporadas, String genero, short duracion){
         //tercer constructor
        super(titulo,creador,genero);
        this.noTemporadas = noTemporadas;
        this.duracion = duracion;
    }



    public byte getNoTemporadas() {
        return noTemporadas;
    }

  


    public short getDuracion() {
        return duracion;
    }



    public void setNoTemporadas(byte noTemporadas) {
        this.noTemporadas = noTemporadas;
    }



    public void setDuracion(short duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("noTemporadas: " + this.noTemporadas + " Temporadas");
        System.out.println("Genero: " + this.getGenero());
        System.out.println("Director: "+this.getCreador());
        System.out.println("Visto: "+this.isVisto());
        System.out.println("Duracion: "+this.duracion);
        System.out.println("Tiempo Visto: "+this.tiempoVisto());
        return "";
    }
    
    
}
