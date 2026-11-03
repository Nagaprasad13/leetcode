class StockSpanner {
    Stack<Integer> st1=new Stack<>();
    Stack<Integer> st2=new Stack<>();
    public StockSpanner() {
        this.st1=st1;
        this.st2=st2;
    }
    public int next(int price) {
        int val=1;
        if(st1.isEmpty()){
            st1.push(price);
            return val;
        }
        while(!st1.isEmpty()&&st1.peek()<=price){
            int stockprice=st1.pop();
            if(stockprice<=price){
                val++;
            }
            st2.push(stockprice);
        }
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        st1.push(price);
        return val;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */