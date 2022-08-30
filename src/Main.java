import java.io.Console;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите числа от 1 до 10(арабские или римские) + Enter");
            String tekst = scanner.nextLine();
            System.out.println(calc(tekst));
        }
    }

    public static String calc(String input) {
        int sum = 0;
        int prov = 0;
        int c = 0;
        boolean flag = false;

        // помещаем строку в массив
        String[] a1 = input.split(" ");

        Main main = new Main();
        int teloA = main.conversion(a1[0]);
        int teloB = main.conversion(a1[2]);
//        System.out.println(teloA);
//        System.out.println(teloB);

        if (main.compareTo(teloA, 0) && main.compareTo(teloB, 0)) {

            int a = Integer.parseInt(a1[0]);
            int b = Integer.parseInt(a1[2]);

            if ((a > 10) || b > 10) {
                System.out.println("Введите числa от 0 до 10");
            } else {

                for (String element : a1) {
                    switch (element) {
                        case "+":
                            sum = a + b;
                            flag = true;
                            break;

                        case "-":
                            sum = a - b;
                            flag = true;
                            break;

                        case ("*"):
                            sum = a * b;
                            flag = true;
                            break;
                        case ("/"):
                            prov = a % b;
                            if (prov == 0){
                            sum = a / b;} else {

                                System.out.println(a + " / " + b + " - не делится без остатка!!!");
                            }


                            flag = true;
                    }
                    if (flag == true) {
                        String voz = "" + sum;
                        return voz;
                    }
                }
            }
            return "";

    }
        if (main.compareTo1(teloA, 0) && main.compareTo1(teloB, 0))
            for (String element : a1) {
                switch (element) {
                    case "+":
                        sum = teloA + teloB;
                        flag = true;
                        break;

                    case "-":
                        sum = teloA - teloB;
                        flag = true;
                        break;

                    case ("*"):
                        sum = teloA * teloB;
                        flag = true;
                        break;
                    case ("/"):
                        prov = teloA % teloB;
                        if (prov == 0){
                        sum = teloA / teloB;} else{
                            System.out.println(RoManiac.convert(teloA) + " / " + RoManiac.convert(teloB) + " - не делится без остатка!!!");
                        }
                        flag = true;
                }
                if (flag == true) {
                    //System.out.println(sum);
                    String voz = "" + RoManiac.convert(sum);
                    return voz;
                }
            }
        try {
                throw new IOException();
            } catch (Exception e) {
                System.out.println("Калькулятор работает только между римскими или арабскими цифрами!!!");
            }
        return "";
    }
    private int conversion(String name){
        // инициализируем римские цифры
        Test num1 = Test.I;
        Test num2 = Test.II;
        Test num3 = Test.III;
        Test num4 = Test.IV;
        Test num5 = Test.V;
        Test num6 = Test.VI;
        Test num7 = Test.VII;
        Test num8 = Test.VIII;
        Test num9 = Test.IX;
        Test num10 = Test.X;
        if (name.equals(num1.getString())){
            return num1.getArab();
        }
        if (name.equals(num2.getString())){
            return num2.getArab();
        }
        if (name.equals(num3.getString())){
            return num3.getArab();
        }
        if (name.equals(num4.getString())){
            return num4.getArab();
        }
        if (name.equals(num5.getString())){
            return num5.getArab();
        }
        if (name.equals(num6.getString())){
            return num6.getArab();
        }
        if (name.equals(num7.getString())){
            return num7.getArab();
        }
        if (name.equals(num8.getString())){
            return num8.getArab();
        }
        if (name.equals(num9.getString())){
            return num9.getArab();
        }
        if (name.equals(num10.getString())){
            return num10.getArab();
        }
        return 0;
    }

    public static boolean compareTo(Number d1, Number d2) {
        Double num1 = d1.doubleValue();
        Double num2 = d2.doubleValue();
        if (Double.compare(num1, num2) == 0)
            return true;
        else
            return false;
    }
    public static boolean compareTo1(Number d1, Number d2) {
        Double num1 = d1.doubleValue();
        Double num2 = d2.doubleValue();
        if (Double.compare(num1, num2) != 0)
            return true;
        else
            return false;
    }
}



