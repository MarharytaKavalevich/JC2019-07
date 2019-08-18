package lesson08;

public class Generics {
    public static class Save<S> {
        public S[] value;

        public void setValue(S[] value) {
            this.value = value;
        }

        public S[] getValue() {
            return value;
        }

        public S getE(int x) {
            return value[x];
        }
    }

    public static void main(String[] args) {
        Save<String> s = new Save<String>();
        s.setValue(new String[]{"1111", "2222", "3333", "4444", "5555"});
        System.out.println(s.getE(2));
    }
}

