import java.util.Arrays;

public class Principal{


    public static String[] carreras(Estudiante[] es){

        String[] carreras = new String[0];

        for(Estudiante e: es){
            int i=0;
            boolean encontrado=false;
            for(;i<carreras.length && !encontrado;i++){
                if(carreras[i].compareTo(e.getCarrera())==0){
                    encontrado=true;
                }
            }

            if(!encontrado){
                carreras = Arrays.copyOf(carreras,carreras.length+1);
                carreras[carreras.length-1]=e.getCarrera();
            }
        }

        return carreras;

    }

    public static Estudiante[][] ceremonia(Estudiante[] es){

        String[] carreras = carreras(es);

        Estudiante[][] ceremonia = new Estudiante[carreras.length][0];

        for(int i=0;i<carreras.length;i++){

            for(Estudiante e: es){
                if(e.getCarrera().compareTo(carreras[i])==0 && e.promedio()>95 && e.getMaterias().length>=6){
                    ceremonia[i] = Arrays.copyOf(ceremonia[i],ceremonia[i].length+1);
                    ceremonia[i][ceremonia[i].length-1]=e;
                }
            }
        }

        return ceremonia;

    }

    public static Estudiante masAlto(Estudiante[] es){

        Estudiante max = es[0];

        for(int i=1;i<es.length;i++){
            if(max.compareTo(es[i])<0){
                max=es[i];
            }
        }

        return max;

    }

    public static void main(String[] args){

        Materia[] materias1 = {new Materia("A",89),new Materia("B",78),new Materia("C",30)};
        Materia[] materias2 = {new Materia("A",89),new Materia("B",78),new Materia("C",82),new Materia("D",79),new Materia("E",95),new Materia("F",56)};
        Materia[] materias3 = {new Materia("A",99),new Materia("B",93),new Materia("C",100),new Materia("D",98),new Materia("E",95),new Materia("F",97)};
        Materia[] materias4 = {new Materia("A",98),new Materia("B",93),new Materia("C",97),new Materia("D",98),new Materia("E",95),new Materia("F",97)};
        Materia[] materias5 = {new Materia("A",98),new Materia("B",96),new Materia("C",100)};

        Estudiante[] est = {
                                new Estudiante("Carrera 1","A",materias2),
                                new Estudiante("Carrera 1","B",materias3),
                                new Estudiante("Carrera 1","C",materias4),
                                new Estudiante("Carrera 1","D",materias1),
                                new Estudiante("Carrera 2","E",materias5),
                                new Estudiante("Carrera 2","F",materias4),
                                new Estudiante("Carrera 2","G",materias1),
                            };

        Estudiante[][] excelencia = ceremonia(est);

        for(int i=0;i<excelencia.length;i++){

            if(excelencia[i].length>0){
                String carreraAux = excelencia[i][0].getCarrera();

                System.out.println(carreraAux + "\n");

                for(Estudiante eaux: excelencia[i]){
                    System.out.println(eaux);
                }

                System.out.println("Mejor estudiante: " + masAlto(excelencia[i]));
            }

            System.out.println("\n");
        }

    }

}