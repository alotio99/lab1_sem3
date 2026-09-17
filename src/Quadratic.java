public class Quadratic {
    static void runQuadratic(String aS, String bS, String cS){
        double a = Double.parseDouble(aS);
        double b = Double.parseDouble(bS);
        double c = Double.parseDouble(cS);
        double D = b*b - 4*a*c;
        if (a == 0){
            System.out.println("Ошибка, уравнение не является квадратным");
        } else if (D > 0) {
            double x1 = (-b + Math.pow(D, 0.5))/(2*a);
            double x2 = (-b - Math.pow(D, 0.5))/(2*a);
            System.out.println("Первый корень: " + x1);
            System.out.println("Второй корень: " + x2);
        } else if (D == 0) {
            double x3 = -b/(2*a);
            System.out.println("Единственный корень: " + x3);
        } else if (D < 0){
            System.out.println("Вещественных корней нет");
        }
    }
}
