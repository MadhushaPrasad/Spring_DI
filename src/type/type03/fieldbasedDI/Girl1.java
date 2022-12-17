package type.type03.fieldbasedDI;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Girl1 implements GoodGirl {

    public Girl1() {
        System.out.println("Girl 1 Instanttiated");
    }

    @Override
    public void kiss() {
        System.out.println("DDDDDDD");
        System.out.println("DDDDDDDDd");
        System.out.println("DDDDDDDDd");
        System.out.println("DDDDDDDDd");
    }
}
