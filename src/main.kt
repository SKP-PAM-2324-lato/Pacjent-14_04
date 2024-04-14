fun main() {

    val choroba = Choroba("gruźlica", 8)
    val pacjent = Pacjent("Łukasz", "Trybulski")
    pacjent.choroba = choroba
    val lekarz = Lekarz("Aleksandra", "Opolska")
    lekarz.dodajPacjenta(pacjent)

    println(lekarz)
}