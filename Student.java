import java.util.List;

class Student {
    String index;
    String firstName;
    String lastName;
    List<Integer> labPoints;


    //TODO constructor

    public Student(String index, String firstName, String lastName, List<Integer> labPoints) {
        this.index = index;
        this.firstName = firstName;
        this.lastName = lastName;
        this.labPoints = labPoints;
    }


    //TODO seters & getters

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Integer> getLabPoints() {
        return labPoints;
    }

    public void setLabPoints(List<Integer> labPoints) {
        this.labPoints = labPoints;
    }

    public double getAverage() {
        //TODO
        int suma = 0;
        double prosek = 0;
        for(int i=0; i<labPoints.size(); i++){
            suma += labPoints.get(i);
        }
        prosek = suma / labPoints.size();
        return prosek;
    }

    public boolean hasSignature() {
        //TODO
        if(labPoints.size() > 8){
            return true;
        }
        return false;
    }
}

class Course{
    List<Student> studenti;

    public void addStudent(Student nov){
        studenti.add(nov);
    }
    public void removeStudent(Student otpisan){
        studenti.remove(otpisan);
    }

    public double averageAll(){
        double average = 0;
        double sum = 0;
        for(Student s: studenti){
            sum += s.getAverage();
        }
        average = sum/studenti.size();
        return average;
    }
}
