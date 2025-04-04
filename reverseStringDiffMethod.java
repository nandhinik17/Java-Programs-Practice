import java.util.*;

class reverseStringDiffMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse().toString());
        
        //another way to reverse
        String str = "Testing";
        char[] arr = str.toCharArray();
        int index = 0;
        int l = arr.length-1;
        while(index<l){
            char temp = arr[index];
            arr[index]=arr[l];
            arr[l]=temp;
            index++;
            l--;
        }
        System.out.println(new String(arr));
    }
}
