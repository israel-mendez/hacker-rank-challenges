class Result {
    public static int fourthBit(int num) {
        String binary = "";
    while (num > 0) {
      binary = (num % 2) + binary;
      num /= 2;
    }
    if (binary.length() < 5) {
      return 0;
    }
    return Integer.parseInt(String.valueOf(binary.charAt(binary.length() - 4)));
    }
}