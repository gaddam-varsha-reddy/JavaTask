//import java.sql.SQLOutput;
//import java.util.ArrayList;
//import java.util.Iterator;
import java.util.*;
class Details{

    int id;
    String name;
    String companyName;
    Details(int id,String name,String companyName){
        this.id=id;
        this.name=name;
        this.companyName=companyName;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Details> users = new ArrayList<>();
        //Details o=new Details();
        System.out.println("1-Adding Users");
        System.out.println("2-Deleting Users");
        System.out.println("3.Display All Users");
        System.out.println("4.Search User");
        System.out.println("5.Exit");
        System.out.println("Enter n value");
        int n=sc.nextInt();
        while(n!=5) {
            switch (n) {
                case 1:
                    System.out.println("case-1");
                    System.out.println("Enter_id:");
                    int id = sc.nextInt();
                    System.out.println("Enter_user_name:");
                    String name = sc.next();
                    System.out.println("Enter_user_company_name:");
                    String companyName=sc.next();
                    users.add(new Details(id,name,companyName));
                    System.out.println("Enter n value");
                    n=sc.nextInt();
                    break;
                case 2:
                    System.out.println("case-2");
                    System.out.println("Enter user id which you want to remove");
                    n=sc.nextInt();
                    Iterator itr = users.iterator();
                    while (itr.hasNext()) {
                        Details x = (Details) itr.next();
                        if (x.id ==n){
                            itr.remove();
                        break;
                        }
                    }
                    System.out.println("Enter n value");
                    n=sc.nextInt();
                    break;
                case 3:
                    System.out.println("case-3");
                    for(Details i:users){
                        System.out.println("User id:"+i.id + " User_name:" + i.name + " User_company_name:"+i.companyName);
                    }
                    System.out.println("Enter n value");
                    n=sc.nextInt();
                    break;
                case 4:
                    System.out.println("case-4");
                    System.out.println("Enter user id whom you want to search");
                    n=sc.nextInt();
                    for(Details i:users) {
                        if(i.id==n){
                            //users.remove(Integer.valueOf(n));
                            System.out.println(i.id+" is found");
                            break;
                        }
                    }
                        //System.out.println(users.contains());
                    System.out.println("Enter n value");
                    n=sc.nextInt();
                    break;
                default:
                    System.out.println("Exit");
                    n=sc.nextInt();
                    break;
            }
        }
        //System.out.println(users);
            int id;
    String name;
    String companyName;
    Details(int id,String name,String companyName){
        this.id=id;
        this.name=name;
        this.companyName=companyName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Details details = (Details) o;
        return id == details.id && Objects.equals(name, details.name) && Objects.equals(companyName, details.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, companyName);
    }

    @Override
    public String toString() {
        return "Details{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }


    }

}
