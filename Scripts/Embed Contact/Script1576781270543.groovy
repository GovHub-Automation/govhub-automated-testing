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

WebUI.callTestCase(findTestCase('Embed Start'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Embed/Embed Contact/Page_Create Topic Page  Digital Services Georgia/span_Embed content_cke_button_arrow'))

WebUI.click(findTestObject('Page_Embed/Embed Contact/Page_Create Topic Page  Digital Services Georgia/span_Contact'))

WebUI.click(findTestObject('Page_Embed/Embed Contact/Page_Create Topic Page  Digital Services Georgia/input_Select_DHS_cons_services'))

WebUI.click(findTestObject('Page_Embed/Embed Contact/Page_Create Topic Page  Digital Services Georgia/Submit_button'))

WebUI.click(findTestObject('Object Repository/Page_Embed/Embed LinkCollection/Page_Create Topic Page  Digital Services Georgia/button_Embed'))

WebUI.callTestCase(findTestCase('Embed End'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Embed/Embed Contact/Page_Embed Automation  Digital Services Georgia/h2_Contact       DHS Constituent Services'), 
    'Contact DHS Constituent Services')

