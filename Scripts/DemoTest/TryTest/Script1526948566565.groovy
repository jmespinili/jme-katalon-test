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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Application/OpenSymphony'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Application/Login'), [('username') : 'jeffrey.espinili+belgiumTestAuto@adslot.com', ('password') : '1Luv@dslo+'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Create Campaign/Page_Overview/a_Create Campaign'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.waitForElementVisible(findTestObject('Create Campaign/Page_New Create Campaign/CreateCampaignIframe'), 0)

WebUI.delay(1)

WebUI.switchToFrame(findTestObject('Create Campaign/Page_New Create Campaign/CreateCampaignIframe'), 30)

WebUI.waitForElementVisible(findTestObject('Create Campaign/Page_New Create Campaign/DetailsTab/DdlAgencyContact'), 30)

String ts = System.currentTimeMillis().toString()

WebUI.setText(findTestObject('Create Campaign/Page_New Create Campaign/DetailsTab/TxtCampaignName'), campaignName + " " + ts)

CustomKeywords.'react.reactSelect.selectValueNcm'(findTestObject('Create Campaign/Page_New Create Campaign/DetailsTab/DdlAgencyContact'), 
    'Auto BG Test')

CustomKeywords.'react.reactSelect.selectValueNcm'(findTestObject('Create Campaign/Page_New Create Campaign/DetailsTab/DdlClient'), 
    'GM_Belgium')

CustomKeywords.'react.reactSelect.selectValueNcm'(findTestObject('Create Campaign/Page_New Create Campaign/DetailsTab/DdlProduct'), 
    'Generic')

CustomKeywords.'react.reactSelect.selectValueNcm'(findTestObject('Create Campaign/Page_New Create Campaign/DetailsTab/Ddl3rdPartyAdServer'), 
    'DCM')

WebUI.click(findTestObject('Create Campaign/Page_New Create Campaign/BtnSave'))

WebUI.callTestCase(findTestCase('Application/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

