// Description: Java 11 Instance Edit Object interface for CFBam BlobDef.

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

public interface ICFBamBlobDefEditObj
	extends ICFBamBlobDefObj,
		ICFBamAtomEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFBamBlobDefObj.
	 */
	ICFBamBlobDefObj getOrigAsBlobDef();

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
	 *	Get the optional byte[] attribute InitValue.
	 *
	 *	@return	The byte[] value of the attribute InitValue.
	 */
	byte[] getOptionalInitValue();

	/**
	 *	Set the optional byte[] attribute InitValue.
	 *
	 *	@param	value	the byte[] value of the attribute InitValue.
	 */
	void setOptionalInitValue( byte[] value );
}
