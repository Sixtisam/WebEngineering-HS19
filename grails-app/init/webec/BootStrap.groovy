package webec

class BootStrap {

    def init = { servletContext ->

        Person sam = new Person(firstName: "Samuel", lastName: "Keusch").save(failOnError: true)
        Person steve = new Person(firstName: "Steve", lastName: "Vogel").save(failOnError: true)
        Person marc = new Person(firstName: "Marc", lastName: "Sieber").save( failOnError: true)

        Room room1 = new Room(name: "1.313", capacity: 50).save(failOnError: true)
        Room room2 = new Room(name: "6.-1D13", capacity: 60).save(failOnError: true)

        Date today = new Date()
        new Booking(booker: sam, room: room1, day: today, slot: Booking.MORGEN).save(failOnError: true)
        new Booking(booker: steve, room: room2, day: today, slot: Booking.ABEND).save(failOnError: true)
    }
    def destroy = {
    }
}
