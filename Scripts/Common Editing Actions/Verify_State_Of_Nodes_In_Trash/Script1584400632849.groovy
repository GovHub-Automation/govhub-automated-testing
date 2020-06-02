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

WebUI.callTestCase(findTestCase('Authenticate Testing Site'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Single Run Cases/Create FAQ List'), [('shortTitle') : 'qafaqautomation'], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_qafaqautomation 997721345764169  Digital Services Georgia/ModerationState_Text'), 
    'Published')

WebUI.click(findTestObject('Object Repository/Page_qafaqautomation 997721345764169  Digit_bf05d3/a_Move to Trash'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Are you sure you want to move FAQ - Automation to Trash  Digital Services Georgia/PageTitle_On_DeleteConfirmPage'), 
    'FAQ - Automation')

WebUI.click(findTestObject('Object Repository/Page_Are you sure you want to move FAQ - Au_840276/input_FAQ - Automation_op'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Page_qafaqautomation 997721345764169  Digital Services Georgia/ModerationState_Text'), 
    'Archived')

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Page_qafaqautomation 997721345764169  Digital Services Georgia/VisibleToPublic_Label'), 
    'No')

WebUI.click(findTestObject('Object Repository/Page_qafaqautomation 1023090573147521  Digi_70c365/a_Edit'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_Create FAQ  Digital Services Georgia/ContentModeration_Section'), 
    30)

WebUI.click(findTestObject('Object Repository/Page_Edit FAQ FAQ - Automation  Digital Ser_0bedc8/a_Restore'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Are you sure you want to move FAQ - Automation to Trash  Digital Services Georgia/PageTitle_On_DeleteConfirmPage'), 
    'FAQ - Automation')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Are you sure you want to restore FAQ -_464eac/input_FAQ - Automation_op'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Page_qafaqautomation 997721345764169  Digital Services Georgia/ModerationState_Text'), 
    'Draft')

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Page_qafaqautomation 997721345764169  Digital Services Georgia/VisibleToPublic_Label'), 
    'No')

WebUI.click(findTestObject('Object Repository/Page_qafaqautomation 1023090573147521  Digi_70c365/a_Edit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create FAQ  Digital Services Georgia/ContentModeration_Section'), 
    30)

WebUI.mouseOver(findTestObject('Page_jasmyneepps  Digital Services Georgia/Hover over Content'))

WebUI.mouseOver(findTestObject('Page_jasmyneepps  Digital Services Georgia/Hover over Micro-content'))

WebUI.click(findTestObject('Page_jasmyneepps  Digital Services Georgia/Add micro-content'))

WebUI.click(findTestObject('Create CTA/Page_Add micro-content  Digital Services Georgia/span_Call To Action'))

WebUI.verifyElementPresent(findTestObject('Page_Create Call To Action  Digital Services Georgia/PublishedCheckbox'), 30)

WebUI.setText(findTestObject('Object Repository/Page_Create Call To Action  Digital Service_b58c43/input_Title_title0value'), 
    'QA test CTA with automation')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_Create Call To Action  Digital Service_b58c43/input_URL_field_cta_url0uri'), 
    'http://www.google.com')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_Create Call To Action  Digital Service_b58c43/input_Link text_field_cta_url0title'), 
    'QA CTA Link')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Create Call To Action  Digital Service_b58c43/input_Published_op'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_QA test CTA with automation  Digital S_92584c/a_Move to Trash'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Page_Are you sure you want to move QA test CTA with automation to Trash  Digital Services Georgia/CTA_Automation_Title'), 
    'QA test CTA with automation')

WebUI.click(findTestObject('Page_Are you sure you want to move QA test CTA with automation to Trash  Digital Services Georgia/CTA_MoveToTrashButton'))

WebUI.click(findTestObject('Object Repository/Page_QA test CTA with automation  Digital S_92584c/a_Edit'))

WebUI.delay(2)

WebUI.verifyElementNotPresent(findTestObject('Page_Create Call To Action  Digital Services Georgia/PublishedCheckbox'), 
    30)

WebUI.click(findTestObject('Object Repository/Page_Edit Call To Action QA test CTA with a_4dcb31/a_Restore'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Page_Are you sure you want to move QA test CTA with automation to Trash  Digital Services Georgia/CTA_Automation_Title'), 
    'QA test CTA with automation')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Are you sure you want to restore QA te_f1ffaa/input_QA test CTA with automation_op'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_QA test CTA with automation  Digital S_92584c/a_Edit'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Page_Create Call To Action  Digital Services Georgia/PublishedCheckbox'), 30)

