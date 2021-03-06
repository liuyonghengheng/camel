/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jira;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class JiraEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        JiraEndpoint target = (JiraEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": target.getConfiguration().setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "consumerkey":
        case "consumerKey": target.getConfiguration().setConsumerKey(property(camelContext, java.lang.String.class, value)); return true;
        case "delay": target.getConfiguration().setDelay(property(camelContext, java.lang.Integer.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "jiraurl":
        case "jiraUrl": target.getConfiguration().setJiraUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "jql": target.setJql(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxresults":
        case "maxResults": target.setMaxResults(property(camelContext, java.lang.Integer.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "privatekey":
        case "privateKey": target.getConfiguration().setPrivateKey(property(camelContext, java.lang.String.class, value)); return true;
        case "sendonlyupdatedfield":
        case "sendOnlyUpdatedField": target.setSendOnlyUpdatedField(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "username": target.getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "verificationcode":
        case "verificationCode": target.getConfiguration().setVerificationCode(property(camelContext, java.lang.String.class, value)); return true;
        case "watchedfields":
        case "watchedFields": target.setWatchedFields(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("accessToken", java.lang.String.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("consumerKey", java.lang.String.class);
        answer.put("delay", java.lang.Integer.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("jiraUrl", java.lang.String.class);
        answer.put("jql", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("maxResults", java.lang.Integer.class);
        answer.put("password", java.lang.String.class);
        answer.put("privateKey", java.lang.String.class);
        answer.put("sendOnlyUpdatedField", boolean.class);
        answer.put("synchronous", boolean.class);
        answer.put("username", java.lang.String.class);
        answer.put("verificationCode", java.lang.String.class);
        answer.put("watchedFields", java.lang.String.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        JiraEndpoint target = (JiraEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": return target.getConfiguration().getAccessToken();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "consumerkey":
        case "consumerKey": return target.getConfiguration().getConsumerKey();
        case "delay": return target.getConfiguration().getDelay();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "jiraurl":
        case "jiraUrl": return target.getConfiguration().getJiraUrl();
        case "jql": return target.getJql();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxresults":
        case "maxResults": return target.getMaxResults();
        case "password": return target.getConfiguration().getPassword();
        case "privatekey":
        case "privateKey": return target.getConfiguration().getPrivateKey();
        case "sendonlyupdatedfield":
        case "sendOnlyUpdatedField": return target.isSendOnlyUpdatedField();
        case "synchronous": return target.isSynchronous();
        case "username": return target.getConfiguration().getUsername();
        case "verificationcode":
        case "verificationCode": return target.getConfiguration().getVerificationCode();
        case "watchedfields":
        case "watchedFields": return target.getWatchedFields();
        default: return null;
        }
    }
}

