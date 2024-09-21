public class divisibleBy3 {
    public static void main(String[]args){
        int n =6;
        int sum =0;
        for (int i =1; i<=n; i++){
            if (i % 3 ==0){
                sum += i;
                System.out.println(i+" is divisible by 3");
            }
        }
        System.out.println("Sum of all Divisible Number is : " + sum );
    }
}