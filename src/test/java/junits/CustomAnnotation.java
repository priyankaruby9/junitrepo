package junits;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.lang.annotation.RetentionPolicy;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

@Tag("Sanity")
@DisplayName("Negative Test")
@Test
public @interface CustomAnnotation {
	
	

}

