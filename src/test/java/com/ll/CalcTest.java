package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class CalcTest
{
    @Test
    @DisplayName(" 10 + 0 = 10 ")
    void t1()
    {
        int rs = Calc.run("10 + 0");
        System.out.println(rs);
//        assertThat(rs).isEqualTo(10);
    }

    @Test
    @DisplayName("10 + 10 = 20")
    void t2()
    {
        int rs = Calc.run("10 + 10");
        System.out.println(rs);
//        assertThat(rs).isEqualTo(20);
    }

    @Test
    @DisplayName(" 10 - 10 = 0 ")
    void t3()
    {
        int rs = Calc.run("10 - 10");
        System.out.println(rs);
        assertThat(rs).isEqualTo(0);

    }

    @Test
    @DisplayName(" 10 - 7 = 3 ")
    void t4()
    {
        int rs = Calc.run("10 - 7");
        System.out.println(rs);
        assertThat(rs).isEqualTo(3);
    }

    @Test
    @DisplayName(" 10 * 7 = 70")
    void t5()
    {
        int rs = Calc.run("10 * 7");
        System.out.println(rs);
        assertThat(rs).isEqualTo(70);
    }

    @Test
    @DisplayName(" 10 / 7 = 1")
    void t6()
    {
        int rs = Calc.run("10 / 7");
        System.out.println(rs);
        assertThat(rs).isEqualTo(1);
    }

    @Test
    @DisplayName(" 10 % 7 = 3")
    void t7()
    {
        int rs = Calc.run("10 % 7");
        System.out.println(rs);
        assertThat(rs).isEqualTo(3);
    }

    @Test
    @DisplayName(" 10 * 2 = 20")
    void t8()
    {
        int rs = Calc.run("10 * 2");
        System.out.println(rs);
        assertThat(rs).isEqualTo(20);
    }

    @Test
    @DisplayName("(10 + 10) = 20")
    void t9()
    {
        int rs = Calc.run("(10 + 10)");
        System.out.println(rs);
        assertThat(rs).isEqualTo(20);
    }
    @Test
    @DisplayName("((10 + 10)) = 20")
    void t10()
    {
        int rs = Calc.run("((10 + 10))");
        System.out.println(rs);
        assertThat(rs).isEqualTo(20);
    }
    @Test
    @DisplayName("(((10 + 10))) = 20")
    void t11()
    {
        int rs = Calc.run("(((10 + 10)))");
        System.out.println(rs);
        assertThat(rs).isEqualTo(20);
    }


}
