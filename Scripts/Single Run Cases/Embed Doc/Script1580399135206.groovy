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

WebUI.callTestCase(findTestCase('Embed Start'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Embed/Embed Doc/Page_Create Topic Page  Digital Services Georgia/span_Documents_cke_button_arrow'))

WebUI.click(findTestObject('Page_Embed/Embed Doc/Page_Create Topic Page  Digital Services Georgia/span_Embed Document_cke_button_icon cke_button__document_icon'))

WebUI.switchToFrame(findTestObject('Page_Embed/Embed Doc/Page_Create Topic Page  Digital Services Georgia/iframe_Add Document_entity_browser_iframe_document_browser_entity_embed'), 
    5)

WebUI.click(findTestObject('Object Repository/Page_Embed/Embed Doc/Page_Create Topic Page  Digital Services Georgia/input_Select_document'))

WebUI.click(findTestObject('Object Repository/Page_Embed/Embed Doc/Page_Create Topic Page  Digital Services Georgia/Select_button'))

WebUI.delay(1)

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Object Repository/Page_Embed/Embed Image/Page_Create Topic Page  Digital Services Georgia/button_Embed'))

WebUI.callTestCase(findTestCase('Single Run Cases/Embed End'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Embed/Embed Doc/Page_Embed Automation  Digital Services Georgia/div_2018_vssr_how_to_guidepdf                (127 MB)'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

