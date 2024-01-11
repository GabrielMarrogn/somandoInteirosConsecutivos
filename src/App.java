import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String entrada = br.readLine();
        String[] arr = entrada.split(" ");
        int n =0;
        int soma = 0;

        int a = Integer.parseInt(arr[0]);

        for(int i = 1;; i++){
            n = Integer.parseInt(arr[i]);

            if(n > 0){
                break;
            }
        }

        for(int i = 0; i < n; i++){
            soma = soma +(a+i);
        }
       
        System.out.println(soma);
    }
}
