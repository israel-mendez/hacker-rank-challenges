class SerialMultiplier {
    private int first;
    private int second;
    private int third;
    private int fourth;
    private int fifth;
    private int result;

    public SerialMultiplier() {
        first = 1;
        second = 1;
        third = 1;
        fourth = 1;
        fifth = 1;
        result = 1;
    }
    
    public SerialMultiplier(int first) {
        this.first = first;
        second = 1;
        third = 1;
        fourth = 1;
        fifth = 1;
        result = first;
    }
    
    public SerialMultiplier(int first, int second) {
        this.first = first;
        this.second = second;
        third = 1;
        fourth = 1;
        fifth = 1;
        result = first * second;
    }
    
    public SerialMultiplier(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
        fourth = 1;
        fifth = 1;
        result = first * second * third;
    }
    
    public SerialMultiplier(int first, int second, int third, int fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        fifth = 1;
        result = first * second * third * fourth;
    }
    
    public SerialMultiplier(int first, int second, int third, int fourth, int fifth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        result = first * second * third * fourth * fifth;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getThird() {
        return third;
    }

    public void setThird(int third) {
        this.third = third;
    }

    public int getFourth() {
        return fourth;
    }

    public void setFourth(int fourth) {
        this.fourth = fourth;
    }

    public int getFifth() {
        return fifth;
    }

    public void setFifth(int fifth) {
        this.fifth = fifth;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
    
    public String toString() {
        return Integer.toString(result);
    }
}