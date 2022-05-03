package HornerSchema;

public class HornerSchema {
    /**
     @param Ac: die Koeffizienten
     @param Ax: die Stützstellen
     @param x: ein einfacher Punkt (statt ein Vektor)
     */
    public static double horner(double[] Ac, double[] Ax, double x){
        double y = 1;
        for (int i = Ac.length - 1; i >= 0; i--){
            y *= (x - Ax [i]) + Ac [i];
        }
        return y;
    }

    public static void main(String[] args) {
        double[] Ac = {1, 2, 3, 4};
        double[] Ax = {1, 2, 3, 4};
        double x = 1;
        System.out.println(horner(Ac, Ax, x));
    }

}
