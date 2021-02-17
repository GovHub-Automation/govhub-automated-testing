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

WebUI.click(findTestObject('Object Repository/Page_Add content  Digital Services Georgia/a_WebformA basic page with a webform attached'))

WebUI.setText(findTestObject('Object Repository/Page_Create Webform  Digital Services Georgia/input_Title_title0value'), 
    'QA test webform with automation')

String timestamp = System.nanoTime()

String titleTimesamp = (shortTitle + ' ') + timestamp

WebUI.setText(findTestObject('Object Repository/Page_Create Webform  Digital Services Georgia/input_Short Title_field_short_title0value'), 
    titleTimesamp)

WebUI.click(findTestObject('Object Repository/Page_Create Webform  Digital Services Georgia/p'))

WebUI.setText(findTestObject('Object Repository/Page_Create Webform  Digital Services Georgia/body_QA test body content for webform here'), 
    'QA test body content for webform here.')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Webform  Digital Services Georgia/select_- Select -ApplyContact UsContent Man_a2accc'), 
    'webform_3681', true)

WebUI.click(findTestObject('Object Repository/Page_Create Webform  Digital Services Georgia/input_Briefly describe the changes you have_2faeff'))

WebUI.click(findTestObject('Object Repository/Page_Create Webform  Digital Services Georgia/input_Published_op'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA Webform automation  Digital Service_e9ac23/li_QA test webform with automation'), 
    'QA test webform with automation')

String url = WebUI.getUrl()

pathAlias = ((shortTitle + '-') + timestamp)

String urlCheck = WebUI.concatenate(((['https://', GlobalVariable.url, '/', pathAlias]) as String[]), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyMatch(url, urlCheck, true, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_qawebformautomation  Digital Services Georgia/h1_QA test webform with automation'), 
    'QA test webform with automation', FailureHandling.STOP_ON_FAILURE)

