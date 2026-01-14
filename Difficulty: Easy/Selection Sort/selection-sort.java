class Solution {
    void selectionSort(int[] arr) {
        // code here
        int n=arr.length;
        int swap;
        for(int i=0;i<n-1;i++){
            int temp=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[temp])
                temp=j;
            }
            swap=arr[i];
            arr[i]=arr[temp];
            arr[temp]=swap;
        }
    }
}