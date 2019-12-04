import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())


RunConfiguration.setExecutionSettingFile('/var/folders/pp/rw_8q31s32v88_f01ndn6_b00000gn/T/Katalon/Test Cases/Create Event/20191204_072138/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

not_run: WebUI.callTestCase(findTestCase('Authenticate Prod'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Log In as Editor'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Editor  Digital Services Georgia/a_Content'))

not_run: WebUI.click(findTestObject('Page_Content  Digital Services Georgia/a_Add content'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Page_Add content  Digital Services Georgia/a_EventEvents open to the public or official meetings they should be informed about'))

not_run: WebUI.setText(findTestObject('Page_Create Event  Digital Services Georgia/input_Title_title0value (1)'), 'New Event Title')

not_run: WebUI.setText(findTestObject('Page_Create Event  Digital Services Georgia/input_Short Title_field_short_title0value (1)'), 
    'Event Title')

not_run: WebUI.click(findTestObject('Page_Create Event  Digital Services Georgia/input_Select a small image to associate with your event_field_event_thumbnail_entity_browser_entity_browser'))

not_run: WebUI.setText(findTestObject('Page_Create Event  Digital Services Georgia/input_Name_name'), 'image')

not_run: WebUI.click(findTestObject('Page_Create Event  Digital Services Georgia/input_Published_edit-submit-media-browser'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Page_Create Event  Digital Services Georgia/div_Open  configuration optionsEdit        _9cc0ee'))

not_run: WebUI.click(findTestObject('Page_Create Event  Digital Services Georgia/input_Select this item_op (1)'))

not_run: WebUI.click(findTestObject('Page_Create Event  Digital Services Georgia/span_- None - (1)'))

not_run: WebUI.click(findTestObject('Page_Create Event  Digital Services Georgia/html_Rich Text Editor Intro Text'))

not_run: WebUI.setText(findTestObject('Page_Create Event  Digital Services Georgia/html_Rich Text Editor Intro Text'), 'Here\\'s some intro content for this event')

not_run: WebUI.click(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/input_Button URL_field_link0uri'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/input_Button URL_field_link0uri'), 
    'Content Specialist Certification Sign-up')

not_run: WebUI.click(findTestObject('Page_Create Event  Digital Services Georgia/URL - Content Specialist Certification Sign-up'))

not_run: WebUI.click(findTestObject('Page_Create Event  Digital Services Georgia/html_Rich Text Editor Registration Details (1)'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Page_Create Event  Digital Services Georgia/Registration Details'), 'Here\\'s some registration details for this event')

not_run: WebUI.click(findTestObject('Page_Create Event  Digital Services Georgia/Enter Start Date'))

not_run: WebUI.setText(findTestObject('Page_Create Event  Digital Services Georgia/Enter Start Date'), '09272020')

not_run: WebUI.click(findTestObject('Page_Create Event  Digital Services Georgia/Event Start Time'))

not_run: WebUI.click(findTestObject('Page_Create Event  Digital Services Georgia/li_1200'))

not_run: WebUI.click(findTestObject('Page_Create Event  Digital Services Georgia/Add Location'))

not_run: WebUI.click(findTestObject('Page_Create Event  Digital Services Georgia/input_Select this item_entity_browser_selectnode13856'))

not_run: WebUI.click(findTestObject('Page_Create Event  Digital Services Georgia/Select Location'))

not_run: WebUI.click(findTestObject('Page_Create Event  Digital Services Georgia/Event Details iframe'))

not_run: WebUI.setText(findTestObject('Page_Create Event  Digital Services Georgia/Event Details'), 'Here are some event details')

not_run: WebUI.click(findTestObject('Page_Create Event  Digital Services Georgia/Add Related File'))

not_run: WebUI.click(findTestObject('Page_Create Event  Digital Services Georgia/Related File'))

not_run: WebUI.click(findTestObject('Page_Create Event  Digital Services Georgia/Select Related File'))

WebUI.click(findTestObject('Page_Create Event  Digital Services Georgia/Add Contact'))

WebUI.click(findTestObject('Page_Create Event  Digital Services Georgia/Contact'))

WebUI.click(findTestObject('Page_Create Event  Digital Services Georgia/Select Contact'))

''', 'Test Cases/Create Event', new TestCaseBinding('Test Cases/Create Event',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
