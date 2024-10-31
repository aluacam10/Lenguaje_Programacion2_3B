
import java.util.ArrayList;
import java.util.List;

class Universidad {

    private List<Profesor> profesores;

    public Universidad() {
        profesores = new ArrayList<>();
    }

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }
}
