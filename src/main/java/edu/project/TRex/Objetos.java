package edu.project.TRex;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hamcrest.generator.qdox.model.JavaPackage;

import javax.swing.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public abstract class Objetos extends JPanel {
    private int position;
    private int sizes;
    private String color;
}
