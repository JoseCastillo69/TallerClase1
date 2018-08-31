package com.example.android.tallerclase1;

public class Metodos {
    public static int cotizar(int cantidad, int n1, int n2, int n3, int n4){
        int total =0;
        if (n1==1){
            if (n2==1){
                if (n3==1 || n3==2){
                    if (n4==1){
                        total = 100*cantidad;
                    }
                    if (n4==2){
                        total = 100*3200*cantidad;
                    }
                    }
                    if (n3==3){
                        if (n4==1){
                            total = 80*cantidad;
                        }
                        if (n4==2){
                            total = 80*3200*cantidad;
                        }
                    }
                    if (n3==4) {
                        if (n4==1){
                            total = 70*cantidad;
                        }
                        if (n4==2){
                            total = 70*3200*cantidad;
                        }
                    }
                    }
                    if (n2==2) {
                        if (n3==1 || n3==2){
                            if (n4==1){
                                total = 120*cantidad;
                            }
                            if (n4==2){
                                total = 120*3200*cantidad;
                            }
                        }
                        if (n3==3){
                            if (n4==1){
                                total = 100*cantidad;
                            }
                            if (n4==2){
                                total = 100*3200*cantidad;
                            }
                        }
                        if (n3==4) {
                            if (n4==1){
                                total = 90*cantidad;
                            }
                            if (n4==2){
                                total = 90*3200*cantidad;
                            }
                        }
                    }


                }
                if (n1==2) {
                    if (n2==1){
                        if (n3==1 || n3==2){
                            if (n4==1){
                                total = 90*cantidad;
                            }
                            if (n4==2){
                                total = 90*3200*cantidad;
                            }
                        }
                        if (n3==3){
                            if (n4==1){
                                total = 70*cantidad;
                            }
                            if (n4==2){
                                total = 70*3200*cantidad;
                            }
                        }
                        if (n3==4) {
                            if (n4==1){
                                total = 50*cantidad;
                            }
                            if (n4==2){
                                total = 50*3200*cantidad;
                            }
                        }
                    }
                    if (n2==2) {
                        if (n3==1 || n3==2){
                            if (n4==1){
                                total = 110*cantidad;
                            }
                            if (n4==2){
                                total = 110*3200*cantidad;
                            }
                        }
                        if (n3==3){
                            if (n4==1){
                                total = 90*cantidad;
                            }
                            if (n4==2){
                                total = 90*3200*cantidad;
                            }
                        }
                        if (n3==4) {
                            if (n4==1){
                                total = 80*cantidad;
                            }
                            if (n4==2){
                                total = 80*3200*cantidad;
                            }
                        }
                    }
                }
                return total;
            }
        }



