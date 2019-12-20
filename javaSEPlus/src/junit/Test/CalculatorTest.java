package junit.Test;


import junit.Junit.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    //测试add方法

    @Test
    public void testAdd() {
        //1.创建对象
        Calculator c = new Calculator();
        //2.调用方法
        int result = c.add(3, 6);
        //3.断言  判断 测试结果与预期结果是否相同
        Assert.assertEquals(9,result);

    }

}
