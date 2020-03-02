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

WebUI.click(findTestObject('Object Repository/Page_jasmyneepps  Digital Services Georgia/a_Content'))

WebUI.navigateToUrl('https://test.prod.dsga.codes/admin/content')

WebUI.click(findTestObject('Object Repository/Page_Content  Digital Services Georgia/a_Add content'))

WebUI.click(findTestObject('Object Repository/Page_Add content  Digital Services Georgia/a_Landing PagePlace specific items in a lay_a31575'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/Create_Landing__Page_Title'), 
    'Create Landing Page')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/Create_Landing_Page_Title_Tooltip'), 
    'To actually add content to this landing page, click "Save" below and then visit the "Layout" tab at the top of this node (next to "View", "Edit", etc.).')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/Title_Label'), 
    'Title')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/Title_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/Short_Title_Label'), 
    'Short Title')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/Short_Title_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/Short_Title_Field_Tooltip'), 
    'Content limited to 40 characters, remaining: 40')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/Include_Navigation_Label'), 
    'Include Navigation?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/Include_Navigation_Checkbox'), 
    30)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/Include_Navigation_Tooltip'), 
    'Check this box to display the site navigation left sidebar.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/Label_label'), 
    'Label')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/Label_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/Label_Field_Tooltip'), 
    'Introduce an optional label for this page. If existing, this will be used for example in the "Landing Page Header" component, which can be placed in full-width regions.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/Summary_Label'), 
    'Summary')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/Summary_WYSIWYG_Bold'), 
    30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/Summary_WYSIWYG_Italic'), 
    30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/Summary_WYSIWYG_Link'), 
    30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/Summary_WYSIWYG_Unlink'), 
    30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/Summary_WYSIWYG_Documents'), 
    30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/Summary_WYSIWYG_Copy'), 
    30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/Summary_WYSIWYG_Cut'), 
    30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/Summary_WYSIWYG_Paste'), 
    30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/Summary_WYSIWYG_PasteFromWord'), 
    30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/Summary_WYSIWYG_RemoveFormat'), 
    30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/Summary_WYSIWYG_InsertSpecialCharacter'), 
    30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/Summary_WYSIWYG_Check_Accessibility'), 
    30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/Summary_WYSIWYG_Source'), 
    30)

WebUI.click(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/summary_Search'))

WebUI.click(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/summary_Menu settings'))

WebUI.click(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/summary_Metatags'))

WebUI.click(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/summary_Book outline'))

WebUI.click(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/summary_XML sitemap'))

WebUI.click(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/summary_URL alias'))

WebUI.click(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/summary_Authoring information'))

WebUI.click(findTestObject('Object Repository/Page_Create Landing Page  Digital Services Georgia/summary_Promotion options'))

WebUI.callTestCase(findTestCase('NodeEditVerifications/LandingPageNodeEdit_RightSideNav_Tests/LandingPageNodeEdit_RightSideNav_AssocSearchAndMenu'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('NodeEditVerifications/LandingPageNodeEdit_RightSideNav_Tests/LandingPageNodeEdit_RightSideNav_Metatags_BasicTagsOpenGraph'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('NodeEditVerifications/LandingPageNodeEdit_RightSideNav_Tests/LandingPageNodeEdit_RightSideNav_Metatags_Twitter'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('NodeEditVerifications/LandingPageNodeEdit_RightSideNav_Tests/LandingPageNodeEdit_RightSideNav_Metatags_Schema'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('NodeEditVerifications/LandingPageNodeEdit_RightSideNav_Tests/LandingPageNodeEdit_RightSideNav_BookOutlineAndBelow'), 
    [:], FailureHandling.STOP_ON_FAILURE)

