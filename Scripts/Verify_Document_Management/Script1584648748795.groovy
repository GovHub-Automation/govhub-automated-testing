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

WebUI.click(findTestObject('Object Repository/Page_jasmyneepps  Digital Services Georgia/a_Content'))

WebUI.click(findTestObject('Object Repository/Page_Content  Digital Services Georgia/a_Documents'))

WebUI.click(findTestObject('Object Repository/Page_Document Library  Digital Services Georgia/a_Add document'))

WebUI.setText(findTestObject('Object Repository/Page_Add Document  Digital Services Georgia/input_Name_name0value'), 'QA test document with automation')

WebUI.click(findTestObject('Object Repository/Page_Add Document  Digital Services Georgia/FileUpload_ChooseFileButton'))

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Object Repository/Page_Add Document  Digital Services Georgia/File_Document_Upload'), '/Users/jasmyneepps/Development/DSGa-TestingAssets/DataProvider_1.csv')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Add Document  Digital Services Georgia/input_Format Leave blank to use the time of_c4fc7d'))

WebUI.click(findTestObject('Object Repository/Page_Add Document  Digital Services Georgia/input_Published_op'))

WebUI.click(findTestObject('Object Repository/Page_Document Library  Digital Services Georgia/a_QA test document with automation'))

documentURL = WebUI.getUrl()

WebUI.click(findTestObject('Object Repository/Page_QA test document with automation  Digi_5349ec/a_Manage'))

WebUI.click(findTestObject('Object Repository/Page_QA test document with automation  Digi_5349ec/a_Content'))

WebUI.click(findTestObject('Object Repository/Page_Content  Digital Services Georgia/a_Documents'))

WebUI.click(findTestObject('Object Repository/Page_Document Library  Digital Services Georgia/button_List additional actions'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Document Library  Digital Services Georgia/ReplaceEverywhere_DropdownItem'), 
    'Replace everywhere')

WebUI.click(findTestObject('Object Repository/Page_Document Library  Digital Services Georgia/ReplaceEverywhere_DropdownItem'))

WebUI.click(findTestObject('Object Repository/Page_Replace QA test document with automati_ab0ef8/input_QA test document with automation_repl_5e87f8'))

WebUI.click(findTestObject('Object Repository/Page_Replace QA test document with automati_ab0ef8/a_Upload Document'))

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Page_Replace QA test document with automation everywhere  Digital Services Georgia/Upload_File_Area'), 
    '/Users/jasmyneepps/Development/DSGa-TestingAssets/DataProvider_2.csv')

WebUI.delay(3)

