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

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_Section_Title'), 
    'TWITTER CARDS')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_Section_Tooltip'), 
    'A set of meta tags specially for controlling the summaries displayed when content is shared on Twitter.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCardsType_Label'), 'Twitter card type')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCardsType_Dropdown'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCardsType_Dropdown_Tooltip'), 
    'Notes:\nno other fields are required for a Summary card\nPhoto card requires the \'image\' field\nMedia player card requires the \'title\', \'description\', \'media player URL\', \'media player width\', \'media player height\' and \'image\' fields,\nSummary Card with Large Image card requires the \'Summary\' field and the \'image\' field,\nGallery Card requires all the \'Gallery Image\' fields,\nApp Card requires the \'iPhone app ID\' field, the \'iPad app ID\' field and the \'Google Play app ID\' field,\nProduct Card requires the \'description\' field, the \'image\' field, the \'Label 1\' field, the \'Data 1\' field, the \'Label 2\' field and the \'Data 2\' field.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_Description_Label'), 
    'Description')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_Description_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_Description_Field_Tooltip'), 
    'A description that concisely summarizes the content of the page, as appropriate for presentation within a Tweet. Do not re-use the title text as the description, or use this field to describe the general services provided by the website. The string will be truncated, by Twitter, at the word to 200 characters.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_SiteTwitterAccount_Label'), 
    'Site\'s Twitter account')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_SiteTwitterAccount_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_SiteTwitterAccount_Field_Tooltip'), 
    'The @username for the website, which will be displayed in the Card\'s footer; must include the @ symbol.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_Title_Label'), 'Title')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_Title_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_Title_Field_Tooltip'), 
    'The page\'s title, which should be concise; it will be truncated at 70 characters by Twitter. This field is required unless this the \'type\' field is set to \'photo\'.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_SitesTwitterAccountID_Label'), 
    'Site\'s Twitter account ID')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_SitesTwitterAccountID_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_SitesTwitterAccountID_Field_Tooltip'), 
    'The numerical Twitter account ID for the website, which will be displayed in the Card\'s footer.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_CreatorTwitterAccount_Label'), 
    'Creator\'s Twitter account')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_CreatorTwitterAccount_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_CreatorTwitterAccount_Field_Tooltip'), 
    'The @username for the content creator / author for this page, including the @ symbol.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_CreatorTwitterAccountID_Label'), 
    'Creator\'s Twitter account ID')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_CreatorTwitterAccountID_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_CreatorTwitterAccountID_Field_Tooltip'), 
    'The numerical Twitter account ID for the content creator / author for this page.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_DoNotTrack_Label'), 
    'Do Not Track')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_DoNotTrack_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_DoNotTrack_Field_Tooltip'), 
    'By default Twitter tracks visitors when a tweet is embedded on a page using the official APIs. Setting this to \'on\' will stop Twitter from tracking visitors.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_PageURL_Label'), 
    'Page URL')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_PageURL_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_PageURL_Field_Tooltip'), 
    'The permalink / canonical URL of the current page.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_ImageURL_Label'), 
    'Image URL')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_ImageURL_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_ImageURL_Field_Tooltip'), 
    'The URL to a unique image representing the content of the page. Do not use a generic image such as your website logo, author photo, or other image that spans multiple pages. Images larger than 120x120px will be resized and cropped square based on longest dimension. Images smaller than 60x60px will not be shown. If the \'type\' is set to Photo then the image must be at least 280x150px. This will be able to extract the URL from an image field. This will be able to extract the URL from an image field.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_ImageAltText_Label'), 
    'Image alternative text')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_ImageAltText_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_ImageAltText_Field_Tooltip'), 
    'The alternative text of the image being linked to. Limited to 420 characters.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_ImageHeight_Label'), 
    'Image height')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_ImageHeight_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_ImageHeight_Field_Tooltip'), 
    'The height of the image being linked to, in pixels.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_ImageWidth_Label'), 
    'Image width')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_ImageWidth_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_ImageWidth_Field_Tooltip'), 
    'The width of the image being linked to, in pixels.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_FirstGalleryImage_Label'), 
    '1st gallery image')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_FirstGalleryImage_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_FirstGalleryImage_Field_Tooltip'), 
    'A URL to the image representing the first photo in your gallery. This will be able to extract the URL from an image field. This will be able to extract the URL from an image field.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_SecondGalleryImage_Label'), 
    '2nd gallery image')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_SecondGalleryImage_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_SecondGalleryImage_Field_Tooltip'), 
    'A URL to the image representing the second photo in your gallery. This will be able to extract the URL from an image field. This will be able to extract the URL from an image field.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_ThirdGalleryImage_Label'), 
    '3rd gallery image')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_ThirdGalleryImage_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_ThirdGalleryImage_Field_Tooltip'), 
    'A URL to the image representing the third photo in your gallery. This will be able to extract the URL from an image field. This will be able to extract the URL from an image field.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_FourthGalleryImage_Label'), 
    '4th gallery image')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_FourthGalleryImage_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_FourthGalleryImage_Field_Tooltip'), 
    'A URL to the image representing the fourth photo in your gallery. This will be able to extract the URL from an image field. This will be able to extract the URL from an image field.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_AppStoreCountry_Label'), 
    'App store country')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_AppStoreCountry_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_AppStoreCountry_Field_Tooltip'), 
    'If your application is not available in the US App Store, you must set this value to the two-letter country code for the App Store that contains your application.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_iPhoneAppName_Label'), 
    'iPhone app name')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_iPhoneAppName_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_iPhoneAppName_Field_Tooltip'), 
    'The name of the iPhone app.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_iPhoneAppID_Label'), 
    'iPhone app ID')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_iPhoneAppID_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_iPhoneAppID_Field_Tooltip'), 
    'String value, should be the numeric representation of your iPhone app\'s ID in the App Store.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_iPhoneAppURLScheme_Label'), 
    'iPhone app\'s custom URL scheme')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_iPhoneAppURLScheme_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_iPhoneAppURLScheme_Field_Tooltip'), 
    'The iPhone app\'s custom URL scheme (must include "://" after the scheme name).')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_iPadAppName_Label'), 
    'iPad app name')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_iPadAppName_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_iPadAppName_Field_Tooltip'), 
    'The name of the iPad app.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_iPadAppID_Label'), 
    'iPad app ID')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_iPadAppID_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_iPadAppID_Field_Tooltip'), 
    'String value, should be the numeric representation of your iPad app\'s ID in the App Store.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_iPadAppURLScheme_Label'), 
    'iPad app\'s custom URL scheme')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_iPadAppURLScheme_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_iPadAppURLScheme_Field_Tooltip'), 
    'The iPad app\'s custom URL scheme (must include "://" after the scheme name).')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_GooglePlayAppName_Label'), 
    'Google Play app name')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_GooglePlayAppName_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_GooglePlayAppName_Field_Tooltip'), 
    'The name of the app in the Google Play app store.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_GooglePlayAppID_Label'), 
    'Google Play app ID')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_GooglePlayAppID_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_GooglePlayAppID_Field_Tooltip'), 
    'Your app ID in the Google Play Store (i.e. "com.android.app").')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_GooglePlayAppURLScheme_Label'), 
    'Google Play app\'s custom URL scheme')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_GooglePlayAppURLScheme_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_GooglePlayURLScheme_Field_Tooltip'), 
    'The Google Play app\'s custom URL scheme (must include "://" after the scheme name).')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_MediaPlayerURL_Label'), 
    'Media player URL')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_MediaPlayerURL_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_MediaPlayerURL_Field_Tooltip'), 
    'The full URL for loading a media player. Required when using a Media player card.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_MediaPlayerWidth_Label'), 
    'Media player width')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_MediaPlayerWidth_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_MediaPlayerWidth_Field_Tooltip'), 
    'The width of the media player iframe, in pixels. Required when using a Media player card.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_MediaPlayerHeight_Label'), 
    'Media player height')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_MediaPlayerHeight_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_MediaPlayerHeight_Field_Tooltip'), 
    'The height of the media player iframe, in pixels. Required when using a Media player card.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_MP4StreamURL_Label'), 
    'MP4 media stream URL')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_MP4StreamURL_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_MP4StreamURL_Field_Tooltip'), 
    'The full URL for an MP4 video (h.264) or audio (AAC) stream, takes precidence over the other media player field.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_MP4StreamMIME_Label'), 
    'MP4 media stream MIME-type')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_MP4StreamMIME_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_MP4StreamMIME_Field_Tooltip'), 
    'The MIME type for the media contained in the stream URL, as defined by RFC 4337.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_Label1_Label'), 
    'Label 1')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_Label1_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_Label1_Field_Tooltip'), 
    'This field expects a string, and you can specify values for labels such as price, items in stock, sizes, etc.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_Data_Label'), 'Data 1')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_Data_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_Data_Field_Tooltip'), 
    'This field expects a string, and allows you to specify the types of data you want to offer (price, country, etc.).')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_Label2_Label'), 
    'Label 2')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_Label2_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_Label2_Field_Tooltip'), 
    'This field expects a string, and you can specify values for labels such as price, items in stock, sizes, etc.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_Data2_Label'), 'Data 2')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_Data2_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/TwitterCards_Data2_Field_Tooltip'), 
    'This field expects a string, and allows you to specify the types of data you want to offer (price, country, etc.).')

