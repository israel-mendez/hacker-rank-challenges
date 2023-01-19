class Result {

    public static int numDuplicates(List<String> name, List<Integer> price, List<Integer> weight) {
        List<List<Object>> q = new ArrayList<List<Object>>();
        for (int i = 0; i < name.size(); i++) {
            List<Object> x = Arrays.asList(name.get(i), price.get(i), weight.get(i));
            q.add(x);
        }
        int l = q.size();
        Set<List<Object>> w = new HashSet<>(q);
        int e = w.size();
        return (l - e);
    }

}