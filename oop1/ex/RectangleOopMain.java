package oop1.ex;

public class RectangleOopMain {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;

        int area = rectangle.calculateArea();
        System.out.println("넗이"+ area);

        int parammeter = rectangle.calculatePerimeter();
        System.out.println("둘레 길이" +parammeter);

        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부" + square);
    }
}
