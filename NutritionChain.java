abstract class Food {
    double proteins;
    double fats;
    double carbs;
    double tastyScore;

    abstract void getMacroNutrients();
}

class Egg extends Food {
    String type = "non-vegetarian";
    int tastyScore = 7;

    Egg(double proteins, double fats, double carbs) {
        this.proteins = proteins;
        this.fats = fats;
        this.carbs = carbs;
    }

    void getMacroNutrients() {
        System.out.println("An egg has " + this.proteins + " gms of protein, " + this.fats + " gms of fats and " + this.carbs + " gms of carbohydrates.");
    }
}

class Bread extends Food {
    String type = "vegetarian";
    int tastyScore = 8;

    Bread(double proteins, double fats, double carbs) {
        this.proteins = proteins;
        this.fats = fats;
        this.carbs = carbs;
    }

    void getMacroNutrients() {
        System.out.println("A slice of bread has " + this.proteins + " gms of protein, " + this.fats + " gms of fats and " + this.carbs +  " gms of carbohydrates.");
    }
}