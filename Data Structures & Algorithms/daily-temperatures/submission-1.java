class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       Stack<Integer>s=new Stack<>();
       int []ans=new int[temperatures.length];
       for(int i=0;i<temperatures.length;i++){
        while(!s.isEmpty() && temperatures[i] > temperatures[s.peek()]){
            int prevIndex=s.pop();
            ans[prevIndex]=i-prevIndex;
        }
        s.push(i);
       }
       return ans;
    }
}
