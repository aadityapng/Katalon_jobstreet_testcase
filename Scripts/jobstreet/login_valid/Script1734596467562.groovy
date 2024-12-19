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

WebUI.navigateToUrl('https://id.jobstreet.com/')

WebUI.click(findTestObject('Object Repository/jobstreet/Menu_Masuk'))

WebUI.setText(findTestObject('Object Repository/jobstreet/Page_Masuk sebagai Kandidat - SEEK/input_Alamat email'), 'aditya.pangestu463@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/jobstreet/Page_Masuk sebagai Kandidat - SEEK/input_kata sandi'), 
    '2ihrMQnVYykpqFuiFmM7nw==')

WebUI.click(findTestObject('Object Repository/jobstreet/Page_Masuk sebagai Kandidat - SEEK/button_Masuk'))

WebUI.takeScreenshot()

