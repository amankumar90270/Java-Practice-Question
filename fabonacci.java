public class fabonacci{
    public static void main(String[] args) {
        int a,b,i,c;
        a=0;
        b=1;
        System.out.println(a);
        System.out.println(b);

        for(i=0; i<=5;i++){

            c=a+b;
            a=b;
            b=c;
        System.out.println(c);
        }
    }
}