package StepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utils.DriverFactory;

public class thyTaskSteps {

    ThyPage thy = new thyPage(DriverFactory.getDriver());
    @Given("android cihaz acilir")
    public void androidCihazAcilir() {
        System.out.println("This process will be made by the before hook in util");
    }

    @When("thy uygulama acilir")
    public void thyuygulamasiAcilir() {
        ThyPage.userClicksToThyIcon();
    }

    @When("konum izni verilir")
    public void konumizniverilir() {
        thyPage.userClickstoAllowLocation}
    @When("bildirimler kabul edilir")
    public void cookielerKabulEdilir() {
        thyPage.userClickstoSkipCookies}

    @When("ucus rezervasyonu secilir")
    public void ucusrezervasyonusecilir() {
        thyPage.userClickstoBookingAFlight}


    @When("tek yon secilir")
    public void tekyonsecilir(){
    thyPage.userClikstoOneWay}


    @When("inis havalimani secilir")
    public void inisHavalimaniSecilir() {
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

    @When("ecofly sinifi secilir")
    public void ecoflysinifisecilir() {
        thyPage.selectingEcoFly();
    }

    @When("ekstra hizmetler secilmeden devam edilir")
    public void ekstrahizmetsecilmedendevamedilir() {
        thyPage.selectingNon();
    }

    @When("kisi bilgileri doldurulur")
    public void kisiBilgileriDoldurulur() {
        thyPage.fillPersonalInfos();
    }


    @When("yolcunun iletisim bilgileri doldurulur")
    public void yolcununiletisimbilgileridoldurulur() {
        thyPage.fillPersonalInfos();
    }



    @When("yolcunun iletisim izinleri verilir")
    public void yolcununiletisimizinleriverilir() {
        thyPage.fillPersonalPermission();
    }

    @When("koltuk secimi yapilir")
    public void koltuksecimiyapilir() {
        thyPage.selectSeat();
    }

    @When("ucus ozeti onaylanir")
    public void confirmFlight() {
        thyPage.confirmFlight();
    }

    @When("koltuk secimi gecilir")
    public void koltukSecimiGecilir() {
    }