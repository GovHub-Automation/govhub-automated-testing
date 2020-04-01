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

not_run: WebUI.callTestCase(findTestCase('Authenticate Testing Site'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Page_jasmyneepps  Digital Services Georgia/Hover over Content'))

WebUI.mouseOver(findTestObject('Page_jasmyneepps  Digital Services Georgia/Hover over Micro-content'))

WebUI.click(findTestObject('Page_jasmyneepps  Digital Services Georgia/Add micro-content'))

WebUI.click(findTestObject('Create Link Collection/Page_Add micro-content  Digital Services Georgia/span_Link Collection'))

WebUI.setText(findTestObject('Create Link Collection/Page_Create Link Collection  Digital Services Georgia/input_Title_title0value'), 
    'From Automation')

WebUI.setText(findTestObject('Create Link Collection/Page_Create Link Collection  Digital Services Georgia/html_Rich Text Editor Summary field'), 
    'Summary text')

WebUI.setText(findTestObject('Create Link Collection/Page_Create Link Collection  Digital Services Georgia/input_URL_field_rich_links0uri'), 
    'https://example.com')

WebUI.setText(findTestObject('Create Link Collection/Page_Create Link Collection  Digital Services Georgia/input_Link text_field_rich_links0title'), 
    'Example link')

WebUI.setText(findTestObject('Create Link Collection/Page_Create Link Collection  Digital Services Georgia/html_Rich Text Editor Link description field'), 
    'Description text')

WebUI.click(findTestObject('Create Link Collection/Page_Create Link Collection  Digital Services Georgia/Save_button'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Create Link Collection/Page_From Automation  Digital Services Georgia/h1_From Automation'), 
    'From Automation', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Create Link Collection/Page_From Automation  Digital Services Georgia/p_Summary text'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Create Link Collection/Page_From Automation  Digital Services Georgia/h2_From Automation'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Create Link Collection/Page_From Automation  Digital Services Georgia/p_Description text'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Create Link Collection/Page_From Automation  Digital Services Georgia/a_Example link'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

