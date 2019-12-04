import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())


RunConfiguration.setExecutionSettingFile('/var/folders/pp/rw_8q31s32v88_f01ndn6_b00000gn/T/Katalon/Test Cases/Create News/20191204_101435/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

not_run: WebUI.callTestCase(findTestCase('Authenticate Prod'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Log In as Editor'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_jasmyneepps  Digital Services Georgia/a_Content'))

not_run: WebUI.navigateToUrl('https://test.prod.dsga.codes/admin/content')

not_run: WebUI.click(findTestObject('Page_Content  Digital Services Georgia/a_Add content'))

not_run: WebUI.click(findTestObject('Page_Add content  Digital Services Georgia/a_NewsNews posts site news and less officia_6c8139'))

not_run: WebUI.setText(findTestObject('Page_Create News  Digital Services Georgia/input_Title_title0value'), 'New News Title')

not_run: WebUI.setText(findTestObject('Page_Create News  Digital Services Georgia/input_Short Title_field_short_title0value'), 
    'News Title')

WebUI.click(findTestObject('Page_Create News  Digital Services Georgia/span_- Select -'))

WebUI.click(findTestObject('Page_Create News  Digital Services Georgia/li_Blog'))

WebUI.click(findTestObject('Page_Create News  Digital Services Georgia/span_- Select -'))

WebUI.click(findTestObject('Page_Create News  Digital Services Georgia/Summary iframe'))

WebUI.setText(findTestObject('Page_Create News  Digital Services Georgia/Summary'), '<p style="">Here\\'s a required summary.</p><div id="katalon" style="top: 0px;"><div id="katalon-rec_elementInfoDiv" style="display: none;"></div></div>')

WebUI.click(findTestObject('Object Repository/Page_Create News  Digital Services Georgia/input_Teaser image_field_teaser_image_entit_151182'))

WebUI.setText(findTestObject('Object Repository/Page_Create News  Digital Services Georgia/input_Name_name'), 'image')

WebUI.click(findTestObject('Object Repository/Page_Create News  Digital Services Georgia/input_Published_edit-submit-media-browser'))

WebUI.click(findTestObject('Object Repository/Page_Create News  Digital Services Georgia/div_Open  configuration optionsEdit        _6b7b61'))

WebUI.click(findTestObject('Object Repository/Page_Create News  Digital Services Georgia/input_Select this item_op'))

WebUI.click(findTestObject('Page_Create News  Digital Services Georgia/Body iframe'))

WebUI.setText(findTestObject('Page_Create News  Digital Services Georgia/Body'), '<p style="">Here\\'s the body content of this news content.</p><div id="katalon" style="top: 0px;"><div id="katalon-rec_elementInfoDiv" style="display: none;"></div></div>')

WebUI.click(findTestObject('Object Repository/Page_Create News  Digital Services Georgia/input_Select or create one or more Bios to _1e94c4'))

WebUI.click(findTestObject('Object Repository/Page_Create News  Digital Services Georgia/input_Select this item_entity_browser_selectnode17121'))

WebUI.click(findTestObject('Object Repository/Page_Create News  Digital Services Georgia/input_Next page_op'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create News  Digital Services Georgia/select_DraftPublishedArchived'), 
    'published', true)

WebUI.click(findTestObject('Object Repository/Page_Create News  Digital Services Georgia/div_Associate this content with        Prog_d994ad'))

WebUI.closeBrowser()

''', 'Test Cases/Create News', new TestCaseBinding('Test Cases/Create News',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
