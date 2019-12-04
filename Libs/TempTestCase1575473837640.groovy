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


RunConfiguration.setExecutionSettingFile('/var/folders/pp/rw_8q31s32v88_f01ndn6_b00000gn/T/Katalon/Test Cases/Create Topic Page/20191204_103717/execution.properties')

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

WebUI.click(findTestObject('Page_jasmyneepps  Digital Services Georgia/a_Content'))

WebUI.click(findTestObject('Page_Content  Digital Services Georgia/a_Add content'))

WebUI.scrollToElement(findTestObject('Page_Add content  Digital Services Georgia/a_Topic PageExplain a specific topic or pro_669fd6'), 
    0)

WebUI.click(findTestObject('Page_Add content  Digital Services Georgia/a_Topic PageExplain a specific topic or pro_669fd6'))

WebUI.setText(findTestObject('Object Repository/Page_Create Topic Page  Digital Services Georgia/input_Title_title0value'), 
    'New Topic Page Title')

WebUI.setText(findTestObject('Object Repository/Page_Create Topic Page  Digital Services Georgia/input_Short Title_field_short_title0value'), 
    'Topic Page Title')

WebUI.click(findTestObject('Page_Create Topic Page  Digital Services Georgia/Summary iframe'))

WebUI.setText(findTestObject('Page_Create Topic Page  Digital Services Georgia/Summary'), 'Here\\'s the required summary')

WebUI.click(findTestObject('Page_Create Topic Page  Digital Services Georgia/Body iframe'))

WebUI.setText(findTestObject('Page_Create Topic Page  Digital Services Georgia/Body'), 'Here\\'s the body content of the Topic Page.')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Topic Page  Digital Services Georgia/select_DraftPublishedArchived'), 
    'published', true)

WebUI.click(findTestObject('Object Repository/Page_Create Topic Page  Digital Services Georgia/div_Associate this content with        Prog_1ebaa7'))

WebUI.closeBrowser()

''', 'Test Cases/Create Topic Page', new TestCaseBinding('Test Cases/Create Topic Page',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
