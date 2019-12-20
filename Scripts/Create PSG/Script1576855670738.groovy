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

WebUI.click(findTestObject('Object Repository/Page_jasmyneepps  Digital Services Georgia/a_Content'))

WebUI.click(findTestObject('Object Repository/Page_Content  Digital Services Georgia/a_Add content'))

WebUI.click(findTestObject('Page_Create PSG/Page_Add content  Digital Services Georgia/a_PSGPolicies Standards and Guidelines'))

WebUI.click(findTestObject('Page_Create PSG/Page_Create PSG  Digital Services Georgia/input_Identifier_field_psg_identifier0value'))

WebUI.setText(findTestObject('Page_Create PSG/Page_Create PSG  Digital Services Georgia/input_Identifier_field_psg_identifier0value'), 
    'PSG From Automation')

WebUI.click(findTestObject('Page_Create PSG/Page_Create PSG  Digital Services Georgia/input_Title Text_field_psg_title_text0value'))

WebUI.setText(findTestObject('Page_Create PSG/Page_Create PSG  Digital Services Georgia/input_Title Text_field_psg_title_text0value'), 
    'PSG From Automation')

WebUI.setText(findTestObject('Page_Create PSG/Page_Create PSG  Digital Services Georgia/html_Rich Text Editor Summary'), 
    'Summary text.')

WebUI.setText(findTestObject('Page_Create PSG/Page_Create PSG  Digital Services Georgia/html_Rich Text Editor Body'), 'Body text.')

WebUI.click(findTestObject('Page_Create PSG/Page_Create PSG  Digital Services Georgia/Add_Releated_File_button'))

WebUI.click(findTestObject('Page_Create PSG/Page_Create PSG  Digital Services Georgia/input_Select_Document_2018_vssr_how_to'))

WebUI.click(findTestObject('Page_Create PSG/Page_Create PSG  Digital Services Georgia/Select_button'))

WebUI.click(findTestObject('Page_Create PSG/Page_Create PSG  Digital Services Georgia/Save_node_button'))

WebUI.verifyElementText(findTestObject('Page_Create PSG/Page_PSG From Automation (PSG From Automation)  Digital Services Georgia/h1_PSG From Automation (PSG From Automation)'), 
    'PSG From Automation (PSG From Automation)')

WebUI.verifyElementText(findTestObject('Page_Create PSG/Page_PSG From Automation (PSG From Automation)  Digital Services Georgia/p_Body text'), 
    'Body text.')

WebUI.verifyElementText(findTestObject('Page_Create PSG/Page_PSG From Automation (PSG From Automation)  Digital Services Georgia/p_Summary text'), 
    'Summary text.')

