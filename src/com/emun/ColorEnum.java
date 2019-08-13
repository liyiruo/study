package com.emun;

public enum ColorEnum {

    RED, GREEN, BLANK, YELLOW;

    public static void main(String[] args) {
        for (ColorEnum color : ColorEnum.values()) {
            System.out.println(color.ordinal()+":"+color);
        }
    }
}
