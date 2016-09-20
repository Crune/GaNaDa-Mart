package ganada.obj.member;

import static org.junit.Assert.*;

import org.junit.Test;

public class PhoneTest {

    @Test
    public void testSetNumber() {
        Phone num = new Phone();
        num.setNumber("010-9165-0415");
        System.out.println(num.getNum1()+"//"+num.getNum2()+"//"+num.getNum3());
    }

}
