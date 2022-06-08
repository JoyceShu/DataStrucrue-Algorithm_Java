package HashTable;

public class Test {
    public static void main(String[] args) throws Exception{
        SymbolTable<Integer, String> st = new SymbolTable<>();
        st.put(1, "Rose");
        st.put(2, "Lisa");
        st.put(3, "Jisoo");
        st.put(1, "Jennie");
        System.out.println(st.size());
        st.put(1, "Joyce");
        System.out.println(st.get(1));
        System.out.println(st.size());
        st.delete(1);
        System.out.println(st.size());

    }
}
