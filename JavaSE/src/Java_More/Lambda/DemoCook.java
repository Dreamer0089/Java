package Java_More.Lambda;

public class DemoCook {
    public static void main(String[] args) {
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("匿名内部类：吃饭了！");
            }
        });

        invokeCook(() -> {
            System.out.println("lambda表达式：吃饭了");
        });

        invokeCook(() -> System.out.println("lambda表达式省略格式：吃饭了"));
    }
    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}
