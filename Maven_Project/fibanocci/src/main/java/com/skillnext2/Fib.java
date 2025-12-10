package com.skillnext2;

/**
 * Hello world!
 *
 */
public class Fib 
{
  /*  public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}*/
public static void main(String[] args) {
        int n = 10; // how many numbers you want
        int a = 0, b = 1;

        System.out.print(a + " " + b);

        for(int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
