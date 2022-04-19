public class TrapezoidalRule {
        /**
         * f(x) = x^2 enter function which should be integrated
         **/
        static double f(double x) {
            return x*x;
        }

        /**
         *
         * @param gridPoints number of grid points
         * @return gridPoints if gridPoints is greater than 0, otherwise return 1
         */
        static int validateGridPoints(int gridPoints) {
                return gridPoints == 0 ? 1 : gridPoints;
            }
        /**
         * Integrate f from lowerBorder to upperBorder using the trapezoidal rule.
         * Increase gridPoints for more precision.
         * @param lowerBorder lower border of integration
         * @param upperBorder upper border of integration
         * @param gridPoints number of grid points
         * @return integral of f from lowerBorder to upperBorder
         * Quelle: https://www.wikipedia.org/wiki/Trapezoidal_rule
         **/
        static double integrate(double lowerBorder, double upperBorder, int gridPoints) {
            gridPoints = validateGridPoints(gridPoints);
            double trapezoidalWidth = (upperBorder - lowerBorder) / gridPoints;
            double sum = 0.5 * (f(lowerBorder) + f(upperBorder));
            for (int i = 1; i < gridPoints; i++) {
                double x = lowerBorder + trapezoidalWidth * i;
                sum = sum + f(x);
            }
            return sum * trapezoidalWidth;
        }

        public static void main(String[] args) {
            double lowerBorder = 0;
            double upperBorder = 1;
            System.out.println(integrate(lowerBorder, upperBorder, 1000));
        }

    }


