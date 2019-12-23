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

WebUI.click(findTestObject('Page_Content  Digital Services Georgia/a_Add content'))

WebUI.click(findTestObject('Page_Add content  Digital Services Georgia/a_OpinionState documents of type Opinion'))

WebUI.setText(findTestObject('Page_Create Opinion  Digital Services Georgia/input_Opinion Number_title0value'), '123456')

WebUI.click(findTestObject('Page_Create Opinion  Digital Services Georgia/opinionnode_to_iframe'))

WebUI.setText(findTestObject('Page_Create Opinion  Digital Services Georgia/opinionnode_to_html'), 'MCQA To Field')

WebUI.click(findTestObject('Page_Create Opinion  Digital Services Georgia/opinionnode_re_iframe'))

WebUI.setText(findTestObject('Page_Create Opinion  Digital Services Georgia/opinionnode_re_html'), 'Test Re Field')

WebUI.click(findTestObject('Page_Create Opinion  Digital Services Georgia/opinionnode_summary_iframe'))

WebUI.setText(findTestObject('Page_Create Opinion  Digital Services Georgia/opinionnode_summary_html'), 'Summary Test')

WebUI.click(findTestObject('Page_Create Opinion  Digital Services Georgia/opinionnode_body_iframe'))

WebUI.setText(findTestObject('Page_Create Opinion  Digital Services Georgia/opinionnode_body_html'), 'Body Test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Opinion  Digital Services Georgia/select_DraftPublishedArchived'), 
    'published', true)

WebUI.click(findTestObject('Page_Create Opinion  Digital Services Georgia/opionnode_savebutton'))

WebUI.verifyElementText(findTestObject('Page_123456  Digital Services Georgia/opinionnode_breadcrumb'), '123456')

WebUI.verifyElementText(findTestObject('Page_123456  Digital Services Georgia/opinionnode_title'), 'Unofficial Opinion 123456')

WebUI.verifyElementText(findTestObject('Page_123456  Digital Services Georgia/opinionnode__published'), 'Published')

WebUI.verifyElementText(findTestObject('Page_123456  Digital Services Georgia/opinionnode_to'), 'MCQA To Field')

WebUI.verifyElementText(findTestObject('Page_123456  Digital Services Georgia/opinionnode_re'), 'Test Re Field')

WebUI.verifyElementText(findTestObject('Page_123456  Digital Services Georgia/opinionnode_body'), 'Body Test')

