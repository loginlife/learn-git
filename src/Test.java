/**
 * Test.java
 * 
 * author: administrator
 * date: 2017-07-30 17:07:53
 */
public class Test {

    public void test01() {
        System.out.println("test01()");
    }

    public void test02() {
        for (int i = 0, len = 10; i < len; i ++ ) {
            System.out.println("i=" + i);
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.test01();
    }

}