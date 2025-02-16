package StrongNumber;

class StrongNumber {

    public static String isStrongNumber(int num) {
        int sum = 0, n = num;
        for(; n>0; n/=10)
            sum += factorial(n%10);

        if(sum == num)
            return "STRONG!!!!";
        else
            return "Not Strong !!";
    }

    private static int factorial(int number){
        int sum = 1;
        for(int i=1; i<=number; i++)
            sum *= i;
        return sum;
    }

}