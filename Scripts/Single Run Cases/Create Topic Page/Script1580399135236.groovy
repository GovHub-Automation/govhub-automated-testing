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

WebUI.click(findTestObject('Page_Content  Digital Services Georgia/a_Add content'))

WebUI.scrollToElement(findTestObject('Page_Add content  Digital Services Georgia/a_Topic PageExplain a specific topic or provide additional details about another topic or service'), 
    0)

WebUI.click(findTestObject('Page_Add content  Digital Services Georgia/a_Topic PageExplain a specific topic or provide additional details about another topic or service'))

WebUI.setText(findTestObject('Object Repository/Page_Create Topic Page  Digital Services Georgia/input_Title_title0value'), 
    'From Automation')

WebUI.setText(findTestObject('Object Repository/Page_Create Topic Page  Digital Services Georgia/input_Short Title_field_short_title0value'), 
    'From Automation')

WebUI.click(findTestObject('Page_Create Topic Page  Digital Services Georgia/Summary iframe'))

WebUI.setText(findTestObject('Page_Create Topic Page  Digital Services Georgia/Summary'), 'Here\'s the required summary')

WebUI.click(findTestObject('Page_Create Topic Page  Digital Services Georgia/Body iframe'))

WebUI.setText(findTestObject('Page_Create Topic Page  Digital Services Georgia/Body'), 'Here\'s the body content of the Topic Page.')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Topic Page  Digital Services Georgia/select_DraftPublishedArchived'), 
    'published', true)

WebUI.click(findTestObject('Page_Create Topic Page  Digital Services Georgia/Page_Create Topic Page  Digital Services Georgia/Save_button'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Page_Create Topic Page  Digital Services Georgia/Page_From Automation  Digital Services Georgia/h1_From Automation'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Create Topic Page  Digital Services Georgia/Page_From Automation  Digital Services Georgia/p_Heres the body content of the Topic Page'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

