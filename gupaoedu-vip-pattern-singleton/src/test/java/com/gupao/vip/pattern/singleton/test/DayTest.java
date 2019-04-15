package com.gupao.vip.pattern.singleton.test;

import com.gupao.vip.pattern.singleton.register.Day;

public class DayTest {

    public static void main(String[] args) {
        Day day = Day.MONDAY;
        System.out.println(day.ordinal());
    }
}
