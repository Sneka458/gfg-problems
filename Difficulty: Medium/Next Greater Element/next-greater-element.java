class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            ans.add(-1);
        }
        for(int i=n-1;i>=0;i--){
            int cur=arr[i];
            while(!st.isEmpty() && cur>=st.peek()){
                st.pop();
            }
            if(!st.isEmpty()) ans.set(i,st.peek());
            st.push(cur);
        }
        return ans;
    }
}