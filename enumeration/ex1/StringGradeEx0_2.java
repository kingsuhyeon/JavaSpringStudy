package enumeration.ex1;

public class StringGradeEx0_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        //존재하지 않는 등급 입력

        int vip = discountService.discount("VIP", price);




        int basic = discountService.discount("BASIC", price);
        int gold = discountService.discount("GOLD", price);
        int diamond = discountService.discount("DIAMOND", price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("gold 등급의 할인 금액: " + gold);
        System.out.println("diamond 등급의 할인 금액: " + diamond);
        System.out.println("VIP 등급의 할인 금액: " + vip);
    }
}
