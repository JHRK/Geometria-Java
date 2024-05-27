import java.util.Scanner;
import java.lang.Math;

public class geometriaMain {

double aresta;
int Tipo;
int Tipodimensao;
double Pi;
double R;
double H;
double V;
double AB;
double AL;
double r;
double raio;
double arestax;
double arestay;
double arestaz;
double laterais;
int operacao;
int operacogonos;
int operacao3d;
int operacaoprismas;
int opvolume;
int oppira;
int opcone;
int opplano;
double ABM;
double pitagoras;
double geratriz;
double A;
double B;
double C;
double D;
double diagonal;
int opperi;
int optrio;
int opgonos2d;

public static void main(String args[]){
geometriaMain Blehrg = new geometriaMain();


Scanner scanner = new Scanner(System.in);

System.out.println("Qual a boa chefia, escolhe uma opção aí, tem a 1 que é pra geometria plana e 2 pra espacial, faz a boa aí.");
int Tipo = scanner.nextInt();

if (Tipo < 2){
System.out.println("tu escolheu geometria plana, segue o fio...");
}
else{
System.out.println("tu escolheu geometria espacial, segue o fio...");
}

switch(Tipo){
    
case 1:
System.out.println("Área ou perímetro?");
System.out.println("1 area");
System.out.println("2 peri");
int operacao = scanner.nextInt();

switch(operacao){   
                        case 1:
                        System.out.println("AREA -- qual vai ser o tipo de figura? ");
                        System.out.println("1 - quadrado ");
                        System.out.println("2 - círculo ");
                        System.out.println("3 - retângulo ");
                        System.out.println("4 - triângulos");
                        System.out.println("5 - trapézio ");
                        System.out.println("6 - algum dos '-gonos'");
                        System.out.println("7 - Losango");
                        int opplano = scanner.nextInt();
                                        switch(opplano){                                
                                            
                                            case 1:
                                                System.out.println("Qual a medida do lado do quadrado?");
                                                System.out.println("Lado");
                                                Blehrg.aresta = scanner.nextDouble();
                                                double Quadrado = plana.calcularQuadrado(Blehrg.aresta);
                                                System.out.println("a area do cubo é  " + Quadrado);
                                                break;
                                                
                                                case 2:
                                                System.out.println("Qual a medida do lado do bola?");
                                                System.out.println("Pi");
                                                Blehrg.Pi = scanner.nextDouble();
                                                System.out.println("Raio");
                                                Blehrg.raio = scanner.nextDouble();
                                                double Bola = plana.calcularBola(Blehrg.Pi, Blehrg.raio);
                                                System.out.println("a area do bola é  " + Bola);
                                                break;
                                                case 3:
                                                System.out.println("Qual a medida do lado do retangulo?");
                                                System.out.println("Lado");
                                                Blehrg.arestax = scanner.nextDouble();
                                                Blehrg.arestay = scanner.nextDouble();
                                                double Retangulo = plana.calcularRetanguloParas(Blehrg.arestax,Blehrg.arestay);
                                                System.out.println("a area do cubo é  " + Retangulo);
                                                break;
                                                
                                                case 4:
                                                System.out.println("Qual dos triangulos?");
                                                int optrio = scanner.nextInt();
                                                switch(optrio){  
                                                                                                
                                                                case 1:
                                                                System.out.println("Qual a medida do lado do triangulos?");
                                                                System.out.println("Lado");
                                                                Blehrg.A = scanner.nextDouble();
                                                                Blehrg.B = scanner.nextDouble();
                                                                Blehrg.C = scanner.nextDouble();
                                                                Blehrg.H = scanner.nextDouble();
                                                                double Triangulo1 = plana.calcularTriangulo1(Blehrg.A,Blehrg.B,Blehrg.C,Blehrg.H);
                                                                System.out.println("a area do cubo é  " + Triangulo1);
                                                                break;
                                                                
                                                                case 2:
                                                                System.out.println("Qual a medida do lado do triangulos?");
                                                                System.out.println("Lado");
                                                                Blehrg.aresta = scanner.nextDouble();
                                                                double Triangulo2 = plana.calcularTriangulo2(Blehrg.aresta);
                                                                System.out.println("a area do cubo é  " + Triangulo2);
                                                                break;
                                                    
                                                }     
                                                
                                                case 5:
                                                System.out.println("Qual a medida do lado do trapezio?");
                                                System.out.println("Lado");
                                                Blehrg.AB = scanner.nextDouble();
                                                Blehrg.ABM = scanner.nextDouble();
                                                Blehrg.H = scanner.nextDouble();
                                                double Trapezio = plana.calcularTrapezio(Blehrg.AB,Blehrg.ABM,Blehrg.H);
                                                System.out.println("a area do cubo é  " + Trapezio);
                                                break;
                                                
                                                case 6:
                                                System.out.println("1 ou 2?");
                                                int opgonos2d = scanner.nextInt();
                                                switch(opgonos2d){  
                                                                                                
                                                                case 1:
                                                                System.out.println("Qual a medida do lado do gono?");
                                                                System.out.println("Lado");
                                                                Blehrg.A = scanner.nextDouble();
                                                                Blehrg.B = scanner.nextDouble();
                                                                Blehrg.C = scanner.nextDouble();
                                                                Blehrg.H = scanner.nextDouble();
                                                                double Triangulo1 = plana.calcularTriangulo1(Blehrg.A,Blehrg.B,Blehrg.C,Blehrg.H);
                                                                System.out.println("a area do cubo é  " + Triangulo1);
                                                                break;
                                                                
                                                                case 2:
                                                                System.out.println("Qual a medida do lado do gono?");
                                                                System.out.println("Lado");
                                                                Blehrg.aresta = scanner.nextDouble();
                                                                double Triangulo2 = plana.calcularTriangulo2(Blehrg.aresta);
                                                                System.out.println("a area do cubo é  " + Triangulo2);
                                                                break;
                                                    
                                                }   
                                                case 7:
                                                System.out.println("Quais as medidas do losango??");
                                                System.out.println("Lado");
                                                Blehrg.aresta = scanner.nextDouble();
                                                System.out.println("Lado");
                                                Blehrg.aresta = scanner.nextDouble();
                                                double Losango = plana.calcularLosango(Blehrg.diagonal,Blehrg.D);
                                                System.out.println("a area do cubo é  " + Losango);
                                                break;
                                        }
                                        
                                        break;

                        case 2:
                        System.out.println("Perímetro -- qual vai ser o tipo de figura? ");
                        System.out.println("1 - quadrado ");
                        System.out.println("2 - círculo ");
                        System.out.println("3 - retângulo ");
                        System.out.println("4 - triângulos");
                        System.out.println("5 - trapézio ");
                        System.out.println("6 - algum dos '-gonos'");
                        System.out.println("7 - Losango");
                        int opperi = scanner.nextInt();
                        
                                        switch(opperi){                                
                                           case 1:
                                                System.out.println("Qual a medida do lado do quadrado?");
                                                System.out.println("Lado");
                                                Blehrg.aresta = scanner.nextDouble();
                                                double periQuadrado = plana.calcularPeriQuadrado(Blehrg.aresta);
                                                System.out.println("a area do cubo é  " + periQuadrado);
                                                break;
                                                
                                                case 2:
                                                System.out.println("Qual a medida do lado do bola?");
                                                System.out.println("Pi");
                                                Blehrg.Pi = scanner.nextDouble();
                                                System.out.println("Raio");
                                                Blehrg.raio = scanner.nextDouble();
                                                double periBola = plana.calcularPeriBola(Blehrg.Pi, Blehrg.raio);
                                                System.out.println("a area do bola é  " + periBola);
                                                break;
                                                case 3:
                                                System.out.println("Qual a medida do lado do retangulo?");
                                                System.out.println("Lado");
                                                Blehrg.arestax = scanner.nextDouble();
                                                Blehrg.arestay = scanner.nextDouble();
                                                double periRetangulo = plana.calcularPeriRetanguloParas(Blehrg.arestax,Blehrg.arestay);
                                                System.out.println("a area do cubo é  " + periRetangulo);
                                                break;
                                                
                                                case 4:
                                                System.out.println("Qual dos trinagulos??");
                                                int optrio = scanner.nextInt();
                                                switch(optrio){  
                                                                                                
                                                                case 1:
                                                                System.out.println("Qual a medida do lado do triangulos?");
                                                                System.out.println("Lado");
                                                                Blehrg.A = scanner.nextDouble();
                                                                Blehrg.B = scanner.nextDouble();
                                                                Blehrg.C = scanner.nextDouble();
                                                                double Triangulo1 = plana.calcularTriangulo1(Blehrg.A,Blehrg.B,Blehrg.C,Blehrg.H);
                                                                System.out.println("a area do cubo é  " + Triangulo1);
                                                                break;
                                                                
                                                                case 2:
                                                                System.out.println("Qual a medida do lado do triangulos?");
                                                                System.out.println("Lado");
                                                                Blehrg.aresta = scanner.nextDouble();
                                                                double Triangulo2 = plana.calcularTriangulo2(Blehrg.aresta);
                                                                System.out.println("a area do cubo é  " + Triangulo2);
                                                                break;
                                                    
                                                }     
                                                
                                                case 5:
                                                System.out.println("Qual a medida do lado do trapezio?");
                                                System.out.println("Lado");
                                                Blehrg.aresta = scanner.nextDouble();
                                                double Trapezio = plana.calcularTrapezio(Blehrg.AB,Blehrg.ABM,Blehrg.H);
                                                System.out.println("a area do cubo é  " + Trapezio);
                                                break;
                                                
                                                case 6:
                                                System.out.println("1 ou 2?");
                                                int opgonos2d = scanner.nextInt();
                                                switch(opgonos2d){  
                                                                                                
                                                                case 1:
                                                                System.out.println("Qual a medida do lado do triangulos?");
                                                                System.out.println("Lado");
                                                                Blehrg.aresta = scanner.nextDouble();
                                                                double Triangulo1 = plana.calcularTriangulo1(Blehrg.A,Blehrg.B,Blehrg.C,Blehrg.H);
                                                                System.out.println("a area do cubo é  " + Triangulo1);
                                                                break;
                                                                
                                                                case 2:
                                                                System.out.println("Qual a medida do lado do triangulos?");
                                                                System.out.println("Lado");
                                                                Blehrg.aresta = scanner.nextDouble();
                                                                double Triangulo2 = plana.calcularTriangulo2(Blehrg.aresta);
                                                                System.out.println("a area do cubo é  " + Triangulo2);
                                                                break;
                                                    
                                                }   
                                                
                                                case 7:
                                                System.out.println("Quais as medidas do losango??");
                                                System.out.println("Lado");
                                                Blehrg.aresta = scanner.nextDouble();
                                                System.out.println("Lado");
                                                Blehrg.aresta = scanner.nextDouble();
                                                double Losango = plana.calcularLosango(Blehrg.diagonal,Blehrg.D);
                                                System.out.println("a area do cubo é  " + Losango);
                                                break;
                                        }
                                                                                break;
}

case 2:
System.out.println("Tá, qual vai ser o tipo de cálculo? 1 para área e 2 para volume");
int Tipodimensao = scanner.nextInt();

switch(Tipodimensao){

case 1:
System.out.println("AREA -- qual vai ser o tipo de polígono? ");
System.out.println("1 - cubo ");
System.out.println("2 - esfera ");
System.out.println("3 - paralelepípedo ");
System.out.println("4 - pirâmide");
System.out.println("5 - cone ");
System.out.println("6 - prisma");
System.out.println("7 - cilindro");

int operacao3d = scanner.nextInt();

switch(operacao3d){

case 1:

System.out.println("Qual a medida do lado do cubo?");
System.out.println("Lado");
Blehrg.aresta = scanner.nextDouble();
double areaCubo = espacial.calcularAreaCubo(Blehrg.aresta);
System.out.println("a area do cubo é  " + areaCubo);
break;

case 2:
System.out.println("Quais as medidas da esfera??");
System.out.println("Pi");
Blehrg.Pi = scanner.nextDouble();
System.out.println("Raio");
Blehrg.raio = scanner.nextDouble();
double areaEsfera = espacial.calcularAreaEsfera(Blehrg.Pi,Blehrg.raio);
System.out.println("a area do cubo é  " + areaEsfera);
break;

case 3:
System.out.println("Quais as medidas do paralelepípedo??");
System.out.println("Lado 1");
Blehrg.arestax = scanner.nextDouble();
System.out.println("Lado 2");
Blehrg.arestay = scanner.nextDouble();
System.out.println("Lado 3");
Blehrg.arestaz = scanner.nextDouble();
double areaParalelepipedo = espacial.calcularAreaParalelepipedo(Blehrg.arestax,Blehrg.arestay,Blehrg.arestaz);
System.out.println("a area do paralelepípedo é  " + areaParalelepipedo);
break;

                    case 4:
                    System.out.println("Quer calcular a piramide inteira ou apenas o tronco?");
                    int oppira= scanner.nextInt();
                    switch(oppira){
                                        case 1:
                                        System.out.println("Quais as medidas da piramide??");
                                        System.out.println("Geratriz");
                                        Blehrg.arestax = scanner.nextDouble();
                                        System.out.println("Lados da base");
                                        Blehrg.laterais = scanner.nextDouble();
                                        System.out.println("Altura");
                                        Blehrg.H = scanner.nextDouble();
                                        double areaPiramide = espacial.calcularAreaPiramide(Blehrg.arestax,Blehrg.laterais,Blehrg.H,Blehrg.AB,Blehrg.AL);
                                        System.out.println("a area da piramide é  " + areaPiramide);
                                        break;
                                        
                                        case 2:
                                        System.out.println("Quais as medidas do tronco da piramide??");
                                        System.out.println("Geratriz");
                                        Blehrg.arestax = scanner.nextDouble();
                                        System.out.println("Lados da base");
                                        Blehrg.laterais = scanner.nextDouble();
                                        System.out.println("Altura");
                                        Blehrg.H = scanner.nextDouble();
                                        double areaTroncoPiramide = espacial.calcularAreaPiramide(Blehrg.arestax,Blehrg.laterais,Blehrg.H,Blehrg.AB,Blehrg.AL);
                                        System.out.println("a area da piramide é  " + areaTroncoPiramide);
                                        break;
                                    }

                    case 5:
                    System.out.println("Quer calcular o cone inteiro ou apenas o tronco?");
                    int opcone = scanner.nextInt();
                    switch(opcone){
                                        case 1:
                                        System.out.println("Quais as medidas do cone??");
                                        System.out.println("altura");
                                        Blehrg.arestay = scanner.nextDouble();
                                        System.out.println("raio da base");
                                        Blehrg.raio = scanner.nextDouble();
                                        System.out.println("Pi");
                                        Blehrg.Pi = scanner.nextDouble();
                                        double areaCone = espacial.calcularAreaCone(Blehrg.arestay, Blehrg.AB, Blehrg.AL, Blehrg.pitagoras, Blehrg.geratriz, Blehrg.Pi, Blehrg.raio);
                                        System.out.println("a area do cone é  " + areaCone);
                                        break;
                                           
                                        case 2:
                                        System.out.println("Quais as medidas do tronco do cone??");
                                        break;
                                        }
                        

                            case 6:
                            System.out.println("Tá, qual vai ser o tipo de prisma?");
                            System.out.println("1 - triangular ");
                            System.out.println("2 - hexagonal ");
                            
                            int operacaoprismas = scanner.nextInt();
                            
                            switch(operacaoprismas){
                            case 1:
                                                System.out.println("Quais as medidas do ??");
                                                System.out.println("Altura");
                                                Blehrg.arestay = scanner.nextDouble();
                                                System.out.println("Raio da base");
                                                Blehrg.raio = scanner.nextDouble();
                                                System.out.println("Pi");
                                                Blehrg.Pi = scanner.nextDouble();
                                                double areaPrismaTriangular = espacial.calcularAreaPrismaTriangular(Blehrg.arestax, Blehrg.arestay, Blehrg.AB, Blehrg.AL);
                                                System.out.println("a area do cone é  " + areaPrismaTriangular);
                                                break;
                            
                            case 2:
                                                System.out.println("Quais as medidas do ??");
                                                System.out.println("Altura");
                                                Blehrg.arestay = scanner.nextDouble();
                                                System.out.println("Raio da base");
                                                Blehrg.raio = scanner.nextDouble();
                                                System.out.println("Pi");
                                                Blehrg.Pi = scanner.nextDouble();
                                                double areaPrismaHexagonal = espacial.calcularAreaPrismaHexagonal(Blehrg.arestax, Blehrg.H, Blehrg.AB, Blehrg.AL);
                                                System.out.println("a area do cone é  " + areaPrismaHexagonal);
                                                break;
                            
                            }

case 7:
                    System.out.println("Quais as medidas do cilindro?");
                    System.out.println("raio");
                    Blehrg.arestax = scanner.nextDouble();
                    System.out.println("Pi");
                    Blehrg.Pi = scanner.nextDouble();
                    System.out.println("Altura");
                    Blehrg.H = scanner.nextDouble();
                    double areaCilindro = espacial.calcularAreaPiramide(Blehrg.arestax,Blehrg.Pi,Blehrg.H,Blehrg.AB,Blehrg.AL);
                    System.out.println("a area do ciliro é  " + areaCilindro);
                    break;

}
                                        break;

case 2:
System.out.println("VOLUME -- qual vai ser o tipo de polígono? ");
System.out.println("1 - cubo ");
System.out.println("2 - esfera ");
System.out.println("3 - paralelepípedo ");
System.out.println("4 - pirâmide");
System.out.println("5 - cone ");
System.out.println("6 - prisma");
System.out.println("7 - cilindro");

int opvolume = scanner.nextInt();

switch(opvolume){

            case 1:
            System.out.println("medida do lado do quadrado?");
            System.out.println("Lado"); 
            Blehrg.aresta = scanner.nextDouble();
            double volumeCubo = espacial.calcularVolumeCubo(Blehrg.aresta);
            System.out.println("o volume  do cubo é  " + volumeCubo);
            break;
            
            case 2:
            System.out.println("quais as medidas da esfera?");
            System.out.println("Pi");
            Blehrg.Pi = scanner.nextDouble();
            System.out.println("Raio");
            Blehrg.raio = scanner.nextDouble();
            double volumeEsfera = espacial.calcularVolumeEsfera(Blehrg.Pi, Blehrg.raio);
            System.out.println("o volume da esfera é  " + volumeEsfera);
            break;
            
            
            case 3:
            System.out.println("quais as medidas do paralelepipedo?");
            System.out.println("Aresta 1");
            Blehrg.arestax = scanner.nextDouble();
            System.out.println("Aresta 2");
            Blehrg.arestay = scanner.nextDouble();
            System.out.println("Aresta 3");
            Blehrg.arestaz = scanner.nextDouble();
            double volumeParalelepipedo = espacial.calcularVolumeParalelepipedo(Blehrg.arestax, Blehrg.arestay, Blehrg.arestaz);
            System.out.println("o volume do paralelepipedo é  " + volumeParalelepipedo);
            break;
            
            case 4:
                    System.out.println("Quer calcular a piramide inteira ou apenas o tronco?");
                    int oppira= scanner.nextInt();
                    switch(oppira){
                                        case 1:
                                        System.out.println("quais as medidas da piramide?");
                                        System.out.println("Geratriz");
                                        Blehrg.arestax = scanner.nextDouble();
                                        System.out.println("Lados da base");
                                        Blehrg.laterais = scanner.nextInt();
                                        System.out.println("Altura");
                                        Blehrg.H = scanner.nextDouble();
                                        double volumePiramide = espacial.calcularVolumePiramide(Blehrg.arestax, Blehrg.laterais, Blehrg.AB, Blehrg.H);
                                        System.out.println("o volume da piramide é  " + volumePiramide);
                                        break;
                                                                    
                                        case 2:
                                        System.out.println("Quais as medidas do tronco da piramide??");
                                        System.out.println("Geratriz");
                                        Blehrg.arestax = scanner.nextDouble();
                                        System.out.println("Lados da base");
                                        Blehrg.laterais = scanner.nextDouble();
                                        System.out.println("Altura");
                                        Blehrg.H = scanner.nextDouble();
                                        double areaPiramide = espacial.calcularAreaPiramide(Blehrg.arestax,Blehrg.laterais,Blehrg.H,Blehrg.AB,Blehrg.AL);
                                        System.out.println("a area da piramide é  " + areaPiramide);
                                        break;
                                    }
                                    
                    System.out.println("Quer calcular o cone inteiro ou apenas o tronco?");
                    int opcone= scanner.nextInt();
                    switch(opcone){
                                        case 1:
                                        System.out.println("quais as medidas do cone?");
                                        Blehrg.raio = scanner.nextDouble();
                                        Blehrg.Pi = scanner.nextDouble();
                                        Blehrg.H = scanner.nextDouble();
                                        double volumeCone = espacial.calcularVolumeCone(Blehrg.raio, Blehrg.Pi, Blehrg.H);
                                        System.out.println("o volume do cone é  " + volumeCone);
                                        break;
                                                                    
                                        case 2:
                                        System.out.println("quais as medidas do cone?");
                                        Blehrg.R = scanner.nextDouble();
                                        Blehrg.r = scanner.nextDouble();
                                        Blehrg.Pi = scanner.nextDouble();
                                        Blehrg.H = scanner.nextDouble();
                                        double volumeTroncoCone = espacial.calcularVolumeTroncoCone(Blehrg.r,Blehrg.R, Blehrg.Pi, Blehrg.H);
                                        System.out.println("o volume do cone é  " + volumeTroncoCone);
                                        break;
                                    }
            
            
            case 6:
            System.out.println("Tá, qual vai ser o tipo de prisma?");
            System.out.println("1 - triangular ");
            System.out.println("3 - hexagonal ");
            
            int operacaoprismas = scanner.nextInt();
            
            switch(operacaoprismas){
            case 1:
            System.out.println("triangulo");
            Blehrg.arestax = scanner.nextDouble();
            Blehrg.AB = scanner.nextDouble();
            Blehrg.H = scanner.nextDouble();
            double volumePrismaTriangular= espacial.calcularVolumePrismaTriangular(Blehrg.arestax, Blehrg.AB, Blehrg.H);
            break;
            case 2:
            System.out.println("seis");
            Blehrg.arestax = scanner.nextDouble();
            Blehrg.H = scanner.nextDouble();
            Blehrg.AB = scanner.nextDouble();
            double volumePrismaHexagonal = espacial.calcularVolumePrismaHexagonal(Blehrg.arestax, Blehrg.H, Blehrg.AB);
            break;
            }
            
            case 7:
            System.out.println("quais as medidas do cilindro?");
            Blehrg.arestax = scanner.nextDouble();
            Blehrg.H = scanner.nextDouble();
            Blehrg.AB = scanner.nextDouble();
            Blehrg.Pi = scanner.nextDouble();
            double volumeCilindro = espacial.calcularVolumeCilindro(Blehrg.arestax, Blehrg.H, Blehrg.AB, Blehrg.Pi);
            System.out.println("o volume  do cubo é  " + volumeCilindro);
            break;

}
                                        break;


}



}
}
}
