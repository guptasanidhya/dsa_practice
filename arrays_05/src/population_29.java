class population_29 {
    public static void main(String[] args) {
//        int arr[][]={{1950,1961},{1960,1971},{1970,1981}};
//        int arr[][]={{1993,1999},{2000,2010}};
//        int arr[][]={{2033,2034},{2039,2047},{1998,2042},{2047,2048},{2025,2029},{2005,2044},{1990,1992},{1952,1956},{1984,2014}};
        int arr[][]={{2008,2026},{2004,2008},{2034,2035},{1999,2050},{2049,2050},{2011,2035},{1966,2033},{2044,2049}};

        maximumPopulation(arr);
    }

    public static void maximumPopulation(int[][] logs) {
        int population[][]=new int[logs.length][2];
        int count=0;
        for(int i=0;i<logs.length;i++){
            int year_born=logs[i][0];
             count=search(year_born,logs);
             population[i][0]=year_born;
             population[i][1]=count;

        }
        for(int i=0;i<population.length;i++){
            for(int j=0;j<2;j++){
                System.out.print(population[i][j]+" ");
            }
            System.out.println();
        }
        int Max=-1;
        int index=0;
        for(int i=0;i<population.length;i++){
           if(population[i][1]>Max){
               Max=population[i][1];
               index=i;
           }
           else if(population[i][1]==Max){
               if(population[i][0]<population[index][0]){
                   index=i;
               }
           }
        }
        System.out.println("-----------------------------------------------");
        System.out.println(population[index][0]);

    }


    static int search(int year, int[][] a) {
        int search_count=0;
        for(int i=0;i<a.length;i++){
            if(a[i][0]<= year && year<a[i][1])
            {search_count++;}
        }
        return search_count;
    }
}