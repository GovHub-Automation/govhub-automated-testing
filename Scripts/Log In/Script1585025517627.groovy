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

if (WebUI.waitForElementVisible(findTestObject('Page_Log in to Georgia GovHub/input_username_username'), 1, FailureHandling.OPTIONAL)) {
    WebUI.setText(findTestObject('Page_Log in to Georgia GovHub/input_username_username'), 'Jasmyne.Epps@gta.ga.gov')

    WebUI.setEncryptedText(findTestObject('Page_Log in to Georgia GovHub/input_password_password'), '8/wq35ywakOjq/v8OqsNaA==')

    WebUI.click(findTestObject('Page_Log in to Georgia GovHub/button_Continue'))
} else {
    WebUI.setText(findTestObject('Page_Log in  Digital Services Georgia/input_(required)_name'), GlobalVariable.username)

    WebUI.setEncryptedText(findTestObject('Page_Log in  Digital Services Georgia/input_(required)_pass'), '8SQVv/p9jVScEs4/2CZsLw==')

    WebUI.click(findTestObject('Object Repository/Page_Log in  Digital Services Georgia/input_Enter the password that accompanies your username_op'))
}

