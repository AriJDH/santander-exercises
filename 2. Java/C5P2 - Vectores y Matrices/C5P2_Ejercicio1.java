package C5P2;

public class C5P2_Ejercicio1 {
    public static void main(String[] args) {

        double minimaTemperatura=999999.9999;
        double maximaTemperatura=-999999.9999;
        int indiceMinimo=0;
        int indiceMaximo=0;

        String ciudades[] ={"Londres","Madrid","Nueva York","Buenos Aires","Asunción",
                "San Pablo","Lima","Santiago de Chile","Lisboa","Tokio"};


        int temperaturas[][] = {{-2,33},{-3,32},{-8,27},{4,37},{6,42},{5,43},{0,39},{-7,26},{-1,31},{-10,35}};


        for(int f=0;f< temperaturas.length;f++){
            if(temperaturas[f][0] < minimaTemperatura){
                minimaTemperatura= temperaturas[f][0];
                indiceMinimo=f;
            }
            if(temperaturas[f][1] > maximaTemperatura){
                maximaTemperatura= temperaturas[f][1];
                indiceMaximo=f;
            }
        }


        System.out.println("La mínima temperatura la tuvo " + ciudades[indiceMinimo] +
                        " con " + minimaTemperatura + "°");
        System.out.println("La máxima temperatura la tuvo " + ciudades[indiceMaximo] +
                " con " + maximaTemperatura + "°");



    }
}
