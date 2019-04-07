package ru.arvalon.alltests;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Первый левел - простые Unit-тесты.
 * Created by arvalon on 09.02.2018.
 */


public class UnitTestEmail {

    @Test
    public void isEmailCorrect(){
        assertThat(EmailUtil.isEmail("dima@ya.ru"),is(true));
    }

    @Test
    public void isEmailIncorrect(){
        assertThat(EmailUtil.isEmail("dima"),is(false));
    }

    /** показатель того что функция проверки email'а не совершенная. Проглатывает двойной @ к примеру */
    @Test
    public void isEmailStrange(){
        assertThat(EmailUtil.isEmail("dima@ya@google.com"),is(true));
    }

    @Test
    public void isnoIP(){
        System.out.println("Unit test...");
        assertThat(EmailUtil.isIP("444.555.2.3"),is(false));
    }

    @Test
    public void isIP(){
        assertThat(EmailUtil.isIP("192.168.1.2"),is(true));
    }
}
