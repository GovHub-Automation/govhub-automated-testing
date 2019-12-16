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

WebUI.click(findTestObject('Object Repository/Page_Add content  Digital Services Georgia/a_Official Record'))

WebUI.setText(findTestObject('Object Repository/Page_Create Official Record  Digital Servic_140a29/input_Title_title0value'), 
    'QA test official record with automation')

WebUI.setText(findTestObject('Object Repository/Page_Create Official Record  Digital Servic_140a29/input_Short Title_field_short_title0value'), 
    'QAOfficialRecordShortTitle')

WebUI.setText(findTestObject('Object Repository/Page_Create Official Record  Digital Servic_140a29/input_Subtitle_field_subtitle0value'), 
    'QATestSubTitle')

WebUI.click(findTestObject('Object Repository/Page_Create Official Record  Digital Servic_140a29/input_Header_field_header_entity_browser_en_5b06e2'))

WebUI.click(findTestObject('Object Repository/Page_Create Official Record  Digital Servic_140a29/input_Select this item_entity_browser_selectmedia4566'))

WebUI.click(findTestObject('Object Repository/Page_Create Official Record  Digital Servic_140a29/input_Published_op'))

WebUI.click(findTestObject('Object Repository/Page_Create Official Record  Digital Services Georgia/OfficialRecord_Node_Summary_iFrame'))

WebUI.setText(findTestObject('Object Repository/Page_Create Official Record  Digital Services Georgia/OfficialRecord_Node_Summary_HTML'), 
    'QA test summary field content here')

WebUI.click(findTestObject('Object Repository/Page_Create Official Record  Digital Services Georgia/OfficialRecord_Node_Summary_iFrame (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Create Official Record  Digital Services Georgia/OfficialRecord_Node_Body_HTML'), 
    'QA test body field content here')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Official Record  Digital Servic_140a29/select_- Select a value -LegislationRule'), 
    'legislation', true)

WebUI.click(findTestObject('Object Repository/Page_Create Official Record  Digital Servic_140a29/input_Author_field_author_entity_browser_en_428c7f'))

WebUI.click(findTestObject('Object Repository/Page_Create Official Record  Digital Servic_140a29/input_Select this item_entity_browser_selectnode17951'))

WebUI.click(findTestObject('Object Repository/Page_Create Official Record  Digital Servic_140a29/input_Next page_op'))

WebUI.setText(findTestObject('Object Repository/Page_Create Official Record  Digital Servic_140a29/input_URL_field_external_links0uri'), 
    'http://www.google.com')

WebUI.setText(findTestObject('Object Repository/Page_Create Official Record  Digital Servic_140a29/input_Link text_field_external_links0title'), 
    'Read More')

WebUI.setText(findTestObject('Object Repository/Page_Create Official Record  Digital Services Georgia/OfficialRecord_Node_Release_Date'), 
    '12202019')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Official Record  Digital Servic_140a29/select_DraftPublishedArchived'), 
    'published', true)

WebUI.click(findTestObject('Object Repository/Page_Create Official Record  Digital Services Georgia/OfficialRecord_Node_Save_Button'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_QAOfficialRecordShortTitle  Digital Services Georgia/OfficialRecord_Page_Title'), 
    'QA test official record with automation')

WebUI.verifyElementText(findTestObject('Object Repository/Page_QAOfficialRecordShortTitle  Digital Services Georgia/OfficialRecord_Page_Body'), 
    'QA test body field content here')

WebUI.verifyElementText(findTestObject('Object Repository/Page_QAOfficialRecordShortTitle  Digital Services Georgia/OfficialRecord_Page_ShortTitle'), 
    'Short Title\nQAOfficialRecordShortTitle')

WebUI.verifyElementText(findTestObject('Object Repository/Page_QAOfficialRecordShortTitle  Digital Services Georgia/OfficialRecord_Page_Subtitle'), 
    'Subtitle\nQATestSubTitle')

WebUI.verifyElementText(findTestObject('Object Repository/Page_QAOfficialRecordShortTitle  Digital Services Georgia/OfficialRecord_Page_RecordType'), 
    'Record Type\nLegislation')

WebUI.verifyElementText(findTestObject('Object Repository/Page_QAOfficialRecordShortTitle  Digital Services Georgia/OfficialRecord_Page_Author'), 
    'Keena Hamillton')

WebUI.verifyElementText(findTestObject('Object Repository/Page_QAOfficialRecordShortTitle  Digital Services Georgia/OfficialRecord_Page_ReleaseDate'), 
    'Fri, 12/20/2019 - 12:00')

WebUI.verifyElementText(findTestObject('Object Repository/Page_QAOfficialRecordShortTitle  Digital Services Georgia/OfficialRecord_Page_ExternalLink'), 
    'Read More')

WebUI.verifyElementText(findTestObject('Object Repository/Page_QAOfficialRecordShortTitle  Digital Services Georgia/OfficialRecord_Page_Summary'), 
    'QA test summary field content here')

WebUI.verifyElementText(findTestObject('Object Repository/Page_QAOfficialRecordShortTitle  Digital Services Georgia/OfficialRecord_Page_Header'), 
    'PAP Press Release Header')
