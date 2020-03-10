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
import org.openqa.selenium.Keys as Keys

not_run: WebUI.callTestCase(findTestCase('Authenticate Testing Site'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Log In as Editor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Editor  Digital Services Georgia/a_Content'))

WebUI.click(findTestObject('Object Repository/Page_Content  Digital Services Georgia/a_Add content'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Add content  Digital Services Georgia/Add Event'))

WebUI.setText(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/input_Title_title0value (1)'), 
    'New Event - Automation')

WebUI.setText(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/input_Short Title_field_short_title0value (1)'), 
    'Event Title')

WebUI.click(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/input_Select a small image to associate with your event_field_event_thumbnail_entity_browser_entity_browser'))

WebUI.setText(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/input_Name_name'), 'image')

WebUI.click(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/input_Published_edit-submit-media-browser'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/div_Open  configuration optionsEdit        _9cc0ee'))

WebUI.click(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/input_Select this item_op (1)'))

WebUI.click(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/span_- None - (1)'))

WebUI.click(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/html_Rich Text Editor Intro Text'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/html_Rich Text Editor Intro Text'), 
    GlobalVariable.introContent)

WebUI.click(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/input_Button URL_field_link0uri'))

WebUI.setText(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/input_Button URL_field_link0uri'), 
    'Content Specialist Certification Sign-up')

WebUI.click(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/URL - Content Specialist Certification Sign-up'))

WebUI.click(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/html_Rich Text Editor Registration Details (1)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/Registration Details'), GlobalVariable.bodyContent)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/EventCreate_StartDate'), '09272020')

WebUI.click(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/Event Start Time'))

WebUI.click(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/li_1200'))

WebUI.click(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/Add Location'))

WebUI.click(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/input_Select this item_entity_browser_selectnode13856'))

WebUI.click(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/input_Published_op (3)'))

WebUI.click(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/Event Details iframe'))

WebUI.setText(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/Event Details'), GlobalVariable.summaryContent)

WebUI.click(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/Add Related File'))

WebUI.click(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/Related File'))

WebUI.click(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/Select Related File'))

WebUI.click(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/Add Contact'))

WebUI.click(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/Contact'))

WebUI.click(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/Select Contact'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/Select Published'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/Select Published'), 
    'published', true)

WebUI.click(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/EventCreate_SaveButton'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Event Title  Digital Services Georgia/EventPage_Breadcrumbs'), 
    'New Event - Automation', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Event Title  Digital Services Georgia/EventPage_PageTitle'), 
    'New Event - Automation', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Event Title  Digital Services Georgia/EventPage_Address'), 
    '47 Trinity Ave SW', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Event Title  Digital Services Georgia/EventPage_City'), 'Atlanta', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Event Title  Digital Services Georgia/EventPage_ContactNotes'), 
    GlobalVariable.notes, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Event Title  Digital Services Georgia/EventPage_ContactTitle'), 
    'Contact Jasmyne Epps', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Event Title  Digital Services Georgia/EventPage_Country'), 
    'United States', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Event Title  Digital Services Georgia/EventPage_Email'), 
    'https://google.com', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Event Title  Digital Services Georgia/EventPage_FaxNumber'), 
    '(404) 234-5678', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Event Title  Digital Services Georgia/EventPage_PrimaryNumber'), 
    '(334) 234-5678', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Event Title  Digital Services Georgia/EventPage_RegistrationDetails'), 
    GlobalVariable.bodyContent, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Event Title  Digital Services Georgia/EventPage_StartDate'), 
    'Sunday, September 27, 2020\n12 p.m.', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Event Title  Digital Services Georgia/EventPage_State'), 
    'GA', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Event Title  Digital Services Georgia/EventPage_ZipCode'), 
    '30334', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Event Title  Digital Services Georgia/EventPage_EventDetails'), 
    GlobalVariable.summaryContent, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Event Title  Digital Services Georgia/EventPage_IntroContent'), 
    GlobalVariable.introContent, FailureHandling.CONTINUE_ON_FAILURE)

