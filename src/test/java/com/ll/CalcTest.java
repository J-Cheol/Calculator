package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class CalcTest
{
    @Test
    @DisplayName(" 3 + 1 = 4 ")
    void t1()
    {
        int rs = Calc.run("3 + 1 ");
        System.out.println(rs);

        assertThat(rs).isEqualTo(5);
    }

    @Test
    @DisplayName(" 9 - 9 = 0 ")
    void t2()
    {
        int rs = Calc.run("9 - 9 ");
        System.out.println(rs);

    }

    @Test
    @DisplayName(" 10 - 10 = 0 ") // char형태로 Calc를 만들었기 때문에 2자리 수 계산 안됌 ㅠ
    void t3()
    {
        int rs = Calc.run("10 - 10");
        System.out.println(rs);
    }


}
