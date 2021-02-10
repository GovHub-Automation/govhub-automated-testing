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

WebUI.click(findTestObject('Object Repository/Manage_Main Menu/a_Structure'))

WebUI.click(findTestObject('Page_Structure  Digital Services Georgia/Structure Page - Menus Link'))

WebUI.click(findTestObject('Object Repository/Manage_Main Menu/a_Edit menu button'))

WebUI.click(findTestObject('Object Repository/Manage_Main Menu/a_Edit child items of Parent'))

WebUI.click(findTestObject('Object Repository/Page_Edit menu Main navigation  Digital Ser_4cefd0/button_Show row weights'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Edit menu Main navigation  Digital Ser_4cefd0/select_-50-49-48-47-46-45-44-43-42-41-40-39_f61565'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Edit menu Main navigation  Digital Ser_4cefd0/select_-50-49-48-47-46-45-44-43-42-41-40-39_f61565_1'), 
    '0', true)

not_run: WebUI.click(findTestObject('Object Repository/Manage_Main Menu/input_Save Children'))

WebUI.click(findTestObject('Object Repository/Page_Edit menu Main navigation  Digital Ser_4cefd0/input_Delete_op'))

not_run: WebUI.verifyTextPresent('', false)

