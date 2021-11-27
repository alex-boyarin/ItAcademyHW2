package calculator.argumentsProvider;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class ArgumentProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
        return Stream.of(
                Arguments.of(5, 6),
                Arguments.of(152, 66),
                Arguments.of(12, 65),
                Arguments.of(21, 54),
                Arguments.of(1524, 87),
                Arguments.of(545, 5516),
                Arguments.of(123, 2),
                Arguments.of(12, 4),
                Arguments.of(4, 2),
                Arguments.of(12, 3)

        );
    }
}
