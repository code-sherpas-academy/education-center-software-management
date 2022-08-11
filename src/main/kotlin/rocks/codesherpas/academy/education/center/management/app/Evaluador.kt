package rocks.codesherpas.academy.education.center.management.app

class Evaluador {
    lateinit var asignaturasDelGrado: MutableList<Asignatura>

    fun evalua(alumno: Alumno, resultado: Resultado, asignatura: Asignatura) {
        asignaturasDelGrado.find { asignature -> asignature == asignatura}.let {
                asignatura -> asignatura?.alumnosMatriculados?.find {
                estudiante -> estudiante == alumno }.let {
                alumno -> alumno?.asignarResultados(resultado)
                }
            }
    }
}
