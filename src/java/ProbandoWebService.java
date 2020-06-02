
import alumno.Exception_Exception;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pc
 */
public class ProbandoWebService {

    private static java.util.List<alumno.Alumno> getEgresados(java.lang.String name) throws Exception_Exception {
        alumno.Saludowx_Service service = new alumno.Saludowx_Service();
        alumno.Saludowx port = service.getSaludowxPort();
        return port.getEgresados(name);
    }
    
    public static void main(String[] args) throws Exception{
        
        ProbandoWebService pw =  new ProbandoWebService();
        
        
        for (int i=0; i<pw.getEgresados("20").size(); i++) {
            
            
            System.out.println(pw.getEgresados("20").get(i).getOAlumnoApellidoPaterno());
            System.out.println(pw.getEgresados("20").get(i).getOAlumnoApellidoMaterno());
            System.out.println(pw.getEgresados("20").get(i).getOAlumnoCodigo());
            System.out.println(pw.getEgresados("20").get(i).getOAlumnoDireccion());
            System.out.println(pw.getEgresados("20").get(i).getOAlumnoNombre());
            
            
            System.out.println(pw.getEgresados("20").size());
        }
        
    }
    
}
