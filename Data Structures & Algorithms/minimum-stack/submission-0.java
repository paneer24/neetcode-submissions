class MinStack {
      private int []arr;
    private int cap;
    private int top;
    private int[]minArr;
    public MinStack() {
    top=-1;
    cap=30000;
    arr=new int[cap];
    minArr=new int[cap];
    }
    
    public void push(int val) {
        top++;
        arr[top]=val;
        if(top==0){
            minArr[top]=val;
        }else{
            minArr[top]=Math.min(val,minArr[top-1]);
        }
    }
    
    public void pop() {
        top--;
    }
    
    public int top() {
        return arr[top];
    }
    
    public int getMin() {
        return minArr[top];
    }
}
