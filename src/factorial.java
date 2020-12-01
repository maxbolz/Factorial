public class factorial {

    public static long calcFactorial(long x)
    {
        long count = x;
        while (count>1)
        {
            count--;
            x *= count;
        }
        return x;
    }

    public static double calcE()
    {
        double e = 1, olde = 0; long count = 0;
        while (e-olde > 0.001)
        {
            olde = e;
            count++;
            e += 1.0/calcFactorial(count);
        }
        return e;
    }

    public static double calcEX(int x)
    {
        double e = 1, olde = 0; long count = 0;
        while (e-olde > 0.001)
        {
            olde = e;
            count++;
            e += Math.pow(x, count)/calcFactorial(count);
        }
        return e;
    }

    public static void main (String [] args)
    {
        for (long x = 1; x<=20; x++)
        {
            System.out.println(calcFactorial(x));
        }

        System.out.printf("\ne = %2.3f \n", calcE());

        System.out.println("");

        for (int x = 1; x<=5; x++)
        {
            System.out.printf("e^" + (x) + " = %2.3f \n", calcEX(x));
        }
    }

}
