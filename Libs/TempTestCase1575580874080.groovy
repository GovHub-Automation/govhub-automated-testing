import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())


RunConfiguration.setExecutionSettingFile('/var/folders/rl/6g9_f46x5pg2csz8vywkttr80000gp/T/Katalon/20191205_162113/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.callTestCase(findTestCase(\'Authenticate Prod\'), [:], FailureHandling.STOP_ON_FAILURE)\n\nWebUI.callTestCase(findTestCase(\'Log In as Editor\'), [:], FailureHandling.STOP_ON_FAILURE)\n\nWebUI.navigateToUrl(\'https://test.prod.dsga.codes/user/11206\')\n\nWebUI.click(findTestObject(\'Object Repository/Page_jasmyneepps  Digital Services Georgia/a_Content\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_Content  Digital Services Georgia/a_Add content\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_Add content  Digital Services Georgia/span_How Do I (1)\'))\n\nWebUI.navigateToUrl(\'https://test.prod.dsga.codes/node/add/how_do_i\')\n\nWebUI.setText(findTestObject(\'Object Repository/Page_Create How Do I  Digital Services Georgia/input_How Do I_title0value (1) (1)\'), \n    \'From Automation\')\n\nWebUI.click(findTestObject(\'Object Repository/Page_Create How Do I  Digital Services Georgia/div_Task (required)        How Do I (1) (1)\'))\n\nWebUI.setText(findTestObject(\'Object Repository/Page_Create How Do I  Digital Services Georgia/input_Short Title_field_short_title0value (1) (1)\'), \n    \'From Automation\')\n\nWebUI.setText(findTestObject(\'Object Repository/Page_Create How Do I  Digital Services Georgia/html_Rich Text Editor Explanation\'), \n    \'Explain\')\n\nWebUI.click(findTestObject(\'Object Repository/Page_Create How Do I  Digital Services Georgia/input_Steps_ief-7a943e484d481fd6eb440cd6b00def49e3d75a63-add\'))\n\n', FailureHandling.STOP_ON_FAILURE, true)

