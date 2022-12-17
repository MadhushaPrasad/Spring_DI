package type.type03.fieldbasedDI;

//@Component
public class OldBoy implements SuperInterface {

//    //property injection
//    @Autowired
//    GoodGirl girl;

//    GoodGirl girl;

    //    constructor injection
//    @Autowired
//    public Boy(Girl g) {
//        this.girl = g;
//        System.out.println("Boy Instanttiated");
//    }

//    //   setter injection
//    @Autowired
//    public void setGirl(Girl g) {
//        this.girl = g;
//    }


    //  interface through Injection
//    @Autowired
//    @Override
    public void inject(Girl1 girl) {
//        this.girl = girl;
    }


//    public void kiss() {
//        this.girl.kiss();
//    }



}
