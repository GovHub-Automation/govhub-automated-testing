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

WebUI.callTestCase(findTestCase('Single Run Cases/Create Listing Block'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Embed Start No Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Create Listing Block/Page_Create Topic Page  Digital Services Georgia/a_Embed micro-content'))

WebUI.click(findTestObject('Create Listing Block/Page_Create Topic Page  Digital Services Georgia/span_Link Collection_cke_button_icon cke_button__listing_block_icon'))

WebUI.switchToFrame(findTestObject('Object Repository/Page_Embed/Embed ListingBlock/Page_Create Topic Page  Digital Services Georgia/iframe_Add Listing Block_entity_browser_iframe_listing_block_browser_entity_embed'), 
    5)

WebUI.delay(2)

WebUI.click(findTestObject('Create Listing Block/Page_Create Topic Page  Digital Services Georgia/a_Listing Block Library'))

WebUI.click(findTestObject('Create Listing Block/Page_Create Topic Page  Digital Services Georgia/input_Select this item_entity_browser_selectnode19056'))

WebUI.click(findTestObject('Create Listing Block/Page_Create Topic Page  Digital Services Georgia/entity_select_button'))

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Object Repository/Page_Embed/Embed LinkCollection/Page_Create Topic Page  Digital Services Georgia/button_Embed'))

WebUI.callTestCase(findTestCase('Single Run Cases/Embed End'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Embed/Embed ListingBlock/Page_Embed Automation  Digital Services Georgia/div_From Automation'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Embed/Embed ListingBlock/Page_Embed Automation  Digital Services Georgia/h2_From Automation'), 
    'From Automation', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Embed/Embed ListingBlock/Page_Embed Automation  Digital Services Georgia/a_Link 1'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

