package com.amiintellect.test;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import com.amiintellect.constant.Name_login;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ss{

    public void testUi() throws Exception {
//        Name_login.mydriver.get("http://develop.edge.customs.dev.amiintellect.com/#/account/sign-in?returnUrl=/home");
//        Name_login.mydriver.findElement(By.id("loginName")).click();
//        Name_login.mydriver.findElement(By.id("loginName")).clear();
//        Name_login.mydriver.findElement(By.id("loginName")).sendKeys("0215测试001");
//        Name_login.mydriver.findElement(By.id("password")).clear();
//        Name_login.mydriver.findElement(By.id("password")).sendKeys("123456");
//        Name_login.mydriver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(1000);
        Name_login.mydriver.findElement(By.linkText("货物申报")).click();
        Thread.sleep(500);
        Name_login.mydriver.findElement(By.linkText("货物申报制单(进口)")).click();
        Thread.sleep(1500);
        Name_login.mydriver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
        Name_login.mydriver.findElement(By.xpath("(//input[@value=''])[2]")).click();
        Name_login.mydriver.findElement(By.xpath("//input[@value='1']")).clear();
        Name_login.mydriver.findElement(By.xpath("//input[@value='1']")).sendKeys("1");
        Name_login.mydriver.findElement(By.id("cusDecStatus")).click();
        Name_login.mydriver.findElement(By.xpath("(//input[@value=''])[3]")).click();
        Name_login.mydriver.findElement(By.xpath("//div[@id='b620bd5c-01cb-42b8-d8b5-b2b36ab02bdf']/ul/li[2]")).click();
        Name_login.mydriver.findElement(By.xpath("//input[@value='1501|长春海关']")).clear();
        Name_login.mydriver.findElement(By.xpath("//input[@value='1501|长春海关']")).sendKeys("1501|长春海关");
        Name_login.mydriver.findElement(By.xpath("(//input[@value=''])[7]")).click();
        Name_login.mydriver.findElement(By.xpath("//div[@id='cf1d8464-cc67-4962-a807-fc60158e573f']/ul/li[2]")).click();
        Name_login.mydriver.findElement(By.xpath("(//input[@value='1501|长春海关'])[2]")).clear();
        Name_login.mydriver.findElement(By.xpath("(//input[@value='1501|长春海关'])[2]")).sendKeys("1501|长春海关");
        Name_login.mydriver.findElement(By.id("iEDate")).click();
        Name_login.mydriver.findElement(By.id("iEDate")).clear();
        Name_login.mydriver.findElement(By.id("iEDate")).sendKeys("20201212");
        Name_login.mydriver.findElement(By.xpath("(//input[@value=''])[11]")).click();
        Name_login.mydriver.findElement(By.xpath("(//input[@value=''])[13]")).click();
        Name_login.mydriver.findElement(By.xpath("//div[@id='d281c039-9ab2-4ac9-c5e9-6d8b3ef096ce']/ul/li[5]")).click();
        Name_login.mydriver.findElement(By.xpath("//input[@value='bgd001']")).clear();
        Name_login.mydriver.findElement(By.xpath("//input[@value='bgd001']")).sendKeys("bgd001");
        Name_login.mydriver.findElement(By.id("consigneeIsNameAndAddress")).click();
        Name_login.mydriver.findElement(By.id("consigneeIsNameAndAddress")).clear();
        Name_login.mydriver.findElement(By.id("consigneeIsNameAndAddress")).sendKeys("123");
        Name_login.mydriver.findElement(By.xpath("(//input[@value=''])[14]")).click();
        Name_login.mydriver.findElement(By.xpath("//div[@id='872f0d24-38bb-46ee-fdf5-9609c621ff0c']/ul/li[5]")).click();
        Name_login.mydriver.findElement(By.xpath("(//input[@value='bgd001'])[2]")).clear();
        Name_login.mydriver.findElement(By.xpath("(//input[@value='bgd001'])[2]")).sendKeys("bgd001");
        Name_login.mydriver.findElement(By.xpath("(//input[@value=''])[12]")).click();
        Name_login.mydriver.findElement(By.xpath("//div[@id='6965fcd7-d4f0-4159-c761-8b027a58fc43']/ul/li/div/div")).click();
        Name_login.mydriver.findElement(By.xpath("//input[@value='1|监管仓库']")).clear();
        Name_login.mydriver.findElement(By.xpath("//input[@value='1|监管仓库']")).sendKeys("1|监管仓库");
        Name_login.mydriver.findElement(By.id("trafName")).click();
        Name_login.mydriver.findElement(By.id("trafName")).clear();
        Name_login.mydriver.findElement(By.id("trafName")).sendKeys("123");
        Name_login.mydriver.findElement(By.xpath("(//input[@value=''])[17]")).click();
        Name_login.mydriver.findElement(By.xpath("//div[@id='eed8ff45-1f02-4217-e19f-89b9499cc71e']/ul/li[7]")).click();
        Name_login.mydriver.findElement(By.xpath("//input[@value='KHM|柬埔寨']")).clear();
        Name_login.mydriver.findElement(By.xpath("//input[@value='KHM|柬埔寨']")).sendKeys("KHM|柬埔寨");
        Name_login.mydriver.findElement(By.xpath("(//input[@value=''])[17]")).click();
        Name_login.mydriver.findElement(By.xpath("//div[@id='14f87f70-c93d-42a4-84a5-21571e319fc5']/ul/li[5]/div/div")).click();
        Name_login.mydriver.findElement(By.xpath("//input[@value='991204|天津东疆保税港区']")).clear();
        Name_login.mydriver.findElement(By.xpath("//input[@value='991204|天津东疆保税港区']")).sendKeys("991204|天津东疆保税港区");
        Name_login.mydriver.findElement(By.xpath("(//input[@value=''])[14]")).click();
        Name_login.mydriver.findElement(By.xpath("//div[@id='bfe1868b-97b9-4c39-bf61-2bb4c8a07e7f']/ul/li[5]/div/div")).click();
        Name_login.mydriver.findElement(By.xpath("//input[@value='1215|保税工厂']")).clear();
        Name_login.mydriver.findElement(By.xpath("//input[@value='1215|保税工厂']")).sendKeys("1215|保税工厂");
        Name_login.mydriver.findElement(By.xpath("(//input[@value=''])[16]")).click();
        Name_login.mydriver.findElement(By.xpath("//div[@id='ba6248d5-562e-43ff-a178-4f9b8876c42f']/ul/li")).click();
        Name_login.mydriver.findElement(By.xpath("//input[@value='1|CIF']")).clear();
        Name_login.mydriver.findElement(By.xpath("//input[@value='1|CIF']")).sendKeys("1|CIF");
        Name_login.mydriver.findElement(By.xpath("(//input[@value=''])[30]")).click();
        Name_login.mydriver.findElement(By.id("packages")).click();
        Name_login.mydriver.findElement(By.id("packages")).clear();
        Name_login.mydriver.findElement(By.id("packages")).sendKeys("1");
        Name_login.mydriver.findElement(By.xpath("(//input[@value=''])[25]")).click();
        Name_login.mydriver.findElement(By.xpath("//div[@id='fd5b515c-6cee-4133-bfb8-7124346a4934']/ul/li/div/div")).click();
        Name_login.mydriver.findElement(By.xpath("//input[@value='01|裸装']")).clear();
        Name_login.mydriver.findElement(By.xpath("//input[@value='01|裸装']")).sendKeys("01|裸装");
        Name_login.mydriver.findElement(By.id("grossWeight")).click();
        Name_login.mydriver.findElement(By.id("grossWeight")).clear();
        Name_login.mydriver.findElement(By.id("grossWeight")).sendKeys("1");
        Name_login.mydriver.findElement(By.id("netWeight")).click();
        Name_login.mydriver.findElement(By.id("netWeight")).clear();
        Name_login.mydriver.findElement(By.id("netWeight")).sendKeys("1");
        Name_login.mydriver.findElement(By.xpath("(//input[@value=''])[26]")).click();
        Name_login.mydriver.findElement(By.xpath("//div[@id='6f52417f-c8c7-4910-b788-5f24d0c2bc4c']/ul/li[6]/div/div")).click();
        Name_login.mydriver.findElement(By.xpath("//input[@value='MMR|缅甸']")).clear();
        Name_login.mydriver.findElement(By.xpath("//input[@value='MMR|缅甸']")).sendKeys("MMR|缅甸");
        Name_login.mydriver.findElement(By.xpath("(//input[@value=''])[28]")).click();
        Name_login.mydriver.findElement(By.xpath("//div[@id='8653ca0e-dd39-480b-c785-42d426b2f248']/ul/li[6]/div/div")).click();
        Name_login.mydriver.findElement(By.xpath("//input[@value='110301|北京朝阳口岸']")).clear();
        Name_login.mydriver.findElement(By.xpath("//input[@value='110301|北京朝阳口岸']")).sendKeys("110301|北京朝阳口岸");
        Name_login.mydriver.findElement(By.id("goodsPlace")).click();
        Name_login.mydriver.findElement(By.id("goodsPlace")).clear();
        Name_login.mydriver.findElement(By.id("goodsPlace")).sendKeys("123123");
        Name_login.mydriver.findElement(By.xpath("(//input[@value=''])[29]")).click();
        Name_login.mydriver.findElement(By.xpath("//div[@id='6304458d-b991-4262-9647-54c57779f87d']/ul/li/div/div")).click();
        Name_login.mydriver.findElement(By.xpath("//input[@value='M|通关无纸化']")).clear();
        Name_login.mydriver.findElement(By.xpath("//input[@value='M|通关无纸化']")).sendKeys("M|通关无纸化");
        Name_login.mydriver.findElement(By.xpath("//div[@id='formbox']/div[5]/div/div/div/div/form/div/table/tbody/tr[17]/td[2]/div/div[2]/div/span")).click();
        Name_login.mydriver.findElement(By.xpath("(//input[@value=''])[29]")).click();
        Name_login.mydriver.findElement(By.xpath("//div[@id='a888e349-b6ec-4a7a-fd3d-44c02420efa7']/ul/li[2]")).click();
        Name_login.mydriver.findElement(By.id("priceImpactAffirm")).click();
        Name_login.mydriver.findElement(By.xpath("//div[@id='9b186d69-c9b3-413a-dc4d-599d9d7d09a8']/ul/li[3]")).click();
        Name_login.mydriver.findElement(By.xpath("(//input[@value=''])[29]")).click();
        Name_login.mydriver.findElement(By.xpath("//div[@id='4785afbb-a734-4696-e263-fc46137085f4']/ul/li[2]")).click();
        Name_login.mydriver.findElement(By.xpath("(//input[@value=''])[28]")).click();
        Name_login.mydriver.findElement(By.xpath("//div[@id='34b7ef6d-8d63-410a-a586-1df33c0ab204']/ul/li[5]")).click();
        Name_login.mydriver.findElement(By.xpath("//div[@id='businessMatters']/label/span[2]")).click();
        Name_login.mydriver.findElement(By.xpath("//div[@id='businessMatters']/label[2]/span[2]")).click();
        Name_login.mydriver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
    }


}
