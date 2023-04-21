package homework2;

import java.util.Scanner;

public class Scan {
    
    // process pr = new process();
    // public Object sc;

    
    boolean isNum(String arg) {
        try {
            Double.parseDouble(arg);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    boolean isSymbol(String arg) {
        if (arg.equals("+") || arg.equals("-") || arg.equals("/")
                || arg.equals("*")) {
            return true;
        } else {
            return false;
        }
    }

    String scannerStr() {
        String element = "";
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while (flag) {
            element = sc.next();
            if (isSymbol(element)) {
                flag = false;
            } else if (element.equals("exit")) {
                System.out.println("Конец работы");
                break;
            } else {
                System.out.println("Введите корректные данные");
            }
        }
        // sc.close();
        return element;
    }

    double scannerNum() {
        String element2 = "";
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while (flag) {
            element2 = sc.next();
            if (isNum(element2)) {
                flag = false;
            } else if (element2.equals("exit")) {
                System.out.println("Конец работы");
                break;
            } else {
                System.out.println("Введите корректные данные");
            }
        }
        // sc.close();
        return Double.parseDouble(element2);
    }
}

