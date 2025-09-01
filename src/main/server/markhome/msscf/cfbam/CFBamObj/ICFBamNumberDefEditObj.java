// Description: Java 11 Instance Edit Object interface for CFBam NumberDef.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBam.*;

public interface ICFBamNumberDefEditObj
	extends ICFBamNumberDefObj,
		ICFBamAtomEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFBamNumberDefObj.
	 */
	ICFBamNumberDefObj getOrigAsNumberDef();

	/**
	 *	Get the required short attribute Digits.
	 *
	 *	@return	The short value of the attribute Digits.
	 */
	short getRequiredDigits();

	/**
	 *	Set the required short attribute Digits.
	 *
	 *	@param	value	the short value of the attribute Digits.
	 */
	void setRequiredDigits( short value );

	/**
	 *	Get the required short attribute Precis.
	 *
	 *	@return	The short value of the attribute Precis.
	 */
	short getRequiredPrecis();

	/**
	 *	Set the required short attribute Precis.
	 *
	 *	@param	value	the short value of the attribute Precis.
	 */
	void setRequiredPrecis( short value );

	/**
	 *	Get the optional BigDecimal attribute InitValue.
	 *
	 *	@return	The BigDecimal value of the attribute InitValue.
	 */
	BigDecimal getOptionalInitValue();

	/**
	 *	Set the optional BigDecimal attribute InitValue.
	 *
	 *	@param	value	the BigDecimal value of the attribute InitValue.
	 */
	void setOptionalInitValue( BigDecimal value );

	/**
	 *	Get the optional BigDecimal attribute MinValue.
	 *
	 *	@return	The BigDecimal value of the attribute MinValue.
	 */
	BigDecimal getOptionalMinValue();

	/**
	 *	Set the optional BigDecimal attribute MinValue.
	 *
	 *	@param	value	the BigDecimal value of the attribute MinValue.
	 */
	void setOptionalMinValue( BigDecimal value );

	/**
	 *	Get the optional BigDecimal attribute MaxValue.
	 *
	 *	@return	The BigDecimal value of the attribute MaxValue.
	 */
	BigDecimal getOptionalMaxValue();

	/**
	 *	Set the optional BigDecimal attribute MaxValue.
	 *
	 *	@param	value	the BigDecimal value of the attribute MaxValue.
	 */
	void setOptionalMaxValue( BigDecimal value );
}
