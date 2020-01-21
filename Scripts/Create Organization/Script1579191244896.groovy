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

WebUI.click(findTestObject('Create Organization/Page_Add content  Digital Services Georgia/span_Organization'))

WebUI.delay(2)

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

WebUI.setText(findTestObject('Create Organization/Page_Create Organization  Digital Services Georgia/input_instagram_field_social_media_links'), 
    'example-instagram')

WebUI.setText(findTestObject('Create Organization/Page_Create Organization  Digital Services Georgia/input_linkedin_field_social_media_links'), 
    'example-linkedin')

WebUI.click(findTestObject('Create Organization/Page_Create Organization  Digital Services Georgia/Add_Location_button'))

WebUI.switchToFrame(findTestObject('Create Organization/Page_Create Organization  Digital Services Georgia/iframe_Location_entity_browser'), 
    5)

WebUI.click(findTestObject('Create Organization/Page_Create Organization  Digital Services Georgia/input_Select_location_entity'))

WebUI.click(findTestObject('Create Organization/Page_Create Organization  Digital Services Georgia/location_entity_browser_select_button'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Create Organization/Page_Create Organization  Digital Services Georgia/Add_Contact_button'))

WebUI.switchToFrame(findTestObject('Create Organization/Page_Create Organization  Digital Services Georgia/iframe_Contact_entity_browser_iframe'), 
    5)

WebUI.click(findTestObject('Create Organization/Page_Create Organization  Digital Services Georgia/input_Select_contact_checkbox'))

WebUI.click(findTestObject('Create Organization/Page_Create Organization  Digital Services Georgia/Contact_select_button'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Create Organization/Page_Create Organization  Digital Services Georgia/Add_Parent_Organization_button'))

WebUI.switchToFrame(findTestObject('Create Organization/Page_Create Organization  Digital Services Georgia/iframe_Organization_entity_browser_iframe'), 
    5)

WebUI.click(findTestObject('Create Organization/Page_Create Organization  Digital Services Georgia/input_Select_Organization_checkbox'))

WebUI.click(findTestObject('Create Organization/Page_Create Organization  Digital Services Georgia/Select_Organization_button'))

WebUI.switchToDefaultContent()

WebUI.selectOptionByValue(findTestObject('Create Organization/Page_Create Organization  Digital Services Georgia/select_DraftNeeds ReviewPublishedArchived'), 
    'published', false)

WebUI.click(findTestObject('Create Organization/Page_Create Organization  Digital Services Georgia/Save_button'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Create Organization/Page_From Automation  Digital Services Georgia/h1_From Automation'), 
    'From Automation', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Create Organization/Page_From Automation  Digital Services Georgia/p_Overview text'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Create Organization/Page_From Automation  Digital Services Georgia/div_Office'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Create Organization/Page_From Automation  Digital Services Georgia/h2_Contact'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Create Organization/Page_From Automation  Digital Services Georgia/h2_Visit'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Create Organization/Page_From Automation  Digital Services Georgia/a_Location details'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

