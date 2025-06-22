class operators {
    public static void main(String[] args) {
        double a=10,b=5;

        //arithmetic operators
        System.out.println(a+b);

        System.out.println(a-b);

        System.out.println(a*b);

        System.out.println(a/b);

        System.out.println(a%b);

        // shorthand operator shorter syntax of arithmatic operators (+=,-=,%=,etc)
        int c=7;
        c-=2;
        System.out.println(c);

        // relational operators
        System.out.println(a==b);

        System.out.println(a!=b);

        System.out.println(a>=b);

        System.out.println(a<=b);

        System.out.println(a>b);

        // logical operators
        System.out.println(a>b && a<15);

        System.out.println(a<b || a>8);

        System.out.println(!(a>b));

        a++;
        System.out.println(a);

        System.out.println(--a);
    }    
}
