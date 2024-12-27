package org.com;

import java.util.ArrayList;
import java.util.List;

public class Buchstabentafel {
    public enum Letter {
        A(1, "albert"), B(2,"berhard"), C(3, "caesar"), D(4, "david"),
        E(5, "emil"), F(6, "friedrich"), G(7, "gustav"), H(8, "heinrich"),
        I(9, "ida"), J(10, "jakob"), K(11, "katharina"), L(12, "ludwig"),
        M(13, "marie"), N(14, "nathan"), O(15, "otto"), P(16, "paula"),
        Q(17, "quelle"), R(18, "richard"), S(19, "samuel"), T(20, "theodor"),
        U(21, "ulrich"), V(22, "viktor"), W(23, "wilhelm"), X(24, "xray"),
        Y(25, "ypsilon"), Z(26, "zacharias");

        private final int value;
        private final String word;

        Letter(int value, String word) {
            this.value = value;
            this.word = word;
        }

        public int getValue() {
            return value;
        }

        public String getWord(){
            return word;
        }
    }

    List<String> str = new ArrayList<>();

    void addLetter(Letter letter){
        //str.add(letter.);
    }

    public List<String> getListOfWords(){
        return new ArrayList<>(str);
    }
}
