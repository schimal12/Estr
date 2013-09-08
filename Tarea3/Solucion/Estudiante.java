public class Estudiante implements Comparable<Estudiante>{

    private String carrera;
    private String nombre;
    private Materia[] materias;

    public Estudiante(String carrera,String nombre,Materia[] materias){
        this.carrera=carrera;
        this.nombre=nombre;
        this.materias=materias;
    }

    public double promedio(){
        double sum=0;
        int cont=0;

        for(Materia m:materias){
            if(m!=null){
                sum+=m.getCalificacion();
                cont++;
            }
        }

        return sum/cont;
    }

    public int compareTo(Estudiante e){

        if(this.promedio()==e.promedio()){
            return 0;
        }
        else{
            if(this.promedio()>e.promedio()){
                return 1;
            }
            else{
                return -1;
            }
        }

    }

    public String getCarrera(){
        return carrera;
    }

    public Materia[] getMaterias(){
        return materias;
    }

    public String toString(){
        return nombre + ": " + carrera + "-->" + promedio();
    }

}