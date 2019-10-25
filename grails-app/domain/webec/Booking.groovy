package webec

class Booking {
    Person booker
    Room room
    Date day
    String slot

    static String MORGEN = "08:15-11:00"
    static String MITTAG = "11:15-15:00"
    static String ABEND = "15:15-18:00"
    static List<String> SLOTS = [MORGEN, MITTAG, ABEND]

    static constraints = {
        slot inList: Booking.SLOTS
    }
}
