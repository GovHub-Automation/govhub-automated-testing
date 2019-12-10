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

WebUI.click(findTestObject('Object Repository/Page_jasmyneepps  Digital Services Georgia/a_Content'))

WebUI.click(findTestObject('Object Repository/Page_Content  Digital Services Georgia/a_Add content'))

WebUI.click(findTestObject('Object Repository/Page_Add content  Digital Services Georgia/span_How Do I (1)'))

WebUI.navigateToUrl('https://test.prod.dsga.codes/node/add/how_do_i')

WebUI.setText(findTestObject('Object Repository/Page_Create How Do I  Digital Services Georgia/input_How Do I_title0value (1) (1)'), 
    'Automation')

WebUI.click(findTestObject('Object Repository/Page_Create How Do I  Digital Services Georgia/div_Task (required)        How Do I (1) (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Create How Do I  Digital Services Georgia/input_Short Title_field_short_title0value (1) (1)'), 
    'Automation')

WebUI.click(findTestObject('Object Repository/Page_Create How Do I  Digital Services Georgia/iframe_Press ALT 0 for help_cke_wysiwyg_frame cke_reset'))

WebUI.setText(findTestObject('Object Repository/Page_Create How Do I  Digital Services Georgia/html_Rich Text Editor Explanation'), 
    'Explain')

WebUI.click(findTestObject('Object Repository/Page_Create How Do I  Digital Services Georgia/input_Steps_ief-7a943e484d481fd6eb440cd6b00def49e3d75a63-add'))

WebUI.setText(findTestObject('Object Repository/Page_Create How Do I  Digital Services Georgia/input_Subtitle_field_hdi_stepsforminline_en_2ab56d'), 
    'Step 1')

WebUI.click(findTestObject('Object Repository/Page_Create How Do I  Digital Services Georgia/iframe for Details wysiwyg'))

WebUI.setText(findTestObject('Object Repository/Page_Create How Do I  Digital Services Georgia/html_Rich Text Editor Details'), 
    'Steps')

WebUI.setText(findTestObject('Object Repository/Page_Create How Do I  Digital Services Georgia/body_Steps'), 'Steps')

WebUI.click(findTestObject('Object Repository/Page_Create How Do I  Digital Services Georgia/input_Contact_field_hdi_steps_form_inline_e_fb2df8'))

WebUI.click(findTestObject('Object Repository/Page_Create How Do I  Digital Services Georgia/input_Select this item_entity_browser_selectnode17731'))

WebUI.click(findTestObject('Object Repository/Page_Create How Do I  Digital Services Georgia/input_Next page_op'))

WebUI.setText(findTestObject('Object Repository/Page_Create How Do I  Digital Services Georgia/input_URL_field_hdi_links0uri'), 
    'https://example.com')

WebUI.setText(findTestObject('Object Repository/Page_Create How Do I  Digital Services Georgia/input_Link text_field_hdi_links0title'), 
    'example')

WebUI.click(findTestObject('Page_Create How Do I  Digital Services Georgia/input_Save as_op'))

WebUI.navigateToUrl('https://test.prod.dsga.codes/how-do-i-automation')

WebUI.verifyElementText(findTestObject('Page_From Automation  Digital Services Georgia/h1_How Do I From Automation'), 'How Do I Automation?')

WebUI.verifyElementText(findTestObject('Page_From Automation  Digital Services Georgia/p_Explain'), 'Explain')

WebUI.verifyElementText(findTestObject('Page_From Automation  Digital Services Georgia/p_Steps'), 'Steps')

WebUI.verifyElementText(findTestObject('Page_From Automation  Digital Services Georgia/h2_Step 1'), 'Step 1')

WebUI.verifyElementAttributeValue(findTestObject('Page_From Automation  Digital Services Georgia/a_example'), 'text', 'example', 
    0)

