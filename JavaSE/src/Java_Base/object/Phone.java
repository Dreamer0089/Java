package Java_Base.object;

/*

    定义一个手机类：
        属性：品牌、价格、颜色
        行为：打电话、发短信
 */
public class Phone {
    String brand;
    int price;
    String color;
    public Phone() {
        System.out.println(price + "块钱的" + color + "的" + brand + "手机！");
    }

    public void call(String name) {
        System.out.println("给" + name + "打电话！");
    }
    public void sendMessage() {
        System.out.println("群发短信！");
    }
}
