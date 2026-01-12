import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'TEST STEP'
'Step 1: Login'
WebUI.callTestCase(findTestCase('LoginPage/TC01-TestLogin'), [('username') : 'standard_user', ('password') : 'secret_sauce'
        , ('expectedHomePage') : 'Swag Labs'], FailureHandling.STOP_ON_FAILURE)

'Step 2: Click the menu button (≡)'
def btnMenu = findTestObject('Object Repository/HomePage/MenuButton')
WebUI.click(btnMenu)

'Step 3: Click Logout'
def btnLogout = findTestObject('Object Repository/HomePage/LogoutButton')
WebUI.click(btnLogout)