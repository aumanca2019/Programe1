package PrimeNumbers;

public class CheckIfIsPrime {


    public boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }

        }
        return isPrime;

    }

    public int[] allPrimeNumbers(int[] arr1) {
        int[] arrayPrime = new int[arr1.length];

        int index = 0;
        for (int i1 = 0; i1 < arr1.length; i1++) {
            if (isPrime(arr1[i1])) {
                arrayPrime[index] = arr1[i1];
                index++;
            }
        }
        return arrayPrime;
    }

}























