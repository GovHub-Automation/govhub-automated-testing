import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('Authenticate Prod'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Log In as Editor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Editor  Digital Services Georgia/a_Content'))

WebUI.click(findTestObject('Page_Content  Digital Services Georgia/a_Add content'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Add content  Digital Services Georgia/span_Alert'))

WebUI.setText(findTestObject('Alert Objects/Page_Create Alert  Digital Services Georgia/input_Alert Title_title0value'), 
    'Alert Title - Type Notice')

WebUI.setText(findTestObject('Alert Objects/Page_Create Alert  Digital Services Georgia/input_URL_field_destination0uri'), 
    'a')

WebUI.click(findTestObject('Alert Objects/Page_Create Alert  Digital Services Georgia/span_2 Determine your main menu structure'))

WebUI.setText(findTestObject('Alert Objects/Page_Create Alert  Digital Services Georgia/input_URL_field_destination0uri'), 
    '/node/98')

WebUI.click(findTestObject('Alert Objects/Page_Create Alert  Digital Services Georgia/input_Link text_field_alert_sitewidevalue'))

WebUI.click(findTestObject('Alert Objects/Page_Create Alert  Digital Services Georgia/iframe_Press ALT 0 for help_cke_wysiwyg_frame cke_reset'))

WebUI.setText(findTestObject('Alert Objects/Page_Create Alert  Digital Services Georgia/iframeBody'), 'Here are the alert details')

WebUI.selectOptionByValue(findTestObject('Alert Objects/Page_Create Alert  Digital Services Georgia/select_DraftPublishedArchived'), 
    'published', true)

WebUI.click(findTestObject('Alert Objects/Page_Create Alert  Digital Services Georgia/input_Save as_op'))

WebUI.verifyElementPresent(findTestObject('Alert Objects/Page_Alert Title - Type Notice  Digital Services Georgia/h1_Alert Title - Type Notice'), 
    0)

WebUI.closeBrowser()

