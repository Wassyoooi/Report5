package jp.ac.uryukyu.ie.e165719;

public class Main {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e){
            System.out.println("NullPointerExceptionが発生しました。");
            e.printStackTrace();
        }
    }
}