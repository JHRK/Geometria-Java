public class plana extends geometriaMain {

        public static double calcularQuadrado(double aresta){
        double Quadrado = (aresta*aresta);
        return Quadrado;
        }
        public static double calcularPeriQuadrado(double aresta){
        double periQuadrado = (aresta*4);
        return periQuadrado;
        }
        
        public static double calcularRetanguloParas(double arestax,double arestay){
        double Retangulo = (arestax*arestay);
        return Retangulo;
        }
        public static double calcularPeriRetanguloParas(double arestax,double arestay){
        double periRetangulo = (2*arestax)+(2*arestay);
        return periRetangulo;
        }
        
        public static double calcularBola(double Pi,double raio){
        double Bola = Pi * Math.pow(raio,2);
        return Bola;
        }
        public static double calcularPeriBola(double Pi, double raio){
        double periBola = 2*Pi*raio;
        return periBola;
        }
        
        public static double calcularTriangulo1(double A,double B,double C,double H){
        double Triangulo1 = (A/H)/2;
        return Triangulo1;
        }
        public static double calcularPeriTriangulo1(double A,double B,double C){
        double periTriangulo1 = A+B+C;
        return periTriangulo1;
        }
        
        public static double calcularTriangulo2(double aresta){
        double Triangulo2 = (Math.pow(aresta, 2)*Math.sqrt(3))/4;
        return Triangulo2;
        }
        public static double calcularPeriTriangulo2(double aresta){
        double periTriangulo2 = 3*aresta;
        return periTriangulo2;
        }
        
        public static double calcularLosango(double diagonal, double D){
        double Losango = (diagonal*D)/2;
        return Losango;
        }
        public static double calcularPeriLosango(double aresta){
        double periLosango= (4*aresta);
        return periLosango;
        }
        
        public static double calcularTrapezio(double AB, double ABM, double H){
        double Trapezio = (AB + ABM)*H/2;
        return Trapezio;
        }
        public static double calcularPeriTrapezio(double AB, double ABM, double arestax, double arestay){
        double periTrapezio =  AB + ABM + arestax + arestay;
        return periTrapezio;
        }
        
}