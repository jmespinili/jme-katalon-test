import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://haides.adslot.com')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_Login to Symphony/input_ctl00ContentLoginUserNam'), 'lorenzo.gonzales+autoVNAgency@adslot.com')

WebUI.setText(findTestObject('Page_Login to Symphony/input_ctl00ContentLoginPasswor'), 'Es2cyfL!')

WebUI.click(findTestObject('Page_Login to Symphony/button_Login'))

WebUI.waitForPageLoad(30)

WebUI.waitForElementVisible(findTestObject('Page_Overview/LblUserInitial'), 30)

WebUI.mouseOver(findTestObject('Page_Overview/LblUserInitial'))

WebUI.click(findTestObject('Page_Overview/a_Logout'))

WebUI.waitForPageLoad(30)

WebUI.closeBrowser()

