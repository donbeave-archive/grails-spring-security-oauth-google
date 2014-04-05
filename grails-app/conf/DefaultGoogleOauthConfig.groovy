import grails.util.Holders

def appName = grails.util.Metadata.current.'app.name'
def baseURL = Holders.config.grails.serverURL ?: "http://localhost:${System.getProperty('server.port', '8080')}/${appName}"

oauth {
    providers {
        google {
            api = org.grails.plugin.springsecurity.oauth.GoogleApi20
            successUri = '/oauth/google/success'
            failureUri = '/oauth/google/failure'
            callback = "${baseURL}/oauth/google/callback"
        }
    }
}