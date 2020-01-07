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

WebUI.callTestCase(findTestCase('Embed Start'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Embed/Embed Image/Page_Create Topic Page  Digital Services Georgia/span_Embed media_cke_button_arrow'))

WebUI.click(findTestObject('Page_Embed/Embed Image/Page_Create Topic Page  Digital Services Georgia/span_Image media'))

WebUI.click(findTestObject('Page_Embed/Embed Image/Page_Create Topic Page  Digital Services Georgia/div_Open_Select this item'))

WebUI.click(findTestObject('Page_Embed/Embed Image/Page_Create Topic Page  Digital Services Georgia/Select_button'))

WebUI.click(findTestObject('Page_Embed/Embed Image/Page_Create Topic Page  Digital Services Georgia/button_Embed'))

WebUI.callTestCase(findTestCase('Embed End'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Embed/Embed Image/Page_Embed Automation  Digital Services Georgia/article_embedded_image'), 
    0)

