// Description: Java 11 Instance Edit Object interface for CFBam Int16Def.

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

public interface ICFBamInt16DefEditObj
	extends ICFBamInt16DefObj,
		ICFBamAtomEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFBamInt16DefObj.
	 */
	ICFBamInt16DefObj getOrigAsInt16Def();

	/**
	 *	Get the optional Short attribute InitValue.
	 *
	 *	@return	The Short value of the attribute InitValue.
	 */
	Short getOptionalInitValue();

	/**
	 *	Set the optional Short attribute InitValue.
	 *
	 *	@param	value	the Short value of the attribute InitValue.
	 */
	void setOptionalInitValue( Short value );

	/**
	 *	Get the optional Short attribute MinValue.
	 *
	 *	@return	The Short value of the attribute MinValue.
	 */
	Short getOptionalMinValue();

	/**
	 *	Set the optional Short attribute MinValue.
	 *
	 *	@param	value	the Short value of the attribute MinValue.
	 */
	void setOptionalMinValue( Short value );

	/**
	 *	Get the optional Short attribute MaxValue.
	 *
	 *	@return	The Short value of the attribute MaxValue.
	 */
	Short getOptionalMaxValue();

	/**
	 *	Set the optional Short attribute MaxValue.
	 *
	 *	@param	value	the Short value of the attribute MaxValue.
	 */
	void setOptionalMaxValue( Short value );
}
