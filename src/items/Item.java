package items;

import lombok.*;

@Getter
@RequiredArgsConstructor
@EqualsAndHashCode
public abstract class Item {

    private final String name;
    private final double weight;
    private final double durability;
    private final int level;

}
