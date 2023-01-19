class Result {
    public static long doubleSize(List<Long> arr, long k)
    {
 
    boolean exist = true;

    while(exist){

      exist = false;
 
      for (int i = 0; i < arr.size(); i++) {
        if (arr.get(i) == k){
          k *= 2;
          exist = true;
          break;
        }
      }
    }
    return k;
  }
}