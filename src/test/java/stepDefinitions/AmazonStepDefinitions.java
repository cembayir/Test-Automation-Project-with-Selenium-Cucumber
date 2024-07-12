package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AmazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();

    @Given("Kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        ReusableMethods.waitFor(1);
        amazonPage.cookies.click();
    }

    @When("Kullanici Iphone aratir")
    public void kullanici_iphone_aratir() {
        amazonPage.searchBox.sendKeys("Iphone", Keys.ENTER);
    }

    @Then("Kullanici sonuçlarin Iphone içerdigini test eder")
    public void kullanici_sonuçlarin_iphone_içerdigini_test_eder() {
        Assert.assertTrue(amazonPage.result.isDisplayed());
    }

    @Then("Kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @When("Kullanici Selenium aratir")
    public void kullaniciSeleniumAratir() {
        amazonPage.searchBox.sendKeys("Selenium", Keys.ENTER);
    }

    @Then("Kullanici sonuçlarin Selenium içerdigini test eder")
    public void kullaniciSonuçlarinSeleniumIçerdiginiTestEder() {
        Assert.assertTrue(amazonPage.result.isDisplayed());
    }

    @When("Kullanici Java aratir")
    public void kullaniciJavaAratir() {
        amazonPage.searchBox.sendKeys("Java", Keys.ENTER);
    }

    @Then("Kullanici sonuçlarin Java içerdigini test eder")
    public void kullaniciSonuçlarinJavaIçerdiginiTestEder() {
        Assert.assertTrue(amazonPage.result.isDisplayed());
    }

    @When("Kullanici {string} aratir")
    public void kullaniciAratir(String arananNesne) {
        amazonPage.searchBox.sendKeys(arananNesne, Keys.ENTER);
    }

    @Then("Kullanici sonuçlarin {string} içerdigini test eder")
    public void kullaniciSonuçlarinIçerdiginiTestEder(String nesne) {
        Assert.assertTrue(amazonPage.result.getText().contains(nesne));
    }

    @Then("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String arananKelime) {
        amazonPage.searchBox.sendKeys(arananKelime, Keys.ENTER);
    }

    @Then("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String dogrulananKelime) {
        Assert.assertTrue(amazonPage.result.getText().contains(dogrulananKelime));
    }
}