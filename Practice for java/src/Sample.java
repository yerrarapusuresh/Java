import acm.program.ConsoleProgram;

public class Sample extends ConsoleProgram
{
    private static final long serialVersionUID = 1L;

    public void run()
    {
        int q;
        int p;
        int thelargest;
        int thesmallest;
        String input2 = "";
        String[] numbers = null;

        println("Enter the list of number : ");
        while (true) {
            String input = readLine();
            if (input.equals(""))
                break;
            input2 += input + " ";
        }
        numbers = input2.split(" ");

        int[] result = new int[numbers.length];
        for (p = 0; p < numbers.length; p++) {
            result[p] = Integer.parseInt(numbers[p]);

        }

        for (q = 0; q < result.length; q++) {
            print("");
            println(result[q]);
        }

        println("Largest Number :  " + LargestNumber(result));
        println(" Smallest Number :  " + SmallestNumber(result));
        thelargest = LargestNumber(result);
        thesmallest = SmallestNumber(result);
        println("The Arithmetic Mean : "
                + AirthmeticMean(result, thesmallest, thelargest));

    }

    public static int SmallestNumber(int[] series)
    {
        int thesmallest = series[0];
        for (int i = 1; i < series.length; i++) {
            if (series[i] < thesmallest) {

                thesmallest = series[i];
            }
        }
        return thesmallest;
    }

    public static int LargestNumber(int[] series)
    {
        int thelargest = series[0];
        for (int i = 1; i < series.length; i++) {
            if (series[i] > thelargest) {

                thelargest = series[i];
            }
        }
        return thelargest;
    }

    public static float AirthmeticMean(int[] result, int thesmallest,
            int thelargest)
    {
        int sum = 0;
        for (int i = 0; i < result.length; i++) {
            sum += result[i];
        }

        sum -= thesmallest;
        sum -= thelargest;

        return (float) sum / result.length;
    }

}