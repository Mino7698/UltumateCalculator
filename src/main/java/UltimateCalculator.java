public class UltimateCalculator {

    public static double EasyCalculate(double i, CalculateSymbols e, double j) throws Exception{
        switch (e) {
            case p:return plus(i,j);
            case u:return multiplication(i,j);
            case m:return minus(i,j);
            case d:return Division(i,j);
        }
        return 0.0;
    }

    private static double Division(double i, double j) throws Exception{
        try {
            if (j / i == Double.POSITIVE_INFINITY) {
                throw new Exception("НЕНОРМ: получилась Плюс бесконечность (полученное число больше чем вмещает double)");
            } else {
                if (j / i == Double.NEGATIVE_INFINITY) {
                    throw new Exception("НЕНОРМ: получилась Минус бесконечность (полученное число меньше чем вмещает double)");
                } else {
                    if (j != 0) {
                        System.out.println("норм");
                        return (i / j);
                    } else {
                        throw new Exception("НЕНОРМ: случилась Попытка деления на НоЛь");
                    }
                }
            }
        }
        catch (Exception ex){
            System.err.println(ex);
            return (i / j);
        }
    }
    private static double minus (double i, double j)throws Exception{
        try {
            if (j - i == Double.POSITIVE_INFINITY) {
                throw new Exception("НЕНОРМ: получилась Плюс бесконечность (полученное число больше чем вмещает double)");
            } else {
                if (j - i == Double.NEGATIVE_INFINITY) {
                    throw new Exception("НЕНОРМ: получилась Минус бесконечность (полученное число меньше чем вмещает double)");
                } else {
                    System.out.println("норм");
                    return (i - j);
                }
            }
        }
        catch (Exception ex){
            System.err.println(ex);
            return (i - j);
        }
    }
    private static double multiplication (double i, double j)throws Exception{
        try {
            if (j * i == Double.POSITIVE_INFINITY) {
                throw new Exception("НЕНОРМ: получилась Плюс бесконечность (полученное число больше чем вмещает double)");
            } else {
                if (j * i == Double.NEGATIVE_INFINITY) {
                    throw new Exception("НЕНОРМ: получилась Минус бесконечность (полученное число меньше чем вмещает double)");
                } else {
                    System.out.println("норм");
                    return (i * j);
                }
            }
        }
        catch (Exception ex){
            System.err.println(ex);
            return (i * j);
        }
    }
    private static double plus (double i, double j) throws Exception {
        try {
            if (j + i == Double.POSITIVE_INFINITY) {
                throw new Exception("НЕНОРМ: получилась Плюс бесконечность (полученное число больше чем вмещает double)");
            } else {
                if (j + i == Double.NEGATIVE_INFINITY) {
                    throw new Exception("НЕНОРМ: получилась Минус бесконечность (полученное число меньше чем вмещает double)");
                } else {
                    System.out.println("норм");
                    return (i + j);
                }
            }
        }
        catch (Exception ex){
            System.err.println(ex);
            return (i + j);
        }
    }

}
