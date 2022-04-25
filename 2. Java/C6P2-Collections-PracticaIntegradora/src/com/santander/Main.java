package com.santander;


public class Main {
    public static void main(String[] args) {
        //Inscripción de participantes a una categoria (3 listas)
        Inscripcion inscripcion = new Inscripcion();
        int id = 1;
        Participante par1 = new Participante(657843298,"Anggie","Miranda",23,1165397113,1165397113,"A+",1);
        inscripcion.inscribir(par1,id++);

        Participante par2 = new Participante(657843298,"Anggie","Miranda",45,1165397113,1165397113,"A+",2);
        inscripcion.inscribir(par2,id++);

        Participante par3 = new Participante(657843298,"Anggie","Miranda",12,1165397113,1165397113,"A+",1);
        inscripcion.inscribir(par3,id++);

        Participante par4 = new Participante(657843298,"Anggie","Miranda",18,1165397113,1165397113,"A+",2);
        inscripcion.inscribir(par4,id++);

        Participante par5 = new Participante(657843298,"Anggie","Miranda",48,1165397113,1165397113,"A+",2);
        inscripcion.inscribir(par5,id++);

        Participante par6 = new Participante(657843298,"Anggie","Miranda",34,1165397113,1165397113,"A+",3);
        inscripcion.inscribir(par6,id++);

        Participante par7 = new Participante(657843298,"Anggie","Miranda",23,1165397113,1165397113,"A+",3);
        inscripcion.inscribir(par7,id++);

        Participante par8 = new Participante(657843298,"Anggie","Miranda",19,1165397113,1165397113,"A+",3);
        inscripcion.inscribir(par8,id++);

        Participante par9 = new Participante(657843298,"Anggie","Miranda",21,1165397113,1165397113,"A+",2);
        inscripcion.inscribir(par9,id++);

        Participante par10 = new Participante(657843298,"Anggie","Miranda",89,1165397113,1165397113,"A+",1);
        inscripcion.inscribir(par10,id++);

        //Mostrar todos los inscriptos a una determinada categoría (datos y número de inscripción)
        System.out.println("------------------------------------------------------------");
        System.out.println("CIRCUITO CHICO");
        for (Participante par: inscripcion.getCircuito_chico()) {
            System.out.println(par);
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("CIRCUITO MEDIO");
        for (Participante par: inscripcion.getCircuito_medio()) {
            System.out.println(par);
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("CIRCUITO AVANZADO");
        for (Participante par: inscripcion.getCircuito_avanzado()) {
            System.out.println(par);
        }
        //Desinscribir a un participante de una categoría
        System.out.println("Elimino al primer participante.");
        inscripcion.desinscripcion(par1);
        System.out.println("Verifico si se elimino.");
        for (Participante par: inscripcion.getCircuito_chico()) {
            System.out.println(par);
        }

        //Calcular el monto recaudado por cada categoria y el total de toda la carrera
        int m1 = inscripcion.recaudado_por_categoria(1);
        System.out.println("Recaudado por el CIRCUITO CHICO : " + m1);
        int m2 = inscripcion.recaudado_por_categoria(2);
        System.out.println("Recaudado por el CIRCUITO MEDIO : "+ m2);
        int m3 = inscripcion.recaudado_por_categoria(3);
        System.out.println("Recaudado por el CIRCUITO AVANZADO: " + m3);

        int suma = m1+m2+m3;
        System.out.println("Total recaudado por toda la carrera: "+ suma);

    }
}
