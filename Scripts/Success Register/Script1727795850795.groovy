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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.click(findTestObject('Object Repository/Page_kasirAja/h2_hai, kasirAja'))

WebUI.click(findTestObject('Object Repository/Page_kasirAja/a_ingin mencoba, daftar'))

WebUI.setText(findTestObject('Object Repository/Page_kasirAja/input_nama toko_name'), namaToko)

WebUI.setText(findTestObject('Object Repository/Page_kasirAja/input_email_email'), 'gembira22@xokut.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_kasirAja/input_password_password'), 'GY5K4AXHbD8sJ+t/Tw6kaQ==')

WebUI.click(findTestObject('Page_kasirAja/button_daftar'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_kasirAja/div_Toko berhasil didaftarkananda dapat men_b3a8bd'))

WebUI.click(findTestObject('Page_kasirAja/div_Toko berhasil didaftarkananda dapat men_b3a8bd'))

