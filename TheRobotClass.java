class Robot {
    int currentX;
    int currentY;
    int previousX;
    int previousY;

    public Robot(){
        currentX = 0;
        currentY = 5;
    }

    public Robot(int x, int y) {
        currentX = x;
        currentY = y;
        previousX = 0;
        previousY = 5;
    }

    public void moveX(int dx) {
        previousX = currentX;
        currentX += dx;
    }

    public void moveY(int dy) {
        previousY = currentY;
        currentY += dy;
    }

    public void printCurrentCoordinates() {
        System.out.println(currentX + " " + currentY);
    }

    public void printLastCoordinates() {
        System.out.println(currentX + " " + previousY);
    }

    public void printLastMove() {
        if (currentX != previousX) {
            System.out.println("x " + (currentX - previousX));
        } else {
            System.out.println("y " + (currentY - previousY));
        }
    }
}