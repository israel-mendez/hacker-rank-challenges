import java.text.DecimalFormat;

class AdditionMagic {
    private static DecimalFormat df = new DecimalFormat("0.0#");
    public static String add(double a, String b) {
        return a + b;
    }

    public static String add(double a, double b) {
        return df.format(a + b);
    }

    public static String add(String a, String b) {
        return a + b;
    }
}