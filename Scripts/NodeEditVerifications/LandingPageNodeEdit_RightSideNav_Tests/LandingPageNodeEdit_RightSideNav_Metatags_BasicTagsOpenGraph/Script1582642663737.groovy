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

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_Section_Label'), 'METATAGS')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Content_Tags'), 'Configure the meta tags below.\nTo view a summary of the individual meta tags and the pattern for a specific configuration, click on its name below. Use tokens to avoid redundant meta data and search engine penalization. For example, a \'keyword\' value of "example" will be shown on all content using this configuration, whereas using the [node:field_keywords] automatically inserts the "keywords" values from the current entity (node, term, etc).')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/BrowseAvailableTokens_Link'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/BasicTags_Section_Label'), 'BASIC TAGS')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/BasicTags_SimpleTags_Label'), 
    'Simple meta tags.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/BasicTags_Page_Title_Label'), 
    'Page title')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/BasicTags_Page_Title_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/BasicTags_Page_Title_Field_Tooltip'), 
    'The text to display in the title bar of a visitor\'s web browser when they view this page. This meta tag may also be used as the title of the page when a visitor bookmarks or favorites this page, or as the page title in a search engine result. It is common to append \'[site:name]\' to the end of this, so the site\'s name is automatically added. It is recommended that the title is no greater than 55 - 65 characters long, including spaces.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/BasicTags_Description_Label'), 
    'Description')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/BasicTags_Description_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/BasicTags_Description_Field_Tooltip'), 
    'A brief and concise summary of the page\'s content, preferably 320 characters or less. The description meta tag may be used by search engines to display a snippet about the page in search results.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/BasicTags_Abstract_Label'), 'Abstract')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/BasicTags_Abstract_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/BasicTags_Abstract_Field_Tooltip'), 
    'A brief and concise summary of the page\'s content, preferably 150 characters or less. Where as the description meta tag may be used by search engines to display a snippet about the page in search results, the abstract tag may be used to archive a summary about the page. This meta tag is no longer supported by major search engines.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/BasicTags_Keywords_Label'), 'Keywords')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/BasicTags_Keywords_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/BasicTags_Keywords_Field_Tooltip'), 
    'A comma-separated list of keywords about the page. This meta tag is no longer supported by most search engines.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_Section_Label'), 
    'OPEN GRAPH')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_Section_Tooltip'), 
    'The Open Graph meta tags are used to control how Facebook, Pinterest, LinkedIn and other social networking sites interpret the site\'s content.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_Determiner_Label'), 
    'Determiner')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_Determiner_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_Determiner_Field_Tooltip'), 
    'The word that appears before the content\'s title in a sentence. The default ignores this value, the \'Automatic\' value should be sufficient if this is actually needed.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_Sitename_Label'), 
    'Site name')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_Sitename_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_Sitename_Field_Tooltip'), 
    'A human-readable name for the site, e.g., IMDb.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_ContentType_Label'), 
    'Content type')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_ContentType_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_ContentType_Field_Tooltip'), 
    'The type of the content, e.g., movie.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_PageURL_Label'), 
    'Page URL')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_PageURL_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_PageURL_Field_Tooltip'), 
    'Preferred page location or URL to help eliminate duplicate content for search engines, e.g., http://www.imdb.com/title/tt0117500/.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_Title_Label'), 
    'Title')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_Title_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_Title_Field_Tooltip'), 
    'The title of the content, e.g., The Rock.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_Description_Label'), 
    'Description')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_Description_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_Description_Field_Tooltip'), 
    'A one to two sentence description of the content.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_Image_Label'), 
    'Image')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_Image_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_Image_Label_Tooltip'), 
    'The URL of an image which should represent the content. The image must be at least 200 x 200 pixels in size; 600 x 316 pixels is a recommended minimum size, and for best results use an image least 1200 x 630 pixels in size. Supports PNG, JPEG and GIF formats. Should not be used if og:image:url is used. Note: if multiple images are added many services (e.g. Facebook) will default to the largest image, not specifically the first one. Multiple values may be used, separated by a comma. Note: Tokens that return multiple values will be handled automatically. This will be able to extract the URL from an image field.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_VideoURL_Label'), 'Video URL')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_VideoURL_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_VideoURL_Label_Tooltip'), 
    'The URL of an video which should represent the content. For best results use a source that is at least 1200 x 630 pixels in size, but at least 600 x 316 pixels is a recommended minimum. Object types supported include video.episode, video.movie, video.other, and video.tv_show. Multiple values may be used, separated by a comma. Note: Tokens that return multiple values will be handled automatically.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_ImageURL_Label'), 
    'Image URL')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_ImageURL_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_ImageURL_Field_Tooltip'), 
    'A alternative version of og:image and has exactly the same requirements; only one needs to be used. Multiple values may be used, separated by a comma. Note: Tokens that return multiple values will be handled automatically. This will be able to extract the URL from an image field.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_ImageSecureURL_Label'), 
    'Image Secure URL')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_ImageSecureURL_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_ImageSecureURL_Field_Tooltip'), 
    'The secure URL (HTTPS) of an image which should represent the content. The image must be at least 50px by 50px and have a maximum aspect ratio of 3:1. Supports PNG, JPEG and GIF formats. All \'http://\' URLs will automatically be converted to \'https://\'. Multiple values may be used, separated by a comma. Note: Tokens that return multiple values will be handled automatically. This will be able to extract the URL from an image field. Any links containing http:// will be converted to https://')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_VideoSecureURL_Label'), 
    'Video Secure URL')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_VideoSecureURL_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_VideoSecureURL_Field_Tooltip'), 
    'The secure URL (HTTPS) of an video which should represent the content. The video must be at least 50px by 50px and have a maximum aspect ratio of 3:1. Supports PNG, JPEG and GIF formats. All \'http://\' URLs will automatically be converted to \'https://\'. Any links containing http:// will be converted to https://')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_ImageType_Label'), 
    'Image type')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_ImageType_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_ImageType_Field_Tooltip'), 
    'The type of image referenced above. Should be either \'image/gif\' for a GIF image, \'image/jpeg\' for a JPG/JPEG image, or \'image/png\' for a PNG image. Note: there should be one value for each image, and having more than there are images may cause problems.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_VideoType_Label'), 
    'Video type')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_VideoType_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_VideoType_Field_Tooltip'), 
    'The type of video referenced above. Should be either video.episode, video.movie, video.other, and video.tv_show. Note: there should be one value for each video, and having more than there are videos may cause problems.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_ImageWidth_Label'), 
    'Image width')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_ImageWidth_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_ImageWidth_Field_Tooltip'), 
    'The height of the above image(s). Note: if both the unsecured and secured images are provided, they should both be the same size.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_VideoWidth_Label'), 
    'Video width')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_VideoWidth_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_VideoWidth_Field_Tooltip'), 
    'The height of the above video(s). Note: if both the unsecured and secured videos are provided, they should both be the same size.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_ImageHeight_Label'), 
    'Image height')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_ImageHeigh_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_ImageHeight_Field_Tooltip'), 
    'The height of the above image(s). Note: if both the unsecured and secured images are provided, they should both be the same size.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_VideoHeight_Label'), 
    'Video height')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_VideoHeight_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_VideoHeight_Field_Tooltip'), 
    'The height of the above video(s). Note: if both the unsecured and secured videos are provided, they should both be the same size.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_ImageAlt_Label'), 
    'Image \'alt\'')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_ImageAlt_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_ImageAlt_Field_Tooltip'), 
    'A description of what is in the image, not a caption. If the page specifies an og:image it should specify og:image:alt.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_ContentModDateTime_Label'), 
    'Content modification date & time')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_ContentModDateTime_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_ContentModDateTime_Field_Tooltip'), 
    'The date this content was last modified, with an optional time value. Needs to be in ISO 8601 format. Can be the same as the \'Article modification date\' tag.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_Latitude_Label'), 
    'Latitude')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_Latitude_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_Longitude_Label'), 
    'Longitude')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_Longitude_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_SeeAlso_Label'), 
    'See also')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_SeeAlso_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_SeeAlso_Field_Tooltip'), 
    'URLs to related content')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_StreetAddress_Label'), 
    'Street address')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_StreetAddress_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_Locality_Label'), 
    'Locality')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_Locality_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_Region_Label'), 
    'Region')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_Region_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_PostalZipCode_Label'), 
    'Postal/ZIP code')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_PostalZipCode_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_CountryName_Label'), 
    'Country name')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_CountryName_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_EmailAddress_Label'), 
    'Email address')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_EmailAddress_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_PhoneNumber_Label'), 
    'Phone number')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_PhoneNumber_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_FaxNumber_Label'), 
    'Fax number')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_FaxNumber_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_Locale_Label'), 
    'Locale')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_Locale_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_Locale_Field_Tooltip'), 
    'The locale these tags are marked up in, must be in the format language_TERRITORY. Default is \'en_US\'.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_AlternativeLocales_Label'), 
    'Alternative locales')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_AlternativeLocales_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_AlternativeLocales_Field_Tooltip'), 
    'Other locales this content is available in, must be in the format language_TERRITORY, e.g. \'fr_FR\'. Multiple values may be used, separated by a comma. Note: Tokens that return multiple values will be handled automatically.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_ArticleAuthor_Label'), 
    'Article author')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_ArticleAuthor_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_ArticleAuthor_Field_Tooltip'), 
    'Links an article to an author\'s Facebook profile, should be either URLs to the author\'s profile page or their Facebook profile IDs. Multiple values may be used, separated by a comma. Note: Tokens that return multiple values will be handled automatically.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_ArticlePublisher_Label'), 
    'Article publisher')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_ArticlePublisher_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_ArticlePublisher_Field_Tooltip'), 
    'Links an article to a publisher\'s Facebook page.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_ArticleSession_Label'), 
    'Article section')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_ArticleSession_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_ArticleSession_Field_Tooltip'), 
    'The primary section of this website the content belongs to.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_ArticleTags_Label'), 
    'Article tag(s)')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_ArticleTags_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_ArticleTags_Field_Tooltip'), 
    'Appropriate keywords for this content. Multiple values may be used, separated by a comma. Note: Tokens that return multiple values will be handled automatically.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_ArticlePubDateTime_Label'), 
    'Article publication date & time')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_ArtPubDateTime_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_ArtPublicDateTime_Field_Tooltip'), 
    'The date this content was published on, with an optional time value. Needs to be in ISO 8601 format.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_ArticleModDateTime_Label'), 
    'Article modification date & time')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_ArticleModDateTime_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_ArticleModDateTime_Field_Tooltip'), 
    'The date this content was last modified, with an optional time value. Needs to be in ISO 8601 format.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_ArtExpirDateTime_Label'), 
    'Article expiration date & time')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_ArtExpirDateTime_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_ArtExpirDateTime_Field_Tooltip'), 
    'The date this content will expire, with an optional time value. Needs to be in ISO 8601 format.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_BookAuthor_Label'), 
    'Book author')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_BookAuthor_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_BookAuthor_Field_Tooltip'), 
    'Links a book to an author\'s Facebook profile, should be either URLs to the author\'s profile page or their Facebook profile IDs. Multiple values may be used, separated by a comma. Note: Tokens that return multiple values will be handled automatically.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_ISBN_Label'), 
    'ISBN')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_ISBN_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_ISBN_Field_Tooltip'), 
    'The Book\'s ISBN')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_ReleaseDate_Label'), 
    'Release Date')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_ReleaseDate_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/OpenGraph_ReleaseDate_Field_Tooltip'), 
    'The date the book was released.')

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_BookTags_Label'), 
    'Book tag(s)')

WebUI.verifyElementPresent(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_BookTags_Field'), 
    30)

WebUI.verifyElementText(findTestObject('Page_Create Landing Page  Digital Services Georgia/Metatags_OpenGraph_BookTags_Field_Tooltip'), 
    'Appropriate keywords for this content. Multiple values may be used, separated by a comma. Note: Tokens that return multiple values will be handled automatically.')

