class Result {
    public static int minDiff(List<Integer> arr) {
        Collections.sort(arr);
        int sum = 0;
        
        for(int i = 0; i < arr.size() - 1; i++){
            sum += Math.abs(arr.get(i) - arr.get(i+1));
        }
        return sum;
    }
}