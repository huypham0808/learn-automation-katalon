import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

def txtUserName = findTestObject('Object Repository/LoginPage/username')
def txtPassword = findTestObject('Object Repository/LoginPage/password')
def btnLogin = findTestObject('Object Repository/LoginPage/btnLogin')
def homepageTitle = findTestObject('Object Repository/HomePage/homepageTitle')

"TEST STEP"
"Step 1: Open browser and navigate to url"
WebUI.openBrowser(GlobalVariable.URL)

"Step 2: Login with valid credentials"
WebUI.setText(txtUserName, username)
WebUI.setText(txtPassword, password)
WebUI.click(btnLogin)

"Step 3: Verify user is logged in and redirected to the Products page"
def actualValue = WebUI.getText(homepageTitle)
WebUI.verifyEqual(actualValue, expectedHomePage)



