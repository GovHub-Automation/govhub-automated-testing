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

WebUI.navigateToUrl('https://gta:gta@digitalservices.staging.dsga.codes/user/login')

WebUI.navigateToUrl('https://digitalservices.staging.dsga.codes/contacts/support-desk')

WebUI.click(findTestObject('Object Repository/Page_Support Desk  Digital Services Georgia/a_Edit'))

WebUI.setText(findTestObject('Page_Edit Contact Support Desk  Digital Ser_1456f7/input_URL_field_website1uri'), 'https://digitalservices.staging.dsga.codes/1-finding-your-audience')

WebUI.click(findTestObject('Object Repository/Page_Edit Contact Support Desk  Digital Ser_1456f7/span_Linkit could not find any suggestions _3820db'))

WebUI.setText(findTestObject('Object Repository/Page_Edit Contact Support Desk  Digital Ser_1456f7/input_Link text_field_website1title'), 
    '1 Finding Your Audience')

WebUI.click(findTestObject('Page_Edit Contact Support Desk  Digital Services Georgia/SupportDesk_Edit_Save_Button'))

WebUI.delay(2)

WebUI.navigateToUrl('https://digitalservices.staging.dsga.codes/locations/47-trinity-avenue-sw')

WebUI.click(findTestObject('Object Repository/Page_47 Trinity Avenue SW  Digital Services_c75718/a_Edit'))

WebUI.setText(findTestObject('Object Repository/Page_Edit Location 47 Trinity Avenue SW  Di_c85c32/input_URL_field_related_links0uri'), 
    'https://digitalservices.staging.dsga.codes/1-creating-document-structure')

WebUI.click(findTestObject('Object Repository/Page_Edit Location 47 Trinity Avenue SW  Di_c85c32/span_Linkit could not find any suggestions _3820db'))

WebUI.setText(findTestObject('Object Repository/Page_Edit Location 47 Trinity Avenue SW  Di_c85c32/input_Link text_field_related_links0title'), 
    '1-creating-document-structure')

WebUI.click(findTestObject('Page_Edit Location 47 Trinity Avenue SW  Digital Services Georgia/Locations_Edit_Save_Button'))

WebUI.delay(2)

WebUI.navigateToUrl('https://gta:gta@www.staging.dsga.codes/user/login')

WebUI.navigateToUrl('https://www.staging.dsga.codes/admin/content/imported-content')

WebUI.verifyElementText(findTestObject('Page_Imported content  Georgiagov/Admin_ImportedContent_Table_Item_1'), '47 Trinity Avenue SW')

WebUI.verifyElementText(findTestObject('Page_Imported content  Georgiagov/Admin_ImportedContent_Table_Item_2'), 'Support Desk')

