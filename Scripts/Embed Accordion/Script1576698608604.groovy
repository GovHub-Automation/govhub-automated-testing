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

WebUI.callTestCase(findTestCase('Create Accordion'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Embed Start No Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Embed/Page_Create Topic Page  Digital Services Georgia/span_Embed micro-content_dropdown_arrow'))

WebUI.click(findTestObject('Page_Embed/Page_Create Topic Page  Digital Services Georgia/Page_Create Topic Page  Digital Services Georgia/span_Accordion_cke_button_icon cke_button__accordion_icon'))

WebUI.click(findTestObject('Page_Embed/Page_Create Topic Page  Digital Services Georgia/a_Accordion Library'))

WebUI.click(findTestObject('Page_Embed/Page_Create Topic Page  Digital Services Georgia/input_Select accordion item'))

WebUI.click(findTestObject('Page_Embed/Page_Create Topic Page  Digital Services Georgia/Select_button'))

WebUI.click(findTestObject('Page_Embed/Page_Create Topic Page  Digital Services Georgia/Embed_button'))

WebUI.callTestCase(findTestCase('Embed End'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Embed/Page_Create Topic Page  Digital Services Georgia/Page_Embed Automation  Digital Services Georgia/div_Item 1'), 
    'Item 1')

