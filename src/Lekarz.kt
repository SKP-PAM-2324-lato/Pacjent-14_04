class Lekarz(val imie:String, val nazwisko:String) {

    val listPacjentow = mutableListOf<Pacjent>()

    fun dodajPacjenta(pacjent:Pacjent){
        listPacjentow.add(pacjent)
    }

    override fun toString(): String {
        return "$imie, $nazwisko $listPacjentow"
    }

}