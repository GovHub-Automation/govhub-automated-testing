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

WebUI.callTestCase(findTestCase('Authenticate Testing Site'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Log In as Editor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://test.prod.dsga.codes/book-page/3-what-can-i-do-maximize-responsive-web-design-experience')

String url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://test.prod.dsga.codes/book-page/3-maximizing-your-experience', true)

WebUI.navigateToUrl('https://test.prod.dsga.codes/book-page/3-mobile-analytics')

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://test.prod.dsga.codes/web-guide/how-read-your-google-analytics/3-mobile-analytics', true)

WebUI.navigateToUrl('https://test.prod.dsga.codes/book-page/1-introduction')

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://test.prod.dsga.codes/web-guide/how-read-your-google-analytics/1-google-analytics', true)

WebUI.navigateToUrl('https://test.prod.dsga.codes/standards/25-analytics-guidelines')

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://test.prod.dsga.codes/web-standards/25-analytics-guidelines', true)

WebUI.navigateToUrl('https://test.prod.dsga.codes/blog/2017-09-22/putting-our-best-face-forward-business-case-content-strategy')

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://test.prod.dsga.codes/blog-post/2017-06-20/putting-our-best-face-forward-business-case-content-strategy', 
    true)

WebUI.navigateToUrl('https://test.prod.dsga.codes/node/94')

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://test.prod.dsga.codes/1-almost-blank-canvas',
	true)

WebUI.navigateToUrl('https://test.prod.dsga.codes/node/766')

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://test.prod.dsga.codes/1-creating-document-structure',
	true)

WebUI.navigateToUrl('https://test.prod.dsga.codes/node/100')

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://test.prod.dsga.codes/4-pick-theme',
	true)

WebUI.navigateToUrl('https://test.prod.dsga.codes/node/3241')

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://test.prod.dsga.codes/blog-post/2017-12-21/govtalks-future-your-digital-information',
	true)

WebUI.navigateToUrl('https://test.prod.dsga.codes/node/112')

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://test.prod.dsga.codes/book-page/3-maximizing-your-experience',
	true)


