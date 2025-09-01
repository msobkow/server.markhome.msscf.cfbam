// Description: Java 11 Instance Edit Object interface for CFBam DelTopDep.

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

public interface ICFBamDelTopDepEditObj
	extends ICFBamDelTopDepObj,
		ICFBamDelDepEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFBamDelTopDepObj.
	 */
	ICFBamDelTopDepObj getOrigAsDelTopDep();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The String value of the attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Set the required String attribute Name.
	 *
	 *	@param	value	the String value of the attribute Name.
	 */
	void setRequiredName( String value );

	/**
	 *	Get the ICFBamTableObj instance referenced by the Table key.
	 *
	 *	@return	The ICFBamTableObj instance referenced by the Table key.
	 */
	ICFBamTableObj getRequiredContainerTable();

	/**
	 *	Set the ICFBamTableObj instance referenced by the Table key.
	 *
	 *	@param	value	the ICFBamTableObj instance to be referenced by the Table key.
	 */
	void setRequiredContainerTable( ICFBamTableObj value );

	/**
	 *	Get the ICFBamDelTopDepObj instance referenced by the Prev key.
	 *
	 *	@return	The ICFBamDelTopDepObj instance referenced by the Prev key.
	 */
	ICFBamDelTopDepObj getOptionalLookupPrev();

	/**
	 *	Set the ICFBamDelTopDepObj instance referenced by the Prev key.
	 *
	 *	@param	value	the ICFBamDelTopDepObj instance to be referenced by the Prev key.
	 */
	void setOptionalLookupPrev( ICFBamDelTopDepObj value );

	/**
	 *	Get the ICFBamDelTopDepObj instance referenced by the Next key.
	 *
	 *	@return	The ICFBamDelTopDepObj instance referenced by the Next key.
	 */
	ICFBamDelTopDepObj getOptionalLookupNext();

	/**
	 *	Set the ICFBamDelTopDepObj instance referenced by the Next key.
	 *
	 *	@param	value	the ICFBamDelTopDepObj instance to be referenced by the Next key.
	 */
	void setOptionalLookupNext( ICFBamDelTopDepObj value );
}
