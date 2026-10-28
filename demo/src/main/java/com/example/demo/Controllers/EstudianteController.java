package com.example.demo.Controllers;

import java.util.Map;
import java.util.HashMap;
import com.example.demo.models.Estudiante;
import org.springframework.stereotype.Controller;

@Controller
public class EstudianteController {
    private static Map<String,Estudiante> Estudiantes = new HashMap<>();
    static {
        Estudiante estudiante1 = new Estudiante("Juan", "Perez", 20, "Ingenieria de Sistemas", "12345");
        Estudiante estudiante2 = new Estudiante("Maria", "Gonzalez", 22, "Medicina", "67890");
        Estudiante estudiante3 = new Estudiante("Carlos", "Ramirez", 21, "Derecho", "54321");
        Estudiantes.put(estudiante1.getCodigo(), estudiante1);
        Estudiantes.put(estudiante2.getCodigo(), estudiante2);
        Estudiantes.put(estudiante3.getCodigo(), estudiante3);
    }
}
