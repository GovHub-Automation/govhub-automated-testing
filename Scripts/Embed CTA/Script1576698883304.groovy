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

WebUI.callTestCase(findTestCase('Embed Start'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Embed/Embed CTA/Page_Create Topic Page  Digital Services Georgia/span_Embed micro-content_cke_button_arrow'))

WebUI.click(findTestObject('Object Repository/Page_Embed/Embed CTA/Page_Create Topic Page  Digital Services Georgia/span_Call To Action'))

WebUI.switchToFrame(findTestObject('Page_Embed/Embed CTA/Page_Create Topic Page  Digital Services Georgia/iframe_Add CTA_entity_browser'), 
    5)

WebUI.click(findTestObject('Page_Embed/Embed CTA/Page_Create Topic Page  Digital Services Georgia/input_Title_inline_entity_formtitle0value'))

WebUI.setText(findTestObject('Page_Embed/Embed CTA/Page_Create Topic Page  Digital Services Georgia/input_Title_inline_entity_formtitle0value'), 
    'From Automation')

WebUI.click(findTestObject('Page_Embed/Embed CTA/Page_Create Topic Page  Digital Services Georgia/input_URL_inline_entity_formfield_cta_url0uri'))

WebUI.setText(findTestObject('Page_Embed/Embed CTA/Page_Create Topic Page  Digital Services Georgia/input_URL_inline_entity_formfield_cta_url0uri'), 
    '/node/add')

WebUI.click(findTestObject('Page_Embed/Embed CTA/Page_Create Topic Page  Digital Services Georgia/input_Link text_inline_entity_formfield_cta_url0title'))

WebUI.setText(findTestObject('Page_Embed/Embed CTA/Page_Create Topic Page  Digital Services Georgia/input_Link text_inline_entity_formfield_cta_url0title'), 
    'Click Me')

WebUI.click(findTestObject('Page_Embed/Embed CTA/Page_Create Topic Page  Digital Services Georgia/CTA_entity_save_button'))

WebUI.delay(3)

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Object Repository/Page_Embed/Embed CTA/Page_Create Topic Page  Digital Services Georgia/Embed_button'))

WebUI.callTestCase(findTestCase('Embed End'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Embed/Embed CTA/Page_Embed Automation  Digital Services Georgia/h2_From Automation'), 
    'From Automation')

WebUI.verifyElementPresent(findTestObject('Page_Embed/Embed CTA/Page_Embed Automation  Digital Services Georgia/a_Click Me'), 
    0)

WebUI.closeBrowser()

