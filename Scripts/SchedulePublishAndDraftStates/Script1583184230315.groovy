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
import groovy.time.TimeCategory as TimeCategory

WebUI.callTestCase(findTestCase('Authenticate Testing Site'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://test.prod.dsga.codes/node/add/press_release')

WebUI.setText(findTestObject('Object Repository/Page_Create Press Release  Digital Services_aa0118/input_Title_title0value'), 
    'QA test press release with automation 2958')

WebUI.setText(findTestObject('Object Repository/Page_Create Press Release  Digital Services_aa0118/input_Short Title_field_short_title0value'), 
    'QA test short title 2958')

WebUI.click(findTestObject('Page_Create Press Release  Digital Services Georgia/PressRelease_SaveButton'))

WebUI.verifyElementText(findTestObject('Page_QA test short title 2958  Digital Services Georgia/IsThisRevisionPublic'), 
    'No')

WebUI.verifyElementText(findTestObject('Page_QA test short title 2958  Digital Services Georgia/ModerationState'), 'Draft')

WebUI.verifyElementText(findTestObject('Page_QA test short title 2958  Digital Services Georgia/MostRecentRevision'), 'Yes')

String url = WebUI.getUrl()

String editURL = WebUI.concatenate(url, '/edit')

WebUI.navigateToUrl(editURL)

WebUI.click(findTestObject('Object Repository/Page_Edit Press Release QA test press relea_fa1c29/a_Schedule a status change'))

timestamp = new Date()

use(groovy.time.TimeCategory, { 
        timestamp = (timestamp + 2.minutes)
    })

String expectedTimestamp = timestamp.format('HH:mm:ss')

WebUI.click(findTestObject('Page_Edit Press Release QA test press release with automation 2958  Digital Services Georgia/ModerationState_TimeField'))

WebUI.sendKeys(findTestObject('Page_Edit Press Release QA test press release with automation 2958  Digital Services Georgia/ModerationState_TimeField'), 
    expectedTimestamp)

WebUI.setText(findTestObject('Page_Edit Press Release QA test press release with automation 2958  Digital Services Georgia/ModerationState_TimeField'), 
    expectedTimestamp)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Edit Press Release QA test press relea_fa1c29/select_DraftNeeds ReviewPublishedArchived'), 
    'published', true)

WebUI.click(findTestObject('Object Repository/Page_Edit Press Release QA test press relea_fa1c29/button_Save'))

WebUI.delay(1.5)

WebUI.click(findTestObject('Page_Edit Press Release QA test press release with automation 2958  Digital Services Georgia/Edit_PressRelease_Save_Button'))

