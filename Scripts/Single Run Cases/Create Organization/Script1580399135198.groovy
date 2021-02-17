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

WebUI.click(findTestObject('Page_Add content  Digital Services Georgia/Add Organization'))

WebUI.setText(findTestObject('Create Organization/Page_Create Organization  Digital Services Georgia/input_Name_title0value'), 
    'From Automation')

WebUI.setText(findTestObject('Create Organization/Page_Create Organization  Digital Services Georgia/input_Acronym_field_acronym0value'), 
    'FA')

WebUI.setText(findTestObject('Create Organization/Page_Create Organization  Digital Services Georgia/html_Rich Text Editor Overview field'), 
    'Overview text')

WebUI.setText(findTestObject('Create Organization/Page_Create Organization  Digital Services Georgia/input_URL_field_website0uri'), 
    'https://example.com')

WebUI.setText(findTestObject('Create Organization/Page_Create Organization  Digital Services Georgia/input_Link text_field_website0title'), 
    'Example Link')

WebUI.click(findTestObject('Create Organization/Page_Create Organization  Digital Services Georgia/Add_Location_button'))

WebUI.click(findTestObject('Page_Create Organization  Digital Services Georgia/Select a Primary Location'))

WebUI.click(findTestObject('Page_Create Organization  Digital Services Georgia/Save Primary Location'))

WebUI.delay(2)

WebUI.click(findTestObject('Create Organization/Page_Create Organization  Digital Services Georgia/Add_Contact_button'))

WebUI.click(findTestObject('Page_Create Organization  Digital Services Georgia/Select Primary Contact'))

WebUI.click(findTestObject('Page_Create Organization  Digital Services Georgia/Save Primary Contact'))

WebUI.delay(2)

WebUI.click(findTestObject('Create Organization/Page_Create Organization  Digital Services Georgia/Add_Parent_Organization_button'))

WebUI.click(findTestObject('Page_Create Organization  Digital Services Georgia/Select a Parent Organization'))

WebUI.click(findTestObject('Page_Create Organization  Digital Services Georgia/Save Parent Organization'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Create Organization/Page_Create Organization  Digital Services Georgia/select_DraftNeeds ReviewPublishedArchived'), 
    'published', false)

WebUI.click(findTestObject('Create Organization/Page_Create Organization  Digital Services Georgia/Save_button'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Create Organization/Page_From Automation  Digital Services Georgia/h1_From Automation'), 
    'From Automation', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Create Organization/Page_From Automation  Digital Services Georgia/p_Overview text'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Create Organization/Page_From Automation  Digital Services Georgia/h2_Contact'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Create Organization/Page_From Automation  Digital Services Georgia/h2_Visit'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Create Organization/Page_From Automation  Digital Services Georgia/a_Location details'), 
    0, FailureHandling.STOP_ON_FAILURE)

