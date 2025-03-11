/* Reverse the Words in java*/

class Main{
    public static void main(String[] args){
        String str = "Hello World";
        String str1[] = str.split("\\s+");
        int start =0;
        int end = str1.length-1;
        while(start<end){
            String temp =str1[start];
            str1[start] = str1[end];
            str1[end] = temp;
            start++;
            end--;
        }
        String op = String.join(" ", str1);
        System.out.println(op);
    }
}
