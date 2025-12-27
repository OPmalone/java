public class Calculadora {
    public static void main(String[] args) {
        
        int num1 = 5, num2 = 2;
        String op = "div";

        if (op == "soma") {
            System.out.println(soma(num1, num2));
        } else if (op == "sub") {
            System.out.println(sub(num1, num2));
        } else if (op == "times") {
            System.out.println(times(num1, num2));
        } else if (op == "div") {
            System.out.println(div(num1, num2));
        }
        
    }

    public static int soma(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int times(int num1 ,int num2) {
        return num1 * num2;
    }

    public static double div(int num1, int num2) {
        return (double) num1 / num2;
    }

    public static void pow(int num1, int num2) {
        System.out.println("Tem que aprender pow ainda");;
    }
} 