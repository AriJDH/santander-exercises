
public class Array {
    public static void main(String[] args){
        String ciudades[] = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asuncion", "Sao Paulo", "Lima", "Santiago de Chile",
        "Lisboa", "Tokio"};
        int indiceCiudadBaja= 0;
        int indiceCiudadAlta= 0;
        //areglo
        int temperaturas[][] = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26},
                {-1, 31}, {-10, 35}};
        //temperatura
        int temperaturaBaja= temperaturas[0][0];
        int temperaturaAlta= temperaturas[0][1];

        for(int f=0; f<temperaturas.length; f++) {
            if(temperaturaAlta<temperaturas[f][1]){
                temperaturaAlta=temperaturas[f][1];
                indiceCiudadAlta= f;
            }

            if(temperaturaBaja>temperaturas[f][0]){
                temperaturaBaja=temperaturas[f][0];
                indiceCiudadBaja= f;
            }



        }

        System.out.println("la teperatura mas alta es de: " + ciudades[indiceCiudadAlta] + " y es de: " + temperaturaAlta);
        System.out.println("la teperatura mas baja es de: " + ciudades[indiceCiudadBaja] + " y es de: " + temperaturaBaja);






    }



}
