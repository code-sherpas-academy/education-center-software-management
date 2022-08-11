package rocks.codesherpas.academy.education.center.management.app

class Grado {
    /** Composición: Un grado TIENE asignaturas */
    lateinit var asignaturas: MutableList<Asignatura> //
    var duracionEstimada: Int = 0
    lateinit var nombre: String
    var creditosTotales: Int = 0

    fun eliminarAsignatura(asignatura: Asignatura) {
        asignaturas.remove(asignatura)
    }

    fun añadirAsignatura(asignatura: Asignatura) {
        asignaturas.add(asignatura)
    }

    fun calcularCreditosTotales(): Int {
        return asignaturas.sumOf {
                asignatura: Asignatura -> asignatura.creditos
        }
    }

    fun consultarCreditosTotales(): Int {
        this.creditosTotales = calcularCreditosTotales()
        return creditosTotales
    }
}
