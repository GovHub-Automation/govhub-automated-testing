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

not_run: WebUI.callTestCase(findTestCase('Authenticate Testing Site'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Log In'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_jasmyneepps  Digital Services Georgia/a_Content'))

WebUI.click(findTestObject('Object Repository/Page_Content  Digital Services Georgia/a_Add content'))

WebUI.click(findTestObject('Object Repository/Page_Add content  Digital Services Georgia/a_Book pageBooks have a built-in hierarchic_9c9d28'))

WebUI.setText(findTestObject('Object Repository/Page_Create Book page  Digital Services Georgia/input_Title_title0value'), 
    'New Book - Automation')

WebUI.setText(findTestObject('Object Repository/Page_Create Book page  Digital Services Georgia/input_Short Title_field_short_title0value'), 
    'New Book')

WebUI.click(findTestObject('Object Repository/Page_Create Book page  Digital Services Georgia/html_Rich Text Editor Summary'))

WebUI.setText(findTestObject('Object Repository/Page_Create Book page  Digital Services Georgia/body_Heres a Summary for this new book'), 
    GlobalVariable.summaryContent)

WebUI.click(findTestObject('Object Repository/Page_Create Book page  Digital Services Georgia/input_Cover Image_field_teaser_image_entity_b7b848'))

WebUI.setText(findTestObject('Object Repository/Page_Create Book page  Digital Services Georgia/input_Name_name'), 'image')

WebUI.click(findTestObject('Object Repository/Page_Create Book page  Digital Services Georgia/input_Published_edit-submit-media-browser'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Create Book page  Digital Services Georgia/div_Open  configuration optionsEdit        _6b7b61'))

WebUI.click(findTestObject('Object Repository/Page_Create Book page  Digital Services Georgia/input_Select this item_op'))

WebUI.click(findTestObject('Object Repository/Page_Create Book page  Digital Services Georgia/html_Rich Text Editor Body'))

WebUI.setText(findTestObject('Object Repository/Page_Create Book page  Digital Services Georgia/body_Heres some body text for this new book_bb4eb0'), 
    GlobalVariable.bodyContent)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Create Book page  Digital Services Georgia/Search'), 0)

WebUI.click(findTestObject('Object Repository/Page_Create Book page  Digital Services Georgia/Book Outline'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Book page  Digital Services Georgia/Select Book Outline'), 
    'new', true)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Book page  Digital Services Georgia/select_DraftPublishedArchived'), 
    'published', true)

WebUI.click(findTestObject('Object Repository/Bio Objects/Page_Create Bio  Digital Services Georgia/Save Bio'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/Page_New Book  Digital Services Georgia/NewBook_Breadcrumb'), 
    'New Book - Automation', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_New Book  Digital Services Georgia/NewBookPage_Title'), 'New Book - Automation', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_New Book  Digital Services Georgia/BookPage_Body'), GlobalVariable.bodyContent, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_New Book  Digital Services Georgia/NewBook_ShortTitle'), 
    'Short Title\nNew Book', FailureHandling.CONTINUE_ON_FAILURE)

