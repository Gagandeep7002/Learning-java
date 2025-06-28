class forWhileloop {
    public static void main(String[] args) {
        for(int a=1 ; a<=10 ; a++){
            System.out.printf("%d X %d = %d \n",5,a,5*a);
        }

        int b=1,sum=0;
        while (b<=10) { 
            sum+=b;
            b++;
        }
        System.out.printf("Sum of first ten numbers is : %d \n",sum);

        int c=1;
        do { 
            System.out.printf("%d X %d = %d \n",9,c,9*c);
            c++;
        } while (c<=10);
    }
}
