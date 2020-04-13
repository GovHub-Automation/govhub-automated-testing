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

WebUI.mouseOver(findTestObject('Page_jasmyneepps  Digital Services Georgia/Content Library'))

WebUI.click(findTestObject('Page_Content  Digital Services Georgia/Add content'))

WebUI.click(findTestObject('Page_Add content  Digital Services Georgia/Add Organization'))

WebUI.setText(findTestObject('Object Repository/Page_Create Organization  Digital Services Georgia/input_Name_title0value'), 
    'Test Organization Page')

WebUI.setText(findTestObject('Object Repository/Page_Create Organization  Digital Services Georgia/input_Acronym_field_acronym0value'), 
    'TOP')

WebUI.setText(findTestObject('Object Repository/Page_Create Organization  Digital Services Georgia/Organization_Overview_WYSIWYG'), 
    'This is a test overview field value.')

WebUI.click(findTestObject('Object Repository/Page_Create Organization  Digital Services Georgia/Organization_Save_Button'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Test Organization Page  Digital Services Georgia/Overview_Page_Title'), 
    'Test Organization Page')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Test Organization Page  Digital Services Georgia/Overview_Page_Text'), 
    'This is a test overview field value.')

WebUI.click(findTestObject('Object Repository/Page_Test Organization Page  Digital Servic_2bb8fa/a_Edit'))

WebUI.setText(findTestObject('Object Repository/Page_Edit Organization Test Organization Pa_02bfd1/input_Name_title0value'), 
    'Test Organization Page REVISION 1')

WebUI.click(findTestObject('Object Repository/Page_Create Organization  Digital Services Georgia/Organization_Save_Button'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Test Organization Page  Digital Services Georgia/Overview_Page_Title'), 
    'Test Organization Page REVISION 1')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Test Organization Page  Digital Services Georgia/Overview_Page_Text'), 
    'This is a test overview field value.')

WebUI.click(findTestObject('Object Repository/Page_Test Organization Page  Digital Servic_2bb8fa/a_Edit'))

WebUI.setText(findTestObject('Object Repository/Page_Edit Organization Test Organization Pa_02bfd1/input_Name_title0value'), 
    'Test Organization Page REVISION 2')

WebUI.click(findTestObject('Object Repository/Page_Create Organization  Digital Services Georgia/Organization_Save_Button'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Test Organization Page  Digital Services Georgia/Overview_Page_Title'), 
    'Test Organization Page REVISION 2')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Test Organization Page  Digital Services Georgia/Overview_Page_Text'), 
    'This is a test overview field value.')

WebUI.click(findTestObject('Object Repository/Page_Test Organization Page REVISION 2  Dig_c7e7b2/a_Revisions'))

WebUI.click(findTestObject('Object Repository/Page_Revisions for Test Organization Page REVISION 2  Digital Services Georgia/Organization_Revision_1_Button'))

WebUI.click(findTestObject('Object Repository/Page_Are you sure you want to revert to the_ae1ebb/input_Wed 03112020 - 1637_op'))

WebUI.click(findTestObject('Object Repository/Page_Revisions for Test Organization Page R_da8b10/a_View'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Test Organization Page  Digital Services Georgia/Overview_Page_Title'), 
    'Test Organization Page REVISION 1')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Test Organization Page  Digital Services Georgia/Overview_Page_Text'), 
    'This is a test overview field value.')

WebUI.click(findTestObject('Object Repository/Page_Test Organization Page REVISION 1  Dig_73cd0e/a_Revisions_1'))

WebUI.click(findTestObject('Page_Revisions for Test Organization Page REVISION 1  Digital Services Georgia/Organization_Revert_Original'))

WebUI.click(findTestObject('Object Repository/Page_Are you sure you want to revert to the_c057eb/input_Wed 03112020 - 1650_op'))

WebUI.click(findTestObject('Page_Revisions for Test Organization Page  _c6f43d/a_View'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Test Organization Page  Digital Services Georgia/Overview_Page_Title'), 
    'Test Organization Page')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Test Organization Page  Digital Services Georgia/Overview_Page_Text'), 
    'This is a test overview field value.')

