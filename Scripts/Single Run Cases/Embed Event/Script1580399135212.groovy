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

WebUI.click(findTestObject('Page_Embed/Embed Contact/Page_Create Topic Page  Digital Services Georgia/span_Embed content_cke_button_arrow'))

WebUI.click(findTestObject('Page_Embed/Embed Event/Page_Create Topic Page  Digital Services Georgia/span_Event'))

WebUI.switchToFrame(findTestObject('Page_Embed/Embed Event/Page_Create Topic Page  Digital Services Georgia/iframe_Add Event_entity_browser_iframe_event_browser_entity_embed'), 
    5)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Embed/Embed Event/Page_Create Topic Page  Digital Services Georgia/input_Select_event'))

WebUI.click(findTestObject('Page_Embed/Embed Event/Page_Create Topic Page  Digital Services Georgia/Select_button'))

WebUI.delay(1)

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Object Repository/Page_Embed/Embed LinkCollection/Page_Create Topic Page  Digital Services Georgia/button_Embed'))

WebUI.callTestCase(findTestCase('Single Run Cases/Embed End'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Embed/Embed Event/Page_Embed Automation  Digital Services Georgia/h3_Event'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

