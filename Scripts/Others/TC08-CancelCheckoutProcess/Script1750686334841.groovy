import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'TEST STEP'
'Step 1: Add an item to cart'
WebUI.callTestCase(findTestCase('Others/TC04-AddSimpleItemToCart'), [('username') : ''], FailureHandling.STOP_ON_FAILURE)

'Step 2: Click cart icon'
def btnCartIcon = findTestObject('Object Repository/HomePage/CartIcon')
WebUI.click(btnCartIcon)

'Step 3: Click Checkout'
def btnCheckout = findTestObject('Object Repository/CartPage/CheckoutButton')
WebUI.click(btnCheckout)

'Step 4: Fill in first name, last name, and zip/postal code on Checkout Page'

def txtFirstNameCheckout = findTestObject('Object Repository/CheckoutPageStep1/FirstNameCheckout')
def txtLastNameCheckout = findTestObject('Object Repository/CheckoutPageStep1/LastNameCheckout')
def txtPostalCode = findTestObject('Object Repository/CheckoutPageStep1/PostalCode')
def btnCancel = findTestObject('Object Repository/CheckoutPageStep1/CancelButton')
String firstNameValue = "Huy"
String lastNameValue= "Pham"
int postalCodenumber = 123456

WebUI.setText(txtFirstNameCheckout, firstNameValue)
WebUI.setText(txtLastNameCheckout, lastNameValue)
String postalCodeValue = postalCodenumber.toString()
WebUI.setText(txtPostalCode, postalCodeValue )

'Step 5: Click cancel button'

WebUI.click(btnCancel)

'Step 6: Compare url link'
def atualUrlLink = WebUI.getUrl()
WebUI.verifyEqual(atualUrlLink, expectedUrlLink)



