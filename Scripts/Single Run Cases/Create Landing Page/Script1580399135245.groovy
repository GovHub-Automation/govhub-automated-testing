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

WebUI.mouseOver(findTestObject('Page_jasmyneepps  Digital Services Georgia/Content Library'))

WebUI.click(findTestObject('Page_Content  Digital Services Georgia/Add content'))

WebUI.click(findTestObject('Page_Add content  Digital Services Georgia/Add Landing Page'))

WebUI.setText(findTestObject('Create Landing Page/Page_Create Landing Page  Digital Services Georgia/input_Title_title0value'), 
    'Landing Page - Automation')

WebUI.setText(findTestObject('Create Landing Page/Page_Create Landing Page  Digital Services Georgia/input_Short Title_field_short_title0value'), 
    'From Automation')

WebUI.setText(findTestObject('Create Landing Page/Page_Create Landing Page  Digital Services Georgia/input_Label_field_landing_page_label0value'), 
    'Label text')

WebUI.click(findTestObject('Create Landing Page/Page_Create Landing Page  Digital Services Georgia/input_Include_navigation_checkbox'))

WebUI.setText(findTestObject('Create Landing Page/Page_Create Landing Page  Digital Services Georgia/html_Rich Text Editor Summary field'), 
    GlobalVariable.summaryContent)

WebUI.selectOptionByValue(findTestObject('Create Landing Page/Page_Create Landing Page  Digital Services Georgia/select_DraftNeeds ReviewPublishedArchived'), 
    'published', false)

WebUI.click(findTestObject('Create Landing Page/Page_Create Landing Page  Digital Services Georgia/Save_button'))

WebUI.verifyElementPresent(findTestObject('Create Landing Page/Page_From Automation  Digital Services Georgia/li_From Automation'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

