package org.milan.hackerearth;

import org.junit.jupiter.api.Test;
import org.milan.util.ListUtil;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link TwitterTrends}
 *
 * @author Milan Rathod
 */
class TwitterTrendsTest {

    @Test
    void testTrendingHashTags() {
        List<String> tweets = List.of("Donald Trump becomes the 45th #US President",
            "Potentially habitable exoplanet #ProximaB discovered",
            "#RogerFederer wins #US Open for 5th time",
            "#GravitationalWaves detection successful",
            "Traces of liquid water discovered on #Mars",
            "Life Could Survive on Exoplanet #ProximaB",
            "Go go #RogerFederer",
            "Ten ways #ProximaB is different from Earth",
            "ISRO becomes 4th space agency to reach #Mars",
            "#RogerFederer beats #Nadal");

        TwitterTrends twitterTrends = new TwitterTrends();

        List<String> result = twitterTrends.trendingHashTags(tweets);

        List<String> expectedResult = Arrays.asList("#ProximaB",
            "#RogerFederer",
            "#Mars",
            "#US",
            "#GravitationalWaves");

        assertTrue(ListUtil.isEqual(result, expectedResult));
    }
}