public class Persona {
   public String documento;
   public String primer_nombre;
   public String segundo_nombre;
   public String primer_apellido;
   public String segundo_apellido;

   public Persona (){
       this.documento =documento;
       this.primer_nombre = primer_nombre;
       this.segundo_nombre = segundo_nombre;
       this.primer_apellido = primer_apellido;
       this.segundo_apellido = segundo_apellido;

   }


    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }





    @Override
    public String toString() {
        return "Persona{" +
                "documento='" + documento + '\'' +
                ", primer_nombre='" + primer_nombre + '\'' +
                ", segundo_nombre='" + segundo_nombre + '\'' +
                ", primer_apellido='" + primer_apellido + '\'' +
                ", segundo_apellido='" + segundo_apellido + '\'' +
                '}';
    }
}
