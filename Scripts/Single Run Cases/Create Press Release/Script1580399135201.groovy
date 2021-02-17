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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.callTestCase(findTestCase('Authenticate Testing Site'), [:], FailureHandling.STOP_ON_FAILURE)

'Maximize current window'
not_run: WebUI.maximizeWindow()

WebUI.mouseOver(findTestObject('Object Repository/Page_jasmyneepps  Digital Services Georgia/Content Library'))

WebUI.click(findTestObject('Object Repository/Page_Content  Digital Services Georgia/Add content'))

WebUI.click(findTestObject('Object Repository/Page_Add content  Digital Services Georgia/Add Press Release'))

WebUI.setText(findTestObject('Object Repository/Create Press Release/Page_Create Press Release  Digital Services Georgia/input_Title_title0value'), 
    'From Automation')

WebUI.setText(findTestObject('Object Repository/Create Press Release/Page_Create Press Release  Digital Services Georgia/input_Short Title_field_short_title0value'), 
    'From Automation')

WebUI.click(findTestObject('Object Repository/Create Press Release/Page_Create Press Release  Digital Services Georgia/Press_Release_Type_dropdown_arrow'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Create Press Release/Page_Create Press Release  Digital Services Georgia/input_Press_Release_Type_search_field'), 
    'Press Release Type')

WebUI.sendKeys(findTestObject('Object Repository/Create Press Release/Page_Create Press Release  Digital Services Georgia/input_Press_Release_Type_search_field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Create Press Release/Page_Create Press Release  Digital Services Georgia/html_Rich Text Editor Summary field'), 
    'Summary text')

WebUI.setText(findTestObject('Object Repository/Create Press Release/Page_Create Press Release  Digital Services Georgia/html_Rich Text Editor Body field'), 
    'Body text')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Create Press Release  Digital Services_aa0118/input_Contact Information_field_contact_ent_e32c28'))

WebUI.click(findTestObject('Object Repository/Page_Create Press Release  Digital Services_aa0118/input_Contact Information_field_contact_ent_e32c28'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Create Press Release  Digital Services_aa0118/input_Select this item_entity_browser_selectnode26829'))

WebUI.click(findTestObject('Object Repository/Page_Create Press Release  Digital Services_aa0118/input_Next page_op'))

WebUI.delay(3)

not_run: WebUI.click(findTestObject('Object Repository/Page_Create Press Release  Digital Services Georgia/Add PDF Document button'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Create Press Release  Digital Services Georgia/Select PDF Document'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Create Press Release  Digital Services Georgia/Save PDF Document'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Create Press Release  Digital Services Georgia/Add Header Image'))

WebUI.click(findTestObject('Object Repository/Page_Create Press Release  Digital Services Georgia/Select Header Image'))

WebUI.click(findTestObject('Object Repository/Page_Create Press Release  Digital Services Georgia/Save Header Image'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Create Press Release  Digital Services Georgia/Add Related File'))

WebUI.click(findTestObject('Object Repository/Page_Create Press Release  Digital Services Georgia/Select Related File'))

WebUI.click(findTestObject('Object Repository/Page_Create Press Release  Digital Services Georgia/Save Related File'))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Press Release/Page_Create Press Release  Digital Services Georgia/select_DraftNeeds ReviewPublishedArchived'), 
    'published', false)

WebUI.click(findTestObject('Object Repository/Create Press Release/Page_Create Press Release  Digital Services Georgia/Save_button'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/Create Press Release/Page_From Automation  Digital Services Georgia/h1_From Automation'), 
    'From Automation', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Create Press Release/Page_From Automation  Digital Services Georgia/p_Body text'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Create Press Release/Page_From Automation  Digital Services Georgia/header_image_div'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Create Press Release/Page_From Automation  Digital Services Georgia/div_Contact'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Create Press Release/Page_From Automation  Digital Services Georgia/h2_Related Files'), 
    'Related Files', FailureHandling.STOP_ON_FAILURE)

