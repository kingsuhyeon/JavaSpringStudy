package ref;

public class MethodChange1 {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: "+a );
        changePrimitve(a);
        System.out.println("메서드 호출 후: "+a );


    }
    static void changePrimitve(int x){
        x =20;

    }
}
