import java.lang.StringBuffer;

public class Test2 {

    public static void main(String[] args) {
        //
    }

    public void show(String msg) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("message:").append(msg);
        System.out.println(buffer.toString());
    }
}
