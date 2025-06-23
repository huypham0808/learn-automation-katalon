import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'TEST STEP'
'Step 1: Login with valid valid credentials and Add Sauce Labs Backpack to cart'
WebUI.callTestCase(findTestCase('LoginPage/TC04-AddSimpleItemToCart'), [('username') : ''], FailureHandling.STOP_ON_FAILURE)

'Step 2: . Click Remove on the same item'
def btnRemoveSauceLabsBackCard = findTestObject('Object Repository/HomePage/ItemRemove')
WebUI.click(btnRemoveSauceLabsBackCard)

