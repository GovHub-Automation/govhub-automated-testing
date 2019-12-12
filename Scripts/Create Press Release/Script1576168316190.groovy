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

WebUI.click(findTestObject('Page_Add content  Digital Services Georgia/a_Press Release'))

WebUI.setText(findTestObject('Page_Create Press Release Digital Services Georgia/input_Title_title0value'), 'Press Release - Automation')

WebUI.setText(findTestObject('Page_Create Press Release Digital Services Georgia/input_Short Title_field_short_title0value'), 
    'Press Release')

WebUI.click(findTestObject('Page_Create Press Release Digital Services Georgia/span_Press Release Type'))

WebUI.click(findTestObject('Page_Create Press Release Digital Services Georgia/li_Press Release Type'))

WebUI.click(findTestObject('Page_Create Press Release Digital Services Georgia/Summary iframe'))

WebUI.setText(findTestObject('Page_Create Press Release Digital Services Georgia/Summary Text'), 'Here\'s a summary for the press release.')

WebUI.click(findTestObject('Page_Create Press Release Digital Services Georgia/html_Rich Text Editor Body'))

WebUI.setText(findTestObject('Page_Create Press Release Digital Services Georgia/body_Here is the body content for the press_18a268'), 
    'Here is the body content for the press release.')

WebUI.click(findTestObject('Page_Create Press Release Digital Services Georgia/input_Contact Information_field_contact_ent_e32c28'))

WebUI.click(findTestObject('Page_Create Press Release Digital Services Georgia/input_Select this item_entity_browser_selectnode17721'))

WebUI.click(findTestObject('Page_Create Press Release  Digital Services Georgia/Select Contact'))

WebUI.click(findTestObject('Page_Create Press Release Digital Services Georgia/input_PDF Version_field_pdf_entity_browser__ac0069'))

WebUI.click(findTestObject('Page_Create Press Release Digital Services Georgia/input_Select this item_entity_browser_selectmedia4966'))

WebUI.click(findTestObject('Page_Create Press Release  Digital Services Georgia/Select Document'))

WebUI.click(findTestObject('Page_Create Press Release Digital Services Georgia/input_Select the appropriate Press letterhe_440eaa'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Create Press Release Digital Services Georgia/input_Select this item_entity_browser_selectmedia4566'))

WebUI.click(findTestObject('Page_Create Press Release  Digital Services Georgia/Select Header Image'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Create Press Release Digital Services Georgia/input_Related Files_field_attached_files_en_2e0de6'))

WebUI.click(findTestObject('Page_Create Press Release Digital Services Georgia/input_Select this item_entity_browser_selectmedia4881'))

WebUI.click(findTestObject('Page_Create Press Release  Digital Services Georgia/Select Related File'))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Page_Create Press Release Digital Services Georgia/select_DraftPublishedArchived'), 
    'published', true)

WebUI.click(findTestObject('Page_Create Press Release Digital Services Georgia/div_Associate this content with        Prog_1ebaa7'))

WebUI.delay(4)

WebUI.closeBrowser()

