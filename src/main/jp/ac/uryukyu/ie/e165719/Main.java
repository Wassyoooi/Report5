package jp.ac.uryukyu.ie.e165719;

public class Main {
    public static void main(String[] args) {
        String str = "3．14";
        try {
            double value = Double.parseDouble(str);
            System.out.println(value);
        } catch (NullPointerException e){
            System.out.println("NullPointerExceptionが発生しました。");
            e.printStackTrace();
        }
    }
}