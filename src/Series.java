public class Series {
    static void runseries(){
        double abs_min = 0.000001;
        int number = 0;
        int col = 0;
        double summ = 0;
        for (int n = 2;;n++) {
            summ = summ + (double) 1 /(n*n + n - 2);
            number = n; col++;
            if ( ((double) 1 /((n+1)*(n+1) + (n+1) - 2)) < abs_min )
                break;
        }
        System.out.println("Вычисленная сумма: " + summ);
        System.out.println("Последний добавленный номер n: " + number);
        System.out.println("Количество добавленных членов ряда: " + col);
    }
}
