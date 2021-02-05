import java.util.*;
public class Volume_3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter \"1\" to calculate the volume of a cube");
        System.out.println("Enter \"2\" to calculate the volume of a cuboid");
        System.out.println("Enter \"3\" to calculate the volume of a cylinder");
        int choice = sc.nextInt();
        int a,l,b,h,r,h1;
        double vol_c1 = 0, vol_c2 = 0, vol_c3 = 0;
        switch(choice)
        {
            case 1:
            System.out.println("Enter the value of the side of the cube : ");
            a = sc.nextInt();

            // "a * a * a" can also be written insted of "Math.pow(a, 3)"
            vol_c1 = Math.pow(a, 3);

            
            System.out.println("The volume : " +vol_c1);
            break;

            case 2:
            System.out.println("Enter the value of the length of the cuboid : ");
            l = sc.nextInt();
            System.out.println("Enter the value of the breadth of the cuboid : ");
            b = sc.nextInt();
            System.out.println("Enter the value of the height of the cuboid : ");
            h = sc.nextInt();
            vol_c2 = l * b * h;
            System.out.println("The voolume of the cuboid : " +vol_c2);
            break;

            case 3:
            System.out.println("Enter the value of the radius of the cylinder : ");
            r = sc.nextInt();
            System.out.println("Enter the value of the height of the cylinder : ");
            h1 = sc.nextInt();
            vol_c3 = (22.0 / 7.0) * Math.pow(r , 2) * h1;
            System.out.println("The volume of the cylinder : " +vol_c3);
            break;

            default:
            System.out.println("Invalid Choice !!!!!");
        }
        sc.close();
    }
}