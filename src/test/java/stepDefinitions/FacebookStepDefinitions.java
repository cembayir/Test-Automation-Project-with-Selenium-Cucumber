package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class FacebookStepDefinitions {
    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("kullanici {int} saniye bekler")
    public void kullanici_saniye_bekler(Integer beklemeSuresi) {
        ReusableMethods.waitFor(beklemeSuresi);
    }

    @When("urlin {string} icerdigini test eder")
    public void urlin_icerdigini_test_eder(String istenenKelime) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(istenenKelime));
    }

    @When("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @When("urlin {string} oldugunu tes teder")
    public void urlinOldugunuTesTeder(String istenenURL) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(istenenURL));
    }
}