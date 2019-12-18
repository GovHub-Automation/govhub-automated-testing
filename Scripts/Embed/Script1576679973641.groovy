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

WebUI.callTestCase(findTestCase('Authenticate Prod'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Log In as Editor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://test.prod.dsga.codes/user/11206')

WebUI.navigateToUrl('https://test.prod.dsga.codes/node/add/topic_page')

WebUI.setText(findTestObject('Page_Embed/input_Title_title0value'), 'Embed Automation')

WebUI.click(findTestObject('Page_Embed/html_Rich Text Editor Summary'))

WebUI.click(findTestObject('Page_Embed/a_Embed micro-content'))

WebUI.setText(findTestObject('Page_Embed/body_Summary'), 'Summary')

WebUI.click(findTestObject('Page_Embed/Page_Create Topic Page  Digital Services Georgia/span_Embed micro-content_dropdown_arrow'))

WebUI.click(findTestObject('Page_Embed/span_Accordion'))

WebUI.click(findTestObject('Page_Embed/Page_Create Topic Page  Digital Services Georgia/a_Accordion Library'))

WebUI.click(findTestObject('Page_Embed/Page_Create Topic Page  Digital Services Georgia/input_Select_HDI_Apply'))

WebUI.click(findTestObject('Page_Embed/Page_Create Topic Page  Digital Services Georgia/Select_button'))

WebUI.click(findTestObject('Page_Embed/Page_Create Topic Page  Digital Services Georgia/Embed_button'))

WebUI.click(findTestObject('Page_Embed/Page_Create Topic Page  Digital Services Georgia/Save_node_button'))

