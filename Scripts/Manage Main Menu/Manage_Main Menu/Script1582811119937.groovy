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

WebUI.comment('Create Main Menu - Parent')

WebUI.callTestCase(findTestCase('Manage Main Menu/Create Main Menu - Parent'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Create Main Menu - Child 1 & Child 2')

WebUI.callTestCase(findTestCase('Manage Main Menu/Create Main Menu - Children'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Reorder Child Menus')

WebUI.callTestCase(findTestCase('Manage Main Menu/Reorder Child Menus'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Change Menu Item Destination')

WebUI.callTestCase(findTestCase('Manage Main Menu/Change Menu Item Destination'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Change Enabled Status')

WebUI.callTestCase(findTestCase('Manage Main Menu/Change Enabled Status'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Delete Child and Parent Menus')

WebUI.callTestCase(findTestCase('Manage Main Menu/Delete Child and Parent Menus'), [:], FailureHandling.STOP_ON_FAILURE)

