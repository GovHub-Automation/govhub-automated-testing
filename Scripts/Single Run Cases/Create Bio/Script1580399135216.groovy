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

not_run: WebUI.callTestCase(findTestCase('Authenticate Testing Site'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Page_jasmyneepps  Digital Services Georgia/Content Library'))

WebUI.click(findTestObject('Page_Content  Digital Services Georgia/Add content'))

WebUI.click(findTestObject('Page_Add content  Digital Services Georgia/Add Bio'))

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/input_First_field_full_name0given'))

WebUI.setText(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/input_First_field_full_name0given'), 
    GlobalVariable.firstName)

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/input_Last_field_full_name0family'))

WebUI.setText(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/input_Last_field_full_name0family'), 
    GlobalVariable.lastName)

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/input_Upload a headshot if available_field_portrait_entity_browser_entity_browser'))

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/input_Name_name (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/input_Name_name (1)'), 'profile')

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/input_Published_edit-submit-media-browser'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/Bio Image'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/Bio_AddImage_SelectButton'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/input_Job Title_field_job_title0value'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/input_Job Title_field_job_title0value'), 
    GlobalVariable.title)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/span_Staff'))

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/li_Our Team'))

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/span_Staff'))

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/Intro Text iframe'))

WebUI.setText(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/introText'), GlobalVariable.introContent)

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/Biography iframe'))

WebUI.setText(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/biographyText'), GlobalVariable.bioContent)

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/input_Contact Information_field_contact_entity_browser_entity_browser'))

WebUI.click(findTestObject('Page_Create Bio  Digital Services Georgia/Select latest contact created'))

WebUI.click(findTestObject('Object Repository/Page_Create Bio  Digital Services Georgia/input_Published_op'))

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

WebUI.verifyElementText(findTestObject('Object Repository/Page_Jasmyne Epps  Digital Services Georgia/BioPage_Intro'), GlobalVariable.introContent, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Jasmyne Epps  Digital Services Georgia/Bio_MoreInformation'), 
    GlobalVariable.bioContent, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Jasmyne Epps  Digital Services Georgia/BioPage_ContactNotes'), 
    GlobalVariable.notes, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Jasmyne Epps  Digital Services Georgia/BioPage_PrimaryNumber'), 
    '(404) 234-5678', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Jasmyne Epps  Digital Services Georgia/BioPage_FaxNumber'), 
    '(334) 234-5678', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Jasmyne Epps  Digital Services Georgia/BioPage_Email'), GlobalVariable.website, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Jasmyne Epps  Digital Services Georgia/BioPage_Address'), 
    GlobalVariable.address, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Jasmyne Epps  Digital Services Georgia/BioPage_City'), GlobalVariable.city, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Jasmyne Epps  Digital Services Georgia/BioPage_State'), GlobalVariable.state, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Jasmyne Epps  Digital Services Georgia/BioPage_ZipCode'), 
    GlobalVariable.zip, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Jasmyne Epps  Digital Services Georgia/BioPage_Country'), 
    GlobalVariable.country, FailureHandling.CONTINUE_ON_FAILURE)

