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

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/BookOutline_Section_Label'), 
    'BOOK OUTLINE')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/BookOutine_Book_Label'), 'Book')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/BookOutine_Book_Dropdown'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/BookOutine_Book_Dropdown_Tooltip'), 
    'Your page will be a part of the selected book.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/BookOutine_Book_Dropdown_Tooltip_2'), 
    'No book selected.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/BookOutine_Book_Weight_Label'), 
    'Weight')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/BookOutine_Book_Weight_Dropdown'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/BookOutine_Book_Weight_Dropdown_Tooltip'), 
    'Pages at a given level are ordered first by weight and then by title.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/XMLSitemap_Section_Label'), 'XML SITEMAP')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/XMLSitemap_Section_Inclusion_Label'), 
    'Inclusion')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/XMLSitemap_Section_Inclusion_Dropdown'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/XMLSitemap_Section_Priority_Label'), 
    'Priority')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/XMLSitemap_Section_Priority_Dropdown'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/XMLSitemap_Section_Priority_Dropdown_Tooltip'), 
    'The priority of this URL relative to other URLs on your site.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/XMLSitemap_Section_ChangeFrequency_Label'), 
    'Change frequency')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/XMLSitemap_Section_ChangeFrequency_Dropdown'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/XMLSitemap_ChangeFreq_Dropdown_Tooltip'), 
    'Select the frequency of changes.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/URLAlias_Section_Label'), 'URL ALIAS')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/URLAlias_Section_GenerateAutoURLAlias_Label'), 
    'Generate automatic URL alias')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/URLAlias_Section_GenerateAlias_Checkbox'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/URLAlias_GenerateAlias_Checkbox_Tooltip'), 
    'Uncheck this to create a custom alias below. Configure URL alias patterns.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/URLAlias_Section_URLAlias_Label'), 
    'URL alias')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/URLAlias_Section_URLAlias_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/URLAlias_Section_URLAlias_Field_Tooltip'), 
    'Specify an alternative path by which this data can be accessed. For example, type "/about" when writing an about page.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/AuthoringInfo_Label'), 'AUTHORING INFORMATION')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/AuthoringInfo_AuthoredBy_Label'), 
    'Authored by')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/AuthoringInfo_AuthoredBy_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/AuthoringInfo_AuthoredBy_Field_Tooltip'), 
    'The username of the content author.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/AuthoringInfo_AuthoredOn_Label'), 
    'Authored on')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/AuthoringInfo_AuthoredOn_DateField'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/AuthoringInfo_AuthoredOn_TimeField'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/PromotionOptions_Section_Label'), 
    'PROMOTION OPTIONS')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/PromoOptions_StickyAtTopOfLists_Label'), 
    'Sticky at top of lists')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/PromoOptions_StickyAtTopOfLists_Checkbox'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/PromotionOptions_Section_LastSaved_Label'), 
    'Last saved Not saved yet')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/PromotionOptions_Section_Author_Label'), 
    'Author jasmyne.epps')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/PromoOptions_RevisionLog_Label'), 
    'Revision log message')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/PromoOptions_RevisionLog_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/PromotionOptions_RevisionLog_Field_Tooltip'), 
    'Briefly describe the changes you have made.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/ContentModeration_Label'), 'CONTENT MODERATION')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/ContentModeration_Section_Tooltip'), 
    'Scheduled state changes may take up to 10 minutes to take place, after the specified time.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/ContentModeration_SaveAs_Label'), 
    'Save as')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/ContentModeration_SaveAs_Dropdown'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/ContentModeration_ScheduleChange_Link'), 
    30)

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/SaveButton'), 30)

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/PreviewButton'), 30)

