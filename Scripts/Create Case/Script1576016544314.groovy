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

WebUI.click(findTestObject('Page_jasmyneepps  Digital Services Georgia/a_Content'))

WebUI.click(findTestObject('Page_Content  Digital Services Georgia/a_Add content'))

WebUI.click(findTestObject('Page_Add content  Digital Services Georgia/a_Case'))

WebUI.setText(findTestObject('Object Repository/Page_Create Case  Digital Services Georgia/input_NIC Number_field_case_nic_number0value'), 
    '7654321')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Case  Digital Services Georgia/select_- None -Unsolved HomicideUnidentifie_398f17'), 
    'unsolved', true)

WebUI.setText(findTestObject('Page_Create Case  Digital Services Georgia/CaseNode_DateField'), '07202019')

WebUI.setText(findTestObject('Object Repository/Page_Create Case  Digital Services Georgia/input_Title Text_field_title_text0value'), 
    'QA test case with automation')

WebUI.setText(findTestObject('Object Repository/Page_Create Case  Digital Services Georgia/input_Location_field_case_location0value'), 
    'QA Test location for case')

WebUI.setText(findTestObject('Object Repository/Page_Create Case  Digital Services Georgia/input_Contact Info_field_case_contact_info0value'), 
    'QA test contact info')

WebUI.setText(findTestObject('Object Repository/Page_Create Case  Digital Services Georgia/input_Crimes_field_crimes0value'), 
    'QA test crimes')

WebUI.click(findTestObject('Object Repository/Page_Create Case  Digital Services Georgia/p'))

WebUI.setText(findTestObject('Page_Create Case  Digital Services Georgia/body_QA test narrative text content here_1'), 'QA test narrative text content here.')

WebUI.setText(findTestObject('Object Repository/Page_Create Case  Digital Services Georgia/input_Name_field_case_name0value'), 
    'Test McTesterson')

WebUI.setText(findTestObject('Object Repository/Page_Create Case  Digital Services Georgia/input_Race_field_case_race0value'), 
    'QA Test Race')

WebUI.setText(findTestObject('Object Repository/Page_Create Case  Digital Services Georgia/input_Weight_field_case_weight0value'), 
    '185')

WebUI.setText(findTestObject('Object Repository/Page_Create Case  Digital Services Georgia/input_Height_field_case_height0value'), 
    '5\' 10"')

WebUI.setText(findTestObject('Object Repository/Page_Create Case  Digital Services Georgia/input_Sex_field_case_sex0value'), 
    'Male')

WebUI.setText(findTestObject('Object Repository/Page_Create Case  Digital Services Georgia/input_Age_field_case_age0value'), 
    '25')

WebUI.setText(findTestObject('Object Repository/Page_Create Case  Digital Services Georgia/input_Hair Color_field_case_hair_color0value'), 
    'Black')

WebUI.setText(findTestObject('Object Repository/Page_Create Case  Digital Services Georgia/input_Eyes_field_case_eyes0value'), 
    'Brown')

WebUI.setText(findTestObject('Object Repository/Page_Create Case  Digital Services Georgia/input_Birth Range_field_case_birth_range0value'), 
    '1970-1980')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Case  Digital Services Georgia/select_DraftPublishedArchived'), 
    'published', true)

WebUI.click(findTestObject('Object Repository/Page_Create Case  Digital Services Georgia/input_Save as_op'))

WebUI.verifyElementText(findTestObject('Page_Unsolved Homicide QA test case with automation  Digital Services Georgia/CaseNode_Breadcrumb'), 
    'Unsolved Homicide: QA test case with automation', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Unsolved Homicide QA test case with automation  Digital Services Georgia/CaseNode_PageTitle'), 
    'Unsolved Homicide: QA test case with automation', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Unsolved Homicide QA test case with automation  Digital Services Georgia/CaseNode_Name'), 
    'Test McTesterson', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Unsolved Homicide QA test case with automation  Digital Services Georgia/CaseNode_IncidentDate'), 
    'Sat, 07/20/2019 - 12:00', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Unsolved Homicide QA test case with automation  Digital Services Georgia/CaseNode_Race'), 
    'QA Test Race', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Unsolved Homicide QA test case with automation  Digital Services Georgia/CaseNode_Location'), 
    'QA Test location for case', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Unsolved Homicide QA test case with automation  Digital Services Georgia/CaseNode_Weight'), 
    '185', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Unsolved Homicide QA test case with automation  Digital Services Georgia/CaseNode_Height'), 
    '5\' 10"', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Unsolved Homicide QA test case with automation  Digital Services Georgia/CaseNode_EyeColor'), 
    'Brown', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Unsolved Homicide QA test case with automation  Digital Services Georgia/CaseNode_HairColor'), 
    'Black', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Unsolved Homicide QA test case with automation  Digital Services Georgia/CaseNode_Sex'), 
    'Male', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Unsolved Homicide QA test case with automation  Digital Services Georgia/CaseNode_Age'), 
    '25', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Unsolved Homicide QA test case with automation  Digital Services Georgia/CaseNode_BirthRange'), 
    '1970-1980', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Unsolved Homicide QA test case with automation  Digital Services Georgia/CaseNode_ContactInfo'), 
    'QA test contact info', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Unsolved Homicide QA test case with automation  Digital Services Georgia/CaseNode_Narrative'), 
    'QA test narrative text content here.', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Unsolved Homicide QA test case with automation  Digital Services Georgia/CaseNode_Crimes'), 
    'QA test crimes', FailureHandling.CONTINUE_ON_FAILURE)

