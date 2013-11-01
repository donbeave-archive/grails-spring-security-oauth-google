/**
* @author <a href='mailto:cazacugmihai@gmail.com'>Mihai Cazacu</a>
* @author <a href='mailto:enrico@comiti.name'>Enrico Comiti</a>
* @author <a href='mailto:donbeave@gmail.com'>Alexey Zhokhov</a>
*/
class SpringSecurityOauthGoogleGrailsPlugin {
    def version = "0.1"
    def grailsVersion = "1.2.2 > *"
    def dependsOn = [springSecurityOauth: '2.0.2 > *']
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    def title = "Google for Spring Security OAuth plugin"
    def author = "Mihai Cazacu, Enrico Comiti, Alexey Zhokhov"
    def authorEmail = "donbeave@gmail.com"
    def description = '''\
Integrate [Google|http://www.google.com] to [Spring Security OAuth plugin|http://grails.org/plugin/spring-security-oauth].
'''

    def documentation = "https://github.com/donbeave/grails-spring-security-oauth-google"

    def license = "APACHE"

    def developers = [
        [name: "Mihai Cazacu", email: "cazacugmihai@gmail.com"],
        [name: "Enrico Comiti", email: "enrico@comiti.name"],
        [name: "Alexey Zhokhov", email: "donbeave@gmail.com"]]

    def scm = [url: 'https://github.com/donbeave/grails-spring-security-oauth-google']

}
