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

WebUI.delay(2)

WebUI.click(findTestObject('Page_Add content  Digital Services Georgia/span_Contact'))

WebUI.click(findTestObject('Page_Create Contact  Digital Services Georgia/input_First_field_split_name0given'))

WebUI.setText(findTestObject('Page_Create Contact  Digital Services Georgia/input_First_field_split_name0given'), 'From')

WebUI.click(findTestObject('Page_Create Contact  Digital Services Georgia/input_Last_field_split_name0family'))

WebUI.setText(findTestObject('Page_Create Contact  Digital Services Georgia/input_Last_field_split_name0family'), 'Automation')

WebUI.setText(findTestObject('Object Repository/Page_Create Contact  Digital Services Georgia/input_Phone number_field_contact_telephone_numbers0value'), 
    '4043214567')

WebUI.click(findTestObject('Page_Embed/Embed Contact/Page_Create Contact  Digital Services Georgia/Save_contact_as'))

WebUI.selectOptionByValue(findTestObject('Page_Embed/Embed Contact/Page_Create Contact  Digital Services Georgia/select_DraftPublishedArchived_contact'), 
    'published', true)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Embed/Embed Contact/Page_Create Contact  Digital Services Georgia/Contact_Save_button'))

WebUI.delay(4)

WebUI.callTestCase(findTestCase('Embed Start No Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Embed/Embed Contact/Page_Create Topic Page  Digital Services Georgia/span_Embed content_cke_button_arrow'))

WebUI.click(findTestObject('Page_Embed/Embed Contact/Page_Create Topic Page  Digital Services Georgia/span_Contact'))

WebUI.click(findTestObject('Page_Embed/Embed Contact/Page_Create Topic Page  Digital Services Georgia/input_Select_contact'))

WebUI.click(findTestObject('Page_Embed/Embed Contact/Page_Create Topic Page  Digital Services Georgia/Submit_button'))

WebUI.click(findTestObject('Object Repository/Page_Embed/Embed LinkCollection/Page_Create Topic Page  Digital Services Georgia/button_Embed'))

WebUI.callTestCase(findTestCase('Embed End'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Embed/Embed Contact/Page_Embed Automation  Digital Services Georgia/h2_Contact'), 
    'Contact From Automation')

WebUI.closeBrowser()

