package suit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

/**
 * @Author yuzhenni
 * @Date 2020/9/5
 */

public class suitConfig {
    @BeforeSuite
    public void bs(){
        System.out.println("suit运行了");
    }
    @AfterSuite
    public void as(){
        System.out.println("aftersuti运行了");
    }
}
