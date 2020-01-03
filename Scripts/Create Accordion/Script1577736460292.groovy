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

WebUI.click(findTestObject('Page_Editor  Digital Services Georgia/a_Content'))

WebUI.navigateToUrl(GlobalVariable.Environment + 'node/add/accordion')

WebUI.click(findTestObject('Create Accordion/Page_Create Accordion  Digital Services Georgia/input_Title_accordion_title'))

WebUI.setText(findTestObject('Create Accordion/Page_Create Accordion  Digital Services Georgia/input_Title_accordion_title'), 
    'From Automation')

WebUI.click(findTestObject('Create Accordion/Page_Create Accordion  Digital Services Georgia/input_Title_field_accordion_list_title'))

WebUI.setText(findTestObject('Create Accordion/Page_Create Accordion  Digital Services Georgia/input_Title_field_accordion_list_title'), 
    'Item 1')

WebUI.click(findTestObject('Create Accordion/Page_Create Accordion  Digital Services Georgia/html_Rich Text Editor Text'))

WebUI.setText(findTestObject('Create Accordion/Page_Create Accordion  Digital Services Georgia/html_Rich Text Editor Text'), 
    'Item 1')

WebUI.click(findTestObject('Create Accordion/Page_Create Accordion  Digital Services Georgia/Save_button'))

WebUI.verifyElementText(findTestObject('Create Accordion/Page_From Automation  Digital Services Georgia/h1_From Automation'), 
    'From Automation')

WebUI.verifyElementText(findTestObject('Create Accordion/Page_From Automation  Digital Services Georgia/div_Item 1'), 'Item 1')

