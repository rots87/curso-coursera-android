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
package com.Rots87.tarea3;
import java.util.ArrayList;
/**
 *
 * @author SOPORTE-T
 */
public class Ejecutable {
    public static void main (String[] args){
        //Declaracion de Variables
        ArrayList<Pelicula> Peliculas = new ArrayList<Pelicula>();
        Pelicula e = new Pelicula();
        ArrayList<Serie> Series = new ArrayList<>();
        Serie s = new Serie();
        //byte flag = 0;
        //Fin de Declaraciones
        //Inicializacion de ArraysList Peliculas
        e = new Pelicula("Divina Comedia","Dante Allegieri");
        Peliculas.add(e);
        e = new Pelicula();
        Peliculas.add(e);
        e = new Pelicula("Mundo Jurasico", "Accion","Steven S.",(short)1998,(short)120);
        Peliculas.add(e);
        e = new Pelicula();
        Peliculas.add(e);
        e = new Pelicula("Taken 3","Olivier Megaton");
        Peliculas.add(e);
        //Fin de la Inicializacion de Arraylist Peliculas
        //Inicializacion de ArraysList Serie
        s = new Serie("Divina Comedia","Dante Allegieri",false);
        Series.add(s);
        s = new Serie();
        Series.add(s);
        s = new Serie("Mundo Jurasico", "Steven S.",(byte) 3,"Accion",(short)120);
        Series.add(s);
        s = new Serie();
        Series.add(s);
        s = new Serie("Taken 3","Olivier Megaton", false);
        Series.add(s);
        //Fin de la Inicializacion de Arraylist Serie
        //Fin de la inicializacion de arrays
        //Marcar como visto algunas peliculas y series
        e = Peliculas.get(2);
        e.marcarVisto();
        Peliculas.set(2, e);
        e = Peliculas.get(3);
        e.marcarVisto();
        Peliculas.set(3, e);
        
        //Imprimir cuales son las peliculas y series ya vistas

}
}