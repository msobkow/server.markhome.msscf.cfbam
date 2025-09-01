// Description: Java 11 Instance Edit Object interface for CFBam BoolDef.

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

public interface ICFBamBoolDefEditObj
	extends ICFBamBoolDefObj,
		ICFBamAtomEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFBamBoolDefObj.
	 */
	ICFBamBoolDefObj getOrigAsBoolDef();

	/**
	 *	Get the optional Boolean attribute InitValue.
	 *
	 *	@return	The Boolean value of the attribute InitValue.
	 */
	Boolean getOptionalInitValue();

	/**
	 *	Set the optional Boolean attribute InitValue.
	 *
	 *	@param	value	the Boolean value of the attribute InitValue.
	 */
	void setOptionalInitValue( Boolean value );

	/**
	 *	Get the optional String attribute FalseString.
	 *
	 *	@return	The String value of the attribute FalseString.
	 */
	String getOptionalFalseString();

	/**
	 *	Set the optional String attribute FalseString.
	 *
	 *	@param	value	the String value of the attribute FalseString.
	 */
	void setOptionalFalseString( String value );

	/**
	 *	Get the optional String attribute TrueString.
	 *
	 *	@return	The String value of the attribute TrueString.
	 */
	String getOptionalTrueString();

	/**
	 *	Set the optional String attribute TrueString.
	 *
	 *	@param	value	the String value of the attribute TrueString.
	 */
	void setOptionalTrueString( String value );

	/**
	 *	Get the optional String attribute NullString.
	 *
	 *	@return	The String value of the attribute NullString.
	 */
	String getOptionalNullString();

	/**
	 *	Set the optional String attribute NullString.
	 *
	 *	@param	value	the String value of the attribute NullString.
	 */
	void setOptionalNullString( String value );
}
