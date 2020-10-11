package myTest;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ConvertNumberTest {

    @Test
    public void whenNumber0() {
        ConvertNumber num = new ConvertNumber();
        String result = num.NumbertoString(0);

        assertThat(result, is("ноль"));
    }

    @Test
    public void whenNumber2() {
        ConvertNumber num = new ConvertNumber();
        String result = num.NumbertoString(02);

        assertThat(result, is("два"));
    }

    @Test
    public void whenNumber5() {
        ConvertNumber num = new ConvertNumber();
        String result = num.NumbertoString(5);

        assertThat(result, is("пять"));
    }

    @Test
    public void whenNumber10() {
        ConvertNumber num = new ConvertNumber();
        String result = num.NumbertoString(10);

        assertThat(result, is("десять"));
    }

    @Test
    public void whenNumber15() {
        ConvertNumber num = new ConvertNumber();
        String result = num.NumbertoString(15);

        assertThat(result, is("пятнадцать"));
    }

    @Test
    public void whenNumber11() {
        ConvertNumber num = new ConvertNumber();
        String result = num.NumbertoString(11);

        assertThat(result, is("одиннадцать"));
    }

    @Test
    public void whenNumber24() {
        ConvertNumber num = new ConvertNumber();
        String result = num.NumbertoString(24);

        assertThat(result, is("двадцать четыре"));
    }

    @Test
    public void whenNumber36() {
        ConvertNumber num = new ConvertNumber();
        String result = num.NumbertoString(36);

        assertThat(result, is("тридцать шесть"));
    }

    @Test
    public void whenNumber47() {
        ConvertNumber num = new ConvertNumber();
        String result = num.NumbertoString(47);

        assertThat(result, is("сорок семь"));
    }

    @Test
    public void whenNumber58() {
        ConvertNumber num = new ConvertNumber();
        String result = num.NumbertoString(58);

        assertThat(result, is("пятьдесят восемь"));
    }

    @Test
    public void whenNumber69() {
        ConvertNumber num = new ConvertNumber();
        String result = num.NumbertoString(69);

        assertThat(result, is("шестьдесят девять"));
    }

    @Test
    public void whenNumber72() {
        ConvertNumber num = new ConvertNumber();
        String result = num.NumbertoString(72);

        assertThat(result, is("семьдесят два"));
    }

    @Test
    public void whenNumber81() {
        ConvertNumber num = new ConvertNumber();
        String result = num.NumbertoString(81);

        assertThat(result, is("восемьдесят один"));
    }

    @Test
    public void whenNumber92() {
        ConvertNumber num = new ConvertNumber();
        String result = num.NumbertoString(92);

        assertThat(result, is("девяносто два"));
    }

    @Test
    public void whenNumber55() {
        ConvertNumber num = new ConvertNumber();
        String result = num.NumbertoString(55);

        assertThat(result, is("пятьдесят пять"));
    }

    @Test
    public void whenNumber100() {
        ConvertNumber num = new ConvertNumber();
        String result = num.NumbertoString(100);

        assertThat(result, is("сто"));
    }

    @Test
    public void whenNumber101() {
        ConvertNumber num = new ConvertNumber();
        String result = num.NumbertoString(101);

        assertThat(result, is("сто один"));
    }

    @Test
    public void whenNumber123() {
        ConvertNumber num = new ConvertNumber();
        String result = num.NumbertoString(123);

        assertThat(result, is("сто двадцать три"));
    }

    @Test
    public void whenNumber291() {
        ConvertNumber num = new ConvertNumber();
        String result = num.NumbertoString(291);

        assertThat(result, is("двести девяносто один"));
    }

    @Test
    public void whenNumber900() {
        ConvertNumber num = new ConvertNumber();
        String result = num.NumbertoString(900);

        assertThat(result, is("девятьсот"));
    }

    @Test
    public void whenNumber313() {
        ConvertNumber num = new ConvertNumber();
        String result = num.NumbertoString(313);

        assertThat(result, is("тристо тринадцать"));
    }

    @Test
    public void whenNumber514() {
        ConvertNumber num = new ConvertNumber();
        String result = num.NumbertoString(514);

        assertThat(result, is("пятсот четырнадцать"));
    }

    @Test
    public void whenNumber416() {
        ConvertNumber num = new ConvertNumber();
        String result = num.NumbertoString(416);

        assertThat(result, is("четыресто шестнадцать"));
    }

    @Test
    public void whenNumber617() {
        ConvertNumber num = new ConvertNumber();
        String result = num.NumbertoString(617);

        assertThat(result, is("шестьсот семнадцать"));
    }

    @Test
    public void whenNumber118() {
        ConvertNumber num = new ConvertNumber();
        String result = num.NumbertoString(118);

        assertThat(result, is("сто восемнадцать"));
    }

    @Test
    public void whenNumber719() {
        ConvertNumber num = new ConvertNumber();
        String result = num.NumbertoString(719);

        assertThat(result, is("семьсот девятнадцать"));
    }

    @Test
    public void whenNumber999() {
        ConvertNumber num = new ConvertNumber();
        String result = num.NumbertoString(999);

        assertThat(result, is("девятьсот девяносто девять"));
    }

    @Test (expected = IllegalArgumentException.class)
    public void whenNumber1000() {
        ConvertNumber num = new ConvertNumber();
        String result = num.NumbertoString(1000);
    }

    @Test (expected = IllegalArgumentException.class)
    public void whenNumberNegativeNumber() {
        ConvertNumber num = new ConvertNumber();
        String result = num.NumbertoString(-1);
    }
}