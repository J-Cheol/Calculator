package com.ll;

public class Calc
{
    public static int run(String calc)
    {
        char[] chars = calc.toCharArray();
        int num1 = 0;
        int num2 = 0;
        char operator = ' ';
        for (char c : chars)
        {
            if (c >= '0' && c <= '9')
            {
                if(num1 == 0)
                    num1 = c - '0';
                else
                {
                    num2 = c - '0';
                }
            } else if (c == '*' || c == '/' || c == '%' || c == '+' || c == '-')
                operator = c;
        }

        int result = 0;
        if (operator == '*')
            result = num1 * num2;
        if (operator == '/')
            result = num1 / num2;
        if (operator == '%')
            result = num1 % num2;
        if (operator == '-')
            result = num1 - num2;
        if (operator == '+')
            result = num1 + num2;

        return result;
    }
}
