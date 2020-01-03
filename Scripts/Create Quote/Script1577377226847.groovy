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

WebUI.click(findTestObject('Page_jasmyneepps  Digital Services Georgia/a_Content'))

WebUI.navigateToUrl(GlobalVariable.Environment + 'node/add/quote')

WebUI.setText(findTestObject('Object Repository/Page_Create Quote  Digital Services Georgia/input_Title_title0value'), 'QA test quote with automation title')

WebUI.click(findTestObject('Page_Create Quote  Digital Services Georgia/QuoteNode_QuoteiFrame'))

WebUI.setText(findTestObject('Page_Create Quote  Digital Services Georgia/QuoteNode_QuoteHTML'), 'QA test quote text body content here.')

WebUI.click(findTestObject('Object Repository/Page_Create Quote  Digital Services Georgia/b'))

WebUI.click(findTestObject('Page_Create Quote  Digital Services Georgia/li_Allowed HTML tags a href hreflang name id em strong p br'))

WebUI.click(findTestObject('Page_Create Quote  Digital Services Georgia/input_Published_op'))

WebUI.verifyElementText(findTestObject('Page_QA test quote with automation title  Digital Services Georgia/QuoteNode_Breadcrumb'), 
    'QA test quote with automation title')

WebUI.verifyElementText(findTestObject('Page_QA test quote with automation title  Digital Services Georgia/QuoteNode_PageTitle'), 
    'QA test quote with automation title')

WebUI.verifyElementText(findTestObject('Page_QA test quote with automation title  Digital Services Georgia/QuoteNode_QuoteText'), 
    'QA test quote text body content here.')

