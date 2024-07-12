package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DatatablePage;
import utilities.ConfigReader;
import utilities.Driver;

public class DatatablesStepDefinitions {
    DatatablePage datatablePage = new DatatablePage();
    Actions actions = new Actions(Driver.getDriver());

    @When("kullanici {string} anasayfasina gider")
    public void kullaniciAnasayfasinaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("kullanici new butonuna basar")
    public void kullaniciNewButonunaBasar() {
        datatablePage.newButton.click();
    }

    @And("kullanici isim bolumune {string} yazar")
    public void kullaniciIsimBolumuneYazar(String firstName) {
        datatablePage.firstName.sendKeys(firstName);
    }

    @And("kullanici soyisim bolumune {string} yazar")
    public void kullaniciSoyisimBolumuneYazar(String lastName) {
        actions.sendKeys(Keys.TAB).sendKeys(lastName).perform();
    }

    @And("kullanici position bolumune {string} yazar")
    public void kullaniciPositionBolumuneYazar(String position) {
        actions.sendKeys(Keys.TAB).sendKeys(position).perform();
    }

    @And("kullanici office bolumune {string} yazar")
    public void kullaniciOfficeBolumuneYazar(String office) {
        actions.sendKeys(Keys.TAB).sendKeys(office).perform();
    }

    @And("kullanici extension bolumune {string} yazar")
    public void kullaniciExtensionBolumuneYazar(String extension) {
        actions.sendKeys(Keys.TAB).sendKeys(extension).perform();
    }

    @And("kullanici startDate bolumune {string} yazar")
    public void kullaniciStartDateBolumuneYazar(String startDate) {
        actions.sendKeys(Keys.TAB).sendKeys(startDate).perform();
    }

    @And("kullanici salary bolumune {string} yazar")
    public void kullaniciSalaryBolumuneYazar(String salary) {
        actions.sendKeys(Keys.TAB).sendKeys(salary).perform();
    }

    @And("kullanici create butonuna basar")
    public void kullaniciCreateButonunaBasar() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstname) {
        datatablePage.searchBox.sendKeys(firstname);
    }

    @And("isim bolumunda {string} yazdigini test eder")
    public void isimBolumundaYazdiginiTestEder(String isim) {
        Assert.assertTrue(datatablePage.result.isDisplayed());
    }
}
