package io.curity.identityserver.plugin.flipkart25

import se.curity.identityserver.sdk.plugin.descriptor.AuthenticationActionPluginDescriptor

class flipkart25AuthenticationActionDescriptor: AuthenticationActionPluginDescriptor<flipkart25AuthenticationActionConfig>
{
    override fun getAuthenticationAction() = flipkart25AuthenticationAction::class.java

    override fun getPluginImplementationType() = "flipkart25"

    override fun getConfigurationType() = flipkart25AuthenticationActionConfig::class.java;
}
