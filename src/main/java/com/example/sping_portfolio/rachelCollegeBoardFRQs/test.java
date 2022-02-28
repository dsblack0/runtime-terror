package com.example.sping_portfolio.rachelCollegeBoardFRQs;

public class test {
    public static void main(String[] args)
    {
     System.out.println(fibonacci(3));
      System.out.println(fibonacci(4));
    }

    public static int fibonacci(int n)
    {
        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int triangle(int rows)
    {
        if (rows == 0)
            return 0;

        return rows + triangle(rows - 1);
    }

    public static int sumDigits(int n)
    {
        if (n <= 9)
            return n;

        return sumDigits(n / 10) + n % 10;
    }

    public static int count7(int n)
    {
        if (n == 0)
            return 0;

        int sevens = count7(n / 10);

        if (n % 10 == 7)
            sevens++;

        return sevens;
    }

    public static int count8(int n)
    {
        if (n == 0)
            return 0;

        int lastDigit = n % 10;
        int secondToLastDigit = n / 10 % 10;

        int eights = 0;

        if (lastDigit == 8)
        {
            eights++;
            if (secondToLastDigit == 8)
                eights++;
        }

        return eights + count8(n / 10);
    }

    public static int countX(String str)
    {
        if (str.length() == 0)
            return 0;

        int xs = countX(str.substring(1));

        if (str.substring(0, 1).equals("x"))
            xs++;

        return xs;
    }

    public static String changeXY(String str)
    {
        if (str.length() == 0)
            return "";

        if (str.charAt(0) == 'x')
            return "y" + changeXY(str.substring(1));
        else
            return str.substring(0, 1) + changeXY(str.substring(1));
    }

}
