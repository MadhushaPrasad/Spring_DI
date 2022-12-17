package type.type01.constructorBasedDI.bean;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMasterDetails {
    private long id;
    private String empName;
    private String empAddress;
    private String empDept;
}
