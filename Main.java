public class Main {

    public static boolean isPrime(int n)
    /**
     * Input: n - integer
     * Output: true, if n - prime
     *          false, otherwise
     */
    {
        return true;
    }

    public static void main(String[] args) {
        if (args.length < 1)
        {
            return;
        }

        String parameter = args[0];
        int givenNumber = Integer.parseInt(parameter);

        System.out.println("List of all prime numbers less than " + givenNumber);
        for (int i = 0; i < givenNumber; i++)
        {
            if (isPrime(i))
                System.out.println(i);
        }
    }
}
