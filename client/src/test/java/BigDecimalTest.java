import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by hongpf on 16/4/29.
 */
public class BigDecimalTest {

    @Test
    public void bigDecimalTest(){
        BigDecimal b = BigDecimal.valueOf(4234.22f);
        String s = b.toEngineeringString();
    }
}
