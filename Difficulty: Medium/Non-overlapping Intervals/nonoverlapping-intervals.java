class Solution {
    public int minRemoval(int arr[][]) {
        // code here
        Arrays.sort(arr,(a,b)->a[1]-b[1]);
        int cnt=1,freetime=arr[0][1];
        int n= arr.length;
        for(int i=1;i<n;i++){
            if(arr[i][0]>=freetime){
                cnt++;
                freetime =arr[i][1];
            }
        }
        return n-cnt;
    }
}


