public class looping {
    public static void main(String[] args) {
        
        for (double counter = 7.5; counter <= 10.0; counter += 0.25) {
            System.out.println(calculateInterest(100.0, counter));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {

        return amount * (interestRate / 100);
    }
}
