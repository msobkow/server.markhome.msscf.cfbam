// Description: Java 11 Instance Edit Object interface for CFBam StringDef.

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

public interface ICFBamStringDefEditObj
	extends ICFBamStringDefObj,
		ICFBamAtomEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFBamStringDefObj.
	 */
	ICFBamStringDefObj getOrigAsStringDef();

	/**
	 *	Get the required int attribute MaxLen.
	 *
	 *	@return	The int value of the attribute MaxLen.
	 */
	int getRequiredMaxLen();

	/**
	 *	Set the required int attribute MaxLen.
	 *
	 *	@param	value	the int value of the attribute MaxLen.
	 */
	void setRequiredMaxLen( int value );

	/**
	 *	Get the required boolean attribute IsPolymorph.
	 *
	 *	@return	The boolean value of the attribute IsPolymorph.
	 */
	boolean getRequiredIsPolymorph();

	/**
	 *	Set the required boolean attribute IsPolymorph.
	 *
	 *	@param	value	the boolean value of the attribute IsPolymorph.
	 */
	void setRequiredIsPolymorph( boolean value );

	/**
	 *	Get the optional String attribute InitValue.
	 *
	 *	@return	The String value of the attribute InitValue.
	 */
	String getOptionalInitValue();

	/**
	 *	Set the optional String attribute InitValue.
	 *
	 *	@param	value	the String value of the attribute InitValue.
	 */
	void setOptionalInitValue( String value );
}
