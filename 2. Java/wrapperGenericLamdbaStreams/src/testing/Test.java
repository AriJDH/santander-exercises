package testing;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        /*DesdeHasta<Integer,Integer> desdeHastaNumero = new DesdeHasta<>(3,4);
        desdeHastaNumero.setDesde(12);
        desdeHastaNumero.setHasta(14);*/


        /*IScoring scoring;
        scoring= (a,b) -> a+b;
        System.out.println(scoring.calcular(12,15));*/

        ArrayList<Persona> personas= new ArrayList<>();
        personas.add(new Persona("jose"));
        personas.add(new Persona("jose"));
        personas.add(new Persona ("aartin"));
        personas.add(new Persona ("marcos"));
        personas.forEach(persona -> {
            System.out.println(persona);
        });
        Optional<Persona> p1= personas.stream().filter((persona)-> persona.getNombre().equals("jose")).findFirst();
        List<Persona> pers= personas.stream().filter((persona)-> persona.getNombre().equals("jose")).collect(Collectors.toList());
        System.out.println(pers);
        System.out.println(p1);
        pers.forEach(System.out::println);
    }
}
