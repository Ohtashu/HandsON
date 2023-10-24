package PackageMain;

public class Student extends Person {
private String program;
private int yearLevel;

public void setProgram(String p)
{
	this.program = p;
}
public String getProgram()
{
	return program;
}
public void setYearLevel(String y)
{
	int year = Integer.parseInt(y);
	this.yearLevel = year;
}
public int getYearLevel()
{
	return yearLevel;
}
}
