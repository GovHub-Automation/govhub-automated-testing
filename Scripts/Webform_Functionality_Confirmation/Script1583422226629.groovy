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

not_run: WebUI.navigateToUrl('https://test.prod.dsga.codes/user/11206')

WebUI.navigateToUrl(('https://' + GlobalVariable.url) + '/admin/structure/webform')

WebUI.click(findTestObject('Object Repository/Page_Webforms  Digital Services Georgia/a_Add webform'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_Webforms  Digital Services Georgia/input_Title_title'), 'QA test webform with automation 2961')

String timestamp = System.nanoTime()

String titleTimesamp = 'Webform automation ' + timestamp

WebUI.setText(findTestObject('Page_Webforms  Digital Services Georgia/input_Title_title'), titleTimesamp)

WebUI.setText(findTestObject('Object Repository/Page_Webforms  Digital Services Georgia/AddWebform_AdminDescription_WYSIWYG'), 
    'QA test administrative description for webform with automation 2961')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Webforms  Digital Services Georgia/AddWebform_CategoryDropdown'), 
    'Basic Interest Form', true)

WebUI.click(findTestObject('Object Repository/Page_Webforms  Digital Services Georgia/button_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/a_Add element'))

WebUI.click(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/a_Checkbox'))

WebUI.setText(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/input_Title_propertiestitle'), 
    'QA checkbox 1')

WebUI.click(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/summary_Element descriptionhelpmore'))

WebUI.setText(findTestObject('Object Repository/Page_QA test webform with automation 2961  Digital Services Georgia/AddCheckBox_ElementDescription_WYSIWYG'), 
    'QA test description for checkbox 1')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/input_Permissions_op'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/a_Add element'))

WebUI.click(findTestObject('Object Repository/Page_QA test webform with automation 2961  Digital Services Georgia/AddElement_TextArea_Button'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/input_Title_propertiestitle'), 
    'QA test text area title')

WebUI.setText(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/input_Limit_propertiesmultiplecontainercard_047c43'), 
    '3')

WebUI.click(findTestObject('Object Repository/Page_QA test webform with automation 2961  Digital Services Georgia/Webform_AddTextArea_FormValidation_Accordion'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/select_- None -CharactersWords'), 
    'character', true)

WebUI.setText(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/input_Counter minimum_propertiescounter_minimum'), 
    '5')

WebUI.setText(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/input_Counter maximum_propertiescounter_maximum'), 
    '200')

WebUI.setText(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/input_Counter maximum message_propertiescou_6af641'), 
    'Total characters allowed for this field is 200')

WebUI.click(findTestObject('Object Repository/Page_QA test webform with automation 2961  Digital Services Georgia/Webform_AddTextArea_Save_Button'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/a_Add element'))

WebUI.click(findTestObject('Object Repository/Page_QA test webform with automation 2961  Digital Services Georgia/Webform_AddEmail_Link'))

WebUI.setText(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/input_Title_propertiestitle'), 
    'Email Address')

WebUI.click(findTestObject('Object Repository/Page_QA test webform with automation 2961  Digital Services Georgia/Webform_AddTextArea_FormValidation_Required_Checkbox'))

WebUI.setText(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/input_Required message_propertiesrequired_error'), 
    'Email field is required')

WebUI.click(findTestObject('Object Repository/Page_QA test webform with automation 2961  Digital Services Georgia/Webform_AddEmail_Save_Button'))

WebUI.click(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/a_Add element'))

WebUI.click(findTestObject('Object Repository/Page_QA test webform with automation 2961  Digital Services Georgia/Webform_AddBasicAddress_Button'))

WebUI.setText(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/input_Title_propertiestitle'), 
    'QA test basic address title')

WebUI.click(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/input_A tooltip displayed after the title_p_aad3ea'))

WebUI.click(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/input_A tooltip displayed after the title_p_7af137'))

WebUI.click(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/input_Replace select element with jQuery Se_ae671f'))

WebUI.click(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/input_Permissions_op_1'))

WebUI.delay(3)

WebUI.dragAndDropToObject(findTestObject('Object Repository/Page_QA test webform with automation 2961  Digital Services Georgia/Webform_Draggable_Item'), 
    findTestObject('Object Repository/Page_QA test webform with automation 2961  Digital Services Georgia/Webform_DropZoneItem'))

WebUI.click(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/input_Customize_op'))

WebUI.click(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/a_Settings'))

WebUI.click(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/a_Emails  Handlers'))

WebUI.click(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/a_Add email'))

WebUI.setText(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/input_Title_label'), 
    'Anonymous user email handler')

WebUI.click(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/select_- Select -Custom To email addresssit_8111fd'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/select_- Select -Custom To email addresssit_8111fd_1'), 
    '[webform_submission:values:email_address:raw]', false)

WebUI.click(findTestObject('Object Repository/Page_QA test webform with automation 2961  Digital Services Georgia/Webform_AddEmailHandler_Save_Button'))

WebUI.click(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/a_Add email'))

WebUI.setText(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/input_Title_label_1'), 
    'Agency User Email Handler')

WebUI.click(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/select_- Select -Custom To email addresssit_8111fd'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/select_- Select -Custom To email addresssit_8111fd_1'), 
    '_other_', true)

WebUI.setText(findTestObject('Object Repository/Page_QA test webform with automation 2961  _111c21/input_To email_settingsto_mailother'), 
    'andrew.messenger@mediacurrent.com')

WebUI.click(findTestObject('Object Repository/Page_QA test webform with automation 2961  Digital Services Georgia/Webform_AddEmailHandler_Save_Button'))

WebUI.mouseOver(findTestObject('Page_jasmyneepps  Digital Services Georgia/Content Library'))

WebUI.click(findTestObject('Page_Content  Digital Services Georgia/Add content'))

WebUI.click(findTestObject('Object Repository/Page_Add content  Digital Services Georgia/a_WebformA basic page with a webform attached'))

WebUI.setText(findTestObject('Object Repository/Page_Create Webform  Digital Services Georgia/input_Title_title0value'), 
    'QA test webform with automation 2961')

WebUI.setText(findTestObject('Object Repository/Page_Create Webform  Digital Services Georgia/input_Short Title_field_short_title0value'), 
    'QA test short title for 2961 webform')

WebUI.setText(findTestObject('Object Repository/Page_Create Webform  Digital Services Georgia/WebformNode_Body_WYSIWYG'), 
    'QA test body content for body field on webform.')

WebUI.click(findTestObject('Object Repository/Page_Create Webform  Digital Services Georgia/WebformNode_Webform_Dropdown'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Webform  Digital Services Georgia/select_- Select -ApplyContact UsContent Man_a2accc'), 
    'qa_test_webform_with_automation_', true)

WebUI.click(findTestObject('Object Repository/Page_Edit Webform QA test webform with auto_cd491e/input_Briefly describe the changes you have_2faeff'))

WebUI.click(findTestObject('Object Repository/Page_Create Webform  Digital Services Georgia/input_Published_op'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA test short title for 2961 webform  Digital Services Georgia/Webform_Test_Node_PageTitle'), 
    'QA test webform with automation 2961')

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA test short title for 2961 webform  Digital Services Georgia/Webform_Test_Node_BodyContent'), 
    'QA test body content for body field on webform.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA test short title for 2961 webform  Digital Services Georgia/Webform_Test_Node_Address_Label'), 
    'Address (required)')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_QA test short title for 2961 webform  Digital Services Georgia/Webform_Test_Node_Address_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA test short title for 2961 webform  Digital Services Georgia/Webform_Test_Node_Address2_Label'), 
    'Address 2')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_QA test short title for 2961 webform  Digital Services Georgia/Webform_Test_Node_Address2_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA test short title for 2961 webform  Digital Services Georgia/Webform_Test_Node_City_Label'), 
    'City/Town (required)')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_QA test short title for 2961 webform  Digital Services Georgia/Webform_Test_Node_City_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA test short title for 2961 webform  Digital Services Georgia/Webform_Test_Node_State_Label'), 
    'State/Province')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_QA test short title for 2961 webform  Digital Services Georgia/Webform_Test_Node_State_DropdownField'), 
    30)

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA test short title for 2961 webform  Digital Services Georgia/Webform_Test_Node_ZipCode_Label'), 
    'ZIP/Postal Code')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_QA test short title for 2961 webform  Digital Services Georgia/Webform_Test_Node_ZipCode_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA test short title for 2961 webform  Digital Services Georgia/Webform_Test_Node_Country_Label'), 
    'Country')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_QA test short title for 2961 webform  Digital Services Georgia/Webform_Test_Node_Country_DropdownField'), 
    30)

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA test short title for 2961 webform  Digital Services Georgia/Webform_Test_Node_Checkbox'), 
    'QA checkbox 1')

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA test short title for 2961 webform  Digital Services Georgia/Webform_Test_Node_CheckBox_Description'), 
    'QA test description for checkbox 1')

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA test short title for 2961 webform  Digital Services Georgia/Webform_Test_Node_TextArea_Label'), 
    'QA test text area title')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_QA test short title for 2961 webform  Digital Services Georgia/Webform_Test_Node_TextArea_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA test short title for 2961 webform  Digital Services Georgia/Webform_Test_Node_Email_Label'), 
    'Email Address (required)')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_QA test short title for 2961 webform  Digital Services Georgia/Webform_Test_Node_Email_Field'), 
    30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_QA test short title for 2961 webform  Digital Services Georgia/Webform_Test_Node_Submit_Button'), 
    30)

