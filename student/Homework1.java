package student;

public class Homework1 {

    public double shippingCalculator(int n){
        if (n == 0) {
            return 0.0;
        } else if (n == 1) {
            return 10.95;
        } else if (n>1) {
            return 10.95 + (n-1) * 2.95;
        }
        
        return 0;
    }
    public boolean isValidTriangle(int a, int b, int c){
        return a + b > c && a + c > b && b + c > a;
        return false;

    }
    public boolean isPrime(int number){
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
        return false;
    }

    public  int hex2int(String hex) {
        hex = hex.toUpperCase();
        if (hex.length() != 1 || !("0123456789ABCDEF".contains(hex))) {
            return -1;
        }
        return Integer.parseInt(hex, 16);
    }
    public String int2hex(int value) {
        if (value < 0 || value > 15) {
            return "-1";
        }
        return Integer.toHexString(value).toUpperCase();
    }


}
