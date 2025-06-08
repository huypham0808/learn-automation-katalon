import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

def txtUserName = findTestObject('Object Repository/LoginPage/username')
def txtPassword = findTestObject('Object Repository/LoginPage/password')
def btnLogin = findTestObject('Object Repository/LoginPage/btnLogin')
def invalidCredsError = findTestObject('Object Repository/LoginPage/errorMessageLogin')

"TEST STEP"
"Step 1: Open browser and navigate to url"
WebUI.openBrowser(GlobalVariable.URL)

"Step 2: Login with invalid credentials"
WebUI.setText(txtUserName, invalidUsername)
WebUI.setText(txtPassword, invalidPassword)
WebUI.click(btnLogin)

"Step 3: Verify an error message is displayed: 'Epic sadface: Username and password do not match'"
def actualErrorValue = WebUI.getText(invalidCredsError)
WebUI.verifyEqual(actualErrorValue, errorMessage)