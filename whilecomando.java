public class whilecomando {
    
    public static void main(String[] args) {

        int i = 5;

        while (i <= 20) { 

            if (isEvenNumber(i)) {
                System.out.println(i);
            }

            i++;
        }
    }

    public static boolean isEvenNumber(int number) {

        return number > 0 && number % 2 == 0;
    }
}
 