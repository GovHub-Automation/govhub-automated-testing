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

not_run: WebUI.callTestCase(findTestCase('Log In'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Page_jasmyneepps  Digital Services Georgia/Hover over Content'))

WebUI.mouseOver(findTestObject('Page_jasmyneepps  Digital Services Georgia/Hover over Media'))

WebUI.mouseOver(findTestObject('Page_jasmyneepps  Digital Services Georgia/Hover over Add media'))

WebUI.click(findTestObject('Page_jasmyneepps  Digital Services Georgia/Add Remote video'))

WebUI.setText(findTestObject('Object Repository/Page_Add Remote video  Digital Services Georgia/input_Name_name0value'), 
    'MCQA Video Test')

WebUI.setText(findTestObject('Object Repository/Page_Add Remote video  Digital Services Georgia/input_Video URL_field_media_oembed_video0value'), 
    'https://www.youtube.com/watch?v=7VnMZoP6F1Q&t=4s')

WebUI.click(findTestObject('Object Repository/Page_Add Remote video  Digital Services Georgia/remotevideo_caption_iframe'))

WebUI.setText(findTestObject('Object Repository/Page_Add Remote video  Digital Services Georgia/remotevideo_caption_html'), 
    'MCQA Video')

WebUI.click(findTestObject('Object Repository/Page_Add Remote video  Digital Services Georgia/remotevideo_savebutton'))

WebUI.click(findTestObject('Object Repository/Page_Media  Digital Services Georgia/a_MCQA Video Test'))

WebUI.verifyElementText(findTestObject('Page_MCQA Video Test  Digital Services Georgia/remotevideo_breadcrumb'), 'MCQA Video Test', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_MCQA Video  Digital Services Georgia/videonode_remotevideotitle'), ('Name' + 
    '\n') + 'MCQA Video Test', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_MCQA Video  Digital Services Georgia/videonode_remotevideocaption'), 
    'MCQA Video', FailureHandling.CONTINUE_ON_FAILURE)

