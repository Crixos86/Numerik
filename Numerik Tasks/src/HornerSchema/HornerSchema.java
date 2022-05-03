package HornerSchema;
public class HornerSchema {


    static int horner(int polynom[], int n, int x)
    {
        // Initialize result
        int result = polynom[0];

        // Evaluate value of polynomial using Horner's method

        for (int i=1; i<n; i++)
            result = result*x + polynom[i];

        return result;
    }


    public static void main (String[] args)
    {
        // Example: f(x) = 3x⁴-11x³-12x+14
        // Question: f(4)
        int[] poly = {3, -11, 0, -12, 14};
        int x = 4;
        int n = poly.length;
        System.out.println("Value of polynomial is "
                + horner(poly,n,x));
    }





}
