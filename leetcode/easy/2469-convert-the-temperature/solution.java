class Solution {
    public double[] convertTemperature(double celsius) {
        double k = celsius + 273.15;
        double fa= (celsius * 9.0/5.0) + 32.0;
        double [] arr = new double[2]; 
            arr[0] = k;
            arr[1] = fa;
        return arr;
    }
}