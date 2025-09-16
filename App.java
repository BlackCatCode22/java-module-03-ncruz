//9/16/2025
//ncruz

public class App {
    public static void main(String[] args) {
        //create chef object
        Chef normalChef = new Chef();
        normalChef.makeChicken();

        Chef ItalianChef = new Chef();
        ItalianChef.makeSpecialDish();

        Chef ChineseChef = new Chef();
        ChineseChef.makeSpecialDish();
    }
}