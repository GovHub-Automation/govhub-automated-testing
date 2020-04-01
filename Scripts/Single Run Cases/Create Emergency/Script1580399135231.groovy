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

not_run: WebUI.callTestCase(findTestCase('Authenticate Testing Site'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Page_jasmyneepps  Digital Services Georgia/Content Library'))

WebUI.click(findTestObject('Page_Content  Digital Services Georgia/Add content'))

WebUI.click(findTestObject('Object Repository/Page_Add content  Digital Services Georgia/a_EmergencyPlatform-wide alert with link to_063931'))

WebUI.setText(findTestObject('Object Repository/Page_Create Emergency  Digital Services Georgia/input_Title_title0value'), 
    'Emergency - Automation')

WebUI.setText(findTestObject('Object Repository/Page_Create Emergency  Digital Services Georgia/input_URL_field_emergency_destination0uri'), 
    'd')

WebUI.click(findTestObject('Object Repository/Page_Create Emergency  Digital Services Georgia/span_2 Determine your main menu structure'))

WebUI.setText(findTestObject('Object Repository/Page_Create Emergency  Digital Services Georgia/input_URL_field_emergency_destination0uri'), 
    '/node/98')

WebUI.click(findTestObject('Object Repository/Page_Create Emergency  Digital Services Georgia/input_Link text_field_emergency_destination0title'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Create Emergency  Digital Services Georgia/input_Link text_field_emergency_destination0title'))

WebUI.setText(findTestObject('Object Repository/Page_Create Emergency  Digital Services Georgia/input_Link text_field_emergency_destination0title'), 
    'Learn More About This Emergency')

WebUI.click(findTestObject('Page_Create Emergency  Digital Services Georgia/Publish checkbox'))

WebUI.click(findTestObject('Page_Create Emergency  Digital Services Georgia/input_Published_op'))

WebUI.verifyElementText(findTestObject('Page_Emergency - Automation  Digital Servic_c924a0/h1_Emergency - Automation'), 
    'Emergency - Automation', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Create Emergency  Digital Services Georgia/Page_Emergency - Automation  Digital Services Georgia/a_Learn More About This Emergency'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

