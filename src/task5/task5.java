package task5;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int per = n;
        int s = -1;
        int b = 0;
        while(per != 0){
            per = per /10;
            s++;
        }

       recurs131();
    }
    /*
        int i = 1;
        int k = scanner.nextInt();
        while (i != k){
            for(int b  = 0; b <= i; b++){
                System.out.println(i);
            }
            i++;
        }
        int first = scanner.nextInt(), sec = scanner.nextInt();
        while (first < sec+1){
            for(int b = 1; b <=first; b++){
                System.out.println(first);
            }
            first++;
        }

        int first = scanner.nextInt(), sec = scanner.nextInt(), summ = 0;
        while (first < sec+1){
            for(int b = 1; b <=first; b++){
                summ += first;
            }
            first++;
        }
        System.out.println(summ);
        int leng = 100;
        int[] array = new int[leng];
        for(int i  = 0; i < leng; i++){
            int n = scanner.nextInt();
            if(n == 0){
                int a = i;
                i = leng;
                leng = a;
            } else if (n !=0) {
                array[i] += n;
            } else if (n != 0 && i ==leng){
                array[i] += n;
                leng++;
            }
        }
        for (int b = 1; b < leng; b += 2){
            System.out.println(array[b]);
        }
        int N = scanner.nextInt(), b = 0;
        for(int i = 1; i != 0; i++){
            N = N % 10;
            System.out.println(N +" ");

        }*/
    //число слева на право
    public static int recursionC(int n, int s, int b) {
        if (s != 0) {
            double sqr = Math.pow(10, s);
            int dqr = (int) sqr;
            b = n / dqr;
            n = n - b*dqr;
            System.out.println(b);
            s--;
            return recursionC(n, s, b);

        }
        else {
            System.out.println(n);
            return (s);
        }
    }
    //число справа на лево
    public static int recursion(int n) {
        if (n < 10) {
            System.out.println(n);
            return n; }
        else {
            int b = n % 10;
            System.out.println(b);
            return recursion(n / 10); }
    }

    //числа массива нечетные
    public static void recurs131(){
        int l = 0;
        recurs13(l);
    }
    public static int recurs13(int l){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(l%2 != 0){
            System.out.println(n);
            l++;
            return recurs13(l);
        }
        else{
            l++;
            return recurs13(l);
        }
    }

}

