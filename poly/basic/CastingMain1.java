package poly.basic;

public class CastingMain1 {

    public static void main(String[] args) {
        //자식 인스턴스 참조 ,  단 자식의 기능은 호출할 수 없다.
        Parent poly =  new Child();

        //다운캐스팅
        //Child child = poly;  //할 수 없음
        Child child = (Child) poly;
        child.childMethod();
    }
}
