import java.util.*;

public class BlossomAlgoritmasi {
 // Maksimum eşleme sayısını bulmak için kullanılacak fonksiyon
    public static int maxEslesme(List<List<Integer>> graph) {
        int n = graph.size(); //boyutu
        int[] match = new int[n];
        Arrays.fill(match, -1);
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (match[i] == -1) {   //eğer atran bir yol yoksa
                int v = findPath(graph, match, i, new boolean[n]);
                if (v != -1) {  // Eğer artan yol bulunursa,
                    match[i] = v;   // i düğümü v ile eşleştirilir.
                    match[v] = i;   // v düğümü i ile eşleştirilir.
                    res++;  // Maksimum eşleşme sayısı bir arttırılır.
                }
            }
        }
        return res; // Maksimum eşleşme sayısı döndürülür.
    }
// Artan yol bulmak için kullanılacak yardımcı fonksiyon.
    private static int findPath(List<List<Integer>> graph, int[] match, int u, boolean[] vis) { 
        vis[u] = true;    // Düğüm ziyaret edilir olarak işaretlenir.
        for (int v : graph.get(u)) { // Düğümün komşuları kontrol edilir.
            if (!vis[v]) { // Eğer komşu düğüm daha önce ziyaret edilmediyse,
                vis[v] = true; // Komşu düğüm ziyaret edilir olarak işaretlenir.
                if (match[v] == -1 || findPath(graph, match, match[v], vis) != -1) {
                     // Eğer komşu düğüm henüz eşleştirilmemişse veya mevcut eşleştirmeden yeni bir artan yol bulunursa,
                    match[v] = u; // Komşu düğüm u ile eşleştirilir.
                    return v; // Eşleşme noktası (v) döndürülür.
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Grafik oluşturulur (örnekteki arkadaşlar veya iş adayları gibi)
        List<List<Integer>> graph = new ArrayList<>();
        graph.add(Arrays.asList(1, 3)); // Aday 1, iş 2 veya iş 4 için uygun
        graph.add(Arrays.asList(0, 2)); // Aday 2, iş 1 veya iş 3 için uygun
        graph.add(Arrays.asList(1, 3)); // Aday 3, iş 2 veya iş 4 için uygun
        graph.add(Arrays.asList(0, 2)); // Aday 4, iş 1 veya iş 3 için uygun

        int maxMatching = maxEslesme(graph);
        System.out.println("Maksimum eşleşme sayisi: " + maxMatching);
    }
}
