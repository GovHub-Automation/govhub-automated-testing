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

WebUI.click(findTestObject('Object Repository/Page_jasmyneepps  Digital Services Georgia/a_Content'))

WebUI.click(findTestObject('Object Repository/Page_Content  Digital Services Georgia/a_Add content'))

WebUI.click(findTestObject('Page_Add content  Digital Services Georgia/a_FAQAnswer common or related questions about a particular topic or service'))

WebUI.setText(findTestObject('Object Repository/Page_Create FAQ  Digital Services Georgia/input_Title_title0value'), 'FAQ created with automation')

WebUI.setText(findTestObject('Object Repository/Page_Create FAQ  Digital Services Georgia/input_Short Title_field_short_title0value'), 
    shortTitle)

WebUI.click(findTestObject('Object Repository/Page_Create FAQ  Digital Services Georgia/p (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Create FAQ  Digital Services Georgia/body_QA test FAQ overview content'), 
    'QA test FAQ overview content.')

WebUI.setText(findTestObject('Object Repository/Page_Create FAQ  Digital Services Georgia/input_Question_field_faq0ga_rich_string_sec_8b029b'), 
    'QA test FAQ question 1')

WebUI.click(findTestObject('Page_Create FAQ  Digital Services Georgia/iframe_Press ALT 0 for help_cke_wysiwyg_frame cke_reset'))

WebUI.setText(findTestObject('Page_Create FAQ  Digital Services Georgia/html_Rich Text Editor Answer For FAQ 1'), 'QA test FAQ 1 answer here')

WebUI.click(findTestObject('Page_Create FAQ  Digital Services Georgia/Add another FAQ item'))

WebUI.setText(findTestObject('Object Repository/Page_Create FAQ  Digital Services Georgia/input_Question_field_faq1ga_rich_string_sec_a5431b'), 
    'Qa test FAQ question 2')

WebUI.click(findTestObject('Page_Create FAQ  Digital Services Georgia/iframe_Press ALT 0 for help_cke_wysiwyg_frame cke_reset'))

WebUI.setText(findTestObject('Page_Create FAQ  Digital Services Georgia/Rich text editor for FAQ 2 answer'), 'QA test FAQ answer 2')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create FAQ  Digital Services Georgia/select_DraftPublishedArchived'), 
    'published', true)

WebUI.click(findTestObject('Page_Create FAQ  Digital Services Georgia/Save node button'))

WebUI.waitForPageLoad(0)

WebUI.delay(10)

String url = WebUI.getUrl()

String urlCheck = WebUI.concatenate((([GlobalVariable.Environment, shortTitle]) as String[]), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyMatch(url, urlCheck, true)

WebUI.verifyElementText(findTestObject('Page_qafaqautomation  Digital Services Georgia/FAQ Page title'), 'FAQ created with automation')

WebUI.verifyElementText(findTestObject('Page_qafaqautomation  Digital Services Georgia/FAQ overview paragraph'), 'QA test FAQ overview content.')

WebUI.verifyElementText(findTestObject('Page_qafaqautomation  Digital Services Georgia/FAQ question 1'), 'QA test FAQ question 1')

WebUI.verifyElementText(findTestObject('Page_qafaqautomation  Digital Services Georgia/FAQ question 2'), 'Qa test FAQ question 2')

