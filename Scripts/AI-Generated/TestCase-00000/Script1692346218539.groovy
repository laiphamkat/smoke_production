import com.kms.katalon.core.model.FailureHandling
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page_product_chekhol-the-amity-affliction'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/product/chekhol-the-amity-affliction')

'step 2: At Page_product_chekhol-the-amity-affliction click on label_object'

testObj = findTestObject('Object Repository/Page_product_chekhol-the-amity-affliction/label_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/product/chekhol-the-amity-affliction(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page_product_chekhol-the-amity-affliction click on button_object'

testObj = findTestObject('Object Repository/Page_product_chekhol-the-amity-affliction/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/product/chekhol-the-amity-affliction(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page_product_chekhol-the-amity-affliction click on button_object'

testObj = findTestObject('Object Repository/Page_product_chekhol-the-amity-affliction/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/product/chekhol-the-amity-affliction(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: At Page_product_chekhol-the-amity-affliction click on button_object'

testObj = findTestObject('Object Repository/Page_product_chekhol-the-amity-affliction/button_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/product/chekhol-the-amity-affliction(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 6: At Page_product_chekhol-the-amity-affliction click on button_object'

testObj = findTestObject('Object Repository/Page_product_chekhol-the-amity-affliction/button_object_2')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/product/chekhol-the-amity-affliction(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 7: Add visual checkpoint at Page_product_chekhol-the-amity-affliction'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00000_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
