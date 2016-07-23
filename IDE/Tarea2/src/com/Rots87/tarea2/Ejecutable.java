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
public class Ejecutable {
    public static void main (String[] args){
        Pelicula[] arrayPeli = new Pelicula[5];
        Serie[] arraySerie = new Serie[5];
        
        //Inicializacion de Arrays
        arrayPeli[0] = new Pelicula();
        arrayPeli[1] = new Pelicula("Pelicula 1", "Accion");
        arrayPeli[2] = new Pelicula();
        arrayPeli[3] = new Pelicula("Pelicula 3","Comedia");
        arrayPeli[4] = new Pelicula("Pelicula 4","Drama","Steven",(short)1992,(short)120);
        
        arraySerie[0] = new Serie();
        arraySerie[1] = new Serie();
        arraySerie[2] = new Serie();
        arraySerie[3] = new Serie();
        arraySerie[4] = new Serie();
        
        //Fin de la inicializacion de arrays
}
}