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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

not_run: WebUI.callTestCase(findTestCase('Authenticate Testing Site'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Clone MicroContent')

WebUI.click(findTestObject('Object Repository/Clone_Nodes/a_Content'))

WebUI.click(findTestObject('Page_Content  Digital Services Georgia/Expand Content Tpyes Hamburger'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Content  Digital Services Georgia/Micro-content Tab'))

WebUI.setText(findTestObject('Object Repository/Clone_Nodes/input_Title'), 'MCQA Test Quote - Cloning')

WebUI.click(findTestObject('Object Repository/Clone_Nodes/button_Filter Micro-content'))

WebUI.click(findTestObject('Page_Content  Digital Services Georgia/Operations Dropdown'))

WebUI.click(findTestObject('Page_Content  Digital Services Georgia/Clone'))

WebUI.click(findTestObject('Object Repository/Clone_Nodes/button_ConfirmClone'))

WebUI.verifyTextPresent('of type node was cloned', false)

