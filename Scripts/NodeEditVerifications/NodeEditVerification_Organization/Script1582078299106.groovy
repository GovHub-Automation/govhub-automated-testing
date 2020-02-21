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

WebUI.click(findTestObject('Object Repository/Page_Add content  Digital Services Georgia/a_OrganizationYour agency and its divisions_9d5a0e'))

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Create Organization_PageTitle'), 
    'Create Organization')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Name_Label (required)'), 'Name')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Name_Field_Tooltip'), 'The name of the Department, Division, Office, or organizational units. Alternately, input the name of your Agency when completing the fields below to display on Georgia.gov')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Acronym_Label'), 'Acronym')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Overview_Label'), 'Overview')

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Overview_WYSIWYG_Bold_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Overview_WYSIWYG_Italic_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Overview_WYSIWYG_Link_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Overview_WYSIWYG_Unlink_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Overview_WYSIWYG_Documents_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Overview_WYSIWYG_Copy_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Overview_WYSIWYG_Cut_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Overview_WYSIWYG_Paste_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Overview_WYSIWYG_Paste_FromWord_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Overview_WYSIWYG_RemoveFormat_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Overview_WYSIWYG_InsertSpecialCharacter_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Overview_WYSIWYG_Check Accessibility_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Overview_WYSIWYG_Source_Button'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Overview_WYSIWYG_Tooltip1'), 
    'This short introduction for your agency will appear on Georgia.gov. (Only applicable for an Organization marked as Primary).')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Overview_WYSIWYG_Tooltip2'), 
    'Content limited to 500 characters, remaining: 500')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Website_SectionTitle'), 'WEBSITE')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Website_URL_Label'), 'URL')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Website_URL_Tooltip'), 'Start typing to find content or paste a URL and click on the suggestion below.')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Website_LinkText_Label'), 'Link text')

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Add_Another_Item_Button'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Primary Location_SectionTitle'), 
    'PRIMARY LOCATION')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Primary_Location_Tooltip1'), 
    'The main office location for the organization')

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Primary_Location_AddLocation_Button'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Primary_Location_Tooltip2'), 
    'You can select one content item.')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Primary_Contact_SectionTitle'), 
    'PRIMARY CONTACT')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Primary_Contact_Tooltip'), 'The main office number for the organization.')

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Primary_Contact_AddContact_Button'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Parent_Organization_SectionTitle'), 
    'PARENT ORGANIZATION')

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Parent_Organization_AddOrganization_Button'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Parent_Organization_Tooltip'), 
    'You can select one content item.')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Additional Information_Label'), 
    'Additional Information')

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Additional_Information_WYSIWYG_Format_Dropdown'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Additional_Information_WYSIWYG_Bold_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Additional_Information_WYSIWYG_Italic_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Additional_Information_WYSIWYG_Quotes_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Additional_Information_WYSIWYG_BulletList_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Additional_Information_WYSIWYG_NumberedList_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Additional_Information_WYSIWYG_DecreaseIndent_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Additional_Information_WYSIWYG_IncreaseIndent_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Additional_Information_WYSIWYG_Link_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Additional_Information_WYSIWYG_Unlink_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Additional_Information_WYSIWYG_Documents_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Additional_Information_WYSIWYG_EmbedContent_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Additional_Information_WYSIWYG_EmbedMedia_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Additional_Information_WYSIWYG_EmbedMicrocontent_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Additional_Information_WYSIWYG_Copy_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Additional_Information_WYSIWYG_Cut_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Additional_Information_WYSIWYG_Paste_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Additional_Information_WYSIWYG_PasteFromWord_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Additional_Information_WYSIWYG_RemoveFormat_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Additional_Information_WYSIWYG_InsertSpecialCharacter_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Additional_Information_WYSIWYG_Table_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Additional_Information_WYSIWYG_Check_Accessibility_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Additional_Information_WYSIWYG_Maximize_Button'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Additional_Information_WYSIWYG_Source_Button'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Associate_This_Content_Section_Title'), 
    'ASSOCIATE THIS CONTENT WITH...')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Division_Section_Label'), 'Division / Section')

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Division_Section_Dropdown'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Categories_Label'), 'Categories')

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Categories_Dropdown'), 30)

WebUI.callTestCase(findTestCase('VerifyRightSideNavOnEditNodes'), [:], FailureHandling.STOP_ON_FAILURE)

