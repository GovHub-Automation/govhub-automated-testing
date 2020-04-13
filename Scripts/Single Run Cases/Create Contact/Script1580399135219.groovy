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

WebUI.click(findTestObject('Page_Add content  Digital Services Georgia/Add Contact'))

WebUI.click(findTestObject('Page_Create Contact  Digital Services Georgia/input_First_field_split_name0given'))

WebUI.setText(findTestObject('Page_Create Contact  Digital Services Georgia/input_First_field_split_name0given'), GlobalVariable.firstName)

WebUI.click(findTestObject('Page_Create Contact  Digital Services Georgia/input_Last_field_split_name0family'))

WebUI.setText(findTestObject('Page_Create Contact  Digital Services Georgia/input_Last_field_split_name0family'), GlobalVariable.lastName)

WebUI.click(findTestObject('Page_Create Contact  Digital Services Georgia/span_- None -'))

WebUI.click(findTestObject('Page_Create Contact  Digital Services Georgia/li_Cool Kids'))

WebUI.click(findTestObject('Page_Create Contact  Digital Services Georgia/span_- None -'))

WebUI.click(findTestObject('Page_Create Contact  Digital Services Georgia/iframe_Notes'))

WebUI.setText(findTestObject('Page_Create Contact  Digital Services Georgia/NotesText'), GlobalVariable.notes)

WebUI.setText(findTestObject('Object Repository/Page_Create Contact  Digital Services Georgia/input_Phone number_field_contact_telephone_numbers0value'), 
    GlobalVariable.phone)

WebUI.click(findTestObject('Page_Create Contact  Digital Services Georgia/Add Another Contact'))

WebUI.delay(2)

WebUI.clearText(findTestObject('Page_Create Contact  Digital Services Georgia/input_Number Fax'))

WebUI.setText(findTestObject('Page_Create Contact  Digital Services Georgia/input_Number Fax'), 'Fax')

WebUI.setText(findTestObject('Page_Create Contact  Digital Services Georgia/input_Phone number Fax'), GlobalVariable.fax)

WebUI.click(findTestObject('Object Repository/Page_Create Contact  Digital Services Georgia/input_URL_field_website0uri'))

WebUI.setText(findTestObject('Object Repository/Page_Create Contact  Digital Services Georgia/input_URL_field_website0uri'), 
    GlobalVariable.website)

WebUI.click(findTestObject('Page_Create Contact  Digital Services Georgia/span_httpsgooglecom'))

WebUI.click(findTestObject('Object Repository/Page_Create Contact  Digital Services Georgia/input_If you want to show the contacts physical location'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Create Contact  Digital Services Georgia/Select a Location by the Xpath'))

WebUI.click(findTestObject('Object Repository/Page_Create Contact  Digital Services Georgia/input_Published_op'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Contact  Digital Services Georgia/select_DraftPublishedArchived'), 
    'published', true)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Create Contact  Digital Services Georgia/input_Save Contact'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Jasmyne Epps  Digital Services Georgia/h1_Contact       Jasmyne Epps'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

