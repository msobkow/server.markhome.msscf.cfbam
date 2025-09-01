// Description: Java 11 Instance Edit Object interface for CFBam DoubleDef.

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

public interface ICFBamDoubleDefEditObj
	extends ICFBamDoubleDefObj,
		ICFBamAtomEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFBamDoubleDefObj.
	 */
	ICFBamDoubleDefObj getOrigAsDoubleDef();

	/**
	 *	Get the optional Double attribute InitValue.
	 *
	 *	@return	The Double value of the attribute InitValue.
	 */
	Double getOptionalInitValue();

	/**
	 *	Set the optional Double attribute InitValue.
	 *
	 *	@param	value	the Double value of the attribute InitValue.
	 */
	void setOptionalInitValue( Double value );

	/**
	 *	Get the optional Double attribute MinValue.
	 *
	 *	@return	The Double value of the attribute MinValue.
	 */
	Double getOptionalMinValue();

	/**
	 *	Set the optional Double attribute MinValue.
	 *
	 *	@param	value	the Double value of the attribute MinValue.
	 */
	void setOptionalMinValue( Double value );

	/**
	 *	Get the optional Double attribute MaxValue.
	 *
	 *	@return	The Double value of the attribute MaxValue.
	 */
	Double getOptionalMaxValue();

	/**
	 *	Set the optional Double attribute MaxValue.
	 *
	 *	@param	value	the Double value of the attribute MaxValue.
	 */
	void setOptionalMaxValue( Double value );
}
