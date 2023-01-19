class EngineerFirm implements Company {
    private int[] income;
    private DecimalFormat df = new DecimalFormat("0.00");

    public EngineerFirm(int n) {
        income = new int[n];
        Arrays.fill(income, 0);
    }

    public void assignSalaries(int[] salaries) {
        int length = Math.min(income.length, salaries.length);
        for (int i = 0; i < length; i++) {
            income[i] = salaries[i];
        }
        System.out.println("Incomes of engineers credited");
    }

    public void averageSalary() {
        double sum = 0;
        for (int i = 0; i < income.length; i++) {
            sum += income[i];
        }
        double average = sum / income.length;
        System.out.println("Average salary of engineers is " + df.format(average));
    }

    public void maxSalary() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < income.length; i++) {
            max = Math.max(max, income[i]);
        }
        System.out.println("Maximum salary amongst engineers is " + max);
    }

    public void minSalary() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < income.length; i++) {
            min = Math.min(min, income[i]);
        }
        System.out.println("Minimum salary amongst engineers is " + min);
    }
}

class AccountantFirm implements Company {
    private int[] income;
    private DecimalFormat df = new DecimalFormat("0.00");

    public AccountantFirm(int n) {
        income = new int[n];
        Arrays.fill(income, 0);
    }

    public void assignSalaries(int[] salaries) {
        int length = Math.min(income.length, salaries.length);
        for (int i = 0; i < length; i++) {
            income[i] = salaries[i];
        }
        System.out.println("Incomes of accountants credited");
    }

    public void averageSalary() {
        double sum = 0;
        for (int i = 0; i < income.length; i++) {
            sum += income[i];
        }
        double average = sum / income.length;
        System.out.println("Average salary of accountants is " + df.format(average));
    }

    public void maxSalary() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < income.length; i++) {
            max = Math.max(max, income[i]);
        }
        System.out.println("Maximum salary amongst accountants is " + max);
    }

    public void minSalary() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < income.length; i++) {
            min = Math.min(min, income[i]);
        }
        System.out.println("Minimum salary amongst accountants is " + min);
    }
}