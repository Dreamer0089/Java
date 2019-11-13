package Java_Base.object;

public class TestPhone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "iPhone";
        phone.price = 3999;
        phone.color = "银白色";

        phone.call("杨洋");
        phone.sendMessage();
        System.out.println(phone.getClass().toString());

    }
}
