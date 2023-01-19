
lass StringDataType<T> implements DataType<T> {
    @Override
    public void addition(T a, T b) {
        System.out.println("Adding two strings");
        System.out.println("The result is: " + a + b);
    }

    public void subtraction(T a, T b) {
        System.out.println("Can't perform this operation on strings");
    }

    public void multiplication(T a, T b) {
        System.out.println("Can't perform this operation on strings");
    }

    public void division(T a, T b) {
        System.out.println("Can't perform this operation on strings");
    }

    public void performAll(T a, T b) {
        addition(a, b);
        subtraction(a, b);
        multiplication(a, b);
        division(a, b);
    }
}

class NumericDataType<T extends Number> implements DataType<T> {
    public void addition(T a, T b) {
        System.out.println("Adding 2 generic instances");
        System.out.printf("The result is: %.2f\n", a.doubleValue() + b.doubleValue());
    }

    public void subtraction(T a, T b) {
        System.out.println("Subtracting two generic instances");
        System.out.printf("The result is: %.2f\n", a.doubleValue() - b.doubleValue());
    }

    public void multiplication(T a, T b) {
        System.out.println("Multiplying two generic instances");
        System.out.printf("The result is: %.2f\n", a.doubleValue() * b.doubleValue());
    }

    public void division(T a, T b) {
        System.out.println("Dividing two generic instances");
        System.out.printf("The result is: %.2f\n", a.doubleValue() / b.doubleValue());
    }

    public void performAll(T a, T b) {
        addition(a, b);
        subtraction(a, b);
        multiplication(a, b);
        division(a, b);
    }
}