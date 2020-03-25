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

not_run: WebUI.callTestCase(findTestCase('Log Me In'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Manage_Main Menu/a_Structure'))

WebUI.click(findTestObject('Object Repository/Manage_Main Menu/a_Menus'))

WebUI.click(findTestObject('Object Repository/Manage_Main Menu/Edit menu_MainNav'))

WebUI.click(findTestObject('Object Repository/Manage_Main Menu/a_Edit menu'))

WebUI.click(findTestObject('Object Repository/Manage_Main Menu/a_Add link'))

WebUI.click(findTestObject('Object Repository/Manage_Main Menu/input_Title'))

WebUI.setText(findTestObject('Object Repository/Manage_Main Menu/input_Title'), 'MCQA Test Menu Child 1')

WebUI.click(findTestObject('Object Repository/Manage_Main Menu/input_Link'))

WebUI.setText(findTestObject('Object Repository/Manage_Main Menu/input_Link'), 'http://www.mediacurrent.com')

WebUI.click(findTestObject('Object Repository/Manage_Main Menu/input_Description'))

WebUI.setText(findTestObject('Object Repository/Manage_Main Menu/input_Description'), 'Test Menu Child 1')

WebUI.click(findTestObject('Object Repository/Manage_Main Menu/select_Parent'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Manage_Main Menu/select_Parent Link'), '-- MCQA Test Menu Parent 1', 
    true)

WebUI.click(findTestObject('Object Repository/Manage_Main Menu/input_Weight'))

WebUI.setText(findTestObject('Object Repository/Manage_Main Menu/input_Weight'), '5')

WebUI.click(findTestObject('Object Repository/Manage_Main Menu/input_Save'))

WebUI.click(findTestObject('Object Repository/Manage_Main Menu/a_Structure'))

WebUI.click(findTestObject('Object Repository/Manage_Main Menu/a_Menus'))

WebUI.click(findTestObject('Object Repository/Manage_Main Menu/Edit menu_MainNav'))

WebUI.click(findTestObject('Object Repository/Manage_Main Menu/a_Edit menu'))

WebUI.click(findTestObject('Object Repository/Manage_Main Menu/a_Add link'))

WebUI.click(findTestObject('Object Repository/Manage_Main Menu/input_Title'))

WebUI.setText(findTestObject('Object Repository/Manage_Main Menu/input_Title'), 'MCQA Test Menu Child 2')

WebUI.click(findTestObject('Object Repository/Manage_Main Menu/input_Link'))

WebUI.setText(findTestObject('Object Repository/Manage_Main Menu/input_Link'), 'http://www.mediacurrent.com')

WebUI.click(findTestObject('Object Repository/Manage_Main Menu/input_Description'))

WebUI.setText(findTestObject('Object Repository/Manage_Main Menu/input_Description'), 'Test Menu Child 2')

WebUI.click(findTestObject('Object Repository/Manage_Main Menu/select_Parent'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Manage_Main Menu/select_Parent Link'), '-- MCQA Test Menu Parent 1', 
    true)

WebUI.click(findTestObject('Object Repository/Manage_Main Menu/input_Weight'))

WebUI.setText(findTestObject('Object Repository/Manage_Main Menu/input_Weight'), '3')

WebUI.click(findTestObject('Object Repository/Manage_Main Menu/input_Save'))

