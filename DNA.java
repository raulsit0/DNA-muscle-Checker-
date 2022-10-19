public class DNA {

    public static void main(String[] args) {
        // will check string to see if it contains protein
        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-

        String dna1 ="ATGCGATACGCTTGA";
        String dna2 ="ATGCGATACGTGA";
        String dna3 ="ATTAATATGTACTGA";
        // change this variable  to see if one of the above DNA  have muscles in it.
        String dna = dna3;
        // Getting index of both of intended dna
        int ATG = dna.indexOf("ATG");
        int TGA = dna.indexOf("TGA");
        // subtracting difference bewteen
        int sequenceDifference = ATG - TGA;


        if (dna.contains("ATG") && dna.contains("TGA") && (sequenceDifference % 3) == 0 ){
            System.out.println("we got some protein in this baby");
        }
        else{
            System.out.println("sadly nothing for the muscles");

        }
    }

}
