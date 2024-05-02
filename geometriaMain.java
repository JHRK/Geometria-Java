import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.*;

import java.util.Scanner;

public class geometriaMain {

        // vai ter um menu aqui para acessar as outras classes
        int Tipo;
        double Pi;
        double R;
        double H;
        double V;
        double AB;
        double AL;
        double r;
        double raio;
        int laterais;
        int operacao;

        public Double calcularAreaCubo(Double AreaCubo){
            return AreaCubo;
        }
    
        public Double calcularVolumeCubo(Double volumeCubo){
            return volumeCubo;
        }
        
        public Double calcularAreaEsfera(Double AreaEsfera){
            return AreaEsfera;
        }
    
        public Double calcularVolumeEsfera(Double volumeEsfera){
            return volumeEsfera;
        }
    
        public Double calcularAreaParalelepipedo(Double AreaParalelepipedo){
            return AreaParalelepipedo;
        }
    
        public Double calcularVolumeParalelepipedo(Double volumeParalelepipedo){
            return volumeParalelepipedo;
        }
    
        public Double calcularAreaPrismaTriangular(Double AreaPrismaTriangular){
            return AreaPrismaTriangular;
        }
    
        public Double calcularVolumePrismaTriangular(Double AreaPrismaHexagonal ){
            return AreaPrismaHexagonal;
        }
    
        public Double calcularAreaCilindro(Double AreaCilindro){
            return AreaCilindro;
        }
    
        public Double calcularVolumeCilindro(Double volumeCilindro){
            return volumeCilindro;
        }
    
        public Double calcularAreaPrismaHexagonal(Double AreaPrismaHexagonal){
            return AreaPrismaHexagonal;
        }
    
        public Double calcularVolumePrismaHexagonal(Double volumePrismaHexagonal){
            return volumePrismaHexagonal;
        }
        
        public Double calcularAreaCone(Double AreaCone){
            return AreaCone;
        }
    
        public Double calcularVolumeCone(Double volumeCone){
            return volumeCone;
        }
    
        public Double calcularAreaPiramide(Double areaPiramide){
            return areaPiramide;
        }
    
        public Double calcularVolumePiramide(Double volumePiramide){
            return volumePiramide;
        }

        public static void main(String args[]){
            geometriaMain Blehrg = new geometriaMain();
            espacial esp = new espacial();
            double areaCubo = esp.areaCubo;
          //  double volumeCubo;
           // double areaEsfera;
           // double volumeEsfera;
           // double areaParalelepipedo;
          //  double volumeParalelepipedo;
           // double areaPrismaHexagonal;
          //  double volumePrismaHexagonal;
          //  double areaPrismaTriangular;
          //  double volumePrismaTriangular;
          //  double areaCilindro;
          //  double volumeCilindro;
          //  double areaCone;
          //  double volumeCone;
          //  double areaPiramide;
          //  double volumePiramide;

            System.out.println(areaCubo);

           // Scanner scanner = new Scanner(System.in);

           // System.out.println("Qual a boa chefia, escolhe uma opção aí, tem a 1 que é pra geometria plana e 2 pra espacial, faz a boa aí.");
           // int operacao = scanner.nextInt();
            //System.out.println("tu escolheu " + operacao);


    }
}