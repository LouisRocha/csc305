Lecture 10 covers 2 new design patterns:
- Builder
- ChainResponsibility

Builder:
    --> Builder is pretty much meant to "Software Engineer-ize" a regular class with hella
        attributes/variables. Deadass its like to see the methods being used, for example, 
        creating a student object:

        Student student = new Student("Louis", 12, "661123", 1.98);
        
        V.S
        
        Student student = new StudentBuilder("Louis")
            .passedClasses(12)
            .phoneNumber("661123")
            .gpa(1.98)
            .build(); 
        
