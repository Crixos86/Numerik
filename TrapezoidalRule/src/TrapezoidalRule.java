public class TrapezoidalRule {


        /**
         * f(x) = x^2 enter function which should be integrated
         **/
        static double f(double x) {
            return x*x;
        }

        /**
         * Integrate f from a(upper border) to b(lower border) using the trapezoidal rule.
         * Increase N(Number of support points) for more precision.
        **/
        static double integrate(double a, double b, int N) {
            double h = (b - a) / N;              // step size
            double sum = 0.5 * (f(a) + f(b));    // area
            for (int i = 1; i < N; i++) {
                double x = a + h * i;
                sum = sum + f(x);
            }

            return sum * h;
        }

        public static void main(String[] args) {
            double a = 0;
            double b = 1;
            System.out.println(integrate(a, b, 1000));
        }

    }


