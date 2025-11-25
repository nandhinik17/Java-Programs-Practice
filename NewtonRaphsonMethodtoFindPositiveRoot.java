import java.util.*;

class NewtonRaphsonMethodtoFindPositiveRoot {
    public static double XValue(double x){
        return 2 * Math.pow(x, 3) - 3 * x -6;
    }
    public static double XDiffValue(double x){
        return 6 * Math.pow(x, 2) -3;
    }
    public static void main(String[] args) {
       double ans = Double.MAX_VALUE;
        double max= 10;
        for(int i=0;i<max; i++){
            double val = i-(XValue(i)/XDiffValue(i));
            if(val>0){
               if(val<ans){
                   ans = val;
               }
                
            }
        }
        System.out.println("Positive Root" + ans);
    }
}
