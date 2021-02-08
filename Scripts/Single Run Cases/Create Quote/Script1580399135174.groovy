import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

not_run: WebUI.callTestCase(findTestCase('Authenticate Testing Site'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Page_jasmyneepps  Digital Services Georgia/Hover over Content'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('Page_jasmyneepps  Digital Services Georgia/Hover over Micro-content'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_jasmyneepps  Digital Services Georgia/Add micro-content'))

WebUI.click(findTestObject('Page_Add micro-content  Digital Services Georgia/Add Quote'))

WebUI.setText(findTestObject('Object Repository/Page_Create Quote  Digital Services Georgia/input_Title_title0value'), 'QA test quote with automation title')

WebUI.click(findTestObject('Page_Create Quote  Digital Services Georgia/QuoteNode_QuoteiFrame'))

WebUI.setText(findTestObject('Page_Create Quote  Digital Services Georgia/QuoteNode_QuoteHTML'), 'QA test quote text body content here.')

WebUI.click(findTestObject('Page_Create Quote  Digital Services Georgia/Icon_field_dropdown_arrow'))

WebUI.setText(findTestObject('Page_Create Quote  Digital Services Georgia/Page_Create Quote  Digital Services Georgia/input__select2-search__field'), 
    'Animal: Dog')

WebUI.sendKeys(findTestObject('Page_Create Quote  Digital Services Georgia/Page_Create Quote  Digital Services Georgia/input__select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Create Quote  Digital Services Georgia/Save_button'))

WebUI.verifyElementText(findTestObject('Page_QA test quote with automation title  Digital Services Georgia/QuoteNode_PageTitle'), 
    'QA test quote with automation title', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_QA test quote with automation title  Digital Services Georgia/QuoteNode_QuoteText'), 
    'QA test quote text body content here.', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Create Quote  Digital Services Georgia/Page_QA test quote with automation title  Digital Services Georgia/a_Animal Dog'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

