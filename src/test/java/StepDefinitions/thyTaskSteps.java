package StepDefinitions;
import java.util.List;

import Pages.AndroidHomePage;
import Pages.ChromeBrowserPage;
import Pages.thyPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class thyTaskSteps {
    @Given("android cihaz acilir")
    public void androidCihazAcilir() {
        System.out.println("This process will be made by the before hook in util");
    }

    @When("chrome tarayici acilir")
    public void chromeTarayiciAcilir() {
        AndroidHomePage.userClicksToChromeIcon();

    }

    @When("thy sitesine girilir")
    public void thySitesineGirilir() {
        ChromeBrowserPage.userWritesExactURL();
    }

    @When("cookieler kabul edilir")
    public void cookielerKabulEdilir() {
        thyPage.acceptCookies();
    }

    @When("tek yon secilir")
    public void tekYonSecilir() {
        thyPage.clickOneWayButton();
    }

    @When("Kalkis havalimanı secilir")
    public void kalkisHavalimanıSecilir() {
        thyPage.userClicksToSearchFlightButton();
    }

    @When("inis havalimanı secilir")
    public void inisHavalimanıSecilir() {
        thyPage.selectingArrivalAirport();
    }

    @When("tarih secilir")
    public void tarihSecilir() {
        thyPage.selectingDateFromCalendar();
    }

    @When("search butonuna basilir")
    public void searchButonunaBasilir() {
        thyPage.clickSearchButton();
    }

    @When("ucuslar ucuzdan pahaliya siralanir")
    public void ucuslarUcuzdanPahaliyaSiralanir() {
        thyPage.selectingPriceInFilter();
    }

    @When("en ucuzu secilir")
    public void enUcuzuSecilir() {
        thyPage.selectingCheapestFlight();
    }

    @When("kisi bilgileri doldurulur")
    public void kisiBilgileriDoldurulur() {
        thyPage.fillPersonalInfos();
    }
}
