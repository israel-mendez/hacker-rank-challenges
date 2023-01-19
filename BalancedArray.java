class Result {
    public static int balancedSum(List<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++){
            sum += arr.get(i);
        }
        
        int curr = arr.get(0);
        for(int i =1; i <arr.size(); i++){
            if(curr == sum - curr - arr.get(i)){
                return i;
            }
            curr += arr.get(i);
        }
        return -1;
    }
}
}