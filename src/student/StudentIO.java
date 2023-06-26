package student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentIO {
    private final static String STUDENT_FILE_NAME = "student.txt";

    public static void write(Student student) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(STUDENT_FILE_NAME, true);
            bw = new BufferedWriter(fw);
            bw.write(student.getId() + "," + student.getName() + "," + student.getAge() + "," + student.getGpa() + "," + student.getAndress());
            bw.newLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            closeStream(bw);
        }
    }

    public static void write(List<Student> listStudent) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(STUDENT_FILE_NAME, true);
            bw = new BufferedWriter(fw);
            for (Student student : listStudent
            ) {
                bw.write(student.getId() + "," + student.getName() + "," + student.getAge() + "," + student.getGpa() + "," + student.getAndress());
                bw.newLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            closeStream(bw);
        }
    }

    public static List<Student> read() {
        List<Student> result = new ArrayList<Student>();
        FileReader fr = null;
        BufferedReader br = null;
        try {
             fr = new FileReader(STUDENT_FILE_NAME);
             br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null)
            {
                String[] parts = line.split(",");
                if (parts.length == 5)
                {
                    result.add(new Student(Integer.parseInt(parts[0]),parts[1],Integer.parseInt(parts[2]),Double.parseDouble(parts[3]),parts[4]));
                }
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            closeStream(br);
        }
        return result;
    }

    private static void closeStream(Writer os) {
        try {
            if (os != null) {
                os.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void closeStream(Reader is) {
        try {
            if (is != null) {
                is.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
