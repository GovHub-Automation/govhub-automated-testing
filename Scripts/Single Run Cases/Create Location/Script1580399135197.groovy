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

WebUI.mouseOver(findTestObject('Page_jasmyneepps  Digital Services Georgia/Content Library'))

WebUI.click(findTestObject('Page_Content  Digital Services Georgia/Add content'))

WebUI.click(findTestObject('Object Repository/Page_Add content  Digital Services Georgia/a_LocationPhysical locations where the publ_47b9b9'))

WebUI.setText(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/input_Name_title0value'), 
    'Atlanta')

WebUI.click(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/Location_Page_WYSIWYG'))

WebUI.setText(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/Location_Page_Notes'), 'QA test location notes')

WebUI.setText(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/input_Street address_field_address0addressa_9a88f2'), 
    '47 Trinity Ave SW')

WebUI.setText(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/input_City_field_address0addresslocality'), 
    'Atlanta')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_- Select -AlabamaAlaskaAmerican Samo_c424a6'), 
    'GA', true)

WebUI.setText(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/input_Zip code_field_address0addresspostal_code'), 
    '30334')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_Hour010203040506070809101112'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_Minute0030'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_AMPMampm'), 
    'am', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_Hour010203040506070809101112_1'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_Minute0030_1'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_AMPMampm_1'), 
    'pm', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_Hour010203040506070809101112_1_2'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_Minute0030_1_2'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_AMPMampm_1_2'), 
    'am', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_Hour010203040506070809101112_1_2_3'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_Minute0030_1_2_3'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_AMPMampm_1_2_3'), 
    'pm', true)

WebUI.click(findTestObject('Page_Create Location  Digital Services Georgia/a_Copy previous day'))

WebUI.click(findTestObject('Page_Create Location  Digital Services Georgia/a_Copy previous day - 2'))

WebUI.click(findTestObject('Page_Create Location  Digital Services Georgia/a_Copy previous day - 3'))

WebUI.setText(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/input_URL_field_related_links0uri'), 
    'a')

WebUI.click(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/span_2 Determine your main menu structure'))

WebUI.click(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/Location_Page_Additional_Information_WYSIWYG'))

WebUI.setText(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/Location_Page_Additional_Information_Body'), 
    'QA test additional information field content here')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_DraftPublishedArchived'), 
    'published', true)

WebUI.click(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/Location_Save_Button'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA Test location with automation  Digital Services Georgia/QATestPage_Breadcrumb'), 
    'Atlanta')

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA Test location with automation  Digital Services Georgia/QATestPage_PageTitle'), 
    'Atlanta', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA Test location with automation  Digital Services Georgia/QATestPage_StreetAddress'), 
    '47 Trinity Ave SW', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA Test location with automation  Digital Services Georgia/QATestPage_City'), 
    'Atlanta', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA Test location with automation  Digital Services Georgia/QATestPage_Country'), 
    'United States', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA Test location with automation  Digital Services Georgia/QATestPage_State'), 
    'GA', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA Test location with automation  Digital Services Georgia/QATestPage_ZipCode'), 
    '30334', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA Test location with automation  Digital Services Georgia/QATestPage_AdditionalInformation'), 
    'QA test additional information field content here', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Sunday - Thursday:  ', false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('05:00 am - 05:00 pm', false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Friday - Saturday:  ', false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA Test location with automation  Digital Services Georgia/QATestPage_Hours2Times'), 
    'Closed', FailureHandling.CONTINUE_ON_FAILURE)

