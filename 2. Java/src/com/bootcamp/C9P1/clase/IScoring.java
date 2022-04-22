package com.bootcamp.C9P1.clase;

//notacion para indicar que se usa como expresion lambda
@FunctionalInterface
public interface IScoring {
    int calcular(int a, int b);

    //Solo pueden tener un metodo abstracto
}
