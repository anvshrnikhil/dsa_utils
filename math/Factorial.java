
class Factorial {

    int MOD = 1_000_000_000 + 7;

    long factorial(int n) {
        if(n == 1) return 1;
        return ( (n) % MOD * (factorial(n-1)) % MOD ) % MOD; 
    }

    long[] factorialArray(int n) {
        long[] fact = new long[n+1];
        fact[0] = 1;
        for(int i=1;i<=n;i++) {
            fact[i] = (fact[i-1] * i) % MOD;
        }
        return fact;
    }
}