public class espacial extends geometriaMain {

    // deve ter as imagens para fazer os calculos
    public Double setPi(){
        return this.Pi;
    }

    public Double PegarRaioMaior(){
        return this.R;
    }

    public Double PegarValor(){
        return this.H;
    }

    public Double getVolume(){
        return this.V;
    }

    public Double getAB(){
        return this.AB;
    }

    public Double getAL(){
        return this.AL;
    }


    public Double PegarRaioMenor(){
        return this.r;
    }



    public static void main(String[] args) {
        
        ingressoSub Blehrg = new ingressoSub();

        Blehrg.Banda = "Sepultura";
        Blehrg.Local = "Araújo Vianna";
        Blehrg.valorAdicional = 35.90;


        System.out.println(Blehrg.PegarNome());
        System.out.println(Blehrg.Local());
        System.out.println(Blehrg.valorTotal());

        System.out.println("--------------------------------------------------");

    }

}
