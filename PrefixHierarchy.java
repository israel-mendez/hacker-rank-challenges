class Result {
    public static List<Integer> findCompletePrefixes(List<String> names, List<String> query) {
        List<Integer> prefixCounts = new ArrayList<Integer>();
        for (String q : query) {
            int count = 0;
            for (String n : names) {
                if (n.length() > q.length() && n.substring(0, q.length()).equals(q)) {
                    count++;
                }
            }
            prefixCounts.add(count);
        }
        return prefixCounts;
    }
}