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

WebUI.callTestCase(findTestCase('Authenticate Prod'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Log In as Editor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Content  Digital Services Georgia/a_Content'))

WebUI.click(findTestObject('Page_Content  Digital Services Georgia/a_Add content'))

WebUI.click(findTestObject('Page_Add content  Digital Services Georgia/span_Bio'))

WebUI.click(findTestObject('Bio Objects/Page_Create Bio  Digital Services Georgia/input_First_field_full_name0given'))

WebUI.setText(findTestObject('Bio Objects/Page_Create Bio  Digital Services Georgia/input_First_field_full_name0given'), 
    'From')

WebUI.click(findTestObject('Bio Objects/Page_Create Bio  Digital Services Georgia/input_Last_field_full_name0family'))

WebUI.setText(findTestObject('Bio Objects/Page_Create Bio  Digital Services Georgia/input_Last_field_full_name0family'), 
    'Automation')

WebUI.click(findTestObject('Bio Objects/Page_Create Bio  Digital Services Georgia/span_Staff'))

WebUI.click(findTestObject('Bio Objects/Page_Create Bio  Digital Services Georgia/li_Our Team'))

WebUI.click(findTestObject('Bio Objects/Page_Create Bio  Digital Services Georgia/span_Staff'))

WebUI.click(findTestObject('Bio Objects/Page_Create Bio  Digital Services Georgia/Intro Text iframe'))

WebUI.setText(findTestObject('Bio Objects/Page_Create Bio  Digital Services Georgia/introText'), 'Here\'s some intro text')

WebUI.selectOptionByValue(findTestObject('Bio Objects/Page_Create Bio  Digital Services Georgia/select_DraftPublishedArchived'), 
    'published', true)

WebUI.delay(2)

WebUI.click(findTestObject('Bio Objects/Page_Create Bio  Digital Services Georgia/Save Bio'))

WebUI.delay(6)

WebUI.callTestCase(findTestCase('Embed Start No Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Embed/Embed Bio/Page_Create Topic Page  Digital Services Georgia/a_Embed content'))

WebUI.click(findTestObject('Page_Embed/Embed Bio/Page_Create Topic Page  Digital Services Georgia/span_Bio'))

WebUI.switchToFrame(findTestObject('Page_Embed/Embed Bio/Page_Create Topic Page  Digital Services Georgia/iframe_Add Bio_entity_browser_iframe_bio_browser_entity_embed'), 
    5)

WebUI.click(findTestObject('Page_Embed/Embed Bio/Page_Create Topic Page  Digital Services Georgia/input_Select_bio'))

WebUI.click(findTestObject('Page_Embed/Embed Bio/Page_Create Topic Page  Digital Services Georgia/Select_button'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Object Repository/Page_Embed/Embed LinkCollection/Page_Create Topic Page  Digital Services Georgia/button_Embed'))

WebUI.callTestCase(findTestCase('Embed End'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Embed/Embed Bio/Page_Embed Automation  Digital Services Georgia/a_Bio_Name'), 
    'From Automation', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

