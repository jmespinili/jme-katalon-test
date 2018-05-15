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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://haides.adslot.com/Public/Login.aspx?ReturnUrl=%2f')

WebUI.setText(findTestObject('Create Campaign/Page_Login to Symphony/input_ctl00ContentLoginUserNam'), 'lorenzo.gonzales+autoVNAgency@adslot.com')

WebUI.setText(findTestObject('Create Campaign/Page_Login to Symphony/input_ctl00ContentLoginPasswor'), 'Es2cyfL!')

WebUI.click(findTestObject('Create Campaign/Page_Login to Symphony/button_Login'))

WebUI.click(findTestObject('Create Campaign/Page_Overview/a_Create Campaign'))

WebUI.selectOptionByValue(findTestObject('Create Campaign/Page_Create Campaign/select_Please selectJE Test Ne'), '3724', 
    true)

WebUI.selectOptionByValue(findTestObject('Create Campaign/Page_Create Campaign/select_Please selectGenericPro'), '12114', 
    true)

WebUI.setText(findTestObject('Create Campaign/Page_Create Campaign/input_ctl00ContentucCampaigntx'), 'JE Test KS 04')

WebUI.selectOptionByValue(findTestObject('Create Campaign/Page_Create Campaign/select_Please selecttest for R'), '46294', 
    true)

WebUI.click(findTestObject('Create Campaign/Page_Create Campaign/a_27'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Create Campaign/Page_Create Campaign/a_31'))

WebUI.click(findTestObject('Create Campaign/Page_Create Campaign/input_ctl00ContentucCampaignra'))

WebUI.setText(findTestObject('Create Campaign/Page_Create Campaign/input_ctl00ContentucCampaigntx_1'), 'https://test.com')

WebUI.click(findTestObject('Create Campaign/Page_Create Campaign/button_Save'))

WebUI.click(findTestObject('Create Campaign/Page_Campaign/a_Logout'))

WebUI.closeBrowser()

