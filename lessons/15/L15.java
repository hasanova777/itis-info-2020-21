import java.util.*;

public class L15 {
    // Двоичный поиск элемента x в массиве a
    //
    // Возвращает индекс элемента, если он есть
    // и -1, если такого элемента нет
    public static int find(int[] a, int x) {
        int l = 0, r = a.length;
        while (l < r) {
            int m = (l + r) / 2;
            if (a[m] < x) {
                l = m + 1;
            } else if (a[m] > x) {
                r = m;
            } else {
                return m;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        test(new int[]{1,2,3,3,4,4,5,7,8},6,-1);
        test(new int[]{1,2,3,3,4,4,5,7,8},1,0);
        test(new int[]{1,2,3,3,4,4,5,7,8},3,2);
        test(new int[]{1,2,3,3,4,4,5,7,8},3,3);
        test(new int[]{1,2,3,3,4,4,5,7,8},8,8);
        test(new int[]{1,2,3,3,4,4,5,7,8},-1,-1);
        test(new int[]{1,2,3,3,4,4,5,7,8},10,-1);
        test(new int[]{1,2,3,5,7},4,-1);
    }
    public static void test(int[] a, int x, int r) {
        if (r != -1 && a[r] != x) {
            System.out.print("FAIL! " + Arrays.toString(a) + "; r=" + r);
            if (r != -1) {
                System.out.print("; a[" + r + "]=" + a[r]);
            }
            System.out.println("; x=" + x);
        }
        int i = find(a,x);
        if (i == -1 && r == -1 ||
            i != -1 && a[i] == x) {
            System.out.print("OK");
        } else {
            System.out.print("WA");
        }
        System.out.println(": " + Arrays.toString(a) + "; x=" + x + "; correct=" + r + "; your=" + i);
    }
}
