
class FibonacciFinder {

    // Create a fibFinder() method that finds the nth number in the Fibonacci sequence.
    // As a reminder, the Fibonacci sequence is a mathematical sequence that begins with 0 and 1,
    // with each following term being the sum of the two previous terms.

    // For example, the first two terms of the sequence are represented by fibFinder(0) and fibFinder(1),
    // which return 0 and 1, respectively. fibFinder(6) should return 8.

    // This challenge was reported to have been asked in interviews at many top companies,
    // including Google. If you’ve covered the material in Pass the Technical Interview with Java or an equivalent,
    // you should be able to solve this challenge. If you have trouble,
    // try refreshing your knowledge with its Dynamic Programming article.


    public static void main(String[] args) {
        System.out.print(fibFinder(6));
    }

    public static int fibFinder(int n) {
        // Write your code here

        int fib1 = 0;

        int fib2 = 1;

        int tempFib = 0;

        if(n == 0)
            return 0;

        if(n == 1)
            return 1;

        for(int i = 0; i < n - 1; i++){

            tempFib = fib2;

            fib2 = fib1 + fib2;

            fib1 = tempFib;

        }

        return fib2;

    }
}