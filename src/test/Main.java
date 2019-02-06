package test;

public class Main {

    public static void main(String[] args) {
        int v = 6;
        boolean isPowerOfTwo = v && !(v && (v - 1));
//        System.out.println("Hello World!");
//        String s = "1" + "2" + "2" + "2" + "2" + "2" + "2" + "2" + "2" + "2" + 5 + "2";
//        String d = "1".concat("2").concat("3").concat("4").concat(5);
//        boolean ddd = true;
//        long e = 5L;
//        switch (3){
//
//        }
        System.out.println(getChar(25));
    }

    private static char getChar(int value){
        String c = String.valueOf(value);
        return c.charAt(0);
    }
}