class Empresa {
    const property nombre
    const property cuit
    const property empleados = #{}
    const property recibosHaberes = #{}

    method agregarEmpleado(empleado) {
        empleados.add(empleado)
    }

    //yo necesito un cambiarSueldo dentro de la clase empresa?
    // o directamente le mando mensaje al empleado cuando lo necesite?
    // lo mismo con direc, estado civil
/*    method cambiarSueldo(empleado, valor) {
        empleado.sueldo(valor)
    } 
*/
    method montoTotalSueldosBrutos() {
        empleados.sueldoBruto().sum()
    }

    method montoTotalSueldosNetos() {
        empleados.sueldoNeto().sum()
    }

    method montoTotalRetencionesEmpleados() {
        empleados.retenciones().sum()
    }

    method liquidarSueldos() {
        empleados.forEach({empleado => self.agregarReciboDe(empleado) })
    }

    method agregarReciboDe(empleado) {
        const recibo = new ReciboHaberes(nombre = empleado.nombre(), direccion = empleado.direccion(),/* 
        fechaDeEmision = new Date(),*/ sueldoNeto = empleado.sueldoNeto(), sueldoBruto = empleado.sueldoBruto())

        recibosHaberes.add(recibo)
    }

}

class ReciboHaberes {
    const property nombre
    const property direccion
    const property fechaDeEmision = new Date()
    const property sueldoNeto
    const property sueldoBruto
}

class Empleado {

    var property nombre 
    var property direccion
    var property estadoCivil
    var property fechaDeNacimiento
    var property sueldoBasico

    method sueldoBruto()

    method sueldoNeto() {
        return self.sueldoBruto() - self.retenciones()
    }

    method retenciones()

    method edad() {
        const fechaDeHoy = new Date()
        return fechaDeHoy.year() - self.fechaDeNacimiento().year()
    }

    method obraSocial() {
        return self.sueldoBruto() / 0.10
    }

    method aportes()
}

class EmpleadoPermanente inherits Empleado {

    var property cantDeHijos
    var property antiguedad
    var property tieneConyuge 
    
    override method sueldoBruto() {
        return sueldoBasico + self.salarioFamiliar()
    }

    //BONIFICACIONES
    method salarioFamiliar() {
        return  self.bonifAsignaciones() + self.bonifAntiguedad()
    }

    method bonifAsignaciones() {
        return self.bonifPorHijo() + self.bonifConyuge()
    }

    method bonifPorHijo() {
        return 150 * cantDeHijos
    }

    method bonifConyuge() {
       return if (tieneConyuge) 100 else 0
    }

    method bonifAntiguedad() {
        return 50 * antiguedad
    }

    //RETENCIONES
    override method retenciones() {
        return self.obraSocial() + self.aportes()
    }

    override method obraSocial() {
        return super() + 20 * cantDeHijos
    }

    override method aportes() {
        return self.sueldoBruto() / 0.15
    }
}

class EmpleadoTemporario inherits Empleado {

    const property fechaFinTemporaria
    var property cantHorasExtras

    override method sueldoBruto() {
        return sueldoBasico + self.bonifHorasExtras()
    }

    //BONIFICACIONES
    method bonifHorasExtras() {
        return cantHorasExtras * 40
    }

    //RETENCIONES
    override method retenciones() {
        return self.obraSocial() + self.aportes()
    }

    override method obraSocial() {
        return super() + self.superaEdad()
    }

    method superaEdad() {
        return if (self.edad() > 50) 25 else 0
    }

    override method aportes() {
        return self.sueldoBruto() / 0.10 + (5 * cantHorasExtras)
    }
}

class EmpleadoContratado inherits Empleado {

}
