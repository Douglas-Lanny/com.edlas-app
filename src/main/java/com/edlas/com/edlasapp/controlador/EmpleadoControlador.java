package com.edlas.com.edlasapp.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edlas.com.edlasapp.entidad.Empleado;
import com.edlas.com.edlasapp.excepciones.ResourceFoundException;
import com.edlas.com.edlasapp.repositorio.EmpleadoRepositorio;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class EmpleadoControlador {

    @Autowired
    private EmpleadoRepositorio repositorio;

    @GetMapping("/empleados")
    public List<Empleado> obtenerEmpleados() {
        return repositorio.findAll();
    }

    @PostMapping("/empleados")
    public Empleado guardarEmpleado(@RequestBody Empleado empleado) {
        return repositorio.save(empleado);
    }

    @GetMapping("/empleados/{id}")
    public ResponseEntity<Empleado> obtenerEmpleado(@PathVariable Long id) {
        Empleado empleado = repositorio.findById(id)
                .orElseThrow(() -> new ResourceFoundException(("No existe el empleado con id: " + id)));

        return ResponseEntity.ok(empleado);
    }

    @PutMapping("/empleados/{id}")
    public ResponseEntity<Empleado> actualizarEmpleado(@PathVariable Long id, @RequestBody Empleado detalleEmpleado) {

        Empleado empleado = repositorio.findById(id)
                .orElseThrow(() -> new ResourceFoundException(("No existe el empleado con id: " + id)));

        empleado.setNombre(detalleEmpleado.getNombre());
        empleado.setNombreUsuario(detalleEmpleado.getNombreUsuario());
        empleado.setPuestoDeTrabajo(detalleEmpleado.getPuestoDeTrabajo());
        empleado.setArea(detalleEmpleado.getArea());
        empleado.setEstatus(detalleEmpleado.getEstatus());

        Empleado empleadoActualizado = repositorio.save(empleado);

        return ResponseEntity.ok(empleadoActualizado);
    }

}
