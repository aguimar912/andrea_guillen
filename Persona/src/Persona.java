public class Persona {
        //Atributos
        private String nombre;
        private String apellidoPaterno;
        private String apellidoMaterno;
        private char sexo;
        private int edad;
        private String direccion;
        //Constructor por defecto
        public Persona(){
        }
        //Constructor de copia
        public Persona(Persona persona){
                this.nombre=persona.nombre;
                this.apellidoPaterno=persona.apellidoPaterno;
                this.apellidoMaterno=persona.apellidoMaterno;
                this.sexo=persona.sexo;
                this.edad=persona.edad;
                this.direccion=persona.direccion;
        }
        
        //Constructor común
        public Persona(String nom, String app, String apm, char sexo, int edad, String dir){
                this.nombre=nom;
                this.apellidoPaterno=app;
                this.apellidoMaterno=apm;
                this.sexo=sexo;
                this.edad=edad;
                this.direccion=dir;
        }  
        public void mayorEdad(int edad){
                if(edad>18)
                        System.out.println("Es mayor de edad");
                else
                        System.out.println("Es menor de edad");
        }   
        public String mostrarDatos(Persona persona){
                String datos="Los datos son: \n";
                datos+=persona.nombre+"\n";
                datos+=persona.apellidoPaterno+"\n";
                datos+=persona.apellidoMaterno+"\n";
                datos+=persona.sexo+"\n";
                datos+=persona.edad+"\n";
                datos+=persona.direccion+"\n";
                return datos;
        }
        
}
