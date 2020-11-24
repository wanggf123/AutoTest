package paramters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public  class parametest {
    @Test
    @Parameters({"name","age"})

    public void parameters01(String name, int age){
        System.out.println("name=" + name + ";age=" + age);
    }
}
