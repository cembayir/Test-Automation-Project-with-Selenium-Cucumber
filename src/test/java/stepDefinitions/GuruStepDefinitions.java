package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitions {
    GuruPage guruPage = new GuruPage();

    @And("{string} sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String baslik) {
        int index = 0;
        for (int i = 0; i < guruPage.basliklar.size(); i++) {

            if (guruPage.basliklar.get(i).getText().equals(baslik)) {
                System.out.println(guruPage.basliklar.get(i).getText());
                index = i + 1;

                List<WebElement> sutunElementler = Driver.getDriver().findElements(By.xpath("//tbody/tr/td[" + index + "]"));
                for (WebElement w : sutunElementler) {
                    System.out.println(w.getText());
                }
            }
        }
    }
}