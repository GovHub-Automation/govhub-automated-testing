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

WebUI.callTestCase(findTestCase('Authenticate Testing Site'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Log In as Editor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_jasmyneepps  Digital Services Georgia/a_Content'))

WebUI.navigateToUrl(GlobalVariable.url + '/node/add-microcontent')

'Maximize current window'
WebUI.maximizeWindow()

WebUI.click(findTestObject('Create CTA/Page_Add micro-content  Digital Services Georgia/span_Call To Action'))

WebUI.setText(findTestObject('Create CTA/Page_Create Call To Action  Digital Services Georgia/input_Title_title0value'), 
    'From Automation')

WebUI.setText(findTestObject('Create CTA/Page_Create Call To Action  Digital Services Georgia/html_Rich Text Editor Description field'), 
    'Description text')

WebUI.setText(findTestObject('Create CTA/Page_Create Call To Action  Digital Services Georgia/input_URL_field_cta_url0uri'), 
    'https://example.com')

WebUI.setText(findTestObject('Create CTA/Page_Create Call To Action  Digital Services Georgia/input_Link text_field_cta_url0title'), 
    'Click Me')

WebUI.click(findTestObject('Create CTA/Page_Create Call To Action  Digital Services Georgia/Icon_dropdown_field'))

WebUI.setText(findTestObject('Create CTA/Page_Create Call To Action  Digital Services Georgia/input_add_Icon-search__field'), 
    'Animal: Dog', FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Create CTA/Page_Create Call To Action  Digital Services Georgia/input_add_Icon-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(3)

'Scroll to top'
WebUI.scrollToPosition(0, 0)

WebUI.delay(3)

WebUI.click(findTestObject('Page_Create Call To Action  Digital Services Georgia/input_Published_op'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Create CTA/Page_From Automation  Digital Services Georgia/h1_From Automation'), 
    'From Automation', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Create CTA/Page_From Automation  Digital Services Georgia/div_From Automation'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Create CTA/Page_From Automation  Digital Services Georgia/h2_From Automation'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Create CTA/Page_From Automation  Digital Services Georgia/p_Description text'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Create CTA/Page_From Automation  Digital Services Georgia/a_Click Me'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

