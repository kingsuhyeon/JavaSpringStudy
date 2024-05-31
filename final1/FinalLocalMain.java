package final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        final int data1;
        data1 = 10; //최초 한번만 할당 가능
        //data1 = 12;

        final int data2 = 10;
        //data2 = 12;
    }
    static void method (final int parameter) {
        //patameter = 20; 컴파일 오류
    }
}
