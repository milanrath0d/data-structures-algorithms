package org.milan.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link VersionsComparison}
 *
 * @author Milan Rathod
 */
class VersionsComparisonTest {

    @Test
    void testCompareVersions() {

        VersionsComparison versionsComparison = new VersionsComparison();

        int result = versionsComparison.compareVersions("1.0.1.0", "1.0.1.0");

        assertEquals(0, result);

        result = versionsComparison.compareVersions(".0.1.0", "1.0.1.0");

        assertEquals(-1, result);

        result = versionsComparison.compareVersions("1.0.1.", "1.0.1.0");

        assertEquals(0, result);

        result = versionsComparison.compareVersions("1.1.1.0", "1.0.1.0");

        assertEquals(1, result);
    }
}