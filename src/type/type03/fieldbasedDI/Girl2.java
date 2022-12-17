package type.type03.fieldbasedDI;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Girl2 implements GoodGirl {
    public Girl2() {
        System.out.println("Girl 2 Instanttiated");
    }

    @Override
    public void kiss() {
        System.out.println("DDDDDDDDd");
        System.out.println("DDDDDDDDd");
        System.out.println("DDDDDDDDd");
    }
}
