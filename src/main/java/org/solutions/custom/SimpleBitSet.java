package org.solutions.custom;

/**
 * Простой бит Сэт (существующий класс для хранения boolean'ов) на основе long
 * Хранит до 64  boolean
 * Условно компактный массив  boolean'ов
 */

public class SimpleBitSet {

    private long store = 0;

    public void setBit(int idx, boolean val) {

        long mask = 0b00000000_00000000_00000000_00000000_00000000_00000000_00000000_00000001;

        //смещение бита налево n раз (в нашем случае idx раз)
        mask = mask << idx;

        //если меняем бит на тру, то производим операцию ИЛИ (логическое сложение)
        if (val) {
            store = mask | store;
        //иначе инвертируем всю маску и производим операцию И (логическое умножение)
        } else {

            //~ это операция NOT (инверсия)
            mask = ~mask;
            store = mask & store;
        }

    }

    public boolean getBit(int idx) {
        long mask = 0b00000000_00000000_00000000_00000000_00000000_00000000_00000000_00000001;
        mask = mask << idx;
        return (mask & store) != 0;
    }
}
