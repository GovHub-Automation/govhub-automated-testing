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

WebUI.click(findTestObject('Page_jasmyneepps  Digital Services Georgia/a_Content'))

WebUI.click(findTestObject('Page_Content  Digital Services Georgia/a_Add content'))

WebUI.click(findTestObject('Create Listing Page/Page_Add content  Digital Services Georgia/span_Listing Page'))

WebUI.setText(findTestObject('Create Listing Page/Page_Create Listing Page  Digital Services Georgia/input_Title_title0value'), 
    'From Automation')

WebUI.setText(findTestObject('Create Listing Page/Page_Create Listing Page  Digital Services Georgia/input_Short Title_field_short_title0value'), 
    'From Automation')

WebUI.setText(findTestObject('Create Listing Page/Page_Create Listing Page  Digital Services Georgia/html_Rich Text Editor Summary field'), 
    'Summary text')

WebUI.click(findTestObject('Create Listing Page/Page_Create Listing Page  Digital Services Georgia/Add_Bio_button'))

WebUI.switchToFrame(findTestObject('Create Listing Page/Page_Create Listing Page  Digital Services Georgia/iframe_Bio_entity_browser_iframe'), 
    0)

WebUI.click(findTestObject('Create Listing Page/Page_Create Listing Page  Digital Services Georgia/input_Select_Bio_checkbox'))

WebUI.click(findTestObject('Create Listing Page/Page_Create Listing Page  Digital Services Georgia/Select_bio_button'))

WebUI.switchToDefaultContent()

WebUI.selectOptionByValue(findTestObject('Create Listing Page/Page_Create Listing Page  Digital Services Georgia/select_DraftNeeds ReviewPublishedArchived'), 
    'published', false)

WebUI.click(findTestObject('Create Listing Page/Page_Create Listing Page  Digital Services Georgia/Save_button'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Create Listing Page/Page_From Automation  Digital Services Georgia/h1_From Automation'), 
    'From Automation')

WebUI.verifyElementPresent(findTestObject('Create Listing Page/Page_From Automation  Digital Services Georgia/p_Summary text'), 
    0)

WebUI.verifyElementPresent(findTestObject('Create Listing Page/Page_From Automation  Digital Services Georgia/main_Summary div'), 
    0)

WebUI.verifyElementPresent(findTestObject('Create Listing Page/Page_From Automation  Digital Services Georgia/div_Bio card'), 
    0)

WebUI.closeBrowser()

