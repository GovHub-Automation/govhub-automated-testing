import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser(('https://gta:gta@' + GlobalVariable.url) + '/user')

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('Log In'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Page_Log in to Georgia GovHub/input_username_username'), 'Jasmyne.Epps@gta.ga.gov')

not_run: WebUI.setEncryptedText(findTestObject('Page_Log in to Georgia GovHub/input_password_password'), '8/wq35ywakOjq/v8OqsNaA==')

not_run: WebUI.click(findTestObject('Page_Log in to Georgia GovHub/button_Continue'))

