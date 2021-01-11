package clases;

public class CapacidadEndedudamiento {
    Integer ingresosTotales;
    Integer gastosFijos;
    Integer gastoVaribales;
    final double POR_FIJO = 0.35;

    //Metodos getter and setter para la clase

    //Construye un metodo que retorne una cadena con las propiedades de la clase

    public String getCapacidadEndeudamiento() {
        // retornar la capacidad de endeudamiento puede ser una cadena con el valor
        Double Cap_Endueda = 0.0;
        String Capacidad;

        Cap_Endueda = (ingresosTotales.doubleValue()-gastoVaribales.doubleValue()-gastosFijos.doubleValue())* POR_FIJO;

        return String.valueOf(Cap_Endueda);
    }

    public Integer getIngresosTotales() {
        return ingresosTotales;
    }

    public void setIngresosTotales(Integer ingresosTotales) {
        this.ingresosTotales = ingresosTotales;
    }

    public Integer getGastosFijos() {
        return gastosFijos;
    }

    public void setGastosFijos(Integer gastosFijos) {
        this.gastosFijos = gastosFijos;
    }

    public Integer getGastoVaribales() {
        return gastoVaribales;
    }

    public void setGastoVaribales(Integer gastoVaribales) {
        this.gastoVaribales = gastoVaribales;
    }
}
