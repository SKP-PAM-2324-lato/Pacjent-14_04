import java.time.LocalDate

class Pacjent(val imie:String, val nazwisko:String) {

    val dataPrzyjacia: LocalDate = LocalDate.now()
    var choroba: Choroba? = null

    override fun toString(): String {
        return "$imie, $nazwisko, $dataPrzyjacia, $choroba"
    }
}