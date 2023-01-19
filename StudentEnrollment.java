class Student {
    String name;
    int studentClass;
    float result;

    Student(String s, int sClass) {
        name = s;
        studentClass = sClass;
        System.out.println("Added student: " + name + " to the roll of class: " + studentClass);
    }

    String getName() {
        return name;
    }

    String publish() {
        if (result >= 33.33) {
            return name + " has been promoted to class: " + (studentClass + 1);
        } else {
            return name + " has been retained in class: " + studentClass;
        }
    }
}

class Result extends Student {
    int subject1;
    int subject2;
    int subject3;

    Result(int a, int b, int c, String s, int sClass) {
        super(s, sClass);
        subject1 = a;
        subject2 = b;
        subject3 = c;
        System.out.println(name + " obtained " + subject1 + " marks in subject1");
        System.out.println(name + " obtained " + subject2 + " marks in subject2");
        System.out.println(name + " obtained " + subject3 + " marks in subject3");
    }

    String calculateResult() {
        result = (subject1 + subject2 + subject3) * 100 / 300;
        return super.publish();
    }

    String changeMarks(int newMarks, String subject) {
        System.out.println(name + " has ordered a recheck in " + subject);
        if (subject.equals("subject1")) {
            subject1 = newMarks;
        } else if (subject.equals("subject2")) {
            subject2 = newMarks;
        } else if (subject.equals("subject3")) {
            subject3 = newMarks;
        }
        String newResult = calculateResult();
        return "Following is the new result: " + newResult;
    }
}