package type.type03.fieldbasedDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy {

    @Qualifier("girl1")
    @Autowired
    GoodGirl girl;

    public Boy() {
        System.out.println("Boy Instanttiated");
    }

    public void kissing() {
        this.girl.kiss();
    }
}
