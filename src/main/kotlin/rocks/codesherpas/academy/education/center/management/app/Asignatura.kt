package rocks.codesherpas.academy.education.center.management.app

class Asignatura {
    var creditos: Int = 0

    /**Composición*/
    lateinit var alumnosMatriculados: List<Alumno>

    /** Composición: Una asignatura TIENE un docente (principal) */
    lateinit var docentePrincipal: Docente
    fun matricular(alumno: Alumno) {}


}

class Docente(evaluador: Evaluador) {
    var añosDeExperiencia: Int = 0

    lateinit var nombre: String

    /**Composición*/
    lateinit var asignaturas: MutableList<Asignatura>

    /**Composición*/
    lateinit var despacho: Despacho

    /**Composición*/ /** Colaborador: Evaluador es un colaborador de Docente, porque ayuda a docente a evaluar */
    var evaluador: Evaluador

    init {
        this.evaluador = evaluador
    }


    fun evaluar(alumno: Alumno, resultado: Resultado, asignatura: Asignatura) {
        evaluador.evalua(alumno, resultado, asignatura)
    }

}

class Resultado {

}

class Alumno {
    fun asignarResultados(resultado: Resultado) {
        TODO("Not yet implemented")
    }

}

class Despacho {
    lateinit var zona: String
    lateinit var edificio: String
    lateinit var planta: String
    lateinit var numero: String
}