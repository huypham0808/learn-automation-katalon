import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'TEST STEP'

'Step 1: Log in with valid credentials'
WebUI.callTestCase(findTestCase('LoginPage/TC01-TestLogin'), [('username') : 'standard_user', ('password') : 'secret_sauce'
	, ('expectedHomePage') : 'Swag Labs'], FailureHandling.STOP_ON_FAILURE)

"Step 2:  Click 'Add to cart' button on 'Sauce Labs Backpack' card"
def btnAddToCart = findTestObject('Object Repository/HomePage/SauceLabsBackCard')
WebUI.click(btnAddToCart)





