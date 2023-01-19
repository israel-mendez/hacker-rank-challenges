    public static int closedPaths(int number) {
        int closedPaths = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit == 0 || digit == 4 || digit == 6 || digit == 9) {
                closedPaths += 1;
            } else if (digit == 8) {
                closedPaths += 2;
            }
            number /= 10;
        }
        return closedPaths;
    }
}