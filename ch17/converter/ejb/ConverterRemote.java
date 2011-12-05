package ch17.converter.ejb;

import java.math.BigDecimal;
import javax.ejb.Remote;

@Remote
public interface ConverterRemote
{
	public BigDecimal dollarToRMB(BigDecimal dollars);

	public BigDecimal RMBToEuro(BigDecimal rmb);
}
