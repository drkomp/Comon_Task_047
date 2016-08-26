/**
 * Created by drkomp on 25.08.2016.
 * 47. Дано действительное число x и массив A[n]. В массиве найти два члена, среднее арифметическое которых ближе всего к x.
 */
public class Task {
    public static void main(String[] args) {
        double x =7;
        double A[]={3,88,1,-4,55,74,4.44};
        double tmpDistance;
        double minDistance =  Math.abs(x- (A[0]+A[1])/2);
        double num1=A[0];
        double num2=A[1];
        for(int i = 0;i<(A.length-1);i++){
            for(int k = (i+1); k<A.length; k++){
                tmpDistance = Math.abs(x- (A[i]+A[k])/2);
                if (minDistance > tmpDistance){
                    minDistance = tmpDistance;
                    num1=A[i];
                    num2=A[k];
                }
            }
        }
        System.out.println("the arithmetic average of "+num1+" and "+num2+" is closest to "+x);
    }
}
