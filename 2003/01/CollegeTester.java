public class CollegeTester {

    public static void main(String[] args) {

        College[] theColleges = new College[]
        {
            new College("Colgate University",               "Northeast", 27025),
            new College("Duke University",                  "Southeast", 26000),
            new College("Kalamazoo College",                "Midwest",   19764),
            new College("Stanford University",              "West",      25917),
            new College("Florida International University", "Southeast", 10800),
            new College("Dartmouth College",                "Northeast", 27764),
            new College("Spelman College",                  "Midwest",   11455)
        };

        CollegeGroup mainGroup = new CollegeGroup(theColleges);
        
        System.out.println(mainGroup);

        mainGroup.updateTuition("Duke University", 999999);
        System.out.println(mainGroup.getCollegeString("Duke University"));

        College[] found = mainGroup.getCollegeList("Southeast", 1, 8723199);
        CollegeGroup foundColleges = new CollegeGroup(found);

        System.out.println(foundColleges);



    }

}