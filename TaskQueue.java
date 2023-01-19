class Result {
    public static long minTime(List<Integer> batchSize, List<Integer> processingTime, List<Integer> numTasks) {
        int n = batchSize.size();
        long maxTime = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            long t = numTasks.get(i) % batchSize.get(i);
            long temp = numTasks.get(i) / batchSize.get(i) + (t == 0 ? 0 : 1);
            maxTime = Math.max(maxTime, temp * processingTime.get(i));
        }
        return maxTime;
    } 
}