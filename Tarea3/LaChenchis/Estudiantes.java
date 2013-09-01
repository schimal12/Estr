public class Estudiante implements Comparable<Estudiante>{
    private String carrera;
    private String nombre;
    private int numeroMaterias;
    private Materia [ ] mat;
    private int contador;
    private int cant;
    public Estudiante(String carrera, String nombre, int numeroMaterias, int cant){
        this.carrera=carrera;
        this.nombre=nombre;
        this.numeroMaterias=numeroMaterias;
        mat=new Materia[cant];
        this.contador=0;
        
    }
    public int getnumeroMaterias(){
        return numeroMaterias;
    }
    public String getNombre(){
        return nombre;
    }
    public Materia [ ] getMaterias(){
         return mat;
    }
    public String getCarrera(){
        return carrera;
    }
    public double promedio(){
        double promedioAux=0;
        double pF;
        for(int i=0; i<numeroMaterias;i++){
            promedioAux += this.getMaterias()[i].getCalificacion();
            }
        pF=promedioAux/numeroMaterias;
            return pF;
    }
    public double promedio(Estudiante estu){
        double promedioAux=0;
        double pF;
        for(int i=0; i<numeroMaterias;i++){
            promedioAux += estu.getMaterias()[i].getCalificacion();
            }
        pF=promedioAux/numeroMaterias;
            return pF; 
    }
    public void agregarMaterias(String clave, String nombre, int calificacion){
        Materia m1= new Materia(clave, nombre, calificacion);
        mat[contador]=m1;
        contador++;
    }
    public int compareTo(Estudiante estu) {
        double proAUX = 0;
        for(int i=0;i<estu.getMaterias().length;i++){
            proAUX+=(estu.getMaterias()[i].getCalificacion());
           
        }
        proAUX=(proAUX/estu.getMaterias().length);
        if(this.promedio()==proAUX){
            return (int) (this.promedio()-proAUX);
        }else{
            if(this.promedio()>proAUX){
                return (int) (this.promedio()-proAUX);
            }
            return (int) (this.promedio()-proAUX);
        }
    }
}
