class Result {
    public static List<String> funWithAnagrams(List<String> text) {
    HashSet<String> set = new HashSet<>();
    List<String> result = new ArrayList<>();
    for (String str : text) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        if (!set.contains(sorted)) {
            set.add(sorted);
            result.add(str);
        }
    }
    Collections.sort(result);
    return result;
    }
}