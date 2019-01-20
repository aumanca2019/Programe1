package TheNthFibonacciTerm;

public class NthFibonacci {

    static int fibo(int n) {


        int fibonacci[] = new int[n + 2];
        int i;
        fibonacci[0]=0;
        fibonacci[1]=1;

        for (i=2;i<=n;i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        return fibonacci[n];


    }

}
