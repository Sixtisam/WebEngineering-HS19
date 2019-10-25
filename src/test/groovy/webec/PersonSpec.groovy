package webec

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class PersonSpec extends Specification implements DomainUnitTest<Person> {

    def setup() {
    }

    def cleanup() {
    }

    void "test construction"() {
        given:
            Person samuel = new Person(firstName: "Samuel", lastName: "Keusch")
        expect: "one can access the parameters"
            samuel.firstName == "Samuel"
            samuel.lastName == "Keusch"
    }
}
