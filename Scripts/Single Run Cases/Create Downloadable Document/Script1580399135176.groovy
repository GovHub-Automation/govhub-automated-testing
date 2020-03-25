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

WebUI.callTestCase(findTestCase('Log In'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Create_downloadable_document/a_Content'))

WebUI.click(findTestObject('Page_Create_downloadable_document/a_Media'))

WebUI.click(findTestObject('Page_Create_downloadable_document/a_Add media'))

WebUI.click(findTestObject('Page_Create_downloadable_document/a_DocumentUse a Document media type for reusable uploaded files'))

WebUI.click(findTestObject('Page_Create_downloadable_document/input_Name_name0value'))

WebUI.setText(findTestObject('Page_Create_downloadable_document/input_Name_name0value'), 'Document From Automation')

WebUI.click(findTestObject('Page_Create_downloadable_document/textarea_Description_field_document_description0value'))

WebUI.setText(findTestObject('Page_Create_downloadable_document/textarea_Description_field_document_description0value'), 
    'The document description.')

String userDir = System.getProperty('user.dir')

String filePath = userDir + '/Data Files/dummy.pdf'

WebUI.uploadFile(findTestObject('Page_Create_downloadable_document/input_File_filesfield_media_file_0'), filePath)

WebUI.click(findTestObject('Page_Create_downloadable_document/select_Day'))

WebUI.selectOptionByValue(findTestObject('Page_Create_downloadable_document/select_Day'), '15', false)

WebUI.click(findTestObject('Page_Create_downloadable_document/select_Month'))

WebUI.selectOptionByValue(findTestObject('Page_Create_downloadable_document/select_Month'), '12', false)

WebUI.click(findTestObject('Page_Create_downloadable_document/select_Year'))

WebUI.selectOptionByValue(findTestObject('Page_Create_downloadable_document/select_Year'), '2019', false)

WebUI.click(findTestObject('Page_Create_downloadable_document/Save button'))

WebUI.click(findTestObject('Page_Create_downloadable_document/a_View Document From Automation'))

WebUI.verifyElementText(findTestObject('Page_Create_downloadable_document/h1_Document From Automation'), 'Document From Automation', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Create_downloadable_document/div_The document description'), 'The document description.', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('Page_Create_downloadable_document/a_Document From Automation'), 'text', 
    'Document From Automation', 0, FailureHandling.CONTINUE_ON_FAILURE)

