package iloveyouboss;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by james on 6/14/15.
 */
public class ProfileTest {
    @Test
    public void test() {
        Profile profile = new Profile("Bull Hockey, Inc.");
        Question question = new BooleanQuestion(1, "Got bonuses?");
        Answer profileAnswer = new Answer(question, Bool.FALSE);
        profile.add(profileAnswer);
        Criteria criteria = new Criteria();
        Answer criteriaAnswer = new Answer(question, Bool.TRUE);
        Criterion criterion = new Criterion(criteriaAnswer, Weight.MustMatch);
        criteria.add(criterion);

        boolean matches = profile.matches(criteria);
        assertFalse(matches);
    }
}
