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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Demo Healthcare/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/Demo Healthcare/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Demo Healthcare/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/Demo Healthcare/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Demo Healthcare/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/Demo Healthcare/input_Apply for hospital readmission_hospit_63901f'))

WebUI.click(findTestObject('Object Repository/Demo Healthcare/input_Medicaid_programs'))

WebUI.click(findTestObject('Object Repository/Demo Healthcare/span_Visit Date (Required)_glyphicon glyphi_cada34'))

WebUI.click(findTestObject('Object Repository/Demo Healthcare/td_30'))

WebUI.setText(findTestObject('Object Repository/Demo Healthcare/textarea_Comment_comment'), 'This is a sample comment')

WebUI.click(findTestObject('Object Repository/Demo Healthcare/button_Book Appointment'))

WebUI.verifyElementText(findTestObject('Object Repository/Demo Healthcare/h2_Appointment Confirmation'), 'Appointment Confirmation')

WebUI.click(findTestObject('Object Repository/Demo Healthcare/a_Go to Homepage'))

WebUI.closeBrowser()

