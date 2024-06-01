package poly.overriding;

public class OverridingMain {

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("Child => Child");
        System.out.println("value = " +child.value);
        child.method();
        System.out.println();
        Parent parent = new Parent();
        System.out.println("Parent => Parent");
        System.out.println("value = " + parent.value);
        parent.method();
        System.out.println();
        Parent poly = new Child();
        System.out.println("Parent -> " +poly.value); //변수는 오버라이딩 X
        poly.method();
    }
}
