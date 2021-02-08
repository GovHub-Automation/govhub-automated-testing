package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object url
     
    /**
     * <p></p>
     */
    public static Object firstName
     
    /**
     * <p></p>
     */
    public static Object lastName
     
    /**
     * <p></p>
     */
    public static Object phone
     
    /**
     * <p></p>
     */
    public static Object fax
     
    /**
     * <p></p>
     */
    public static Object email
     
    /**
     * <p></p>
     */
    public static Object address
     
    /**
     * <p></p>
     */
    public static Object city
     
    /**
     * <p></p>
     */
    public static Object state
     
    /**
     * <p></p>
     */
    public static Object zip
     
    /**
     * <p></p>
     */
    public static Object country
     
    /**
     * <p></p>
     */
    public static Object website
     
    /**
     * <p></p>
     */
    public static Object summaryContent
     
    /**
     * <p></p>
     */
    public static Object introContent
     
    /**
     * <p></p>
     */
    public static Object bodyContent
     
    /**
     * <p></p>
     */
    public static Object bioContent
     
    /**
     * <p></p>
     */
    public static Object notes
     
    /**
     * <p></p>
     */
    public static Object title
     
    /**
     * <p></p>
     */
    public static Object username
     
    /**
     * <p></p>
     */
    public static Object gagov
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            url = selectedVariables['url']
            firstName = selectedVariables['firstName']
            lastName = selectedVariables['lastName']
            phone = selectedVariables['phone']
            fax = selectedVariables['fax']
            email = selectedVariables['email']
            address = selectedVariables['address']
            city = selectedVariables['city']
            state = selectedVariables['state']
            zip = selectedVariables['zip']
            country = selectedVariables['country']
            website = selectedVariables['website']
            summaryContent = selectedVariables['summaryContent']
            introContent = selectedVariables['introContent']
            bodyContent = selectedVariables['bodyContent']
            bioContent = selectedVariables['bioContent']
            notes = selectedVariables['notes']
            title = selectedVariables['title']
            username = selectedVariables['username']
            gagov = selectedVariables['gagov']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
