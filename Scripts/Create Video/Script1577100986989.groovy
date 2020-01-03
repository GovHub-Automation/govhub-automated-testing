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

WebUI.click(findTestObject('Object Repository/Page_Content  Digital Services Georgia/a_Media'))

WebUI.click(findTestObject('Object Repository/Page_Media  Digital Services Georgia/a_Add media'))

WebUI.click(findTestObject('Object Repository/Page_Add media  Digital Services Georgia/span_Remote video'))

WebUI.setText(findTestObject('Object Repository/Page_Add Remote video  Digital Services Georgia/input_Name_name0value'), 
    'MCQA Video Test')

WebUI.setText(findTestObject('Object Repository/Page_Add Remote video  Digital Services Georgia/input_Video URL_field_media_oembed_video0value'), 
    'https://www.youtube.com/watch?v=7VnMZoP6F1Q&t=4s')

WebUI.click(findTestObject('Object Repository/Page_Add Remote video  Digital Services Georgia/remotevideo_caption_iframe'))

WebUI.setText(findTestObject('Object Repository/Page_Add Remote video  Digital Services Georgia/remotevideo_caption_html'), 
    'MCQA Video')

WebUI.click(findTestObject('Object Repository/Page_Add Remote video  Digital Services Georgia/remotevideo_savebutton'))

WebUI.click(findTestObject('Object Repository/Page_Media  Digital Services Georgia/a_MCQA Video Test'))

WebUI.verifyElementText(findTestObject('Page_MCQA Video Test  Digital Services Georgia/remotevideo_breadcrumb'), 'MCQA Video Test')

WebUI.verifyElementText(findTestObject('Page_MCQA Video  Digital Services Georgia/videonode_remotevideotitle'), 'Name' + '\n' + 'MCQA Video Test')

WebUI.verifyElementText(findTestObject('Object Repository/Page_MCQA Video  Digital Services Georgia/videonode_remotevideocaption'), 
    'MCQA Video')

