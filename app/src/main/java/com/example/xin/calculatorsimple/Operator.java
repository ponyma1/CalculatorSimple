package com.example.xin.calculatorsimple;

/**
 * Created by xiaoqian-niu on 2016-02-15.
 */
public class Operator extends Element {
    private int level;
    private char symbol;
    private boolean left_assoiative;


    public Operator(char c){
        symbol = c;

        super.isOperator = true;

        left_assoiative = true;

        switch(c){
            case '+':
            case '-':
                level = 0;
                break;
            case '*':
            case '/':
            case '%':
                level = 1;
                break;
            case '^':
                level = 2;
                left_assoiative = false;
                break;
            default:
                isOperator = false;
        }
    }

    public Operator(String str){
        symbol = str.charAt(0);
        char c = symbol;

        super.isOperator = true;

        left_assoiative = true;

        switch(c){
            case '+':
            case '-':
                level = 0;
                break;
            case '*':
            case '/':
            case '%':
                level = 1;
                break;
            case '^':
                level = 2;
                left_assoiative = false;
                break;
            default:
                isOperator = false;
        }

    }

    public boolean isOperator() {
        return isOperator;
    }

    public boolean isLeft_assoiative() {
        return left_assoiative;
    }

    public int getLevel() {
        return level;
    }

    public char getSymbol() {
        return symbol;
    }


    /*Using the static for call directly, not through an object */
    public static int getLevel(char c) {
        switch (c) {
            case '+':
            case '-':
                return 0;
            case '*':
            case '/':
            case '%':
                return 1;
            case '^':
                return 2;
            default:
                /* level == -1 means the Operator is invalid */
                return -1;
        }
    }


    @Override
    public String toString() {
        return String.valueOf(symbol);
    }

    public static boolean isOperator(char c){
        switch(c){
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
                return true;
            default:
                return false;
        }
    }
}
