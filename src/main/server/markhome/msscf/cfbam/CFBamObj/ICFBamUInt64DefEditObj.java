// Description: Java 11 Instance Edit Object interface for CFBam UInt64Def.

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

public interface ICFBamUInt64DefEditObj
	extends ICFBamUInt64DefObj,
		ICFBamAtomEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFBamUInt64DefObj.
	 */
	ICFBamUInt64DefObj getOrigAsUInt64Def();

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
