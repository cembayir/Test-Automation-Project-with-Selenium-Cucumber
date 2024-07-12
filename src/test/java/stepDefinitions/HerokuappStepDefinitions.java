package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HerokuappPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class HerokuappStepDefinitions {
    HerokuappPage herokuappPage = new HerokuappPage();

    @Given("Kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @And("Add Element butonuna basar")
    public void addElementButonunaBasar() {
        herokuappPage.addElementButton.click();
    }

    @And("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int sure) {
        ReusableMethods.waitFor(sure);
    }

    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void deleteButonuGorunurOluncayaKadarBekler() {
        ReusableMethods.waitForVisibility(herokuappPage.deleteElementButton, 10);
    }

    @And("Delete butonunun gorunur oldugunu test eder")
    public void deleteButonununGorunurOldugunuTestEder() {
        Assert.assertTrue(herokuappPage.deleteElementButton.isDisplayed());
    }

    @Then("Delete butonuna basar")
    public void deleteButonunaBasar() {
        herokuappPage.deleteElementButton.click();
    }

    @And("Delete butonunun gorunur olmadigini test eder")
    public void deleteButonununGorunurOlmadiginiTestEder() {
        Assert.assertTrue(herokuappPage.deleteElementButtonList.isEmpty());
    }
}