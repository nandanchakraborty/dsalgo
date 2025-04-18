public class TrappingRainWater {

    static int trap(int []arr){
        int n = arr.length;
        int pref[] = new int [n];
        int suff[] = new int [n];

        pref[0] =0;
        for(int i=1;i<n;i++){
            pref[i] = Math.max(pref[i-1],arr[i]);
        };
        suff[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
        suff[i] = Math.max(suff[i+1],arr[i]);
        }
        int waterTrapped =0;
        for(int i=0;i<n;i++){
            waterTrapped =  waterTrapped+Math.min(pref[i],suff[i])-arr[i];
        }
        return waterTrapped;
    }
    public static void main(String args[]) {
        int arr[] = {4,2,0,3,2,5};
        System.out.println("The total water trapped " + trap(arr));
    }

}
