// Description: Java 11 Instance Edit Object interface for CFBam FloatDef.

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

public interface ICFBamFloatDefEditObj
	extends ICFBamFloatDefObj,
		ICFBamAtomEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFBamFloatDefObj.
	 */
	ICFBamFloatDefObj getOrigAsFloatDef();

	/**
	 *	Get the optional Float attribute InitValue.
	 *
	 *	@return	The Float value of the attribute InitValue.
	 */
	Float getOptionalInitValue();

	/**
	 *	Set the optional Float attribute InitValue.
	 *
	 *	@param	value	the Float value of the attribute InitValue.
	 */
	void setOptionalInitValue( Float value );

	/**
	 *	Get the optional Float attribute MinValue.
	 *
	 *	@return	The Float value of the attribute MinValue.
	 */
	Float getOptionalMinValue();

	/**
	 *	Set the optional Float attribute MinValue.
	 *
	 *	@param	value	the Float value of the attribute MinValue.
	 */
	void setOptionalMinValue( Float value );

	/**
	 *	Get the optional Float attribute MaxValue.
	 *
	 *	@return	The Float value of the attribute MaxValue.
	 */
	Float getOptionalMaxValue();

	/**
	 *	Set the optional Float attribute MaxValue.
	 *
	 *	@param	value	the Float value of the attribute MaxValue.
	 */
	void setOptionalMaxValue( Float value );
}
