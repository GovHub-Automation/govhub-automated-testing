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

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/AssociateThisContentWith_Label'), 
    'ASSOCIATE THIS CONTENT WITH...')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/ProgramOrServicesReferences_Label'), 
    'PROGRAM OR SERVICES REFERENCES')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/AddProgramServices_Button'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/DivisionSection_Label'), 'Division / Section')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/DivisionSection_Dropdown'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Categories_Label'), 'Categories')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Categories_Dropdown'), 30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/SearchSection_Label'), 'SEARCH')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/SearchTerms_Label'), 'SEARCH TERMS')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/SearchTerms_Field'), 30)

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/SearchTerms_AddAnotherItem_Button'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/SearchTerms_ExcludeFromSearch_Label'), 
    'Exclude from search')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/SearchTerms_ExcludeFromSearch_Checkbox'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/MenuSettings_Label'), 'MENU SETTINGS')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/MenuSettings_Checkbox_Label'), 
    'Provide a menu link')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/MenuSettings_Checkbox'), 30)

