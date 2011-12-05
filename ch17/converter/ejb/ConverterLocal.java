package ch17.converter.ejb;

import java.math.BigDecimal;
import javax.ejb.Local;

@Local
public interface ConverterLocal
{
	public BigDecimal dollarToRMB(BigDecimal dollars);

	public BigDecimal RMBToEuro(BigDecimal rmb);
}
