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

WebUI.callTestCase(findTestCase('Log In as Editor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_jasmyneepps  Digital Services Georgia/a_Content'))

WebUI.navigateToUrl('https://test.prod.dsga.codes/admin/content')

WebUI.click(findTestObject('Page_Content  Digital Services Georgia/a_Add content'))

WebUI.click(findTestObject('Object Repository/Page_Add content  Digital Services Georgia/a_OrganizationYour agency and its divisions_9d5a0e'))

timestamp = new Date()

use(groovy.time.TimeCategory, { 
        timestamp = (timestamp - 1.seconds)
    })

String expectedTimestamp = (('Format: ' + timestamp.format('yyyy-MM-dd HH:mm:ss')) + '.') + ' Leave blank to use the time of form submission.'

WebUI.click(findTestObject('Object Repository/Page_Create Organization  Digital Services Georgia/summary_Search'))

WebUI.click(findTestObject('Object Repository/Page_Create Organization  Digital Services Georgia/summary_Book outline'))

WebUI.click(findTestObject('Object Repository/Page_Create Organization  Digital Services Georgia/summary_XML sitemap'))

WebUI.click(findTestObject('Object Repository/Page_Create Organization  Digital Services Georgia/summary_URL alias'))

WebUI.click(findTestObject('Object Repository/Page_Create Organization  Digital Services Georgia/summary_Authoring information'))

WebUI.click(findTestObject('Object Repository/Page_Create Organization  Digital Services Georgia/summary_Promotion options'))

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

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Search_Section_Title'), 'SEARCH')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Search_Terms_Label'), 'Search Terms')

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Search_Terms_Dropdown'), 30)

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Exclude_From_Search_Label'), 
    'Exclude from search')

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Exclude_From_Search_Checkbox'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Book_Outline_Section_Title'), 
    'BOOK OUTLINE')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Book_Label'), 'Book')

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Book_Dropdown'), 30)

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Book_Dropdown_Tooltip'), 'Your page will be a part of the selected book.')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/No_Book_Selected_Label'), 'No book selected.')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Weight_Label'), 'Weight')

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Weight_Dropdown'), 30)

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Weight_Dropdown_Tooltip'), 'Pages at a given level are ordered first by weight and then by title.')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/XML_Sitemap_Section_Title'), 
    'XML SITEMAP')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Inclusion_Label'), 'Inclusion')

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Inclusion_Dropdown'), 30)

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Priority_Label'), 'Priority')

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Priority_Dropdown'), 30)

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Priority_Dropdown_Tooptip'), 
    'The priority of this URL relative to other URLs on your site.')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Change_Frequency_Label'), 'Change frequency')

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Change_Frequency_Dropdown'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Change_Frequency_Dropdown_Tooltip'), 
    'Select the frequency of changes.')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/URL_Alias_Section_Title'), 'URL ALIAS')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Generate_Automatic_URL_Alias_Label'), 
    'Generate automatic URL alias')

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Generate_Automatic_URL_Alias_Checkbox'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Generate_Automatic_URL_Alias_Checkbox_Tooltip'), 
    'Uncheck this to create a custom alias below. Configure URL alias patterns.')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/URL_Alias_Label'), 'URL alias')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/URL_Alias_Tooltip'), 'Specify an alternative path by which this data can be accessed. For example, type "/about" when writing an about page.')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Authoring_Information_Section_Title'), 
    'AUTHORING INFORMATION')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Authored_By_Label'), 'Authored by')

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Authored_By_UserName_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Authored_By_User_Name_Field_Tooltip'), 
    'The username of the content author.')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Authored_On_Label'), 'Authored on')

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Authored_On_Date_Field'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Authored_On_Time_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Authored_On_DateTime_Tooltip'), 
    expectedTimestamp)

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Promotion_Options_Section_Title'), 
    'PROMOTION OPTIONS')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Sticky_At_Top_Of_Lists_Label'), 
    'Sticky at top of lists')

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Sticky_At_Top_Of_Lists_Checkbox'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Last_Saved'), 'Last saved Not saved yet')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Author'), 'Author jasmyne.epps')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Revision_Log_Message_Label'), 
    'Revision log message')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Revision_Log_Message_Tooltip'), 
    'Briefly describe the changes you have made.')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Content_Moderation_Section_Title'), 
    'CONTENT MODERATION')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Content_Moderation_Tooltip'), 
    'Scheduled state changes may take up to 10 minutes to take place, after the specified time.')

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Save_As_Label'), 'Save as')

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Save_As_Dropdown'), 30)

WebUI.verifyElementText(findTestObject('Page_Create Organization  Digital Services Georgia/Schedule_A_Status_Change_Link'), 
    'Schedule a status change')

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Save_Button'), 30)

WebUI.verifyElementPresent(findTestObject('Page_Create Organization  Digital Services Georgia/Preview_Button'), 30)

