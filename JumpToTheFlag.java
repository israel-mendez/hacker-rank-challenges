class Result {
    public static int jumps(int flagHeight, int bigJump) {
        int smallJump = 1;
        int jumps = 0;
        
        while (flagHeight > 0){
            if(flagHeight >= bigJump){
                flagHeight -= bigJump;
                jumps++;
            } else {
                flagHeight -= smallJump;
                jumps++;
            }
        }
        return jumps;
    }
}