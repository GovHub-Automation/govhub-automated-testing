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

WebUI.navigateToUrl('https://gta:gta@www.staging.dsga.codes/user/login')

WebUI.navigateToUrl('https://www.staging.dsga.codes/node/add/book')

WebUI.setText(findTestObject('Object Repository/Page_Create Book page  Georgiagov/input_Title_title0value'), 'QA test book with automation')

WebUI.click(findTestObject('Object Repository/Page_Create Book page  Digital Services Georgia/html_Rich Text Editor Summary'))

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/Page_Create Book page  Digital Services Georgia/body_Heres a Summary for this new book'), 
    GlobalVariable.summaryContent)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Book page  Georgiagov/select_DraftNeeds ReviewPublishedArchived'), 
    'published', true)

WebUI.click(findTestObject('Object Repository/Page_Create Book page  Georgiagov/AddBookNode_SaveButton'))

WebUI.delay(4)

String bookURL = WebUI.getUrl()

WebUI.navigateToUrl('https://www.staging.dsga.codes/node/add/organization')

WebUI.click(findTestObject('Object Repository/Page_Create Organization  Georgiagov/summary_Citations'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create Organization  Georgiagov/Citation_Section_Title'), 
    30)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Create Organization  Georgiagov/Citation_Section_Title'), 
    'CITATIONS')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Create Organization  Georgiagov/Citation_Section_Label'), 
    'CITATION')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Create Organization  Georgiagov/Citation_URL_Label'), 'URL')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create Organization  Georgiagov/Citation_URL_Field'), 
    30)

WebUI.setText(findTestObject('Object Repository/Page_Create Organization  Georgiagov/input_URL_field_citation0value'), 'http://www.google.com')

WebUI.click(findTestObject('Object Repository/Page_Create Organization  Georgiagov/Citation_Section_AddAnotherItem_Button_1'))

WebUI.setText(findTestObject('Object Repository/Page_Create Organization  Georgiagov/input_URL_field_citation1value'), '/test/node')

WebUI.click(findTestObject('Object Repository/Page_Create Organization  Georgiagov/Citation_Section_AddAnotherItem_Button_2'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create Organization  Georgiagov/Citation_Section_URL_Validation_Message'), 
    30)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Create Organization  Georgiagov/Citation_URL_Label'), 'URL')

WebUI.setText(findTestObject('Object Repository/Page_Create Organization  Georgiagov/input_URL_field_citation1value_1'), 
    bookURL)

WebUI.click(findTestObject('Object Repository/Page_Create Organization  Georgiagov/Citation_Section_AddAnotherItem_Button_2'))

WebUI.setText(findTestObject('Object Repository/Page_Create Organization  Georgiagov/input_Name_title0value'), 'QA test organization node with automation')

WebUI.setText(findTestObject('Object Repository/Page_Create Organization  Georgiagov/input_Display Title_field_display_title0value'), 
    'QA test display title for organization with automation')

WebUI.setText(findTestObject('Create Organization/Page_Create Organization  Digital Services Georgia/html_Rich Text Editor Overview field'), 
    'Overview text')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Organization  Georgiagov/select_DraftNeeds ReviewPublishedArchived'), 
    'published', true)

WebUI.click(findTestObject('Object Repository/Page_Create Organization  Georgiagov/CreateOrganization_Save_Button'))

WebUI.click(findTestObject('Object Repository/Page_QA test organization node with automat_0274eb/a_Citations'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Citations on QA test organization node with automation  Georgiagov/Citation_Table_Item_1'), 
    'http://www.google.com')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Citations on QA test organization node with automation  Georgiagov/Citation_Table_Item_2'), 
    bookURL)

WebUI.click(findTestObject('Object Repository/Page_Citations on QA test organization node_93f7f3/a_Content'))

WebUI.click(findTestObject('Object Repository/Page_Content  Georgiagov/a_Citations'))

WebUI.verifyElementText(findTestObject('Page_Citations  Georgiagov/AdminPage_Citation_Table_1'), 'QA test organization node with automation')

