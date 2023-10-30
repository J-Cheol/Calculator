package com.ll;

public class Calc
{
    public static int run(String exp)
    {
        if (exp.isBlank())
            return 0;

        while (exp.startsWith("(") && exp.endsWith(")"))
        {
            exp = exp.substring(1, exp.length() - 1);
        }
        final String[] expBits = exp.split(" ");
        final String sign = expBits[1];


        int num1 = Integer.parseInt(expBits[0]);
        int num2 = Integer.parseInt(expBits[2]);

        switch (sign)
        {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            case "%":
                return num1 % num2;
            default:
                return 0;
        }
    }
}

//        if (exp.isBlank())
//            return 0;
//        if (exp.contains("+"))
//        {
//            String[] exps = exp.split(" \\+ ");
//            int num1 = Integer.parseInt(exps[0]);
//            int num2 = Integer.parseInt(exps[1]);
//            return num1 + num2;
//        }
//        if (exp.contains("-"))
//        {
//            String[] exps = exp.split(" \\- ");
//            int num1 = Integer.parseInt(exps[0]);
//            int num2 = Integer.parseInt(exps[1]);
//            return num1 - num2;
//        }
//        if (exp.contains("*"))
//        {
//            String[] exps = exp.split(" \\* ");
//            int num1 = Integer.parseInt(exps[0]);
//            int num2 = Integer.parseInt(exps[1]);
//            return num1 * num2;
//        }
//        if (exp.contains("/"))
//        {
//            String[] exps = exp.split(" \\/ ");
//            int num1 = Integer.parseInt(exps[0]);
//            int num2 = Integer.parseInt(exps[1]);
//            return num1 / num2;
//        }
//        if (exp.contains("%"))
//        {
//            String[] exps = exp.split(" \\% ");
//            int num1 = Integer.parseInt(exps[0]);
//            int num2 = Integer.parseInt(exps[1]);
//            return num1 % num2;
//        }
//
//        return 0;