package PackageTest;

public class JavaTest {

    public final Integer code1;
    public final Integer code2;

    public JavaTest(Integer code1, Integer code2){
        if(code2 != 0){
            this.code2 = code2;
        }else {
            this.code2 = null;
        }

        if(code1 != 0){
            this.code1 = code1;
        }else {
            this.code1 = null;
        }
    }
}
