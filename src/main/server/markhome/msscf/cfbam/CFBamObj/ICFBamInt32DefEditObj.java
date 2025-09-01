// Description: Java 11 Instance Edit Object interface for CFBam Int32Def.

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

public interface ICFBamInt32DefEditObj
	extends ICFBamInt32DefObj,
		ICFBamAtomEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFBamInt32DefObj.
	 */
	ICFBamInt32DefObj getOrigAsInt32Def();

	/**
	 *	Get the optional Integer attribute InitValue.
	 *
	 *	@return	The Integer value of the attribute InitValue.
	 */
	Integer getOptionalInitValue();

	/**
	 *	Set the optional Integer attribute InitValue.
	 *
	 *	@param	value	the Integer value of the attribute InitValue.
	 */
	void setOptionalInitValue( Integer value );

	/**
	 *	Get the optional Integer attribute MinValue.
	 *
	 *	@return	The Integer value of the attribute MinValue.
	 */
	Integer getOptionalMinValue();

	/**
	 *	Set the optional Integer attribute MinValue.
	 *
	 *	@param	value	the Integer value of the attribute MinValue.
	 */
	void setOptionalMinValue( Integer value );

	/**
	 *	Get the optional Integer attribute MaxValue.
	 *
	 *	@return	The Integer value of the attribute MaxValue.
	 */
	Integer getOptionalMaxValue();

	/**
	 *	Set the optional Integer attribute MaxValue.
	 *
	 *	@param	value	the Integer value of the attribute MaxValue.
	 */
	void setOptionalMaxValue( Integer value );
}
