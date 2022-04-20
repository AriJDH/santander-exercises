package com.own_exception_test;

public class Main {
    public static void main(String[] args){
        Biblioteca b1= new Biblioteca();
        try{
           Libro l1= b1.prestarLibro();
           System.out.println(l1);
        }catch(Exception e){
            System.out.println("capture mi propia exception juani");
        }finally {
            System.out.println("finally");
        }
    }
}
