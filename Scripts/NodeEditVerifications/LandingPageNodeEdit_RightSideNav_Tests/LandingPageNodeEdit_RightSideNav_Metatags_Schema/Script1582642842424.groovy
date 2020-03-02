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

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_Schema_Label'), 'SCHEMA.ORG: WEBPAGE')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Tooltip'), 'See Schema.org definitions for this Schema type at https://schema.org/WebPage. Also see Google\'s requirements.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_type_Label'), '@type')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_Schema_type_Dropdown'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_type_Dropdown_Tooltip'), 
    'REQUIRED. The type of web page.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_Schema_id_Label'), '@id')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_id_FIeld'), 30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_Schema_id_FIeld_Tooltip'), 
    'Globally unique @id, usually a url, used to to link other properties to this object.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_Schema_Breadcrumb_Label'), 
    'breadcrumb')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_Schema_Breadcrumb_Dropdown'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Breadcrumb_Dropdown_Tooltip'), 
    'Add the breadcrumb for the current web page to Schema.org structured data?')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Description_Label'), 'description')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_Schema_Description_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Description_Field_Tooltip'), 
    'A description of the item.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_Schema_Author_Label'), 
    'AUTHOR')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_Schema_Author_type_Label'), 
    '@type')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Author_type_Dropdown'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Author_type_Dropdown_Label'), 
    'Author of the web page.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Publisher_Label'), 'PUBLISHER')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Publisher_type_Label'), 
    '@type')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Publisher_type_Dropdown'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_Schema_Publisher_id_Label'), 
    '@id')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_Schema_Publisher_id_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_Schema_Publisher_id_Field_Tooltip'), 
    'Globally unique @id of the person or organization, usually a url, used to to link other properties to this object.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Publisher_Name_Label'), 
    'name')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Publisher_Name_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Publisher_Name_Field_Tooltip'), 
    'Name of the person or organization, i.e. [node:author:display-name].')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Publisher_URL_Label'), 
    'url')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Publisher_URL_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Publisher_URL_Label_Tooltip'), 
    'Absolute URL of the canonical Web page, like the URL of the author\'s profile page or the organization\'s official website, i.e. [node:author:url].')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Publisher_SameAs_Label'), 
    'sameAs')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Publisher_SameAs_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Publisher_SameAs_Field_Tooltip'), 
    'Comma separated list of URLs for the person\'s or organization\'s official social media profile page(s).')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_Schema_Publisher_Logo_Label'), 
    'LOGO')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Publisher_Logo_type_Label'), 
    '@type')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Publisher_Logo_type_Dropdown'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Publisher_Logo_Pivot_Label'), 
    'Pivot')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Publisher_Logo_Pivot_Dropdown'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Publisher_Logo_Pivot_Dropdown_Tooltip'), 
    'Combine and pivot multiple values to display them as multiple objects.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Publisher_Logo_RepOfPage_Label'), 
    'representative Of Page')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Publisher_Logo_RepOfPage_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Publisher_Logo_RepOfPage_Field_Tooltip'), 
    'Whether this image is representative of the content of the page.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Publisher_Logo_URL_Label'), 
    'url')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Publisher_Logo_URL_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Publisher_Logo_URL_Field_Tooltip'), 
    'Absolute URL of the image, i.e. [node:field_name:image_preset_name:url].')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Publisher_Logo_width_Label'), 
    'width')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Publisher_Logo_width_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Publisher_Logo_height_Label'), 
    'height')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Publisher_Logo_height_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Publisher_Log_height_Field_Tooltip'), 
    'The logo of the organization. For AMP pages, Google requires a image no larger than 600 x 60.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Haspart_Section_Label'), 
    'HASPART')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_Schema_Haspart_type_Label'), 
    '@type')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_Schema_Haspart_type_Dropdown'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Haspart_type_Dropdown_Tooltip'), 
    'Use for Paywalled content.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_IsAccessibleForFree_Label'), 
    'isAccessibleForFree')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_IsAccessibleForFree_Dropdown'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_IsAccessibleForFree_Dropdown_Tooltip'), 
    'Use for Paywalled content.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Speakable_Label'), 'SPEAKABLE')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Speakable_Type_Label'), 
    'Type')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Speakable_Type_Dropdown'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Speakable_Type_Dropdown_Tooltip'), 
    'Please provide either xpath or cssSelector, not both.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Speakable_Type_Dropdown_Tooltip_2'), 
    'Speakable property.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_Schema_InLanguage_Label'), 
    'inLanguage')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_InLanguage_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_Schema_InLanguage_Field_Tooltip'), 
    'The language of the content')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Translation_Label'), 'TRANSLATIONOFWORK')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Translation_id_Label'), 
    '@id')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_TranslationOfWork_id_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Translation_id_Field_Tooltip'), 
    'Globally unique @id of the related node, usually a url, used to to link other properties to this object.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Translation__id_Field_Tooltip_2'), 
    'The website id that this is a direct translation of')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Worktranslation_Label'), 
    'WORKTRANSLATION')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Worktranslation_id_Label'), 
    '@id')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Worktranslation_id_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Worktranslation_id_Field_Tooltip'), 
    'Globally unique @id of the related node, usually a url, used to to link other properties to this object.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Schema_Worktranslation_id_Field_Tooltip_2'), 
    'Translation(s) of this work')

