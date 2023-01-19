class Result {
    public static int arraySum(List<Integer> numbers) {
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        return sum;
    }

}