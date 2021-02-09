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

not_run: WebUI.callTestCase(findTestCase('Authenticate Testing Site'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Page_jasmyneepps  Digital Services Georgia/Content Library'))

WebUI.click(findTestObject('Page_Content  Digital Services Georgia/Add content'))

WebUI.click(findTestObject('Page_Add content  Digital Services Georgia/Add Program or Service'))

WebUI.setText(findTestObject('Create ProgramOrService/Page_Create Program or Service  Digital Services Georgia/input_Name_title0value'), 
    'From Automation')

WebUI.setText(findTestObject('Create ProgramOrService/Page_Create Program or Service  Digital Services Georgia/input_URL_field_first_step0uri'), 
    'https://example.com')

WebUI.setText(findTestObject('Create ProgramOrService/Page_Create Program or Service  Digital Services Georgia/input_Link text_field_first_step0title'), 
    'Example link')

WebUI.selectOptionByLabel(findTestObject('Create ProgramOrService/Page_Create Program or Service  Digital Services Georgia/select_Category_dropdown'), 
    'Legal', false)

WebUI.setText(findTestObject('Create ProgramOrService/Page_Create Program or Service  Digital Services Georgia/html_Rich Text Editor Overview field'), 
    'Overview text')

WebUI.setText(findTestObject('Create ProgramOrService/Page_Create Program or Service  Digital Services Georgia/html_Rich Text Editor First Step Summary field'), 
    'Summary text')

WebUI.click(findTestObject('Create ProgramOrService/Page_Edit Program or Service From Automation  Digital Services Georgia/Add_Image_button'))

WebUI.switchToFrame(findTestObject('Create ProgramOrService/Page_Edit Program or Service From Automation  Digital Services Georgia/iframe_Add_Image_entity_browser_frame'), 
    5)

WebUI.click(findTestObject('Create ProgramOrService/Page_Edit Program or Service From Automation  Digital Services Georgia/div_Image_to_select'))

WebUI.click(findTestObject('Create ProgramOrService/Page_Edit Program or Service From Automation  Digital Services Georgia/Image_Select_button'))

WebUI.switchToDefaultContent()

WebUI.selectOptionByValue(findTestObject('Create ProgramOrService/Page_Create Program or Service  Digital Services Georgia/select_DraftNeeds ReviewPublishedArchived'), 
    'published', false)

WebUI.click(findTestObject('Create ProgramOrService/Page_Create Program or Service  Digital Services Georgia/Save_button'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Create ProgramOrService/Page_From Automation  Digital Services Georgia/h1_From Automation'), 
    'From Automation', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Create ProgramOrService/Page_From Automation  Digital Services Georgia/p_Overview text'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Create ProgramOrService/Page_From Automation  Digital Services Georgia/div_Get started'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Create ProgramOrService/Page_From Automation  Digital Services Georgia/p_Summary text'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Create ProgramOrService/Page_From Automation  Digital Services Georgia/a_Example link'), 
    0, FailureHandling.STOP_ON_FAILURE)

