package com.ejercicio.ejercicio.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Convertidor {

    private final int I = 1;
    private final int V = 5;
    private final int X = 10;
    private final int L = 50;
    private final int C = 100;
    private final int D = 500;
    private final int M = 1000;


    @GetMapping(path = "/{num}")
    public String convertir(@PathVariable Integer num) {
        String resultadoRomano = "";
        while (num > 0) {
            if (num >= M) {
                resultadoRomano += "M";
                num = num - M;
            } else {
                if (num >= M - C) {
                    resultadoRomano += "CM";
                    num = num - (M - C);
                } else {
                    if (num >= D) {
                        resultadoRomano += "D";
                        num = num - D;

                    } else {
                        if (num >= D - C) {
                            resultadoRomano += "CD";
                            num = num - (D - C);
                        } else {
                            if (num >= C) {
                                resultadoRomano += "C";
                                num = num - C;
                            } else {
                                if (num >= C - X) {
                                    resultadoRomano += "XC";
                                    num = num - (C - X);
                                } else {
                                    if (num >= L) {
                                        resultadoRomano += "L";
                                        num = num - L;
                                    } else {
                                        if (num >= L - X) {
                                            resultadoRomano += "XL";
                                            num = num - (L - X);
                                        } else {
                                            if (num >= X) {
                                                resultadoRomano += "X";
                                                num = num - X;
                                            } else {
                                                if (num >= X - I) {
                                                    resultadoRomano += "IX";
                                                    num = num - (X - I);
                                                } else {
                                                    if (num >= V) {
                                                        resultadoRomano += "V";
                                                        num = num - V;
                                                    } else {
                                                        if (num >= V - I) {
                                                            resultadoRomano += "IV";
                                                            num = num - (V - I);
                                                        } else {
                                                            if (num >= I) {
                                                                resultadoRomano += "I";
                                                                num = num - I;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return resultadoRomano;
    }
}
