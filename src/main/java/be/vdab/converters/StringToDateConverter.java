package be.vdab.converters;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import org.springframework.core.convert.converter.Converter;

public class StringToDateConverter implements Converter<String, LocalDate>{

	@Override
	public LocalDate convert(String source) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		try {
			return LocalDate.parse(source, formatter);
		}
		catch (DateTimeParseException ex) {
			throw new IllegalArgumentException(ex);
		}
	}

}
