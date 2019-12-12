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

WebUI.callTestCase(findTestCase('Authenticate Prod'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Log In as Editor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_jasmyneepps  Digital Services Georgia/a_Content'))

WebUI.click(findTestObject('Object Repository/Page_Content  Digital Services Georgia/a_Add content'))

WebUI.click(findTestObject('Object Repository/Page_Add content  Digital Services Georgia/a_LocationPhysical locations where the publ_47b9b9'))

WebUI.setText(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/input_Name_title0value'), 
    'QA Test location with Automation')

WebUI.click(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/Location_Page_WYSIWYG'))

WebUI.setText(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/Location_Page_Notes'), 'QA test location notes')

WebUI.setText(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/input_Street address_field_address0addressa_9a88f2'), 
    '1234 Test Ave')

WebUI.setText(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/input_City_field_address0addresslocality'), 
    'Gainesville')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_- Select -AlabamaAlaskaAmerican Samo_c424a6'), 
    'FL', true)

WebUI.setText(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/input_Zip code_field_address0addresspostal_code'), 
    '32607')

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

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_Hour010203040506070809101112_1_2_3_4'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_Minute0030_1_2_3_4'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_AMPMampm_1_2_3_4'), 
    'pm', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_Hour010203040506070809101112_1_2_3_4_5'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_Minute0030_1_2_3_4_5'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_AMPMampm_1_2_3_4_5'), 
    'pm', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_Hour010203040506070809101112_1_2_3_4_5_6'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_Minute0030_1_2_3_4_5_6'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_AMPMampm_1_2_3_4_5_6'), 
    'am', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_Hour010203040506070809101112_1_2_3_4_5_6_7'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_Minute0030_1_2_3_4_5_6_7'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_AMPMampm_1_2_3_4_5_6_7'), 
    'pm', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_Hour010203040506070809101112_1_2_3_4_5_6_7_8'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_Minute0030_1_2_3_4_5_6_7_8'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_AMPMampm_1_2_3_4_5_6_7_8'), 
    'am', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_Hour010203040506070809101112_1_2_3_4_5_6_7_8_9'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_Minute0030_1_2_3_4_5_6_7_8_9'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_AMPMampm_1_2_3_4_5_6_7_8_9'), 
    'pm', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_Hour010203040506070809101112_1_2_3_4_5_6_7_8_9_10'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_Minute0030_1_2_3_4_5_6_7_8_9_10'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_AMPMampm_1_2_3_4_5_6_7_8_9_10'), 
    'am', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_Hour010203040506070809101112_1_2_3_4_5_6_7_8_9_10_11'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_Minute0030_1_2_3_4_5_6_7_8_9_10_11'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_AMPMampm_1_2_3_4_5_6_7_8_9_10_11'), 
    'pm', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_Hour010203040506070809101112_1_2_3_4_5_6_7_8_9_10_11_12'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_Minute0030_1_2_3_4_5_6_7_8_9_10_11_12'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_AMPMampm_1_2_3_4_5_6_7_8_9_10_11_12'), 
    'am', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_Hour010203040506070809101112_1_2_3_4_5_6_7_8_9_10_11_12_13'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_Minute0030_1_2_3_4_5_6_7_8_9_10_11_12_13'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_AMPMampm_1_2_3_4_5_6_7_8_9_10_11_12_13'), 
    'pm', true)

WebUI.setText(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/input_URL_field_related_links0uri'), 
    'a')

WebUI.click(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/span_2 Determine your main menu structure'))

WebUI.setText(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/input_URL_field_related_links0uri'), 
    '/node/98')

WebUI.click(findTestObject('Page_Create Location  Digital Services Georgia/Location_Page_Additional_Information_WYSIWYG'))

WebUI.setText(findTestObject('Page_Create Location  Digital Services Georgia/Location_Page_Additional_Information_Body'), 
    'QA test additional information field content here')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/select_DraftPublishedArchived'), 
    'published', true)

WebUI.click(findTestObject('Object Repository/Page_Create Location  Digital Services Georgia/Location_Save_Button'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA Test location with automation  Digital Services Georgia/Location_Page_Breadcrumb'), 
    'QA Test location with Automation')

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA Test location with automation  Digital Services Georgia/Location_Page_Title'), 
    'QA Test location with Automation')

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA Test location with automation  Digital Services Georgia/Location_Page_Street_Address'), 
    '1234 Test Ave')

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA Test location with automation  Digital Services Georgia/Location_Page_City'), 
    'Gainesville')

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA Test location with automation  Digital Services Georgia/Location_Page_Country'), 
    'United States')

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA Test location with automation  Digital Services Georgia/Location_Page_State'), 
    'FL')

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA Test location with automation  Digital Services Georgia/Location_Page_ZipCode'), 
    '32607')

WebUI.verifyElementText(findTestObject('Page_QA Test location with automation  Digital Services Georgia/Location_Page_Additional_Information_Front_End'), 
    'QA test additional information field content here')

