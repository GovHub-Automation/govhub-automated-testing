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

WebUI.callTestCase(findTestCase('Embed Start'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Embed/Embed Image/Page_Create Topic Page  Digital Services Georgia/span_Embed media_cke_button_arrow'))

WebUI.click(findTestObject('Page_Embed/Embed Remote/Page_Create Topic Page  Digital Services Georgia/span_Remote media'))

WebUI.switchToFrame(findTestObject('Page_Embed/Embed Remote/Page_Create Topic Page  Digital Services Georgia/iframe_Add Remote Media_entity_browser_iframe_remote_media_browser_iframe'), 
    5)

WebUI.click(findTestObject('Page_Embed/Embed Remote/Page_Create Topic Page  Digital Services Georgia/input_Name_inline_entity_formname0value'))

WebUI.setText(findTestObject('Page_Embed/Embed Remote/Page_Create Topic Page  Digital Services Georgia/input_Name_inline_entity_formname0value'), 
    'Example')

WebUI.click(findTestObject('Page_Embed/Embed Remote/Page_Create Topic Page  Digital Services Georgia/input_Remote Media URL'))

WebUI.setText(findTestObject('Page_Embed/Embed Remote/Page_Create Topic Page  Digital Services Georgia/input_Remote Media URL'), 
    'https://soundcloud.com/soundcloud-hustle/sets/rap-new-hot')

WebUI.click(findTestObject('Page_Embed/Embed Remote/Page_Create Topic Page  Digital Services Georgia/Select_button'))

WebUI.delay(1)

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Page_Embed/Embed Image/Page_Create Topic Page  Digital Services Georgia/button_Embed'))

WebUI.callTestCase(findTestCase('Embed End'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Embed/Embed Remote/Page_Embed Automation  Digital Services Georgia/div_Embed Automation_card-wrapper__content'), 
    0)

WebUI.closeBrowser()

