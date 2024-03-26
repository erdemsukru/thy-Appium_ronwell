import Pages.MobileElement;
import Pages.WebElement;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ElementHelper;

public class thyPage {
    public AndroidDriver<MobileElement> driver;
    private WebDriverWait wait;
    private ElementHelper elementHelper;

    public thyPage(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10L);
        this.elementHelper = new ElementHelper(driver);
    }

    By skipNot = MobileBy.id("com.turkishairlines.mobile:id/itemOnboardingTemplate1_llBtn2");
    By skip = MobileBy.id("com.turkishairlines.mobile:id/frOnboardingTop_ttSkip");
    By continueGuest = MobileBy.id("com.turkishairlines.mobile:id/frOnboardingTop_ttSkip");
    By allowLocation = MobileBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    By bookAFlight = MobileBy.id("com.turkishairlines.mobile:id/acMain_btnBooking");
    By oneWay = MobileBy.id("com.turkishairlines.mobile:id/frDashboard_tvOneWay");
    By destination = MobileBy.id("com.turkishairlines.mobile:id/frDashboard_llTo");
    By searchAnkara = MobileBy.id("com.turkishairlines.mobile:id/frAirportSelection_etSearch");
    By clickAnkara = MobileBy.id("com.turkishairlines.mobile:id/itemAirport_tvTop");
    By clickDone = MobileBy.id("com.turkishairlines.mobile:id/frDashboard_btnDone");
    By searchFlight = MobileBy.id("com.turkishairlines.mobile:id/frDashboard_btnSearch");
    By filterFlight = MobileBy.id("com.turkishairlines.mobile:id/frFlightSearch_tvSortAndFilter");
    By selectCheapest = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.view.ViewGroup");
    By applyCheapest = MobileBy.id("com.turkishairlines.mobile:id/frFilterAndSort_btnApply");
    By selectedCheapestFlight = MobileBy.id("com.turkishairlines.mobile:id/itemFlightSearchParent_imCheapestPrice_Domestic");
    By selectEcoFly = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup");
    By continueEcoFly = MobileBy.id("com.turkishairlines.mobile:id/frFlightSearch_btnContinue");
    By stayOnEcoFly = MobileBy.id("com.turkishairlines.mobile:id/bsEcoExtra_btnNegative");
    By addName = MobileBy.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddName");
    By addLastName = MobileBy.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddLastName");
    By gender = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.CheckBox[1]");
    By addBirthday = MobileBy.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddDateOfBirth");
    By addEmail = MobileBy.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddEmail");
    By nationality = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.CheckBox[1]");
    By addTCKN = MobileBy.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddTCKN");
    By addPassenger = MobileBy.id("com.turkishairlines.mobile:id/frAddNewPassenger_btnAddPassenger");
    By continueLast = MobileBy.id("com.turkishairlines.mobile:id/layoutGenericBottom_btnContinue");
    By countryCode = MobileBy.id("com.turkishairlines.mobile:id/frAddContactInfo_etCountryCode");
    By searchCountryCode = MobileBy.id("com.turkishairlines.mobile:id/frPhoneCode_etSearch");
    By searchTurkey = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout");
    By telNumber = MobileBy.id("com.turkishairlines.mobile:id/frAddContactInfo_etPhoneNumber");
    By emailPermission = MobileBy.id("com.turkishairlines.mobile:id/frAddNewPassenger_cbEmail");
    By smsPermission = MobileBy.id("com.turkishairlines.mobile:id/frAddNewPassenger_cbSms");
    By extraService = MobileBy.id("com.turkishairlines.mobile:id/frAddContactInfo_btnContinue");
    By lastContinue = MobileBy.id("com.turkishairlines.mobile:id/layoutGenericBottom_btnContinue");

    public void clickToSkipNot() {
        driver.findElement(skipNot).click();
    }

    public void clickToSkip() {
        driver.findElement(skip).click();
    }

    public void clickToContinueGuest() {
        driver.findElement(continueGuest).click();
    }

    public void clickToAllowLocation() {
        driver.findElement(allowLocation).click();
    }

    public void clickToBookAFlight() {
        driver.findElement(bookAFlight).click();
    }

    public void clickToOneWay() {
        driver.findElement(oneWay).click();
    }

    public void clickToDestination() {
        driver.findElement(destination).click();
    }

    public void searchAnkara(String keyword) {
        WebElement searchBox = driver.findElement(searchAnkara);
        searchBox.sendKeys(keyword);
    }

    public void clickToAnkara() {
        driver.findElement(clickAnkara).click();
    }

    public void clickToDone() {
        driver.findElement(clickDone).click();
    }

    public void clickToSearchFlight() {
        driver.findElement(searchFlight).click();
    }

    public void clickToFilterFlight() {
        driver.findElement(filterFlight).click();
    }

    public void selectCheapest() {
        driver.findElement(selectCheapest).click();
    }

    public void clickToApplyCheapest() {
        driver.findElement(applyCheapest).click();
    }

    public void clickToSelectedCheapestFlight() {
        driver.findElement(selectedCheapestFlight).click();
    }

    public void selectEcoFly() {
        driver.findElement(selectEcoFly).click();
    }

    public void clickToContinueEcoFly() {
        driver.findElement(continueEcoFly).click();

        public void clickToStayOnEcoFly() {
            driver.findElement(stayOnEcoFly).click();
        }

        public void addName(String name) {
            WebElement nameField = driver.findElement(addName);
            nameField.sendKeys(name);
        }

        public void addLastName(String lastName) {
            WebElement lastNameField = driver.findElement(addLastName);
            lastNameField.sendKeys(lastName);
        }

        public void selectGender() {
            driver.findElement(gender).click();
        }

        public void addBirthday(String dateOfBirth) {
            WebElement birthdayField = driver.findElement(addBirthday);
            birthdayField.sendKeys(dateOfBirth);
        }

        public void addEmail(String email) {
            WebElement emailField = driver.findElement(addEmail);
            emailField.sendKeys(email);
        }

        public void selectNationality() {
            driver.findElement(nationality).click();
        }

        public void addTCKN(String tckn) {
            WebElement tcknField = driver.findElement(addTCKN);
            tcknField.sendKeys(tckn);
        }

        public void clickToAddPassenger() {
            driver.findElement(addPassenger).click();
        }

        public void clickToContinueLast() {
            driver.findElement(continueLast).click();
        }

        public void addCountryCode(String code) {
            WebElement codeField = driver.findElement(countryCode);
            codeField.sendKeys(code);
        }

        public void searchCountryCode(String code) {
            WebElement searchField = driver.findElement(searchCountryCode);
            searchField.sendKeys(code);
        }

        public void clickToSearchTurkey() {
            driver.findElement(searchTurkey).click();
        }

        public void addPhoneNumber(String number) {
            WebElement phoneNumberField = driver.findElement(telNumber);
            phoneNumberField.sendKeys(number);
        }

        public void selectEmailPermission() {
            driver.findElement(emailPermission).click();
        }

        public void selectSmsPermission() {
            driver.findElement(smsPermission).click();
        }

        public void clickToExtraService() {
            driver.findElement(extraService).click();
        }

        public void clickToLastContinue() {
            driver.findElement(lastContinue).click();
        }
    }
