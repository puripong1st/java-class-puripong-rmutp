public class StudentID {
    private int id;

    // Constructor ของคลาส StudentID
    public StudentID(int id) {
        this.id = id;
    }

    // เมธอดเพื่อดึงค่า id ออกมา
    public int getID() {
        return id;
    }

    // เมธอดเพื่อกำหนดค่าใหม่ให้กับ id
    public void setID(int id) {
        this.id = id;
    }
}
