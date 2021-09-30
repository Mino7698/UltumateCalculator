public class UltimateCalculator {

    public static double EasyCalculate(double firstValue, CalculateSymbols e, double secondValue) throws CalculateException, CalculateException {

        switch (e) {
            case PLUS:return plus(firstValue,secondValue);
            case MULTIPLICATION:return multiplication(firstValue,secondValue);
            case MINUS:return minus(firstValue,secondValue);
            case DIVISION:return division(firstValue,secondValue);
        }
        return 0.0;
    }

    private static double division(double firstValue, double secondValue) throws CalculateException{
        if (secondValue == 0)
            throw new CalculateException("НЕНОРМ: случилась Попытка деления на НоЛь",Double.POSITIVE_INFINITY);
            else if (firstValue / secondValue == Double.POSITIVE_INFINITY)
                throw new CalculateException("НЕНОРМ: получилась Плюс бесконечность (полученное число больше чем вмещает double)",Double.POSITIVE_INFINITY);
             else if (firstValue / secondValue == Double.NEGATIVE_INFINITY)
                 throw new CalculateException("НЕНОРМ: получилась Минус бесконечность (полученное число меньше чем вмещает double)",Double.NEGATIVE_INFINITY);
                else {
                    System.out.println("норм");
                    return (firstValue / secondValue);
                }
    }

    private static double minus (double firstValue, double secondValue)throws CalculateException{
        if (firstValue - secondValue == Double.POSITIVE_INFINITY)
                throw new CalculateException("НЕНОРМ: получилась Плюс бесконечность (полученное число больше чем вмещает double)",Double.POSITIVE_INFINITY);
            else if (firstValue - secondValue == Double.NEGATIVE_INFINITY)
                    throw new CalculateException("НЕНОРМ: получилась Минус бесконечность (полученное число меньше чем вмещает double)",Double.NEGATIVE_INFINITY);
                else {
                    System.out.println("норм");
                    return (firstValue - secondValue);
                }

    }
    private static double multiplication (double firstValue, double secondValue)throws CalculateException{
             if (firstValue * secondValue == Double.POSITIVE_INFINITY)
                 throw new CalculateException("НЕНОРМ: получилась Плюс бесконечность (полученное число больше чем вмещает double)",Double.POSITIVE_INFINITY);
             else if (firstValue * secondValue == Double.NEGATIVE_INFINITY)
                 throw new CalculateException("НЕНОРМ: получилась Минус бесконечность (полученное число меньше чем вмещает double)",Double.NEGATIVE_INFINITY);
                else {
                    System.out.println("норм");
                    return (firstValue * secondValue);
                 }

    }
    private static double plus (double firstValue, double secondValue) throws CalculateException {
            if (firstValue + secondValue == Double.POSITIVE_INFINITY)
                throw new CalculateException("НЕНОРМ: получилась Плюс бесконечность (полученное число больше чем вмещает double)",Double.POSITIVE_INFINITY);
                else if (firstValue + secondValue == Double.NEGATIVE_INFINITY)
                    throw new CalculateException("НЕНОРМ: получилась Минус бесконечность (полученное число меньше чем вмещает double)",Double.NEGATIVE_INFINITY);
                    else {
                    System.out.println("норм");
                    return (firstValue + secondValue);
                }
    }

    public static class CalculateException extends Throwable {
        private double number;
        public double getNumber(){return number;}
        public CalculateException(String message, double num){

            super(message);
            number=num;
        }
    }
}




