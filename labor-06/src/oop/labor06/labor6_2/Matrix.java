package oop.labor06.labor6_2;

import java.util.Random;

public class Matrix {
    private double data[][];
    private final int rows;
    private final int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new double[rows][columns];
    }

    public Matrix(double data[][]) {
        this.data = new double[data.length][data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                this.data[i][j] = data[i][j];

            }
        }
        this.rows = data.length;
        this.columns = data[0].length;
    }

    public Matrix(Matrix matrix) {
        this.data = new double[matrix.rows][matrix.columns];
        this.rows = matrix.rows;
        this.columns = matrix.columns;
        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; j < matrix.columns; j++) {
                this.data[i][j] = matrix.data[i][j];
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }
    public void fillRandom(double a, double b){
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i][j]=rand.nextDouble(a,b);
            }
        }
    }
    public void printMatrix(){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("%.2f ",data[i][j]);
            }
            System.out.print("\n");
        }
    }
    public static Matrix add(Matrix matrix1, Matrix matrix2){
        if(matrix1.rows==matrix2.rows && matrix1.columns ==matrix2.columns){
            Matrix result = new Matrix(matrix1);
            for (int i = 0; i < matrix1.rows; i++) {
                for (int j = 0; j < matrix1.rows; j++) {
                    result.data[i][j]+=matrix2.data[i][j];
                }
            }
            return result;
        }
        return null;
    }
//    public static Matrix multiply(Matrix matrix1, Matrix matrix2){
//        if(matrix1.columns==matrix2.rows){
//            Matrix result = new Matrix(matrix1);
//            for (int i = 0; i < matrix1.rows; i++) {
//                for (int j = 0; j < matrix1.rows; j++) {
//                    for (int k = 0; k < matrix2.columns; k++) {
//                        for (int l = 0; l < matrix2.rows; l++) {
//                            result.data[i][j]=matrix1.data[i][j]*matrix2.data[l][k];
//                        }
//                    }
//                }
//            }
//            return result;
//        }
//        return null;
//    }
//    public static Matrix transpose(Matrix matrix){
//        Matrix result = new Matrix(matrix);
//        for (int i = 0; i < matrix.rows; i++) {
//            for (int j = 0; j < matrix.columns; j++) {
//                //for (int k = 0; k < ; k++) {
//
//               // }
//            }
//
//        }
//    }
}