public class week2 {

    public static void main(String[] args){
        System.out.println(true && false);
        System.out.println(true || false);
        System.out.println(false && false);
        System.out.println(true && (false || true));
        System.out.println(false || (true && false));
        System.out.println(false || 1 < 5);
        System.out.println(5 >= 4 && 1 > 3);
        System.out.println(10 < 4 || 1 > 4);
        System.out.println(12 >= 2 && 1 < 24);
        System.out.println("Hello".charAt(0) == 'h');

        boolean isHotOutsie = false;
        boolean isWeekday = true;
        boolean hasMoneyInPocket = true;
        double costOfMilk = 2.15;
        double moneyInWallet = 16.37;
        int thirstLevel = 6;

        boolean shouldBuyIceCream = isHotOutsie && hasMoneyInPocket;
        boolean willGoSwimming = isHotOutsie && !isWeekday;
        boolean isAGoodDay = isHotOutsie && hasMoneyInPocket && !isWeekday;
        boolean willBuyMilk = thirstLevel > 3 && moneyInWallet > costOfMilk * 2;

        System.out.println("Should I buy ice cream?: " + shouldBuyIceCream);
        System.out.println("Will I go swimming?: " + willGoSwimming);
        System.out.println("Is it a good day?: " + isAGoodDay);
        System.out.println("Will I buy milk?: " + willBuyMilk);
    }

}