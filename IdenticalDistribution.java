class Result {
    public static int cardPackets(List<Integer> cardTypes) {
    int sum=0;
    for(int i=0;i<cardTypes.size();i++){
        if(cardTypes.get(i)%2!=0){
            sum++;
        }
    }
    if(sum<2 || sum==3){
        sum=0;
    }
    return sum;
}
}