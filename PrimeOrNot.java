class Result {
    public static int isPrime(long n) {
        if (n < 2) {
            return -1;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return i;
            }
        }
        return 1;
    }
}