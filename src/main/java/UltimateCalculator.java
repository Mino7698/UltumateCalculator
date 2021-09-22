public class UltimateCalculator {
    static {
        System.out.println("\n" + "инфо: при попытке деления на 0 или получении бесконечности " +
                "в консоль возвращается сообщение об ошибке, а методом возвращается " +
                "значение операции (infinity/-infinity)" + "\n");
    }

    public static double EasyCalculate(double i, String e, double j) {
        switch (e) {
            case "+": {
                if (j + i == Double.POSITIVE_INFINITY) {
                    System.err.println("НЕНОРМ: получилась Плюс бесконечность (полученное число больше чем вмещает double)");
                    return (i + j);
                } else {
                    if (j + i == Double.NEGATIVE_INFINITY) {
                        System.err.println("НЕНОРМ: получилась Минус бесконечность (полученное число меньше чем вмещает double)");
                        return (i + j);
                    } else {
                        System.out.println("норм");
                        return (i + j);
                    }
                }
            }
            case "*": {
                if (j * i == Double.POSITIVE_INFINITY) {
                    System.err.println("НЕНОРМ: получилась Плюс бесконечность (полученное число больше чем вмещает double)");
                    return (i * j);
                } else {
                    if (j * i == Double.NEGATIVE_INFINITY) {
                        System.err.println("НЕНОРМ: получилась Минус бесконечность (полученное число меньше чем вмещает double)");
                        return (i * j);
                    } else {
                        System.out.println("норм");
                        return (i * j);
                    }
                }
            }
            case "-": {
                if (j - i == Double.POSITIVE_INFINITY) {
                    System.err.println("НЕНОРМ: получилась Плюс бесконечность (полученное число больше чем вмещает double)");
                    return (i - j);
                } else {
                    if (j - i == Double.NEGATIVE_INFINITY) {
                        System.err.println("НЕНОРМ: получилась Минус бесконечность (полученное число меньше чем вмещает double)");
                        return (i - j);
                    } else {
                        System.out.println("норм");
                        return (i - j);
                    }
                }
            }
            case "/": {
                if (j / i == Double.POSITIVE_INFINITY) {
                    System.err.println("НЕНОРМ: получилась Плюс бесконечность (полученное число больше чем вмещает double)");
                    return (i / j);
                } else {
                    if (j / i == Double.NEGATIVE_INFINITY) {
                        System.err.println("НЕНОРМ: получилась Минус бесконечность (полученное число меньше чем вмещает double)");
                        return (i / j);
                    } else {
                        if (j != 0) {
                            System.out.println("норм");
                            return (i / j);

                        } else {
                            System.err.println("НЕНОРМ: случилась Попытка деления на НоЛь");
                            return (i / j);
                        }
                    }


                }
            }
        }
        return 0.0;
    }
}
