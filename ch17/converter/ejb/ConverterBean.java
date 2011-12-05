package ch17.converter.ejb;

import java.math.BigDecimal;
import javax.ejb.Stateless;

@Stateless
public class ConverterBean implements ConverterLocal, ConverterRemote
{
	private BigDecimal RMBRate = new BigDecimal("6.8564");
	private BigDecimal euroRate = new BigDecimal("0.0926");

	public BigDecimal dollarToRMB(BigDecimal dollars)
	{
		BigDecimal result = dollars.multiply(RMBRate);
		return result.setScale(2, BigDecimal.ROUND_UP);
	}

	public BigDecimal RMBToEuro(BigDecimal rmb)
	{
		BigDecimal result = rmb.multiply(euroRate);
		return result.setScale(2, BigDecimal.ROUND_UP);
	}
}
