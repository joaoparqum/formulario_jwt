/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.formulariocontrol.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 *
 * @author João P. Arquim
 */
@Data
public class FormDto {
    
    @NotBlank
    private String nome;
    @NotBlank
    private String email;
    @NotBlank
    @Size(max = 15)
    private String telefone;
    @NotBlank
    private String data_nasc;
    @NotBlank
    private String sexo;
    @NotBlank
    private String cidade;
    @NotBlank
    private String estado;
    @NotBlank
    private String endereco;
    
}
