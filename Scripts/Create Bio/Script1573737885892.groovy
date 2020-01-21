import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('Authenticate Prod'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Log In as Editor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Content  Digital Services Georgia/a_Content'))

WebUI.click(findTestObject('Object Repository/Page_Content  Digital Services Georgia/a_Add content'))

WebUI.click(findTestObject('Object Repository/Page_Add content  Digital Services Georgia/span_Bio'))

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/input_First_field_full_name0given'))

WebUI.setText(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/input_First_field_full_name0given'), 
    'Jasmyne')

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/input_Last_field_full_name0family'))

WebUI.setText(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/input_Last_field_full_name0family'), 
    'Epps')

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/input_Upload a headshot if available_field_portrait_entity_browser_entity_browser'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/input_Name_name (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/input_Name_name (1)'), 'profile')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/input_Published_edit-submit-media-browser'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/Bio Image'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/Bio_AddImage_SelectButton'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/input_Job Title_field_job_title0value'))

WebUI.setText(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/input_Job Title_field_job_title0value'), 
    'Testing Lead')

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/span_Staff'))

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/li_Our Team'))

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/span_Staff'))

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/Intro Text iframe'))

WebUI.setText(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/introText'), 'Here\'s some intro text')

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/Biography iframe'))

WebUI.setText(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/biographyText'), 'Here\'s some more information about Jasmyne Epps.')

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/input_Contact Information_field_contact_entity_browser_entity_browser'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/input_Title_title (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/input_Title_title (1)'), 'Jasmyne')

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/input_Moderation state_edit-submit-content-browser'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/input_Select this item_entity_browser_selec_a73239'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/input_Published_op'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/select_DraftPublishedArchived'), 
    'published', true)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/Save Bio'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Jasmyne Epps  Digital Services Georgia/BioPage_Title'), 'Jasmyne Epps', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Jasmyne Epps  Digital Services Georgia/BioPage_JobTitle'), 
    'Testing Lead', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Jasmyne Epps  Digital Services Georgia/BioPage_StaffOption'), 
    'OUR TEAM', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Jasmyne Epps  Digital Services Georgia/BioPage_Intro'), 'Here\'s some intro text', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Jasmyne Epps  Digital Services Georgia/Bio_MoreInformation'), 
    'Here\'s some more information about Jasmyne Epps.', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Jasmyne Epps  Digital Services Georgia/BioPage_ContactNotes'), 
    'Here are some contact notes for Jasmyne', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Jasmyne Epps  Digital Services Georgia/BioPage_PrimaryNumber'), 
    '(404) 321-4567', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Jasmyne Epps  Digital Services Georgia/BioPage_FaxNumber'), 
    '(770) 321-4567', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Jasmyne Epps  Digital Services Georgia/BioPage_Email'), 'https://google.com', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Jasmyne Epps  Digital Services Georgia/BioPage_Address'), 
    '47 Trinity Ave SW', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Jasmyne Epps  Digital Services Georgia/BioPage_City'), 'Atlanta', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Jasmyne Epps  Digital Services Georgia/BioPage_State'), 'GA', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Jasmyne Epps  Digital Services Georgia/BioPage_ZipCode'), 
    '30334', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Jasmyne Epps  Digital Services Georgia/BioPage_Country'), 
    'United States', FailureHandling.CONTINUE_ON_FAILURE)

