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

'Maximize current window'
WebUI.click(findTestObject('Page_Add micro-content  Digital Services Georgia/Add Listing block'))

WebUI.click(findTestObject('Create Listing Block/Page_Create Listing block  Digital Services Georgia/input_Title_title0value'))

WebUI.setText(findTestObject('Create Listing Block/Page_Create Listing block  Digital Services Georgia/input_Title_title0value'), 
    'From Automation')

WebUI.click(findTestObject('Create Listing Block/Page_Create Listing block  Digital Services Georgia/input_URL_field_cta_url0uri'))

WebUI.setText(findTestObject('Create Listing Block/Page_Create Listing block  Digital Services Georgia/input_URL_field_cta_url0uri'), 
    'https://example.com')

WebUI.click(findTestObject('Create Listing Block/Page_Create Listing block  Digital Services Georgia/input_Link text_field_cta_url0title'))

WebUI.setText(findTestObject('Create Listing Block/Page_Create Listing block  Digital Services Georgia/input_Link text_field_cta_url0title'), 
    'Link 1')

WebUI.click(findTestObject('Create Listing Block/Page_Create Listing block  Digital Services Georgia/select_list'))

WebUI.selectOptionByLabel(findTestObject('Create Listing Block/Page_Create Listing block  Digital Services Georgia/select_list'), 
    'Bio', false)

WebUI.click(findTestObject('Create Listing Block/Page_Create Listing block  Digital Services Georgia/save_button'))

WebUI.verifyElementText(findTestObject('Create Listing Block/Page_From Automation  Digital Services Georgia/h1_From Automation'), 
    'From Automation', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Create Listing Block/Page_From Automation  Digital Services Georgia/div_Link 1'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Create Listing Block/Page_From Automation  Digital Services Georgia/a_Link 1'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

