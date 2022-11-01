public class Exercise8 {
    public static void main(String[] args) {
        int[][] multi = new int[10][10];                             //establecemos cantidad de lineas y columnas


        for (int i = 0; i < multi.length; i++) {                        //para las lineas
            for (int j = 0; j < multi[i].length; j++) {                 // para las columnas
                multi[0][4] = 1;
                multi[2][6] = 1;                                        //seleccionar elementos dentro de la matriz
                multi[3][1] = 1;
                multi[8][6] = 1;
                System.out.print(multi[i][j] + " ");                    //imprimimos los dos for (I,J)
            }
            System.out.println();                                 //realizamos un salto de linea fuera del primer for
        }


    }
}
