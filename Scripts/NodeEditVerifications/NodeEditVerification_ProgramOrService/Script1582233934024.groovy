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

WebUI.callTestCase(findTestCase('Log In as Editor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_jasmyneepps  Digital Services Georgia/a_Content'))

WebUI.navigateToUrl('https://test.prod.dsga.codes/admin/content')

WebUI.click(findTestObject('Page_Content  Digital Services Georgia/a_Add content'))

WebUI.click(findTestObject('Object Repository/Page_Add content  Digital Services Georgia/a_Program or ServicePrograms and services y_f0e73d'))

WebUI.verifyElementText(findTestObject('Page_Create Program or Service  Digital Services Georgia/CreateProgramOrService_Page_Title'), 
    'Create Program or Service')

WebUI.verifyElementText(findTestObject('Page_Create Program or Service  Digital Services Georgia/Name_FIeld_Label'), 'Name')

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/Name_Field'), 30)

WebUI.verifyElementText(findTestObject('Page_Create Program or Service  Digital Services Georgia/Category_Label'), 'Category')

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/Category_Dropdown'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Program or Service  Digital Services Georgia/Primary_Service_Tooltip'), 
    'This is a Primary Service')

WebUI.verifyElementText(findTestObject('Page_Create Program or Service  Digital Services Georgia/Primary_Service_Tooltip (1)'), 
    'This service will be featured on the primary organization (About Us) page for your site, and is eligible to be shared to Georgia.gov.')

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/Primary_Service_Checkbox'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Program or Service  Digital Services Georgia/Overview_Label'), 'Overview')

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/Overview_WYSIWYG_Bold'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/Overview_WYSIWYG_Italic'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/Overview_WYSIWYG_Link'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/Overview_WYSIWYG_Unlink'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/Overview_WYSIWYG_Documents'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/Overview_WYSIWYG_Copy'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/Overview_WYSIWYG_Cut'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/Overview_WYSIWYG_Paste'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/Overview_WYSIWYG_PasteFromWord'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/Overview_WYSIWYG_RemoveFormat'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/Overview_WYSIWYG_InsertSpecialCharacter'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/Overview_WYSIWYG_CheckAccessibility'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/Overview_WYSIWYG_Source'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Program or Service  Digital Services Georgia/Logo_Label'), 'LOGO')

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/Logo_AddImage_Button'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Program or Service  Digital Services Georgia/Logo_AddImage_Tooltip'), 
    'You can select one media item.')

WebUI.verifyElementText(findTestObject('Page_Create Program or Service  Digital Services Georgia/Audience_Label'), 'Audience')

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/Audience_Dropdown'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Program or Service  Digital Services Georgia/First_Step_Label'), 'FIRST STEP')

WebUI.verifyElementText(findTestObject('Page_Create Program or Service  Digital Services Georgia/First_Step_Summary_Label'), 
    'First Step Summary')

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/FirstStep_WYSIWYG_Bold'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/FirstStep_WYSIWYG_Italic'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/FirstStep_WYSIWYG_Link'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/FirstStep_WYSIWYG_Unlink'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/FirstStep_WYSIWYG_Documents'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/FirstStep_WYSIWYG_Copy'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/FirstStep_WYSIWYG_Cut'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/FirstStep_WYSIWYG_Paste'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/FirstStep_WYSIWYG_PasteFromWord'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/FirstStep_WYSIWYG_RemoveFormat'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/FirstStep_WYSIWYG_InsertSpecialCharacter'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/FirstStep_WYSIWYG_Source'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Program or Service  Digital Services Georgia/FirstStep_CTA_Section_Title'), 
    'FIRST STEP')

WebUI.verifyElementText(findTestObject('Page_Create Program or Service  Digital Services Georgia/FirstStep_CTA_URL_Label'), 
    'URL')

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/FirstStep_CTA_URL_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Program or Service  Digital Services Georgia/FirstStep_CTA_URL_Tooltip'), 
    'Start typing to find content or paste a URL and click on the suggestion below.')

WebUI.verifyElementText(findTestObject('Page_Create Program or Service  Digital Services Georgia/FirstStep_CTA_LinkText_Label'), 
    'Link text')

WebUI.verifyElementPresent(findTestObject('Page_Create Program or Service  Digital Services Georgia/FirstStep_CTA_LinkText_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Program or Service  Digital Services Georgia/FirstStep_CTA_LinkText_Tooltip'), 
    'When referencing documents, we ignore "Link text" and use the document\'s name instead.')

WebUI.callTestCase(findTestCase('VerifyRightSideNavOnEditNodes'), [:], FailureHandling.STOP_ON_FAILURE)

