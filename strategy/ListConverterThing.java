package strategy;

import java.util.List;

public class ListConverterThing implements ListConverter {
    private final int strategy;

    public ListConverterThing(int strategy) {
        this.strategy = strategy;
    }

    public String listToString(List<String> list) {
        StringBuilder sb = new StringBuilder();
        switch (strategy) {
            case 1:
                for (String s : list) {
                    sb.append(s).append("\n");
                }
                break;
            case 2:
                for (int i = 0; i < list.size(); i++) {
                    sb.append(list.get(i)).append(i % 2 == 1 ? "\n" : "");
                }
                break;
            case 3:
                for (int i = 0; i < list.size(); i++) {
                    sb.append(list.get(i)).append(i % 3 == 2 ? "\n" : "");
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid strategy: " + strategy);
        }
        return sb.toString();
    }
}
