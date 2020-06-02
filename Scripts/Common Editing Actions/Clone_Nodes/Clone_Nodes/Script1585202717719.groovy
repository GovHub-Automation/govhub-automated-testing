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

WebUI.comment('Open Website and Login as Editor')

WebUI.callTestCase(findTestCase('Authenticate Testing Site'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Clone Landing Page')

WebUI.callTestCase(findTestCase('Common Editing Actions/Clone_Nodes/Clone Landing Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Clone MicroContent')

WebUI.callTestCase(findTestCase('Common Editing Actions/Clone_Nodes/Clone Micro Content'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Clone Media')

WebUI.callTestCase(findTestCase('Common Editing Actions/Clone_Nodes/Clone Media'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Clone Document')

WebUI.callTestCase(findTestCase('Common Editing Actions/Clone_Nodes/Clone Document'), [:], FailureHandling.STOP_ON_FAILURE)
