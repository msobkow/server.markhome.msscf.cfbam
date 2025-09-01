// Description: Java 11 Instance Edit Object interface for CFBam Int64Def.

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

public interface ICFBamInt64DefEditObj
	extends ICFBamInt64DefObj,
		ICFBamAtomEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFBamInt64DefObj.
	 */
	ICFBamInt64DefObj getOrigAsInt64Def();

	/**
	 *	Get the optional Long attribute InitValue.
	 *
	 *	@return	The Long value of the attribute InitValue.
	 */
	Long getOptionalInitValue();

	/**
	 *	Set the optional Long attribute InitValue.
	 *
	 *	@param	value	the Long value of the attribute InitValue.
	 */
	void setOptionalInitValue( Long value );

	/**
	 *	Get the optional Long attribute MinValue.
	 *
	 *	@return	The Long value of the attribute MinValue.
	 */
	Long getOptionalMinValue();

	/**
	 *	Set the optional Long attribute MinValue.
	 *
	 *	@param	value	the Long value of the attribute MinValue.
	 */
	void setOptionalMinValue( Long value );

	/**
	 *	Get the optional Long attribute MaxValue.
	 *
	 *	@return	The Long value of the attribute MaxValue.
	 */
	Long getOptionalMaxValue();

	/**
	 *	Set the optional Long attribute MaxValue.
	 *
	 *	@param	value	the Long value of the attribute MaxValue.
	 */
	void setOptionalMaxValue( Long value );
}
