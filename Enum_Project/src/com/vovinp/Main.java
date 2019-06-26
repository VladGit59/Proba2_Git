package com.vovinp;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(Color.RED.getCode());
        System.out.println(Color.BLUE.getCode());

        Operation op = Operation.SUM;
        System.out.println(op.action(5, 7));

        op = Operation.SUBTRACT;
        System.out.println(op.action(2,3));
        System.out.println(op.action(8,7));
        System.out.println(op);
        System.out.println(op.getClass());
    }
}

enum Operation {
    SUM {
        public int action(int x, int y) {
            return x + y;
        }
    },
    SUBTRACT {
        public int action(int x, int y) {
            return x - y;
        }
    };

    public abstract int action(int x, int y);
}

enum Color {
    RED("#FF0000"), BLUE("#0000FF"), GREEN("#00FF00");
    private String code;

    Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
