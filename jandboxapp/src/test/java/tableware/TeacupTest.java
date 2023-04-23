package tableware;

import org.junit.Test;

public class TeacupTest {
    @Test
    public void getSizeTest() {
        Teacup teacup = new Teacup(10, "red");
        assert teacup.getSize() == 10;
    }
}
