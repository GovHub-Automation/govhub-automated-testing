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

WebUI.callTestCase(findTestCase('Authenticate Prod'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Log In as Editor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_jasmyneepps  Digital Services Georgia/a_Content'))

WebUI.click(findTestObject('Page_Content  Digital Services Georgia/a_Add content'))

WebUI.click(findTestObject('Page_Add content  Digital Services Georgia/a_NewsNews posts site news and less officia_6c8139'))

WebUI.setText(findTestObject('Page_Create News  Digital Services Georgia/input_Title_title0value'), 'From Automation')

WebUI.setText(findTestObject('Page_Create News  Digital Services Georgia/input_Short Title_field_short_title0value'), 'From Automation')

WebUI.click(findTestObject('Page_Create News  Digital Services Georgia/span_- Select -'))

WebUI.click(findTestObject('Page_Create News  Digital Services Georgia/li_Blog'))

WebUI.click(findTestObject('Page_Create News  Digital Services Georgia/span_- Select -'))

WebUI.click(findTestObject('Page_Create News  Digital Services Georgia/Summary iframe'))

WebUI.setText(findTestObject('Page_Create News  Digital Services Georgia/Summary'), 'Here\'s a required summary')

WebUI.click(findTestObject('Page_Create News  Digital Services Georgia/Body iframe'))

WebUI.setText(findTestObject('Page_Create News  Digital Services Georgia/Body'), 'Here\'s the body content of this news content.')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create News  Digital Services Georgia/select_DraftPublishedArchived'), 
    'published', true)

WebUI.click(findTestObject('Page_Embed/Embed News/Page_Create News  Digital Services Georgia/create_news_save_button'))

WebUI.delay(3)

WebUI.callTestCase(findTestCase('Embed Start No Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Embed/Embed Contact/Page_Create Topic Page  Digital Services Georgia/span_Embed content_cke_button_arrow'))

WebUI.click(findTestObject('Page_Embed/Embed News/Page_Create Topic Page  Digital Services Georgia/span_News'))

WebUI.delay(1)

WebUI.switchToFrame(findTestObject('Page_Embed/Embed News/Page_Create Topic Page  Digital Services Georgia/iframe_Add News_entity_browser_iframe_news_browser_entity_embed'), 
    5)

WebUI.click(findTestObject('Page_Embed/Embed News/Page_Create Topic Page  Digital Services Georgia/td_From Automation'))

WebUI.click(findTestObject('Page_Embed/Embed News/Page_Create Topic Page  Digital Services Georgia/Select_button'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Object Repository/Page_Embed/Embed LinkCollection/Page_Create Topic Page  Digital Services Georgia/button_Embed'))

WebUI.callTestCase(findTestCase('Embed End'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Embed/Embed News/Page_Embed Automation  Digital Services Georgia/h3_From Automation'), 
    'From Automation', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Embed/Embed News/Page_Embed Automation  Digital Services Georgia/div_From Automation'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Embed/Embed News/Page_Embed Automation  Digital Services Georgia/p_Heres a required summary'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

