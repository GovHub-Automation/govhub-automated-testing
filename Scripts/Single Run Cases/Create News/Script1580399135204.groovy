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

not_run: WebUI.callTestCase(findTestCase('Authenticate Testing Site'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Page_jasmyneepps  Digital Services Georgia/Content Library'))

WebUI.click(findTestObject('Page_Content  Digital Services Georgia/Add content'))

WebUI.click(findTestObject('Page_Add content  Digital Services Georgia/a_NewsNews posts site news and less officia_6c8139'))

WebUI.setText(findTestObject('Page_Create News  Digital Services Georgia/input_Title_title0value'), 'From Automation')

WebUI.setText(findTestObject('Page_Create News  Digital Services Georgia/input_Short Title_field_short_title0value'), 'From Automation')

WebUI.click(findTestObject('Page_Create News  Digital Services Georgia/span_- Select -'))

WebUI.click(findTestObject('Page_Create News  Digital Services Georgia/li_Blog'))

WebUI.click(findTestObject('Page_Create News  Digital Services Georgia/span_- Select -'))

WebUI.click(findTestObject('Page_Create News  Digital Services Georgia/Summary iframe'))

WebUI.setText(findTestObject('Page_Create News  Digital Services Georgia/Summary'), 'Here\'s a required summary')

WebUI.click(findTestObject('Object Repository/Page_Create News  Digital Services Georgia/input_Teaser image_field_teaser_image_entit_151182'))

WebUI.setText(findTestObject('Object Repository/Page_Create News  Digital Services Georgia/input_Name_name'), 'image')

WebUI.click(findTestObject('Object Repository/Page_Create News  Digital Services Georgia/input_Published_edit-submit-media-browser'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Create News  Digital Services Georgia/div_Open  configuration optionsEdit        _6b7b61'))

WebUI.click(findTestObject('Object Repository/Page_Create News  Digital Services Georgia/input_Select this item_op'))

WebUI.click(findTestObject('Page_Create News  Digital Services Georgia/Body iframe'))

WebUI.setText(findTestObject('Page_Create News  Digital Services Georgia/Body'), 'Here\'s the body content of this news content.')

WebUI.click(findTestObject('Object Repository/Page_Create News  Digital Services Georgia/input_Select or create one or more Bios to _1e94c4'))

WebUI.click(findTestObject('Page_Create News  Digital Services Georgia/Select a Bio'))

WebUI.click(findTestObject('Page_Create News  Digital Services Georgia/Save the Bio'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Event  Digital Services Georgia/Select Published'), 
    'published', true)

WebUI.click(findTestObject('Page_Create How Do I  Digital Services Georgia/input_Save as_op'))

WebUI.verifyElementPresent(findTestObject('Page_Create News  Digital Services Georgia/Page_From Automation  Digital Services Georgia/h1_From Automation'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Create News  Digital Services Georgia/Page_From Automation  Digital Services Georgia/p_Heres the body content of this news content'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Page_Create News  Digital Services Georgia/Page_From Automation  Digital Services Georgia/a_Jasmyne Epps'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

