package suit;

import io.qameta.allure.*;
import org.testng.annotations.Test;

/**
 * @Author yuzhenni
 * @Date 2020/9/5
 */

public class LoginTest {
    @Test(description = "这是标题吗")
    @Feature("主要能模块")
    @Story("功能模块表的分支功能")
    @Step("步骤1到2到3到4")

    public void logintaobao(){
        System.out.println("逃吧登录成功");
    }
    @Test(description = "这是标题吗")
    @Feature("主要功能模块")
    @Story("功能模块表的分支功能")
    @Step("buz2")
    public void logintaobao2(){
        System.out.println("逃吧登录成功2");
    }
    @Test(description = "这是标题吗")
    @Feature("主要功能模块")
    @Story("功能模块表的分支功能")
    @Step("buz3")
    public void logintaobao3(){
        System.out.println("逃吧登录成功3");
    }
    @Test(description = "这是标题吗")
    @Feature("主要功能模块")
    @Story("功能模块表的分支功能")
    @Step("buz4")
    @Description("有一个描述")
    @Link("http://baidu.com")
    public void logintaobao4(){

        System.out.println("逃吧登录成功4");
    }
}
