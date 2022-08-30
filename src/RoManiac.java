public class RoManiac {
    public static String convert(int in) {
        StringBuffer a = new StringBuffer("");
        // Выделяем тысячи
        int m1 = in / 1000;
        a.append(M(m1));
        // то что осталось после тысяч
        int m2 = in % 1000;

        // Выделяем пятьсот из остатка от тысячи
        int d1 = m2 / 500;
        a.append(D(d1));
        // остаток после выделения полтысячи
        int d2 = m2 % 500;

        // Выделяем сотни из остатка
        int c1 = d2 / 100;
        a.append(C(c1));
        // остаток из сотен
        int c2 = d2 % 100;

        // Выделяем полсотни
        int l1 = c2 / 50;
        a.append(L(l1));
        // остаток
        int l2 = c2 % 50;

        // Выделяем десятки
        int x1 = l2 / 10;
        a.append(X(x1));
        // остаток
        int x2 = l2 % 10;

        // Выделяем то что осталось
        a.append(basic(x2));
        return a.toString();
    }

    private static String M(int in) {
        StringBuffer a = new StringBuffer("");
        int i = 0;
        while (i < in) {
            a.append("M");
            i++;
        }
        return a.toString();
    }

    private static String C(int in) {
        if (in == 4) return "CD"; //если 400, то 500-100
        else if ((in != 0) && (in < 4)) {
            StringBuffer a = new StringBuffer("");
            int i = 0;
            while (i < in) {
                a.append("C");
                i++;
            }
            return a.toString();
        }
        else return "";
    }

    private static String X(int in) {
        if (in == 4) return "XL";
        else if ((in != 0) && (in < 4)) {
            StringBuffer a = new StringBuffer("");
            int i = 0;
            while (i < in) {
                a.append("X");
                i++;
            }
            return a.toString();
        }
        else return "";
    }
    private static String D(int in) {

        if (in == 4) return "CM";
        else if ((in != 0) && (in < 4)) {
            StringBuffer a = new StringBuffer("");
            int i = 0;
            while (i < in) {
                a.append("D");
                i++;
            }
            return a.toString();
        }
        else  return "";
    }
    private static String L(int in) {

        if (in == 4) return "XC";
        else if ((in != 0) && (in < 4)) {
            StringBuffer a = new StringBuffer("");
            int i = 0;
            while (i < in) {
                a.append("D");
                i++;
            }
            return a.toString();
        }
        return "";

    }
    private static String basic(int in) {
        String[] a = {
                "",
                "I",
                "II",
                "III",
                "IV",
                "V",
                "VI",
                "VII",
                "VIII",
                "IX"
        };
        return a[in];
    }
}
