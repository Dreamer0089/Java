package Java_Base.forInsideClass;

public class Body {

    int num = 10;

    public class Heart {

        int num = 20;

        public void beat() {
            System.out.println("心脏跳动！");
        }

        public void methodHeart() {
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Body.this.num);//外部类.this.外部类的成员变量   内部类访问外部类成员变量
        }
    }
    private String name;

    public void methodBody() {
        System.out.println("外部类方法！");
        Heart heart = new Heart();
        heart.beat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
