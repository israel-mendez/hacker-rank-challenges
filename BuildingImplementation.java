class School implements Building {
    private List<Boolean> floors;
    private int n;

    public School(int n) {
        this.n = n;
        floors = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            floors.add(false);
        }
        System.out.println("A school is being constructed");
    }

    public void floorCompleted(int floorNumber) {
        if (floorNumber < 1 || floorNumber > n) {
            System.out.println("Floor number " + floorNumber + " does not exist in school");
        } else {
            floors.set(floorNumber - 1, true);
            System.out.println("Construction for floor number " + floorNumber + " completed in school");
        }
    }

    public void printStatus(int floorNumber) {
        if (floorNumber < 1 || floorNumber > n) {
            System.out.println("Floor number " + floorNumber + " does not exist in school");
        } else {
            if (floors.get(floorNumber - 1)) {
                System.out.println("Construction for floor number " + floorNumber + " completed in school");
            } else {
                System.out.println("Construction for floor number " + floorNumber + " not completed in school");
            }
        }
    }

    public void printNumberOfFloors() {
        System.out.println("The school has " + n + " floors");
    }
}

class Hospital implements Building {
    private List<Boolean> floors;
    private int n;

    public Hospital(int n) {
        this.n = n;
        floors = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            floors.add(false);
        }
        System.out.println("A hospital is being constructed");
    }

    public void floorCompleted(int floorNumber) {
        if (floorNumber < 1 || floorNumber > n) {
            System.out.println("Floor number " + floorNumber + " does not exist in hospital");
        } else {
            floors.set(floorNumber - 1, true);
            System.out.println("Construction for floor number " + floorNumber + " completed in hospital");
        }
    }

    public void printStatus(int floorNumber) {
        if (floorNumber < 1 || floorNumber > n) {
            System.out.println("Floor number " + floorNumber + " does not exist in hospital");
        } else {
            if (floors.get(floorNumber - 1)) {
                System.out.println("Construction for floor number " + floorNumber + " completed in hospital");
            } else {
                System.out.println("Construction for floor number " + floorNumber + " not completed in hospital");
            }
        }
    }

    public void printNumberOfFloors() {
        System.out.println("The hospital has " + n + " floors");
    }
}