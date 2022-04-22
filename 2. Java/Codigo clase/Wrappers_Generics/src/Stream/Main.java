package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Persona> nombres= new ArrayList<>();
        nombres.add(new Persona("Juan"));
        nombres.add(new Persona("dsd"));
        nombres.add(new Persona("Juan"));
        nombres.add(new Persona("Asd"));

        System.out.println(nombres.stream().filter((persona) -> persona.getNombre().equals("Asd")).collect(Collectors.toList()));

        //Las dos cosas hace lo mismo
        nombres.forEach((persona) -> System.out.println(persona));
        nombres.forEach(System.out::println);
    }
}
