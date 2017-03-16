
import java.util.*;
import java.lang.Math;

//main del programa

public class main {

    public static void main(String[] args) {
        boolean error = true;
        Scanner scan = new Scanner(System.in);
        while(error){
        	//se le pide al usuario seleccionar un tipo de HASH para que pueda ser utilizado
            try{
                System.out.println("Por favor ingrese de lista que quiere usar ('HashSet', 'TreeSet', 'LinkedHashSet')");
                String type = scan.next();
                System.out.println(" ");
                boolean addnew=true;
                //se inicializaon los valores
                factory ListFactory = new factory();

                AbstractSet Android = ListFactory.getList(type);
                AbstractSet IOS = ListFactory.getList(type);
                AbstractSet Java = ListFactory.getList(type);
                AbstractSet todos = ListFactory.getList(type);
                int androidc=0;
                int javac=0;
                int IOSc=0;
                int todosc=0;
                
                //se le pide al usuario si quiere ingresar un desarrollador

                while(addnew){
                    System.out.println("Desea agregar otro desarrollador? Si es igual a1 y no es igual a 0");
                    int ynn = scan.nextInt();
                    if(ynn==1){
                        System.out.println(" ");
                        System.out.println("Ingrese el nombre del desarrollador");
                        String dev = scan.next();
                        //que tipo de desarrollador es
                        System.out.println("Ingrese el tipo de desarrollador (puede ingresar más de un número, todo junto):");
                        System.out.println("1) dessarrollador IOS");
                        System.out.println("2) dessarrollador Java");
                        System.out.println("3) dessarrollador Android");
                        String tipo = scan.next();
                        // si es 1 se agrega a IOS, si es 2 se agrega a java y si es 3 se agrega a android
                        if(tipo.contains("1")){  IOS.add(dev);IOSc++;}
                        if(tipo.contains("2")){Java.add(dev);javac++;}
                        if(tipo.contains("3")){Android.add(dev); androidc++;}
                        todos.add(dev);
                        todosc++;
                    }else{addnew=false;}
                }


                Iterator iterator1 = todos.iterator();
                Iterator iterator2 = todos.iterator();
                Iterator iterator3 = todos.iterator();
                Iterator iterator4 = todos.iterator();
                //se muestra los resultados de las preguntas
                System.out.println(" ");
                System.out.println("Desarrolladores con experiencia en IOS, java y Android: ");
                while(iterator1.hasNext()){
                    Object persona = iterator1.next();
                    if(Java.contains(persona) && IOS.contains(persona) && Android.contains(persona) ){
                        System.out.println(persona);
                    }
                }
                System.out.println(" ");
                System.out.println("Desarrolladores con experiencia en java pero no IOS: ");
                while(iterator2.hasNext()){
                    Object persona = iterator2.next();
                    if(Java.contains(persona) && !IOS.contains(persona)){
                        System.out.println(persona);
                    }
                }
                System.out.println(" ");
                System.out.println("Desarrolladores con experiencia en IOS y Android pero no java: ");
                while(iterator3.hasNext()){
                    Object persona = iterator3.next();
                    if(!Java.contains(persona) && Android.contains(persona) && IOS.contains(persona) ){
                        System.out.println(persona);
                    }
                }

                System.out.println(" ");
                System.out.println("Desarrolladores con experiencia Java o Android pero no IOS: ");
                while(iterator4.hasNext()){
                    Object persona = iterator4.next();
                    if(!IOS.contains(persona) || Java.contains(persona) && !Android.contains(persona) ){
                        System.out.println(persona);
                    }
                }

                System.out.println(" ");



                int max = Math.max(Math.max(Java.size(),IOS.size()),Android.size());
                if(IOS.size() == max){
                    System.out.println("El grupo con más miembros es: IOS");
                    System.out.println("Desarrolladores Android: "+Android);
                }
                System.out.println(" ");
                if(Java.size() == max){
                    System.out.println("El grupo con más miembros es: java");
                    System.out.println("Desarrolladores Java: "+Java);
                }
                System.out.println(" ");
                if(Android.size() == max){
                    System.out.println("El grupo con más miembros es: Android");
                    System.out.println("Desarrolladores Android: "+Android);
                }
                
                boolean operador = Java.containsAll(Android);
                if(operador = true){
                	System.out.println("si es un subconjunto");
                }
                else{
                	System.out.println("No es un subconjunto");
                }



                error=false;




            }catch (Exception E){
                System.out.println("usted ingresó algo arroneo");
                error=true;
            }
        }



    }
}