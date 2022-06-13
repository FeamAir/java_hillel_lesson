package com.hillel.korolhomework12;

public enum Answer {
    YES(1),
    NO(2);

    private final int value;

    Answer(int value) {
        this.value = value;
    }

    public static Answer convert(int value){
        for (Answer answer : values()) {
            if (answer.value == value) {
                return answer;
            }
        }
        return NO;
    }
}