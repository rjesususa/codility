package br.com.codility;

public class MinimumNumber {
    private double[] list;

    public MinimumNumber(double[] list){
        this.list = list;
    }

    public double findTheMinimumNumber(){
        double minimumValue = Double.MAX_VALUE;
        int size = list.length;

        for(int count =0; count < size; count++){
            double leftValue = list[count];
            int rightIndex = Math.abs(count-(size-1));
            double rightValue = list[rightIndex];

            if(leftValue < minimumValue){
                minimumValue = leftValue;
            }

            if (rightValue < minimumValue){
                minimumValue = rightValue;
            }

            if((count+1) == rightIndex) {
                break;
            }
        }
        return minimumValue;
    }
}