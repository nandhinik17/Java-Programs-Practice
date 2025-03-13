import java.util.*;
class twoSumIndex {
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 9;
        int op[] = new int[2];
        for(int i=0;i<arr.length; i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]+arr[j]==targeta){
                    op[0]=i;
                    op[1]=j;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(op));
    }
}

