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

WebUI.callTestCase(findTestCase('Authenticate Testing Site'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Log In as Editor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_jasmyneepps  Digital Services Georgia/a_Content'))

WebUI.click(findTestObject('Page_Create_Important_Date/a_Add content'))

WebUI.click(findTestObject('Page_Create_Important_Date/a_Important DateInform visitors about impor_b6ec0d'))

WebUI.click(findTestObject('Page_Create_Important_Date/input_Title_title0value'))

WebUI.setText(findTestObject('Page_Create_Important_Date/input_Title_title0value'), 'Important Date - Automation')

WebUI.click(findTestObject('Page_Create_Important_Date/input_Subtitle_field_subtitle0value'))

WebUI.setText(findTestObject('Page_Create_Important_Date/input_Subtitle_field_subtitle0value'), 'Automation')

WebUI.click(findTestObject('Page_Create_Important_Date/input_URL_field_call_to_action0uri'))

WebUI.setText(findTestObject('Page_Create_Important_Date/input_URL_field_call_to_action0uri'), 'https://example.com')

WebUI.click(findTestObject('Page_Create_Important_Date/input_Link text_field_call_to_action0title'))

WebUI.setText(findTestObject('Page_Create_Important_Date/input_Link text_field_call_to_action0title'), 'Click Me!')

WebUI.click(findTestObject('Page_Create_Important_Date/input_Date_field_id_date0valuedate'))

WebUI.setText(findTestObject('Page_Create_Important_Date/input_Date_field_id_date0valuedate'), '12-14-2019')

WebUI.click(findTestObject('Page_Create_Important_Date/input_Time_field_id_date0valuetime'))

WebUI.setText(findTestObject('Page_Create_Important_Date/input_Time_field_id_date0valuetime'), '01:00:00')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/Select Published'), 
    'published', true)

WebUI.click(findTestObject('Page_Create_Important_Date/input_Save as_op'))

WebUI.verifyElementText(findTestObject('Page_Create_Important_Date/h1_Important Date Automation'), 'Important Date - Automation', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('Page_Create_Important_Date/a_Click Me'), 'text', 'Click Me!', 0, FailureHandling.CONTINUE_ON_FAILURE)

