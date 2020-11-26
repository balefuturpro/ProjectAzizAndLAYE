package calculer;

public class Calculator {

    public  int sum(int a, int b) {
        return a + b ;
    }
    public  int minus(int a, int b) {
        return  a - b ;
    }
    public  int divide(int a, int b){

        if(b==0) {
            throw new IllegalArgumentException("operation impossible");
        }
        return a / b ;
    }
    public int multiply(int a, int b){

        return  a * b;
    }
    public int min(int a, int b) {

        return Math.min(a,b) ;
    }
    public int max(int a, int b){
        return Math.max(a,b);

    }

    public int maxElement(int[] list){

        int maxVal = list[0];
        for (int i=1; i < list.length; i++){
            if(list[i] > maxVal){
                maxVal = list[i];
            }
        }
        return  maxVal ;
    }
    public int minElement(int[] list){

        int minVal = list[0];
        for (int i=1; i < list.length; i++){
            if(list[i] < minVal){
                minVal = list[i];
            }
        }
        return  minVal ;
    }

}
