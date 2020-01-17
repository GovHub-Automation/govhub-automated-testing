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

WebUI.click(findTestObject('Create Press Release/Page_Add content  Digital Services Georgia/span_Press Release'))

WebUI.setText(findTestObject('Create Press Release/Page_Create Press Release  Digital Services Georgia/input_Title_title0value'), 
    'From Automation')

WebUI.setText(findTestObject('Create Press Release/Page_Create Press Release  Digital Services Georgia/input_Short Title_field_short_title0value'), 
    'From Automation')

WebUI.click(findTestObject('Create Press Release/Page_Create Press Release  Digital Services Georgia/Press_Release_Type_dropdown_arrow'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Create Press Release/Page_Create Press Release  Digital Services Georgia/input_Press_Release_Type_search_field'), 
    'Press Release Type')

WebUI.sendKeys(findTestObject('Create Press Release/Page_Create Press Release  Digital Services Georgia/input_Press_Release_Type_search_field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Create Press Release/Page_Create Press Release  Digital Services Georgia/html_Rich Text Editor Summary field'), 
    'Summary text')

WebUI.setText(findTestObject('Create Press Release/Page_Create Press Release  Digital Services Georgia/html_Rich Text Editor Body field'), 
    'Body text')

WebUI.click(findTestObject('Create Press Release/Page_Edit Press Release From Automation  Digital Services Georgia/Add_Contact_button'))

WebUI.switchToFrame(findTestObject('Create Press Release/Page_Edit Press Release From Automation  Digital Services Georgia/iframe_Add_Contact_entity_browser_frame'), 
    5)

WebUI.click(findTestObject('Create Press Release/Page_Edit Press Release From Automation  Digital Services Georgia/input_Contact_Select_entity_browser_checkbox'))

WebUI.click(findTestObject('Create Press Release/Page_Edit Press Release From Automation  Digital Services Georgia/Add_Contact_Select_button'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Create Press Release/Page_Edit Press Release From Automation  Digital Services Georgia/Add_Header_Image_button'))

WebUI.switchToFrame(findTestObject('Create Press Release/Page_Edit Press Release From Automation  Digital Services Georgia/iframe_Add_Header_frame'), 
    5)

WebUI.click(findTestObject('Create Press Release/Page_Edit Press Release From Automation  Digital Services Georgia/input_Add_Header_select_entity_browser_checkbox'))

WebUI.click(findTestObject('Create Press Release/Page_Edit Press Release From Automation  Digital Services Georgia/Add_Header_Select_button'))

WebUI.switchToDefaultContent()

WebUI.selectOptionByValue(findTestObject('Create Press Release/Page_Create Press Release  Digital Services Georgia/select_DraftNeeds ReviewPublishedArchived'), 
    'published', false)

WebUI.click(findTestObject('Create Press Release/Page_Create Press Release  Digital Services Georgia/Save_button'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Create Press Release/Page_From Automation  Digital Services Georgia/h1_From Automation'), 
    'From Automation')

WebUI.verifyElementPresent(findTestObject('Create Press Release/Page_From Automation  Digital Services Georgia/p_Body text'), 
    0)

WebUI.verifyElementPresent(findTestObject('Create Press Release/Page_From Automation  Digital Services Georgia/header_image_div'), 
    0)

WebUI.verifyElementPresent(findTestObject('Create Press Release/Page_From Automation  Digital Services Georgia/div_Contact'), 
    0)

