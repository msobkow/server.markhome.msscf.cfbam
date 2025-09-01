// Description: Java 11 Instance Edit Object interface for CFBam Id32Gen.

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

public interface ICFBamId32GenEditObj
	extends ICFBamId32GenObj,
		ICFBamInt32TypeEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFBamId32GenObj.
	 */
	ICFBamId32GenObj getOrigAsId32Gen();

	/**
	 *	Get the required short attribute Slice.
	 *
	 *	@return	The short value of the attribute Slice.
	 */
	short getRequiredSlice();

	/**
	 *	Set the required short attribute Slice.
	 *
	 *	@param	value	the short value of the attribute Slice.
	 */
	void setRequiredSlice( short value );

	/**
	 *	Get the required int attribute BlockSize.
	 *
	 *	@return	The int value of the attribute BlockSize.
	 */
	int getRequiredBlockSize();

	/**
	 *	Set the required int attribute BlockSize.
	 *
	 *	@param	value	the int value of the attribute BlockSize.
	 */
	void setRequiredBlockSize( int value );

	/**
	 *	Get the ICFBamTableObj instance referenced by the Dispenser key.
	 *
	 *	@return	The ICFBamTableObj instance referenced by the Dispenser key.
	 */
	ICFBamTableObj getOptionalLookupDispenser();

	/**
	 *	Set the ICFBamTableObj instance referenced by the Dispenser key.
	 *
	 *	@param	value	the ICFBamTableObj instance to be referenced by the Dispenser key.
	 */
	void setOptionalLookupDispenser( ICFBamTableObj value );
}
