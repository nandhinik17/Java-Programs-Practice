import java.util.*;

class checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean flag = true;
        if(a<=2){
            flag = false;
        }
        else{
        for(int i=2; i<Math.sqrt(a);i++){
            if(a%i==0){
                flag = false;
                break;
            }
        }
        }
        System.out.println(flag);
    }
}
