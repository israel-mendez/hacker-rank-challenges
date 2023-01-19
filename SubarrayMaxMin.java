class Result {
    public static int maxMin(List<Integer> arr, int k) {
        int maxMin = Integer.MIN_VALUE; 
        Deque<Integer> window = new LinkedList<>(); 

        for (int i = 0; i < k; i++) {
            while (!window.isEmpty() && arr.get(i) <= arr.get(window.getLast())) {
                window.removeLast();
            }
            window.addLast(i);
        }

        for (int i = k; i < arr.size(); i++) {
            maxMin = Math.max(maxMin, arr.get(window.getFirst()));

            while (!window.isEmpty() && window.getFirst() <= i - k) {
                window.removeFirst();
            }

            while (!window.isEmpty() && arr.get(i) <= arr.get(window.getLast())) {
                window.removeLast();
            }

            window.addLast(i);
        }
        maxMin = Math.max(maxMin, arr.get(window.getFirst()));

        return maxMin;
    }
}