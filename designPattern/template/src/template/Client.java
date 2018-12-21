package template;

public class Client {
    public static void main(String[] args) {
        CookTemplate cookTemplate = new CookEggRice();
        cookTemplate = new CookMeatBackPot();
        cookTemplate.doCook();
    }
}
