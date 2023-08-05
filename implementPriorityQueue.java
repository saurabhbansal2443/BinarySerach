import java.util.ArrayList;

public class implementPriorityQueue{
    public static void main(String[] args) {
        Priority p = new Priority();

        p.add(1);
        p.add(500);
        p.add(10);
        p.add(5);
        p.add(4);
        p.add(7);
        p.add(20);

        System.out.println(p.remove());
        System.out.println(p.remove());
        System.out.println(p.remove());

        p.display();
    }
}

class Priority{

    ArrayList<Integer> arr;

    Priority(){
        arr = new ArrayList<>();
    }

    public void add(int ele){

        if(arr.size()==0){
            arr.add(ele);
            return;
        }

        arr.add(ele);

        upheapify(arr.size()-1);

    }

    private void upheapify(int idx){
        if(idx==0){
            return ;
        }

        int pi = (idx-1)/2;

        if(arr.get(pi)>arr.get(idx)){
            swap(pi,idx);
            upheapify(pi);
        }
    }

    private void swap(int idx1 , int idx2){
        int ele1 = arr.get(idx1);
        int ele2 = arr.get(idx2);

        arr.set(idx1,ele2);
        arr.set(idx2,ele1);
        
    } 

      public int remove(){

        if(arr.size()==0){
            return -1;
        }

        int ans = arr.get(0);

        swap(0,arr.size()-1);

        arr.remove(arr.size()-1);

        downheapify(0);

        return ans ;

      }

      private  void downheapify(int pi){
        int min = pi;

        int li = 2*pi + 1;
        int ri = 2*pi + 2;

        if(li<arr.size() && arr.get(li)<arr.get(min)){
            min =li;
        }

        if(ri<arr.size() && arr.get(ri)<arr.get(min)){
            min = ri;
        }

        if(min != pi){
            swap(pi,min);
            downheapify(min);
        }


      } 

    public int size(){
        return arr.size();
    }

    public int peek(){
        return arr.get(0);
    }

    public void display(){
       System.out.println(arr);
    }
}