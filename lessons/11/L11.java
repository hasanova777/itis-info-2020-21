import java.util.*;

public class L11 {
    public static void main(String[] args) {
        // Вызовы функций
        int f = 10;
        for (int i = 1; i<10; i++) {
            System.out.println(i + ": " + isPrime(i));
        }
        int[] a = strangeFunction();
        for (int i=0; i<a.length; i++) {
            System.out.println(i + " -> " + a[i]);
        }
        System.out.println(max(a,5));

        int[] b = {1,2,3};
        int[] c = {1,2,3,4};
        int[] d = add(b,c);
        for (int i = 0; i<d.length; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println();
    }

    // Функция проверки на простоту
    public static boolean isPrime(int n) {
        // return - возвращает результат (сразу выходит)
        if (n == 1) return false;

        boolean f = true;
        for (int i = 2; i*i <= n; i++) {
            f &= (n % i != 0);
        }
        return f;
    }

    // Возвращаем массив
    // Функция может не принимать параметров
    public static int[] strangeFunction() {
        int n = 100;
        int[] a = new int[n];
        a[0] = 27;
        for (int i = 1; i<n; i++) {
            if (a[i-1] % 2 == 0)
                a[i] = a[i-1] / 2;
            else
                a[i] = 3*a[i-1]+1;
        }
        return a;
    }

    // Максимальный элемент из первых k элементов
    public static int max(int[] a, int k) {
        int m = a[0];
        for (int i = 1; i < k; i++) {
            if (m < a[i]) {
                m = a[i];
            }
        }
        return m;
    }

    // Функция поэлементного сложения двух массивов
    public static int[] add(int[] a, int[] b) {
        int n = a.length;
        if (n < b.length) {
            n = b.length;
        }
        int[] c = new int[n];
        for (int i=0; i<n; i++) {
            if (i < a.length) {
                c[i] += a[i];
            }
            if (i < b.length) {
                c[i] += b[i];
            }
        }
        return c;
    }
}
