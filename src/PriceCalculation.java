public class PriceCalculation {
    public static void main(String[] args) {
        double laptopPrice = 85000;
        double mousePrice = 2500;
        double discountPercentage = 15;

        double totalPriceBeforeDiscount = laptopPrice + mousePrice;

        double discountAmount = (discountPercentage / 100) * totalPriceBeforeDiscount;

        double totalPriceAfterDiscount = totalPriceBeforeDiscount - discountAmount;

        System.out.println("Total cost after applying " + discountPercentage + "% discount: " + totalPriceAfterDiscount + " TK");
    }
}