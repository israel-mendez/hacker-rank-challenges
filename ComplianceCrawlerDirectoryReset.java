class Result {
    static int minimumSteps(List<String> loggedMoves) {
        int steps = 0;
        for (String move : loggedMoves) {
            if (move.equals("../")) {
                steps--;
            } else if (!move.equals("./")) {
                steps++;
            }
        }
        return Math.abs(steps);
    }
}