class Result {
    public static List<String> deviceNamesSystem(List<String> devicenames) {
        Map<String, Integer> deviceNameMap = new HashMap<>();
        List<String> uniqueDeviceNames = new ArrayList<>();

        for (String name : devicenames) {
            if (!deviceNameMap.containsKey(name)) {
                deviceNameMap.put(name, 1);
                uniqueDeviceNames.add(name);
            } else {
                int count = deviceNameMap.get(name);
                String newName = name + count;
                uniqueDeviceNames.add(newName);
                deviceNameMap.put(name, count + 1);
            }
        }
        return uniqueDeviceNames;
    }
}