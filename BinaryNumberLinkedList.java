class Result {     
    public static long getNumber(SinglyLinkedListNode binary) {
        long ans = 0;
        SinglyLinkedListNode a = binary;
        while (a!=null){
            ans = (ans<<1)+(a.data);
            a = a.next;
        }
        
        return ans;
    }
}