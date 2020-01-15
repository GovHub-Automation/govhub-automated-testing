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

WebUI.callTestCase(findTestCase('Embed Start'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Embed/Embed CTA/Page_Create Topic Page  Digital Services Georgia/span_Embed micro-content_cke_button_arrow'))

WebUI.click(findTestObject('Page_Embed/Embed Promo/Page_Create Topic Page  Digital Services Georgia/span_Promo'))

WebUI.switchToFrame(findTestObject('Page_Embed/Embed Promo/Page_Create Topic Page  Digital Services Georgia/iframe_Add Promo_entity_browser_iframe_promo_browser_entity_embed'), 
    5)

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Embed/Embed Promo/Page_Create Topic Page  Digital Services Georgia/input_Title_inline_entity_formtitle0value'), 
    'From Automation')

WebUI.click(findTestObject('Page_Embed/Embed Promo/Page_Create Topic Page  Digital Services Georgia/input_URL_inline_entity_formfield_cta_url0uri'))

WebUI.setText(findTestObject('Page_Embed/Embed Promo/Page_Create Topic Page  Digital Services Georgia/input_URL_inline_entity_formfield_cta_url0uri'), 
    'https://example.com')

WebUI.click(findTestObject('Page_Embed/Embed Promo/Page_Create Topic Page  Digital Services Georgia/input_Link text_inline_entity_formfield_cta_url0title'))

WebUI.setText(findTestObject('Page_Embed/Embed Promo/Page_Create Topic Page  Digital Services Georgia/input_Link text_inline_entity_formfield_cta_url0title'), 
    'Example')

WebUI.click(findTestObject('Page_Embed/Embed Promo/Page_Create Topic Page  Digital Services Georgia/Promo_save_button'))

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Object Repository/Page_Embed/Embed LinkCollection/Page_Create Topic Page  Digital Services Georgia/button_Embed'))

WebUI.callTestCase(findTestCase('Embed End'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Embed/Embed Promo/Page_Embed Automation  Digital Services Georgia/div_From Automation'), 
    0)

WebUI.verifyElementText(findTestObject('Page_Embed/Embed Promo/Page_Embed Automation  Digital Services Georgia/h3_From Automation'), 
    'From Automation')

WebUI.verifyElementPresent(findTestObject('Page_Embed/Embed Promo/Page_Embed Automation  Digital Services Georgia/a_Example'), 
    0)

WebUI.closeBrowser()

