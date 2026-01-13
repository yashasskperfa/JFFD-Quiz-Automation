import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType      // ⭐ REQUIRED IMPORT
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import java.util.Arrays

WebUI.openBrowser('')

WebUI.navigateToUrl(    'https://www.justfoodfordogs.com/dog-food-calculator/?startCalculator=true'
)

WebUI.click(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/div_His name is'))

WebUI.setText(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/input_concat(Your dog, , s name)_petName'),
	'test59')

WebUI.click(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/span_Continue'))

//WebUI.click(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/div_Boost Wellness'))
TestObject improveDigestion = new TestObject('improveDigestion')
improveDigestion.addProperty(
	"xpath",
	ConditionType.EQUALS,
	"//label[@for='ImproveDigestion']"
)

WebUI.waitForElementClickable(improveDigestion, 10)
WebUI.click(improveDigestion)
WebUI.click(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/span_Continue_1'))

WebUI.click(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/span_Continue_2'))

WebUI.click(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/a_click here to select Mixed Breed'))

WebUI.click(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/button_Continue'))
// --- Reusable Dropdown Clicker ---
def clickDropdown(String placeholderText) {
	def driver = DriverFactory.getWebDriver()

	WebElement dropdown = driver.findElement(
		By.xpath("//button[contains(@class, 'dropdown-toggle') and contains(@class,'bs-placeholder') and contains(.,'" + placeholderText + "')]")
	)

	WebUI.executeJavaScript("arguments[0].scrollIntoView(true);", Arrays.asList(dropdown))
	WebUI.executeJavaScript("arguments[0].click();", Arrays.asList(dropdown))
}

// --- Reusable Option Selector ---
def selectOption(String optionText) {
	def driver = DriverFactory.getWebDriver()
	WebElement option = driver.findElement(By.xpath("//span[normalize-space(text())='" + optionText + "']"))
	WebUI.executeJavaScript("arguments[0].click();", Arrays.asList(option))
}

// --- Select Birth Month: January ---
clickDropdown("Birth month")
selectOption("January")

// --- Select Birth Year: 2025 ---
clickDropdown("Birth year")
selectOption("2025")



WebUI.click(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/span_Continue_3'))

WebUI.click(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/span_Continue_4'))

WebUI.setText(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/input_Weight_petWeight'),
	'25')

WebUI.click(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/div_Yes'))

WebUI.click(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/span_Continue_5'))

WebUI.click(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/div_Skinny                                 _190b6b'))

WebUI.click(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/span_Continue_6'))

WebUI.click(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/div_Moderate'))

WebUI.click(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/span_Continue_7'))

WebUI.click(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/span_Continue_8'))

WebUI.click(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/div_Standard Kibble'))

WebUI.click(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/span_Continue_9'))

//WebUI.click(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/div_Chicken'))
//WebUI.click(findTestObject('Object Repository/Page_JustFoodForDogs  Fresh Dog Food, Prove_e81f98/Page_Dog Food Calculator by Breed  Weight  _00aef56/div_None All are OK'))
TestObject beefOption = new TestObject('beefOption')
beefOption.addProperty(
	"xpath",
	ConditionType.EQUALS,
	"//label[@for='Beef']"
)

WebUI.waitForElementClickable(beefOption, 10)
WebUI.click(beefOption)
WebUI.click(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/span_Continue_10'))

//WebUI.click(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/span_Fresh Frozen'))
TestObject justFreshOption = new TestObject('justFreshOption')
justFreshOption.addProperty(
	"xpath",
	ConditionType.EQUALS,
	"//span[contains(normalize-space(.), 'JustFresh')]"
)

WebUI.waitForElementClickable(justFreshOption, 10)
WebUI.click(justFreshOption)
WebUI.click(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/span_Continue_11'))

WebUI.click(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/span_Full Bowl'))

WebUI.click(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/span_Continue_12'))

WebUI.click(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/input_First name_petUserName'))

WebUI.click(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/input_First name_petUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/input_First name_petUserName'),
	'yashas')

WebUI.setText(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/input_Email address_petUserEmail'),
	'yashas@perfaware.com')

WebUI.click(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/span_Continue_13'))

WebUI.click(findTestObject('Object Repository/Page_Dog Food Calculator by Breed  Weight  _00aef3/button_See your results'))

// --- VERIFY URL ---
String currentUrl = WebUI.getUrl()
WebUI.verifyMatch(
	currentUrl,
	'.*nutritionplannerresult.*',
	true,
	FailureHandling.STOP_ON_FAILURE
)

// --- VERIFY PAGE CONTENT (Recommendations) ---
WebUI.verifyTextPresent(
	'Recommendations',
	false,
	FailureHandling.STOP_ON_FAILURE
)
